package com.denghb;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupApp {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://36kr.com/p/5097093.html")
                .timeout(10000)
                .get();
        Elements elements = document.getElementsByTag("p");
        for (Element element : elements) {
            System.out.println(element.text());
        }

    }
}
