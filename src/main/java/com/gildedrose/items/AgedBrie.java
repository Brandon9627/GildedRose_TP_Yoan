package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.Process;

public class AgedBrie {
    Item item;
    public AgedBrie(Item item) {
        this.item = item;
    }
    public void updateQuality(){
        Process process = new Process(item);
            process.raiseQuality(1);
        if (process.sellInTimeBelow(0)) {
            process.raiseQuality(1);
        }
    }
}
