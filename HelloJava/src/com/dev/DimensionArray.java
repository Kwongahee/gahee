package com.dev;

//2차원배열..
public class DimensionArray {
	public static void main(String[] args) {

	int[][] intRectAry = new int[5][5];
		
		for(int i=0; i<5;i++) {
		int cntNum=1;
			for(int j=0; j<5; j++) {     // 총 25번 돌면서 1씩 증가된 숫자의 배열을 넣음
				intRectAry[i][j] = cntNum++;
			}
		}
		

		for(int i=0; i<5;i++) {
			for(int j=0; j<5; j++) { 
				//System.out.println("["+i+"]"+ j + "=>" +intRectAry[i][j]);;
			System.out.printf("%3d",intRectAry[i][j]); 
			}
			
			System.out.println();
		}
		
		
		
		
		
		int[] intAry = {20, 38, 45}; // |20|38|45|
		System.out.println(intAry[0]); //20
		
	int[][] intDimAry = {{23,34}, {12,32,45},{37,39}};
		int[] anotherAry = intDimAry[0]; //=> int[] 
		System.out.println(anotherAry[0] == intDimAry[0][0]);		

		//34를 출력하고 싶으면
		System.out.println(intDimAry[0][1]);

		//32를 33으로 바꿀려면
		intDimAry[1][1] = 33;
		
		//32를 출력하고 싶으면
		System.out.println(intDimAry[1][1]);
		

	}
}
