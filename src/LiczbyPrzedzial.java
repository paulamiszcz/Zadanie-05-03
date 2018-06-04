public class LiczbyPrzedzial {
    public static void main(String[] args){

        double x = 0;
        double y = 0;

        while (x < 3.1){
            System.out.printf("%.1f\n", x);
            x = x + 0.1;
        }
        do{
            System.out.printf("%.1f\n",y);
            y = x + 0.1;
        } while (y<3.1);
    }
}
