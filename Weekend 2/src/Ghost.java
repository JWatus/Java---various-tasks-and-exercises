import java.util.Random;

public class Ghost {

    public String getColor() {

        String[] tab = new String[4];

        tab[0] = "white";
        tab[1] = "yellow";
        tab[2] = "purple";
        tab[3] = "red";

        int random = new Random().nextInt(4);

        System.out.println(tab[random]);

        return tab[random];
    }
}

/*
        Create a class Ghost

        Ghost objects are instantiated without any arguments.

        Ghost objects are given a random color attribute of white" or "yellow" or "purple" or "red" when instantiated

        Ghost ghost = new Ghost();
        ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"

        */
