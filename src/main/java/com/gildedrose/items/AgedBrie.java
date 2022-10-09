package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.Process;

public class AgedBrie {
    Item item;
    public AgedBrie(Item item) {
        this.item = item;
    }
    public void updateQuality(){
        Process update = new Process(item);
        if (item.quality < 50) {
            update.raiseQuality();
        }
        if (item.sellIn < 0 && item.quality < 50) {
            update.raiseQuality();
        }
        }
}
