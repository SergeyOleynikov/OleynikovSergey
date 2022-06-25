
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = 0;
        int z=0;
        n = sc.nextInt();
        int[] mas1 = new int[n];
        for (int i = 0; i < n; i++) {
            mas1[i] = (int) (Math.random() * (n + 1));
        }
        System.out.println("Стандартный массив: ");
        System.out.println(Arrays.toString(mas1));

        Scanner q = new Scanner(System.in);
        System.out.println("Введите число: ");
        int y=q.nextInt();
        for (int i = 0; i < n; i++) {
            if(mas1[i]==y){
                z++;
            }
        }

        int h=0;
        int[] mas2 = new int[z];
        for (int i = 0; i < n; i++){
            if(y==mas1[i]){
                mas2[h]=i;
                h++;

            }

        }
        System.out.println("Массив с индексами заданного значения: ");
        System.out.println(Arrays.toString(mas2));


    }
}
















package com.company;

        import java.util.Scanner;
        import java.util.Arrays;

class main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = 0;
        n = sc.nextInt();

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = (int) (Math.random() * (n + 1));
        }

        int[] C = new int[n];
        for (int i = 0; i < n; i++) {
            C[i] = (int) (Math.random() * (n + 1));
        }

        int size_b = 0;
        for (int e : b)
            if (e > 0)
                C[size_b++] = e*5;

        int[] c = Arrays.copyOf(C, size_b);
        Arrays.sort(c);
        System.out.println("Массив b: ");
        print_array(b);
        System.out.println("Массив C: ");
        print_array(c);
    }

    private static void print_array(int[] a) {
        Arrays.stream(a).forEach(e -> System.out.printf("% 4d", e));
        System.out.println();
    }
}
