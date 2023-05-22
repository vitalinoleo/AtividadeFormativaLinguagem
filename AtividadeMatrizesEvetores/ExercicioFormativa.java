package AtividadeMatrizesEvetores;

import java.util.Random;

import java.util.Scanner;



public class AtividadeMatrizesEvetores {
    public static void main(String[] args) {

        Random random = new Random();

    private int[][] matriz;

    private int linhas;

    private int colunas;

    public Matriz(int linhas, int colunas) {

        this.linhas = linhas;

        this.colunas = colunas;

        this.matriz = new int[linhas][colunas];

    }

    public void preencherMatriz() {

        Random random = new Random();

        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas; j++) {

                matriz[i][j] = random.nextInt(10);

            }

        }

    }

    public void substituirValores() {

        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas; j++) {

                if (i > j) {

                    matriz[i][j] = 1;

                } else if (i == j) {

                    matriz[i][j] = 0;

                } else {

                    matriz[i][j] = 2;

                }

            }

        }

    }

    public void imprimirMatriz() {

        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas; j++) {

                System.out.print(matriz[i][j] + " ");

            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        Matriz minhaMatriz = new Matriz(linhas, colunas);
        System.out.println("Matriz original:");
        minhaMatriz.preencherMatriz();
        minhaMatriz.imprimirMatriz();

        System.out.println("\nMatriz modificada:");
        minhaMatriz.substituirValores();
        minhaMatriz.imprimirMatriz();
    }
}
