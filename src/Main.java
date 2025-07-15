import java.util.Scanner;

public class Memo {
    String Title;
    String Date;
    String Content;

    void write() { //작성
        //다시 스캔을 불러와 내용 작성
    }
    void read() { //읽기
        System.out.println(Content);
    }
    void edit() { //편집
        System.out.println(Content);
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 내용을 입력하세요.");
        Content = sc.nextLine();
    }

    void delete() {}

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