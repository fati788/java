public class factoria {

    public static void main(String[] args) {

        // factorial
        // 5! = 5*4*3*2*1

        double tptal =1 ;

        for (int i = 8; i >=2 ; i--) {
            tptal = tptal * i;


            System.out.println("Factorial :" + i + " " + tptal);



        }
        System.out.println("El factorial es : " + tptal);
    }
}
