import java.util.Scanner;

public class Array02 {
    public static void main(String[] args){
        int count = 0;

        Scanner sc = new Scanner(System.in);

        String Text1;
        String Text2;

        // 각각의 문자열의 알파벳의 빈도수
        int[] a = new int[26];
        int[] b = new int[26];

        Text1 = sc.next();
        Text2 = sc.next();

        // 알파벳 소문자 - 'a'를 통해 알파벳의 순서에 맞는 인덱스에 카운트
        for(int i = 0; i < Text1.length(); i++){
            a[Text1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < Text2.length(); i++){
            b[Text2.charAt(i) - 'a']++;
        }

        // 빈도 수의 차가 음수 일 수 있기 때문에 절대값 메소드 사용
        for(int i = 0; i < 26; i ++){
            count += Math.abs((a[i] - b[i]));
        }

        System.out.print(count);
    }
}
