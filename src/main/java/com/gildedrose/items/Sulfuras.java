package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.Process;


public class Sulfuras {
    Item item;
    public Sulfuras(Item item){
        this.item = item;
    }

    public void updateQuality(){
        Process update = new Process(item);
        update.setQuality(80);
    }
}
