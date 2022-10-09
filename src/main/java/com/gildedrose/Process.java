package com.gildedrose;

public class Process {
    Item item;
    public int maxQuality = 50;
    public int minQuality = 0;

    public Process(Item item){
        this.item = item;
    }

    public void sellInTime(){
        item.sellIn--;
    }

    public void raiseQuality(int increment){
        for (int i = 0; i < increment; i++) {
            if (item.quality < maxQuality) {
                item.quality++;
            }
        }
    }

    public void reduceQuality(int decrement){
        for (int i = 0; i < decrement; i++) {
            if (item.quality > minQuality) {
                item.quality--;
            }
        }
    }

    public void setQuality(int quality){
        item.quality = quality;
    }

    public Boolean sellInTimeBelow(int sellIn){
        return item.sellIn < sellIn;
    }

    public Boolean sellInTimeAbove(int sellIn){
        return item.sellIn > sellIn;
    }
}
