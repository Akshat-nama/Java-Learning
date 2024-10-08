package pattern;

public class Pattern1 {

    //Rectangle Pattern
    //Print a star pattern with a rows and b columns
    public void rectanglePattern(int a, int b) {
        for (int i = 0; i < a; i++) {

            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

//    public void hollowRectangle(int a, int b){
//        for (int i = 0; i < a ; i++){
//            for (int j = 0 ; j < b ; j++){
//                if(i == 0 || i == a-1) {
//                    System.out.print("* ");
//                }else if(j==0 || j == b-1){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//
//        }
//    }

    public void hollowRectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    public void halfPyramid(int a , int b){
        for( int i = 1; i <= a ; i ++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void invertedHalfPyramid(int n){
        for( int i = 1; i <= n ; i ++){
            for(int j = n ; j >= i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void invertedHalfPyramid180(int n){
        for( int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
               if(j>n-i){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }

    public void halfPyramidWithNumbers(int n){
        int a =  1;
        for( int i = 1; i <= n ; i++){

            for(int j = 1 ; j <= i ; j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    public void invertedHalfPyramidWithNumbers(int n){
        for( int i = 1; i <= n ; i++){
            for(int j = 1 ; j <=n+1-i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

//    public void butterflyPattern(int n){
//        for(int i = 1 ; i <= n ; i++){
//            for (int j = 1 ; j <= n*2 ; j++){
//                if( j <= i || j >=n*2+1-i ){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i = 1 ; i <= n ; i++){
//            for (int j = n*2 ; j >= 1 ; j--){
//                if( j/2 <= n+1-i  ){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }

    public  void butterflyPattern(int n ){
        //upper half
        for(int i = 1 ; i <= n ; i++){
            //for first half
            for(int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            //for spaces
            int spaces = 2* (n-i);
            for (int j = 1 ; j <=spaces ; j++){
                System.out.print(" ");
            }

            //for second half
            for(int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //lower half
        for(int i = n ; i >= 1 ; i--){
            //for first half
            for(int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            //for spaces
            int spaces = 2* (n-i);
            for (int j = 1 ; j <=spaces ; j++){
                System.out.print(" ");
            }

            //for second half
            for(int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
