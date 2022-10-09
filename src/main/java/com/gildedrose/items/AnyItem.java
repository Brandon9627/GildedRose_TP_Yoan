package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.Process;


public class AnyItem {
    Item item;
    public AnyItem(Item item){
        this.item = item;
    }
    public void updateQuality(){
        Process process = new Process(item);
            process.reduceQuality(1);
        if (process.sellInTimeBelow(0)) {
            process.reduceQuality(1);
        }
    }
}
