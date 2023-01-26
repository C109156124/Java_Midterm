/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_;

/**
 *
 * @author Wei
 */
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class PttCrawler {
    public static void main(String[] args) {
        // 要爬取的PTT版面網址
        String url = "https://www.ptt.cc/bbs/C_Chat/index.html";
        try {
            // 使用Jsoup連線到網頁
            Document doc = Jsoup.connect(url).get();
            // 取得文章列表
            Elements articles = doc.select("div.r-ent");
            // 迴圈檢視每篇文章
            for (Element article : articles) {
                // 取得文章標題
                String title = article.select("div.title > a").text();
                // 取得文章網址
                String articleUrl = article.select("div.title > a").attr("href");
                // 輸出文章標題和網址
                System.out.println("標題：" + title);
                System.out.println("網址：" + "https://www.ptt.cc" + articleUrl);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}