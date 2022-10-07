package com.gildedrose.items;

import com.gildedrose.Item;

public class Sulfuras {
    Item item;
    public Sulfuras(Item item){
        this.item = item;
    }

    public void updateQuality(){
        item.quality = 80;
    }
}
