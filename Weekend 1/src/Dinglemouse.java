public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int catYears = 0;
        int dogYears = 0;

        if (humanYears == 1) {
            catYears = 15;
            dogYears = 15;

        } else if (humanYears == 2) {

            catYears = 15 + 9;
            dogYears = 15 + 9;

        } else if (humanYears > 2) {

            catYears = 15 + 9 + (humanYears - 2) * 4;
            dogYears = 15 + 9 + (humanYears - 2) * 5;
        }

        return new int[]{humanYears, catYears, dogYears};
    }
}

/*
        Kata Task

        I have a cat and a dog.

        I got them at the same time as kitten/puppy. That was humanYears years ago.

        Return their respective ages now as [humanYears,catYears,dogYears]

        NOTES:

        humanYears >= 1

        Cat Years
            15 cat years for first year
            +9 cat years for second year
            +4 cat years for each year after that
        Dog Years
            15 dog years for first year
            +9 dog years for second year
            +5 dog years for each year after that
*/


/*
public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int catYears = 15;
        int dogYears = 15;
        if (humanYears > 1) {
            catYears += 9;
            dogYears += 9;
            if (humanYears > 2) {
                int yearsLeft = humanYears - 2;
                catYears += yearsLeft * 4;
                dogYears += yearsLeft * 5;
            }
        }

        return new int[]{humanYears, catYears, dogYears};
    }

}*/
