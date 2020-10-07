package laa;

public class Ordenacao {

    public String printaVetor(int[] array) {
        StringBuilder construtor = new StringBuilder();
        for (int elemento : array) {
            construtor.append(elemento).append(",");
        }
        return construtor.toString();
    }

    public int[] SelectionSort(int[] array) {
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

    public int[] BubbleSort(int[] num) {

        for (int i = 0; i < num.length - 1; i++) {

            for (int j = 0; j < (num.length - 1) - i; j++) {

                if (num[j] > num[j + 1]) {

                    int varaux = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = varaux;

                }
            }

        }
        return num;
    }

    private static void print(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (i == num.length - 1) {
                System.out.println(num[i]);

            } else {
                System.out.print(num[i] + ", ");
            }
        }

    }

    public int[] InsertionSort(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int j = i;
            int Insert = numeros[i];

            while ((j > 0) && (numeros[j - 1] > Insert)) {
                numeros[j] = numeros[j - 1];
                j--;

            }
            numeros[j] = Insert;
        }
        return numeros;

    }

    public int[] HeapSort(int[] numeros) {
        int n = numeros.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(numeros, n, i);
        }

        for (int i = n - 1; i > 0; i--) {

            int temp = numeros[0];
            numeros[0] = numeros[i];
            numeros[i] = temp;

            heapify(numeros, i, 0);
        }
        return numeros;
    }

    void heapify(int arr[], int n, int i) {
        int maior = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[maior]) {
            maior = l;
        }

        if (r < n && arr[r] > arr[maior]) {
            maior = r;
        }

        if (maior != i) {
            int troca = arr[i];
            arr[i] = arr[maior];
            arr[maior] = troca;

            heapify(arr, n, maior);
        }
    }

}
