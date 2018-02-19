package canvas;

class MyCanvas {

    int height;
    int width;
    String[][] canvas;

    public MyCanvas(int width, int height) {

        this.height = height;
        this.width = width;

        canvas = new String[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                canvas[i][j] = " ";
            }
        }
    }

    public MyCanvas draw(int x1, int y1, int x2, int y2) {

        for (int i = 0; x1 <= i && i <= x2; i++) {
            for (int j = 0; y1 <= j && j <= y2 ; j++) {
                canvas[i][j] = "x";
                System.out.println(canvas[i][j]);
            }
        }
        return this;
    }

    public MyCanvas fill(int x, int y, char ch) {






        return this;
    }



    public String drawCanvas() {






        return "draw the canvas with borders";
    }
}