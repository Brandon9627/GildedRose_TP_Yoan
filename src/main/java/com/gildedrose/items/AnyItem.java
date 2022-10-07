package com.gildedrose.items;

import com.gildedrose.Item;

public class AnyItem {
    Item item;
    public AnyItem(Item item){
        this.item = item;
    }
    public void updateQuality(){
        item.sellIn --;
        if (item.quality > 0) {
            item.quality --;
        }
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality --;
        }
    }
}
