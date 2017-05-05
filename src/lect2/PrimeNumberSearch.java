package lect2;

import java.net.SocketPermission;
    import java.util.Arrays;
    import java.util.Scanner;

    public class PrimeNumberSearch {
        public static void main(String[] args) {

            Scanner myScanner = new Scanner(System.in);
            int n;
            int res = 0;

            System.out.println("Введите число для поиска простых чисел: ");
            n = myScanner.nextInt();
            int resArray[] = new int[n];

            if (n <= 1) {
                System.out.println("Введите число больше единицы");
                n = myScanner.nextInt();
            } else {
                for (int i = n; i > 1; i--) {
                    for (int j = i - 1; j > 1; j--) {
                        resArray[j] = i % j;
                        if(resArray[j] == 0){
                            res = 0;
                            continue;
                        }else{
                            ++res;
                            }
                        }
                        if(res == i - 2){
                        System.out.println(i);
                        }
                    }
                }
            }
        }

