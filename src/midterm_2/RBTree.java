/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm_2;

/**
 *
 * @author Wei
 */
import java.util.Scanner;

public class RBTree {
    private Node root;
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    public RBTree() {
    root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private boolean isRed(Node x) {
        if (x == null) {
            return false;
        }
        return x.color == RED;
    }

    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private void flipColors(Node h) {
        h.color = !h.color;
        h.left.color = !h.left.color;
        h.right.color = !h.right.color;
    }

    public void insert(int key) {
        root = insert(root, key);
        root.color = BLACK;
    }

    private Node insert(Node h, int key) {
        if (h == null) {
            return new Node(key, RED);
        }

        if (key < h.key) {
            h.left = insert(h.left, key);
        } else if (key > h.key) {
            h.right = insert(h.right, key);
        } else {
            h.key = key;
        }

        if (isRed(h.right) && !isRed(h.left)) {
            h = rotateLeft(h);
        }
        if (isRed(h.left) && isRed(h.left.left)) {
            h = rotateRight(h);
        }
        if (isRed(h.left) && isRed(h.right)) {
            flipColors(h);
        }

        return h;
    }

    public void delete(int key) {
        if (!isRed(root.left) && !isRed(root.right)) {
            root.color = RED;
        }
        root = delete(root, key);
        if (!isEmpty()) {
            root.color = BLACK;
        }
    }

    private Node delete(Node h, int key) {
        if (key < h.key) {
            if (!isRed(h.left) && !isRed(h.left.left)) {
                h = moveRedLeft(h);
            }
            h.left = delete(h.left, key);
        } else {
            if (isRed(h.left)) {
                h = rotateRight(h);
            }
            if (key == h.key && (h.right == null)) {
                return null;
            }
            if (!isRed(h.right) && !isRed(h.right.left)) {
                h = moveRedRight(h);
            }
            if (key == h.key) {
                Node x = min(h.right);
                h.key = x.key;
                h.right = deleteMin(h.right);
            } else {
                h.right = delete(h.right, key);
            }
        }
    return balance(h);
    }

private Node moveRedLeft(Node h) {
    flipColors(h);
    if (isRed(h.right.left)) {
        h.right = rotateRight(h.right);
        h = rotateLeft(h);
        flipColors(h);
    }
    return h;
}

private Node moveRedRight(Node h) {
    flipColors(h);
    if (isRed(h.left.left)) {
        h = rotateRight(h);
        flipColors(h);
    }
    return h;
}

private Node balance(Node h) {
    if (isRed(h.right)) {
        h = rotateLeft(h);
    }
    if (isRed(h.left) && isRed(h.left.left)) {
        h = rotateRight(h);
    }
    if (isRed(h.left) && isRed(h.right)) {
        flipColors(h);
    }
    return h;
}

    private Node min(Node h) {
        if (h.left == null) {
            return h;
        } else {
            return min(h.left);
        }
    }

    private Node deleteMin(Node h) {
        if (h.left == null) {
            return null;
        }
        if (!isRed(h.left) && !isRed(h.left.left)) {
            h = moveRedLeft(h);
        }
        h.left = deleteMin(h.left);
        return balance(h);
    }

    public static void main(String[] args) {
        RBTree rbt = new RBTree();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("請選擇操作: 1.新增 2.刪除 3.結束");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("請輸入要新增的數字:");
                int num = sc.nextInt();
                rbt.insert(num);
                System.out.println("新增成功!");
            } else if (choice == 2) {
                System.out.println("請輸入要刪除的數字:");
                int num = sc.nextInt();
                rbt.delete(num);
                System.out.println("刪除成功!");
            } else {
                System.out.println("結束程式");
                break;
            }
        }
    }

    private class Node {
        int key;
        boolean color;
        Node left;
        Node right;
        public Node(int key, boolean color) {
            this.key = key;
            this.color = color;
        }
    }
}