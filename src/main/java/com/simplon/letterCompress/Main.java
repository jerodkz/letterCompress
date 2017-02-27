package com.simplon.letterCompress;

/**
 * Created by jerome on 27/02/17.
 */
public class Main {
    public static void main (String[] args){
        String string ="aabcccccaaa" ;
        LetterCompress lc = new LetterCompress(string);
        lc.LetterCompress();
        System.out.println(lc);
    }
}
