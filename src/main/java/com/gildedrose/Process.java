package com.gildedrose;

public class Process {
    Item item;

    public Process(Item item){
        this.item = item;
    }

    public void timeSellIn(){
        item.sellIn--;
    }

    public void raiseQuality(){item.quality++;}

    public void reduceQuality(){
        item.quality--;
    }

    public void setQuality(int quality){
        item.quality = quality;
    }
}
