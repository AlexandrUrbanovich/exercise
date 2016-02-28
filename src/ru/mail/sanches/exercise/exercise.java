package ru.mail.sanches.exercise;

import java.util.Random;

/**
 * Created by Александр on 28.02.2016.
 */
public class exercise {

    public static void main(String[] args){
        int[][] A = new int[5][8];
        Random random = new Random();
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 8; j++){
                A[i][j] = random.nextInt(90) + 10;
            }
        }

        System.out.println("Массив 8х5 из случайных чисел");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 8; j++){
                System.out.print(A[i][j] + ", ");
            }
            System.out.println();
        }

    }
}
