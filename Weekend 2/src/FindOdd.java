public class FindOdd {

    public static int findIt(int[] A) {

        int oddCount = 0;
        int odd = 0;

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {

                if (A[i] == A[j]) {

                    oddCount = oddCount + 1;
                }
            }

            if (oddCount % 2 != 0) {

                odd = A[i];
                break;
            }
        }

        System.out.println(odd);

        return odd;
    }
}

//          Given an array, find the int that appears an odd number of times.
//          There will always be only one integer that appears an odd number of times.