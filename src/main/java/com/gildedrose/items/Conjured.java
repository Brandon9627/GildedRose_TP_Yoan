package com.gildedrose.items;

import com.gildedrose.Item;

public class Conjured {
    Item item;
    public Conjured(Item item){
        this.item = item;
    }

    public void updateQuality(){
        AnyItem anyItem = new AnyItem(item);
        for (int i = 0; i < 2; i++) {
            anyItem.updateQuality();
        }
    }
}
