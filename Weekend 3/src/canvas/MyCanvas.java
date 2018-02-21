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

        for (int i = x1; i <= x2; i++) {

            if (y1 == y2)
                canvas[i][y1] = "x";

            for (int j = y1; j <= y2; j++) {

                if (x1 == x2)
                    canvas[x1][j] = "x";

                if (x1 != x2 && y1 != y2) {
                    canvas[x1][j] = "x";
                    canvas[x2][j] = "x";
                    canvas[i][y1] = "x";
                    canvas[i][y2] = "x";
                }
            }
        }
        return this;
    }

    public MyCanvas fill(int x, int y, char ch) {
        int counter = 0;

        for (int i = 0; i <= width - 1; i++) {
            if (canvas[i][y] == "x" && i < x) {
                counter++;
            }
            if (canvas[i][y] == "x" && i > x) {
                counter++;
            }
        }
        for (int j = 0; j <= height - 1; j++) {
            if (canvas[x][j] == "x" && j < y) {
                counter++;
            }
            if (canvas[x][j] == "x" && j > y) {
                counter++;
            }
        }
        if (counter != 4) {
            throw new java.lang.IllegalArgumentException();
        }

        outerloop:
        for (int i = x; i >= 0; i--) {
            for (int j = y; j >= 0; j--) {
                if (canvas[i][y] == "x") {
                    break outerloop;
                }
                if (canvas[i][j] == "x") {
                    break;
                } else {
                    canvas[i][j] = String.valueOf(ch);
                }
            }
        }
        outerloop:
        for (int i = x; i <= width - 1; i++) {


            for (int j = y; j >= 0; j--) {
                if (canvas[i][y] == "x") {
                    break outerloop;
                }
                if (canvas[i][j] == "x") {
                    break;
                } else {
                    canvas[i][j] = String.valueOf(ch);
                }
            }
        }
        outerloop:
        for (int i = x; i >= 0; i--) {

            for (int j = y; j <= height - 1; j++) {
                if (canvas[i][y] == "x") {
                    break outerloop;
                }
                if (canvas[i][j] == "x") {
                    break;
                } else {
                    canvas[i][j] = String.valueOf(ch);
                }
            }
        }
        outerloop:
        for (int i = x; i <= width - 1; i++) {
            for (int j = y; j <= height - 1; j++) {
                if (canvas[i][y] == "x") {
                    break outerloop;
                }
                if (canvas[i][j] == "x") {
                    break;
                } else {
                    canvas[i][j] = String.valueOf(ch);
                }
            }
        }


        return this;
    }

    public String drawCanvas() {

        for (int i = 0; i < width; i++) {
            canvas[i][0] = "-";
            canvas[i][height] = "-";
            for (int j = 0; j < height; j++) {
                canvas[0][j] = "|";
                canvas[width][j] = "|";
            }
        }
        return "draw the canvas with borders";
    }
}

/*    You are going to write a simple console-style drawing board program.

        Functions
        The drawing board is very simple so only these functions are supported.

        Function	Description
        Create canvas	Create new empty canvas (filled with ' ') with given width and height
        Draw line / rectangle	Draw the line with 'x' which connects the given points.
        If the points are diagonal, a rectangle instead of diagonal line should be drawn
        Fill color	Fill the entire area connected to the given point with given character, also known as "bucket fill" in paint programs
        Output
        Implement the drawCanvas method to return the string contains the entire canvas surrounded by borders with - and |.

        Example
        Empty canvas 4x2

        ------
        |    |
        |    |
        ------
        Drawing 2 lines (0, 2) to (4, 2) and (2, 0) to (2, 4)

        -------
        |  x  |
        |  x  |
        |xxxxx|
        |  x  |
        |  x  |
        -------
        Drawing a rectangle (1, 1) to (5, 4) and fill with o

        ---------
        |       |
        | xxxxx |
        | xooox |
        | xooox |
        | xxxxx |
        |       |
        ---------
        Error handling
        For any invalid input, raise an error/exception depends on the language.

        In Java should throw java.lang.IllegalArgumentException
        In JavaScript should throw the string Out of bounds
        The data type of the arguments is always valid, no need to do type checks.

        Remarks
        The drawing board functions should return the object itself to allow method chaining
        The coordinates are zero-based, therefore the origin is (0, 0), which is at the top-left corner
        The coordinates are inclusive in draw method
        If the area is already filled with different color, fill method should do nothing*/
