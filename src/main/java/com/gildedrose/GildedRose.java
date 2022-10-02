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
                    item.sellIn--;
                    if (item.quality < 50) {
                        item.quality++;
                    }
                    if (item.sellIn < 0 && item.quality < 50) {
                        item.quality++;
                    }
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
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

                    break;
                case "Sulfuras, Hand of Ragnaros":
                    item.quality = 80;
                    break;
                case "Conjured":
                    item.sellIn --;
                    for(int i=0; i<2; i++){
                        if (item.quality > 0) {
                            item.quality--;
                        }
                        if (item.sellIn < 0 && item.quality > 0) {
                            item.quality--;
                        }
                    }
                    break;
                default:
                    item.sellIn --;
                    if (item.quality > 0) {
                        item.quality --;
                    }
                    if (item.sellIn < 0 && item.quality > 0) {
                        item.quality --;
                    }
                    break;
            }
        }
    }
}