package com.simplon.letterCompress;

import java.util.ArrayList;
import java.util.Arrays;

public class LetterCompress
{

    String string ;
    String result = "";
    private ArrayList<String> uniqueStr = new ArrayList<String>();
    public LetterCompress(String string) {
        this.string = string;
    }

    public String LetterCompress(){

        //String result = "";
        String[] str = this.string.split("");
        uniqueStr = this.UniqueStr();


        for (int k=0 ; k < uniqueStr.size() ; k++) {
            int count =0;
            for(int i=0 ; i < this.string.length() ; i++) {
                if (str[i].equals(uniqueStr.get(k))) {
                    count++;
                }
            }
            result += uniqueStr.get(k)+count;
        }
        return result;
    }



    private ArrayList<String> UniqueStr(){
        String[] str = this.string.split("");
        for (int j=0 ; j < str.length ; j++){
            if(!uniqueStr.contains(str[j])) {
                uniqueStr.add(str[j]);
            }
        }
        return uniqueStr;
    }

    @Override
    public String toString() {
        return "LetterCompress{" +
                "string='" + string + '\'' +
                ", result='" + result + '\'' +
                ", uniqueStr=" + uniqueStr +
                '}';
    }
}

