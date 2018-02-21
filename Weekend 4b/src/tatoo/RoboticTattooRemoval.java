package tatoo;

public class RoboticTattooRemoval {
    public static String[][] robot(String[][] skinScan) {

        for (int i = 0; i < skinScan.length; i++) {
            for (int j = 0; j < skinScan[i].length; j++) {
                if (skinScan[i][j] == "X")
                    skinScan[i][j] = "*";
            }
        }

        return skinScan;


/*        return Arrays.stream(skinScan)
                .map(x -> Arrays.stream(x).map(y -> y.equals("X") ? "*" : y).toArray(i -> new String[i]))
                .toArray(i -> new String[i][i]);*/

/*        for (String[] row : skinScan) {
            for (int i = 0; i < row.length; i ++) {
                if (row[i].equals("X")) {
                    row[i] = "*";
                }
            }
        }
        return skinScan;
    };*/



    };
}
