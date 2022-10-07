package com.gildedrose;

class GildedRose {
    Item[] items;
    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for (Item item : items) {

            switch (item.name) {
                case "Aged Brie":
                    agedBrie(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    backstagePasses(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    sulfuras(item);
                    break;
                case "Conjured":
                    conjured(item);
                    break;
                default:
                    anyItem(item);
                    break;
            }
        }
    }

    private void agedBrie(Item item){
        item.sellIn--;
        if (item.quality < 50) {
            item.quality++;
        }
        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }
    }

    private void backstagePasses(Item item){
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

    private void sulfuras(Item item){
        item.quality = 80;
    }

    private void conjured(Item item){
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

    private void anyItem(Item item){
        item.sellIn --;
        if (item.quality > 0) {
            item.quality --;
        }
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality --;
        }
    }

}