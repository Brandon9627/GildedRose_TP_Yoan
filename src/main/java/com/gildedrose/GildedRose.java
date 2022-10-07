package com.gildedrose;

import com.gildedrose.items.ItemList;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemList itemList = new ItemList(item);
            itemList.selection();
        }
    }
}