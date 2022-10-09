package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.Process;


public class AnyItem {
    Item item;
    public AnyItem(Item item){
        this.item = item;
    }
    public void updateQuality(){
        Process update = new Process(item);
        if (item.quality > 0) {
            update.reduceQuality();
        }
        if (item.sellIn < 0 && item.quality > 0) {
            update.reduceQuality();
        }
    }
}
