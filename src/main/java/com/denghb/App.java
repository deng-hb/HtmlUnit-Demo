package com.denghb;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            WebClient webClient = new WebClient(BrowserVersion.CHROME);
            HtmlPage htmlPage = (HtmlPage) webClient.getPage("http://36kr.com/p/5097093.html");
            DomNodeList domNodeList = htmlPage.getElementsByTagName("p");
            for (int i = 0; i < domNodeList.size(); i++) {
                DomElement domElement = (DomElement) domNodeList.get(i);
                System.out.println(domElement.asText());
            }
            webClient.close();
        } catch (FailingHttpStatusCodeException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
