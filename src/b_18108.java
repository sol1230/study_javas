import java.util.Scanner;

// 문제 : 태국은 불기 사용, 한국은 서기 사용
//         불기를 서기로 바꿔주는 프로그램 작성

public class b_18108 {

  public static int year(int t_year) {
    int k_year = t_year - 543;
    return k_year;
  }

  public static void main(String[] args) {
    // 테스트 케이스
    // 2541 - 543 = 1998

    // 입력 : 서기 연도를 알아보고 싶은 불기 연도 y(1000<= y <= 3000)
    Scanner sc = new Scanner(System.in);

    int t_year = sc.nextInt();

    // 처리
    b_18108 main = new b_18108();
    int k_year = b_18108.year(t_year);

    // 출력
    System.out.println(t_year - 543);
  }
}
// public class p18108{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();
//         System.out.println(year - 543);
//     }
// }
