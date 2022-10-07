package com.gildedrose.items;

import com.gildedrose.Item;

public class BackstagePasses {
    Item item;
    public BackstagePasses(Item item){
        this.item = item;
    }
    public void updateQuality(){
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality = 0;
        } else {
            if (item.quality < 50) {
                item.quality++;
            }
            if (item.sellIn < 10 && item.quality < 50) {
                item.quality++;
            }
            if (item.sellIn < 5 && item.quality < 50) {
                item.quality++;
            }
        }
    }
}
