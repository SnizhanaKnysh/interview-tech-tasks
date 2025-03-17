public class Main {

    public static void main(String[] args) {

        System.out.println(Fu(3));
        System.out.println(Fu2(3));

    }

    static int Fu(final int n) {


        if (n == 0) {
            return 1;
        }
        if(n == 1) {
            return 3;
        }

        //result = Fu(3) + Fu(2)  [7 + 4 = 11]
        //result Fu(3) = Fu(2) + Fu(1) -> result F(2) = Fu(1) + Fu(0) = 4



        return Fu(n-1) + Fu(n-2);

    }

    static int Fu2(final int n) {

        int fuZero = 1;
        int fuOne = 3;

        for (int i = 2; i <= n; i++) {
            int currentResult = fuZero + fuOne;
            fuZero = fuOne;
            fuOne = currentResult;


        }
        return fuOne;
    }


}

/*Program the function Fu(n) = Fu(n-1) + Fu(n-2), Fu(0) = 1, Fu(1) = 3 for any n.
* 1. calculate fist operation
* 2. check the condition if 0 or 1
* 3. calculation of 2nd operation
* 4. check condition
* 5. add  */
