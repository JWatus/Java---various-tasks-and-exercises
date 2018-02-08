public class Block {

    private int height;
    private int length;
    private int width;

    public Block(int[] tablica) {

        this.width = tablica[0];
        this.length = tablica[1];
        this.height = tablica[2];

    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

}
/*

    Write a class Block that creates a block (Duh..)

        ##Requirements

        The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created.

        Define these methods:

        `getWidth()` return the width of the `Block`

        `getLength()` return the length of the `Block`

        `getHeight()` return the height of the `Block`

        `getVolume()` return the volume of the `Block`

        `getSurfaceArea()` return the surface area of the `Block`

        */
