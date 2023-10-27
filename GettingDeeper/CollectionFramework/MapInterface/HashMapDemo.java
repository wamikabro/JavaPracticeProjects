package javaBeginnersGuideProjects.GettingDeeper.CollectionFramework.MapInterface;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        // when we tried to put 2 values in the same key
        // instead of giving any error, it simply overrode the existing value
        hashMap.put(1, "Wamique");
        hashMap.put(1, "Wasique");

        // it proves that now key 1 contains Wasique instead of Wamique
        System.out.println(hashMap.get(1));

        // let's add some more elements
        hashMap.put(2, "John");
        hashMap.put(3, "Steve");

        // print all
        System.out.println(hashMap);

        // contains key will check if the key exists
        // it will return boolean
        if(hashMap.containsKey(2))
            System.out.println("Yes hashMap contains the passed key");
        else
            System.out.println("No it does not contain the passed key");

        // contains value will check if the given value exists
        if(hashMap.containsValue("Wamique"))
            System.out.println("Yes, hashMap contains given value.");
        else
            System.out.println("No, hashMap does not contain given value.");

        // to stay safe from overriding any key-value
        // we have a method
        hashMap.putIfAbsent(1, "Wamique"); // this method checks if 1 already exists
        // if 1 exists then it won't touch it, if it doesn't exist
        // then it will be made a key and given value will be set to it

        // entry set will return whole Map
        // we already know we can simply print map if we want to because it will automatically
        // return whole map. but sometimes we want the entry set to be returned
        // because we want to do things other than printing.
        System.out.println(hashMap.entrySet());

        // to get only keys
        System.out.println(hashMap.keySet());

        // to get only values
        System.out.println(hashMap.values());

        System.out.println("Keys:");
        // to Iterate the Keys

        System.out.println("Values:");
        // to Iterate the Values
        for(var value: hashMap.values())
            System.out.println(value);

        // to Iterate both Keys and Values
        for(var keyAndValue: hashMap.entrySet())
            System.out.println(keyAndValue);

        // now there's something technical to know
        // your entrySet further support methods to get information form
        for(var keyAndValue: hashMap.entrySet())
            // this will take out key from each keyValuePair
            // and return
            System.out.println(keyAndValue.getKey());

        // similarly we can get Values from entrySet
        for(var keyAndValue: hashMap.entrySet())
            System.out.println(keyAndValue.getValue());

        // let's print first one and break the loop
        System.out.println("Only printing first pair of Key and Value: ");
        for(var keyAndValue: hashMap.entrySet()){
            System.out.println(keyAndValue);
            break;
        }




    }
}
