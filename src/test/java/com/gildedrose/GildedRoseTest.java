package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {
// ********** Example given **********
  @Test
  @DisplayName("Test that the name is unchanged")
  void testName() {
    Item element = new Item("foo", 0, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.name, is("foo"));
  }

// ********** Tests from requirements ***********
  @Test
  @DisplayName("Test that when SellIn<0, quality decreases by 2")
  void testQualityDecreasesTwice() {
      Item element = new Item("Any", 0, 2);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(0));
  }

  @Test
  @DisplayName("Test that a product's quality can never be negative")
  void testQualityAtZero() {
      Item element = new Item("Any", 1, 0);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(0));
  }

  @Test
  @DisplayName("Aged Brie, Quality will increase with time")
  void testAgedBrieQualityIncreasesBy1() {
      Item element = new Item("Aged Brie", 1, 40);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(41));
  }

  @Test
  @DisplayName("Aged Brie quality will not raise above 50")
  void testAgedBrieQualityMaxFifty() {
      Item element = new Item("Aged Brie", 10, 50);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(50));
  }

  @Test
  @DisplayName("Sulfuras, sellin remains constant and quality is always set to 80")
  void testSulfurasQualityAndSellInConstant() {
      Item element = new Item("Sulfuras, Hand of Ragnaros", 10, 50);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(80));
  }

  @Test
  @DisplayName("Backstage passes, quality increases by 1 with time if sellin > 10")
  void testBackstageQualityIncreasesBy1() {
      Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(21));
  }

  @Test
  @DisplayName("Backstage passes, quality increases by 2 with time if 5 < sellin <= 10")
  void testBackstageQualityIncreasesBy2() {
      Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 6, 20);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(22));
  }

  @Test
  @DisplayName("Backstage passes, quality increases by 3 with time if 0 < sellin <= 5")
  void testBackstageQualityIncreasesBy3() {
      Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(23));
  }
  @Test
  @DisplayName("Backstage passes, will not raise if quality is 50 ")
  void testBackstageQualityNotRaisedMaxFifty() {
      Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 8, 50);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(50));
    }
  @Test
  @DisplayName("Backstage passes, will not raise above 50 if 5 < sellin <= 10 and quality=49")
  void testBackstageQualityIncreasesLessThan2MaxFifty() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 8, 49);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.quality, is(50));
    }

  @Test
  @DisplayName("Backstage passes, will not raise above 50 if 0 < sellin <= 5 and quality>=48")
  void testBackstageQualityIncreasesLessThan3MaxFifty() {
        Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 48);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.quality, is(50));
    }

  @Test
  @DisplayName("Backstage passes, quality = 0 after concert, that is, when Sellin < 0")
  void testBackstageQualityIsZero() {
      Item element = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(0));
  }

  @Test
  @DisplayName("Conjured will decrease by 2 with time if sellin >=0")
  void testConjuredDecreasesBy2(){
      Item element = new Item("Conjured", 1, 40);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(38));
  }

  @Test
  @DisplayName("Conjured will decrease by 4 with time if sellin < 0")
  void testConjuredDecreasesBy4(){
      Item element = new Item("Conjured", 0, 40);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(36));
  }
  @Test
  @DisplayName("Conjured will not decrease below zero when sellin < 0")
  void testConjuredDecreasesBy2Max50(){
        Item element = new Item("Conjured", 0, 2);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.quality, is(0));
    }

  @Test
  @DisplayName("Conjured will remain the same if quality is 0")
  void testConjuredStayZero(){
      Item element = new Item("Conjured", 10, 0);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(0));
    }

// ********** Tests remaining to cover the entire code **********

  @Test
  @DisplayName("Test Aged Brie when SellIn<0, quality increases by 2")
  void testAgedBrieQualityIncreasesTwice() {
      Item element = new Item("Aged Brie", 0, 10);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(12));
  }

  @Test
  @DisplayName("Test Aged Brie when SellIn<0 and Quality=49. since, max is 50, quality increases by 1 instead of 2")
  void testAgedBrieQualityIncreasesBy1Max50() {
        Item element = new Item("Aged Brie", 0, 49);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.quality, is(50));
    }

  @Test
  @DisplayName("Test Sulfuras when SellIn<0, quality remains constant")
  void testSulfurasQualityAndSellInConstantBelowZero() {
        Item element = new Item("Sulfuras, Hand of Ragnaros", -1, 80);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.quality, is(80));
    }

  @Test
  @DisplayName("Test Item toString return value")
  void testStringReturn() {
        Item element = new Item("Sulfuras, Hand of Ragnaros", 5, 10);
        assertThat(element.toString(), is("Sulfuras, Hand of Ragnaros, 5, 10"));
    }

// ***** Test to complete Pitest *****

  @Test
  @DisplayName("Test that normal items when SellIn<0, quality decreases by 1 if quality = 1")
  void testQualityDecreasesBy1MinZero() {
      Item element = new Item("Any", 0, 1);
      GildedRose app = new GildedRose(new Item[] {element});
      app.updateQuality();
      assertThat(element.quality, is(0));
  }

    @Test
    @DisplayName("Test that normal items when SellIn>0, quality decreases by 1")
    void testQualityDecreasesBy2MinZero() {
        Item element = new Item("Any", 1, 2);
        GildedRose app = new GildedRose(new Item[] {element});
        app.updateQuality();
        assertThat(element.quality, is(1));
    }
}
