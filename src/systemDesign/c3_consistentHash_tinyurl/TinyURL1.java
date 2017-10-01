package systemDesign.c3_consistentHash_tinyurl;

import java.util.*;

/**
 * Created by yuboyang on 7/28/17.
 * https://leetcode.com/problems/design-tinyurl/tabs/description
 *
 */

/*
 choose the global variable count
 better than random,
 in bad case, random needs to call random method many times, and read query many times
*/


public class TinyURL1 {
    public static void main(String[] args) {
        TinyURL1 tinyURL1 = new TinyURL1();
        System.out.println(tinyURL1.encode("http://leetcode.com"));
        System.out.println(tinyURL1.encode("http://leetcode.com"));
        System.out.println(tinyURL1.encode("http://leetcode1.com"));
        System.out.println(tinyURL1.encode("http://leetcode2.com"));
        System.out.println(tinyURL1.decode("http://tinyurl.com/caaaaa"));
        System.out.println(tinyURL1.decode("http://tinyurl.com/aaaaaa"));
    }


    static int count = 0; // global increment sequential
    String base = "http://tinyurl.com/";
    String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; //62
    HashMap<String, String> long2shortMap = new HashMap<>();
    HashMap<String, String> short2longMap = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (long2shortMap.containsKey(longUrl)) return long2shortMap.get(longUrl);
        String shortUrl = this.generateShortUrl();
        long2shortMap.put(longUrl, shortUrl);
        short2longMap.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return short2longMap.get(shortUrl);
    }

    public String generateShortUrl() {
        String newStr = "";
        int cur = this.count;
        for (int i = 0; i < 6; i++) {
            int remainer = cur % 62;
            newStr += str.charAt(remainer);
            cur /= 62;
        }
        count++;
        return base + newStr;
    }
}
