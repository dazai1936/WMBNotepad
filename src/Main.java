import java.util.Scanner;

public class Memo {
    String Title;
    String Date;
    String Content;

    void write() {
        //다시 스캔을 불러와 내용 작성
    }
    void read() {
        System.out.println(Content);
    }
    void edit() {
        return Content;
        //기존의 내용을 불러온 상태에서 수정이 가능해야함
    }
    void delete() {}

    public static void main(String[] args) {

        Memo m = new Memo();
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        String str = sc.next(); // 입력받은 문자열을 str에 저장

        if (str.equals("m.Title")) {

            m.read(m.Content);
        }
        else
        {
            m.write();
        }
    }

        System.out.println();
}
}