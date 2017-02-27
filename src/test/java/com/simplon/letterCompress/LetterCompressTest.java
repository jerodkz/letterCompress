package com.simplon.letterCompress;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LetterCompressTest
{
/* UN test annulé pour la méthode devenu private, pour retester faire passer la méthode en public
   @Test
    public void uniqueStr_test(){
        //set
        String string = "aabcccccaaadef";
        LetterCompress lc = new LetterCompress(string);
        //test
        ArrayList<String> result = lc.UniqueStr();
        //assert
        assertEquals(6,result.size());
    }
*/
    @Test
    public void lettercompress_with_string(){
        //set
        String string = "aabcccccaaa";
        LetterCompress lc = new LetterCompress(string);
        //test
        String result = lc.LetterCompress();
        //assert
        assertEquals("a5b1c5",result);
    }

    @Test
    public void lettercompress_with_no_string(){
        //set
        String string = "";
        LetterCompress lc = new LetterCompress(string);
        //test
        String result = lc.LetterCompress();
        //assert
        assertEquals("0",result);
    }
}
