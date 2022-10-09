package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.Process;


public class BackstagePasses {
    Item item;
    public BackstagePasses(Item item){
        this.item = item;
    }


    public void updateQuality(){
        Process process = new Process(item);
        if (process.sellInTimeAbove(10)) {
            process.raiseQuality(1);
        } else if (process.sellInTimeAbove(5)) {
            process.raiseQuality(2);
        } else if (process.sellInTimeAbove(-1)) {
            process.raiseQuality(3);
        } else {
            process.setQuality(0);
        }
    }
}
