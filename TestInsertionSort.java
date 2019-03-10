public class TestInsertionSort{
    public static void main(String[] args){
        InsertionSort insertion = new InsertionSort();
        System.out.println("Vetor desordenado:");
        insertion.printVetor();
        System.out.println("Vetor ordenado:");
        insertion.sort();
        insertion.printVetor();
    }

 }