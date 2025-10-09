package org.example.task2;

import java.util.Arrays;

public class Cart {

    private final int maxBasketful = 100;

    private final Item[] contents = new Item[maxBasketful];
    private int index;

    public Item[] getContents() {
        return Arrays.copyOf(this.contents, this.index);
    }


    public void removeById(int id) {

        if (this.index == 0) {
            return;
        }

        int foundItemIndex = this.findItemInArray(id);

        if (foundItemIndex == -1) {
            return;
        }

        if (foundItemIndex == index - 1) {
            contents[index - 1] = null;
            index--;
            return;
        }

        this.shiftArray(foundItemIndex);
    }

    private void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < this.index - 1; i++) {
            this.contents[i] = this.contents[i + 1];
        }
        this.contents[this.index-1] = null;
        this.index--;
    }

    private int findItemInArray(int id) {
        for (int i = 0; i < this.index; i++) {
            Item item =  this.contents[i];
            if (item.getId() == id) {
                return i;
            }
        }

        return -1;
    }

    public void add(Item item) {
        if (this.isCartFull()) {
            return;
        }

        this.contents[this.index] = item;
        this.index++;
    }

    public boolean isCartFull() {
        return this.index == this.contents.length;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(Arrays.copyOf(this.contents, this.index)) +
                '}' + "\n";
    }
}
