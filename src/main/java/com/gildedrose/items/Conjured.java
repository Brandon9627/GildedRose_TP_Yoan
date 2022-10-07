package com.gildedrose.items;

import com.gildedrose.Item;

public class Conjured {
    Item item;
    public Conjured(Item item){
        this.item = item;
    }

    public void updateQuality(){
        item.sellIn --;
        for(int i=0; i<2; i++){
            if (item.quality > 0) {
                item.quality--;
            }
            if (item.sellIn < 0 && item.quality > 0) {
                item.quality--;
            }
        }
    }
}
