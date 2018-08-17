public class ForByFor {
    public static void main(String[] args){
        for(int a = 0; a < 3; a++) {
            System.out.print("|");

            for(int b = 0; b < 3; b++ ){

            for (int c = 0; c < 3; c++) {
                if(b==1 && a == 1){
                    System.out.print("#");
                }else if(a==1){
                    System.out.print("*");
                }else if(b == 1 && a!=1){
                    System.out.print("$");
                }else{
                    System.out.print("&");
                }
            }

            System.out.print("|");
        }
            System.out.print("\n");
        }




//        for (int i = 0; i < 3; i++) {
//            System.out.print("|");
//
//            for (int j = 0; j < 3; j++) {
//                for (int k = 0; k < 3; k++) {
//                    System.out.print("*");
//                }
//                System.out.print("|");
//            }
//            System.out.println("");
//        }
    }
}
