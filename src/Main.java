import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Memo m = new Memo();
        Scanner sc = new Scanner(System.in);

        System.out.println("WMBNotepad에 오신 걸 환영합니다.");
        System.out.println("1. 새로 작성");
        System.out.println("2. 목록");
        System.out.println("3. 종료");

        while (true) {

            String str = sc.next();

            switch (str) {
                case "1":
                    m.write(sc);
                    break;
                case "2":
                    //목록 출력
                    break;
                case "3":
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
