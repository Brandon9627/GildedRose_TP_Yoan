package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.Process;


public class BackstagePasses {
    Item item;
    public BackstagePasses(Item item){
        this.item = item;
    }
    public void updateQuality(){
        Process update = new Process(item);
        if (item.sellIn < 0) {
            update.setQuality(0);
        } else {
            if (item.quality < 50) {
                update.raiseQuality();
            }
            if (item.sellIn < 10 && item.quality < 50) {
                update.raiseQuality();
            }
            if (item.sellIn < 5 && item.quality < 50) {
                update.raiseQuality();
            }
        }
    }
}
