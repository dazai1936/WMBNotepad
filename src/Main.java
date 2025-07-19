import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("WMBNotepad에 오신 걸 환영합니다.");
        System.out.println("1. 새로 작성");
        System.out.println("2. 목록");
        System.out.println("3. 종료");

        Memo m = new Memo();
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        String str = sc.next(); // 입력받은 문자열을 str에 저장

        switch (str) {
            case "1":
                m.write(sc);
                break;

            case "2":
                //목록
                break;
            case "3":
                //종료
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
    }
}
