package Order.SortsTest;

import Order.Sorts.ShellSort;

public class ShellSortTest {
    public static void ordenar(int vezes, int tamanho, Long seed) {
        int[] arr = CriarArrayRamdom.createArray(tamanho, seed);
        long ta = 0;
        int i;

        for (i = 0; i < vezes; i++) {
            int[] array = arr;
            long ti = System.nanoTime();
            ShellSort.sort(array);
            long tf = System.nanoTime();
            long td = tf - ti;
            ta += td; 
        }
        System.out.println(ta/i + " ns tempo médio para ordenar");
    }
}
