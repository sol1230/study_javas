import java.util.Scanner;

// 문제 : 두 정수 A와 B를 입력받은 다음, A+B 출력
public class p10950 {
   public int t(int a, int b) {
    int output_t = a + b;
    return output_t;
    
   }
    public static void main(String[] args) {
        // 입력 : 첫째 줄에 T개수 주어짐, 테스트케이스는 한 줄
        // 각 줄에 A, B (0<A, B<10)
        // 각 테스트 케이스 마다 A+B 출력

        // 입력
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // 처리
        p10950 main = new p10950();
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int output_t = main.t(a, b);
        
        // 출력
        System.out.println(output_t);
        }
        sc.close();
    } 
}


// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();

// for(int i = 0; i < t; i++){
//     int a = sc.nextInt();
//     int b = sc.nextInt();

// // 출력
//     System.out.println(a+b);
// }
// sc.close();