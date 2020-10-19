package com.cg.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class LinkedlistHashMapTest {
    @Test
    public void givenSentenceWhenWordsAreaddedToListShouldReturnParanoidFrequency() {
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myLinkedHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value++;
            myLinkedHashMap.add(word, value);
        }
        int frequency = myLinkedHashMap.get("paranoid");
        System.out.println(myLinkedHashMap);
        Assert.assertEquals(3, frequency);
    }
    @Test
    public void givenSentenceWhenWordsAreaddedToListShouldReturnAvoidableFrequency() {
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        MyLinkedHashMap<String,Integer> myLinkedHashMap=new MyLinkedHashMap<>();
        String[] words=sentence.toLowerCase().split(" ");
        for(String word:words){
            Integer value = myLinkedHashMap.get(word);
            if(value==null)
                value=1;
            else
                value++;
            myLinkedHashMap.add(word,value);
        }
        myLinkedHashMap.delete("avoidable");
        Integer frequency = myLinkedHashMap.get("avoidable");
        System.out.println(myLinkedHashMap);
        Assert.assertEquals(null,frequency);
    }
}
