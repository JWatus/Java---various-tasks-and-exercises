package canvas;

public class Main {

    public static void main(String[] args) {

        MyCanvas c = new MyCanvas(10, 10);
        c.draw(1, 1, 7, 7);
        c.fill(4, 4, 'A');
        c.drawCanvas();
        for (String[] x : c.canvas) {
            System.out.println();
            for (String y : x) {
                System.out.print(y);

            }
        }
    }
}
