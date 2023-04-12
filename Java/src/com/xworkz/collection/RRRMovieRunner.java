package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;


public class RRRMovieRunner {

    public static void main(String[] args) {
        Collection<String> cast = new ArrayList<>();
        cast.add("S S Rajamouli");
        cast.add("Jr NTR");
        cast.add("Ram charan");
        cast.add("olivia morris");
        cast.add("Ajay Devgan");
        cast.add("Alia bhatt");
        cast.add("M M Keravani");
        cast.add("Rahul sipligan");
        cast.add("Shreya");
        cast.add("Rahul ramakrishna");
        cast.add(null);

        System.out.println("running for each loop");

        for (String member : cast) {

            if (Objects.nonNull(member)) {
                System.out.println(member);  
            }
        }
        System.out.println("size: " + cast.size());

        Iterator<String> castIterator = cast.iterator();
        while (castIterator.hasNext()) {
            String member = castIterator.next();
          {
                if (Objects.isNull(member)) {
                    castIterator.remove();
               }
            }
          
        }
        System.out.println("After remove: " + cast);
       System.out.println("After remove size : " + cast.size());
    }

}

