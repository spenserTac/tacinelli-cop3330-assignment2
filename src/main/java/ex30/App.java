package ex30;

public class App {
    public static void mult_table() {
        for (int i = 1; i < 13; i++) {
            String tempinit = String.valueOf(i);

            switch(tempinit.length()){
                case 1:
                    System.out.print(" " + i);
                    break;
                case 2:
                    System.out.print(i);
                    break;
            }

            for (int j = 2; j < 13; j++) {
                // gets number of spaces needed
                String temp = String.valueOf(j*i);
                int spaces = 5 - temp.length();

                for(int m = 0; m < spaces; m++){
                    System.out.print(" ");
                }

                System.out.print((i * j));
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        mult_table();
    }
}
