package laa;

public class Ordenacao {
    
    public String printaVetor(int[] array){
        StringBuilder construtor = new StringBuilder();
        for (int elemento : array) {
            construtor.append(elemento + ",");
        }
        return construtor.toString();
    }

    public  int[] SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexDoValorMenor = i;
            for (int j = i; j < array.length; j++) {
                if (array[indexDoValorMenor] > array[j]) {
                    indexDoValorMenor = j;
                }
            }
            int menorValor = array[indexDoValorMenor];
            array[indexDoValorMenor] = array[i];
            array[i] = menorValor;            
        }
        return array;
    }

    public  int[] BubbleSort(int[] numeros) {
        for (int i = 0; i < numeros.length; i++)
        {
            for (int j = 0; j < numeros.length; j++) {

                if (numeros[j] > numeros[j] + 1) {

                    int aux = numeros[j];
                    numeros[j] = numeros[j] + 1;
                    numeros[j + 1] = aux;
                }
            }
        }
        return numeros;
    }
}
