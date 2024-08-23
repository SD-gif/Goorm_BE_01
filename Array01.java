import java.util.Scanner;

public class Array01 {
    public static void main(String[] args){
        // 세 개의 자연수를 저장하기 위한 배열
        int[] numArr = new int[3];
        // 0 ~ 9의 숫자가 몇 번 사용 되었는지 카운트하기 위한 용도의 배열
        int[] numArr2 = new int[10];
        int result = 1;

        // 세 개의 자연수 입력
        Scanner sc = new Scanner(System.in);
        for( int i = 0; i < numArr.length; i++){
            int num = sc.nextInt();
            numArr[i] = num;
        }

        // 세 개의 자연수 곱셈 결과
        for( int i : numArr){
            result *= i;
        }

        // 나머지를 통해 각 자릿수의 숫자가 무엇인지 확인 및 0 ~ 9 숫자의 카운트를 올린다
        while(result != 0){
            int i = result % 10;
            numArr2[i]++;
            result /= 10;
        }

        for(int i = 0; i < numArr2.length; i++) {
            System.out.println(numArr2[i]);
        }
    }
}

