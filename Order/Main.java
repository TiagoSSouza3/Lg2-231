package Order;

import Order.SortsTest.InsertionSortTest;

import java.util.Scanner;

import Order.SortsTest.BubbleSortTest;
import Order.SortsTest.ShellSortTest;
import Order.SortsTest.QuickSortTest;
import Order.SortsTest.SelectionSortTest;
import Order.SortsTest.MergeSortTest;
import Order.SortsTest.HeapSortTest;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("Digite o numero de repetiçoes, o tamanho da lista e a semente desejada: ");
        int vezes = sc.nextInt();
        int tamanho = sc.nextInt();
        Long seed = sc.nextLong();
         */

        int vezes = 100;
        int tamanho = 1024;
        Long seed = 16L;
        
        System.out.println("Digite o numero do tipo de sort desejado:\n1 - Bubble\n2 - Heap\n3 - Insertion\n4 - Merge\n5 - Quick\n6 - Selection\n7 - Shell\nNumero:");
        int index = sc.nextInt();

        switch (index) {
            case 1:
                BubbleSortTest.ordenar(vezes, tamanho, seed);
                break;
            case 2:
                HeapSortTest.ordenar(vezes, tamanho, seed);
                break;
            case 3:
                InsertionSortTest.ordenar(vezes, tamanho, seed);
                break;
            case 4:
                MergeSortTest.ordenar(vezes, tamanho, seed);
                break;
            case 5:
                QuickSortTest.ordenar(vezes, tamanho, seed);
                break;
            case 6:
                SelectionSortTest.ordenar(vezes, tamanho, seed);
                break;
            case 7:
                ShellSortTest.ordenar(vezes, tamanho, seed);
                break;
            default:
                System.out.println("O numero não consta na lista");
                break;
        }
        
        sc.close();
    }
}
