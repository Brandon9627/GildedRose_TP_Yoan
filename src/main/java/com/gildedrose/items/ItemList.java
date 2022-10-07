package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.items.*;

public class ItemList {
    Item item;
    public ItemList(Item item) {
        this.item = item;
    }

    public void selection(){
        switch (item.name) {
            case "Aged Brie":
                AgredBrie agedBrie = new AgredBrie(item);
                agedBrie.updateQuality();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                BackstagePasses backstage = new BackstagePasses(item);
                backstage.updateQuality();
                break;
            case "Sulfuras, Hand of Ragnaros":
                Sulfuras sulfuras = new Sulfuras(item);
                sulfuras.updateQuality();
                break;
            case "Conjured":
                Conjured conjured = new Conjured(item);
                conjured.updateQuality();
                break;
            default:
                AnyItem anyItem = new AnyItem(item);
                anyItem.updateQuality();
                break;
        }
    }
}
