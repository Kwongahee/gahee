package com.edu;

public class ArraySort {

	// 메소드는 중복되면 안돼서 메인메소드 밖에서 실행.
	public static void sorting(int[] ary) {
		int loopCnt = ary.length - 1; // 마지막값이 젤 처음위치로 이동하려면 배열크기 -1;

		for (int cnt = 0; cnt < loopCnt; cnt++) { // 숫자만큼 배열 반복.
			int temp = ary[0]; // 첫번째 값으로 temp를 지정..
			for (int i = 0; i < loopCnt; i++) {
				if (ary[i] > ary[i + 1]) {
					// 34 25 > 25 34로 위치 바꾸기
					temp = ary[i];
					ary[i] = ary[i + 1];
					ary[i + 1] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
//		int[] intAry => {34,25,48,12}
//		intAry[0] -> intAry[0+1]; > 다음위치라는 의미
//비교하는 코드.. 3번 비교하면 됨.

		int[] intAry = { 34, 25, 48, 12 };
		int[] intAry2 = { 22, 56, 99, 12 };
		// 제일 마지막 값을 최소값으로 지정.
		// 첫번째 작업. 25,34,12,48 두번째 작업,25.12.34.48 세번째 작업 12.25.34.48
		int loopCnt = intAry.length - 1; // 마지막값이 젤 처음위치로 이동하려면 배열크기 -1;

		sorting(intAry);
		sorting(intAry2);

		// 변경된 결과 출력.
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i] + "");
		}

	}

}

