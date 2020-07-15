package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getSellIn() {
        return this.sellIn;
    }

    public int getQuality() {
        return this.quality;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void upgrade() { }

    public void decreaseQuality() {
        if (getQuality() > 0) {
            setQuality(getQuality() - 1);
        }
    }

    public void increaseQuality() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);
        }
    }
}
