package org.task1;

public class Box {
    private long length;
    private long width;
    private long height; // double


    public Box(long length, long width, long height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(long length) {
        if (length <= 0) {
            return;
        }

        this.length = length;
    }

    private void setWidth(long width) {
        if (width <= 0) {
            return;
        }

        this.width = width;
    }

    private void setHeight(long height) {
        if (height <= 0) {
            return;
        }

        this.height = height;
    }

    public long getSurfaceArea() {
        return 2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public long getLateralSurfaceArea() {
        return 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public long getVolume () {
        return this.length * this.width * this.height;
    }
}
