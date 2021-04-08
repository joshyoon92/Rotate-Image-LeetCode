package com.company;

public class RotateImage {

    private static int N;
    public static void rotate(int[][] matrix){
        transpose(matrix);
        reflect(matrix);
        N = matrix.length;
        System.out.println("Matrix rotated!");

    }
    public static void transpose(int[][] matrix){
        for (int i=0; i<N; i++){
            for (int j=i; j<N; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void reflect(int[][] matrix){
        for (int i=0; i<N; i++){
            for (int j=0; j<(N/2); j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j];
                matrix[i][N-1-j] = temp;
            }
        }
    }

}
