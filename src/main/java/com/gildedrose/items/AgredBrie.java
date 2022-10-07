package com.gildedrose.items;

import com.gildedrose.Item;

public class AgredBrie {
    Item item;
    public AgredBrie(Item item) {
        this.item = item;
    }
    public void updateQuality(){
        item.sellIn--;
        if (item.quality < 50) {
            item.quality++;
        }
        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }
    }
}
