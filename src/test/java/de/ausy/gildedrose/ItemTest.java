package de.ausy.gildedrose;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;


public class ItemTest {
    
      @Test
    void foo_the_test() {
           Item item = new Item("I´m alive", 1, 1);
           System.out.println(item);
           
           MatcherAssert.assertThat(item.toString(), Matchers.is("I´m alive, 1, 1"));
    }
    
}
