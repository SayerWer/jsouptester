/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtester;

import java.util.HashMap;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



/**
 *
 * @author sawye
 */
public class JTester {

    
     public static HashMap<Integer, String> hmap = new HashMap<Integer, String>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        sMap();
        System.out.println("0-17");
        Scanner scan = new Scanner(System.in);
        int i =scan.nextInt();
                scan.close();
        String url = "http://pokemondb.net/type/"+hmap.get(i);
        Document document = Jsoup.connect(url).get();
        Element a = document.select("div.colset > div").first();
        Element b = a.children().select("div").first();
        //String question = document.select("#closet .type-icon-list-indent").html().toString();
        Elements r =b.children();
        System.out.println("Question: " + a.text());

       // Elements answerers = document.select("#answers .user-details a");
        //for (Element answerer : answerers) {
          //  System.out.println("Answerer: " + answerer.text());
        //}
    
    }
    public static void sMap(){
        hmap.put(0, "normal");
        hmap.put(1, "fire");
        hmap.put(2, "water");
        hmap.put(3, "rock");
        hmap.put(4, "ground");
        hmap.put(5, "electric");
        hmap.put(6, "grass");
        hmap.put(7, "ice");
        hmap.put(8, "dragon");
        hmap.put(9, "steel");
        hmap.put(10, "flying");
        hmap.put(11, "bug");
        hmap.put(12, "poison");
        hmap.put(13, "fighting");
        hmap.put(14, "ghost");
        hmap.put(15, "dark");
        hmap.put(16, "faiey");
        hmap.put(17, "psychic");
        
    
    }
    
}
