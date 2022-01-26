package com.HarniK.Assisted_Project;

public class matrix {
	public static void main(String[] args){
		int row1 = 2, column1 = 3;
		int row2 = 3, column2 = 2;
		int[][] firstMatrix = { {2, 5, -4}, {6, 0, 0} };
		int[][] secondMatrix = { {2, 1}, {0, -2}, {0, 5} };
		
		int[][] product = multiply_Matrices(firstMatrix, secondMatrix, row1, column1, column2);
		displayProduct(product);
		}
	
	public static int[][] multiply_Matrices(int[][] firstMatrix, int[][] secondMatrix, int row1, int column1, int column2){
		int[][] product = new int[row1][column2];
		for(int i = 0; i <row1; i++){
			for (int j = 0; j < column2; j++) {
				for (int k = 0; k < column1; k++){
					product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
							}
				}
		}
		return product;
		}
	
	public static void displayProduct(int[][] product){
		System.out.println("Product of two matrices is: ");
		for(int[] row : product){
			for (int column : row){
				System.out.print(column + "    ");
				}
			System.out.println();
			}
		}
	}
