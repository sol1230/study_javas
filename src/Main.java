import java.util.Scanner;

// b_8993_analysis.txt

public class Main{
    public int sum(int input){
        int sum = 0;
        for(int i = 1; i <= input; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // 합 구함
        Main main = new Main();
        int output = main.sum(input);
        
        // 출력
        System.out.println(output);

        sc.close();
    }
}






// public class Main {
// // 4. 테스트케이스
// //  3 --> 6
// //  5 --> 15
// //  1 --> 1
//     public static void main(String[] args) {
//         // 반복값 입력
//         Scanner sc = new Scanner(System.in);

//         int input = sc.nextInt();
        
//         // 합 구합
//         int sum = 0;
//         for(int i = 1; i <= input; i++){
//             sum = sum + i;
//         }
//         // 합한 값 출력
//         System.out.println(sum);
//         sc.close();
//     }
    
// }
