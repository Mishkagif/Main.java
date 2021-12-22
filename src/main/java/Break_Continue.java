public class Break_Continue {
    public static void main(String[] args) {

        for (int i = 0; i <=15 ; i++) {
            if (i%2==0) {
                continue;
            }
        }




        int i = 5;
        while (true) {
            if (i==15){
                break;
            }
            System.out.println("Мы вышли из цикла "+i);
            i++;
        }
    }
}
