package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

  @Test
  @DisplayName("Test that the name is unchanged")
  void testName() {
    Item element = new Item("foo", 0, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals("foo", element.name, "the name changed");
  }

  @Test
  @DisplayName("Test that the quality is changed")
  void testquantity() {
    Item element = new Item("+5 Dexterity Vest", 10, 20);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(19, element.quality, "the quality changed");
  }

  @Test
  @DisplayName("Test that the quality is augmented")
  void testAugment() {
    Item element = new Item("Aged Brie", 2, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(1, element.quality, "the quality changed");
  }

  @Test
  @DisplayName("Test that the quality can't be more than 50")
  void testPlus50() {
    Item element = new Item("Aged Brie", 2, 49);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "the quality changed");
  }

  @Test
  @DisplayName("Test that the quality is unchanged")
  void testunchanged() {
    Item element = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(80, element.quality, "the quality unchanged");
  }

  @Test
  @DisplayName("Test that the quality can't be more than 50")
  void test_Plus50() {
    Item element = new Item("Aged Brie", 2, 50);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "the quality changed");
  }


}


