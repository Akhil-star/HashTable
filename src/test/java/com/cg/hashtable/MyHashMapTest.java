package com.cg.hashtable;

import org.junit.Assert;
import org.junit.Test;


public class MyHashMapTest {
    @Test
    public void givenSentenceWhenWordsAreaddedToListShouldReturnFrequency() {
        String sentence = "To be or not to be";
        MyHashMap<String,Integer> myHashMap= new MyHashMap<String ,Integer>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words){
            Integer value = myHashMap.get( word );
            if(value==null)
                value=1;
            else
                value++;

            myHashMap.add(word,value);
        }
        int frequency = myHashMap.get("to");
        System.out.println(myHashMap);
        Assert.assertEquals(2,frequency);
        }
    }

