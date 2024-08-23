import java.util.Scanner;

public class Array03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int max = 0;
        // 숫자의 빈도수를 카운트 하기 위한 배열
        int[] a = new int[10];

        int num = sc.nextInt();

        // 자릿수 와 나머지 개념을 사용하여 숫자의 빈도수 카운트
        while(num != 0){
            a[num % 10]++;
            num /= 10;
        }

        // 6과 9는 동일하게 사용이 가능하며, 한 세트에 2개가 있다고 생각할 수 있기 때문에 6과 9의 갯수가 홀수 또는 짝수일 때의 상황을 나누어 카운트
        int num2 = a[6] + a[9];

        if(num2 % 2 == 0){
            a[6] = num2 / 2;
            a[9] = 0;
        }
        else{
            a[6] = (num2 / 2) + 1;
            a[9] = 0;
        }

        // 가장 많은 빈도수를 가진 숫자의 세트 만큼 필요로 하기 때문에 max 값을 구하여 출
        for(int i : a){
            if( i > max){
                max = i;
            }
        }

        System.out.print(max);
    }
}
