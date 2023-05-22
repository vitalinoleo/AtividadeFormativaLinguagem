package ExercicioFormativa2;

import java.util.Random;

import java.util.Scanner;


    public class ExercicioFormativa {

        public static void main(String[] args) {

            Random random = new Random();

            int numeroSorteado = random.nextInt(1001); 

    
            try (Scanner scanner = new Scanner(System.in)) {

                int tentativas = 0;

                boolean acertou = false;

    
                while (!acertou) {

                    System.out.print("Digite seu palpite: ");

                    int palpite = scanner.nextInt();

                    tentativas++;

    
                    if (palpite == numeroSorteado) {

                        acertou = true;

                    } else if (palpite < numeroSorteado) {

                        System.out.println("Palpite menor do que o número sorteado.");

                    } else {
                        System.out.println("Palpite maior do que o número sorteado.");

                    }

                }

    
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");

            }

        }

    }
        
    
