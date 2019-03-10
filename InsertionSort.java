import java.util.*;

public class InsertionSort {

        private Integer i;
        private Integer j;
        private Integer aux;
        private Integer vetor[] = new Integer[5];

    public InsertionSort(){
        
        for(int z = 0; z < 5; z++){
            vetor[z] = (int) (Math.random() * 50 + 1);
        }
    }
    public void printVetor(){
        System.out.println(Arrays.toString(vetor));
    }
    public void sort(){
        for (i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while ((j >= 0) && (aux < vetor[j]))
            {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
    }      
}
