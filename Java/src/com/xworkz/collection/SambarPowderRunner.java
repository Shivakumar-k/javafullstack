package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class SambarPowderRunner {

	public static void main(String[] args) {
		Collection <String> sambar = new ArrayList<>();
		sambar.add("MTR");
		sambar.add("Aachi");
		sambar.add("Haldirams");
		sambar.add("MDH");
		sambar.add("Everest");
		sambar.add("Ramdev");
		sambar.add("Catch");
		sambar.add("Tata");
		sambar.add(null);
		
        System.out.println("running for each loop");

        for (String member : sambar) {

            if (Objects.nonNull(member)) {
                System.out.println(member);  
            }
        }
        System.out.println("size: " + sambar.size());

        Iterator<String> castIterator = sambar.iterator();
        while (castIterator.hasNext()) {
            String member = castIterator.next();
          {
                if (Objects.isNull(member)) {
                    castIterator.remove();
                    System.out.println("After remove: " + sambar);
                   System.out.println("After remove size : " + sambar.size());
               }
            }
        }
		

	}

}
