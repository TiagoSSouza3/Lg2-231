package Order.SortsTest;

import java.util.Random;

public class CriarArrayRamdom {

   public static int[] createArray(int tamanho, Long semente) {
      Random rd = new Random(semente);
      int[] arr = new int[tamanho];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt();
      }
      return arr;
   }
}
