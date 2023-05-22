package ExercicioVetores;

import java.util.Scanner;

/**
 * Exercicios
 */
public class Exercicios {

    Scanner sc = new Scanner (System.in);

    public void exercicio6 () {
        //laço dentro de laço 
        //vetor media dos alunos 

        double aluno[] = new double [10]; //esse vai recebre as medias 
        double notas[] = new double[4]; //esse vai receber as notas 
        //laço para receber a media 
        int cont=0;
        for(int i=0;i<aluno.length;i++) {
            //laço para receber as notas 
            for (int j=0;j<notas.length;j++) {
                System.out.println("digite a nota do aluno " +(j+1)+" do aluno "+(i+1)+":");
                notas[j]= sc.nextDouble();
                aluno[i]+=notas[j];//acumular as notas do aluno i
                
            }
            aluno [i]/=notas.length; //calcula a media dividindo pelo numero de notas
            //conta o numero de alunos com notas >7
            if (aluno[i]>=7){
                cont++;
                
            }

        }
        for (int i = 0; i < aluno.length; i++) {
            System.out.println("a media do aluno" +(i=1)+ "é" +aluno[i]);

        }

        System.out.println("o numero de alunos com nota ");
    }
}
