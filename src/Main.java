import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Memo m = new Memo();
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        String str = sc.next(); // 입력받은 문자열을 str에 저장

        if (str.equals("m.Title")) {
            m.read();
        }
        else
        {
            m.write();
        }
    }
}
