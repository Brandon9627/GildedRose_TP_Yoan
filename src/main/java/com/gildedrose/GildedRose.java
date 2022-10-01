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
                    if (item.sellIn <= 0) {
                        item.quality = 0;
                    } else {
                        if (item.quality < 50) {
                            item.quality++;
                        }
                        if (item.sellIn < 11 && item.quality < 50) {
                            item.quality++;
                        }
                        if (item.sellIn < 6 && item.quality < 50) {
                            item.quality++;
                        }
                    }
                    item.sellIn--;
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    item.quality = 80;
                    break;
                case "Conjured":
                    item.sellIn --;
                    if (item.quality > 0) {
                        item.quality -= 2;
                    }
                    if (item.sellIn < 0 && item.quality > 0) {
                        item.quality -= 2;
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