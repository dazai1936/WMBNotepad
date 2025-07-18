import java.util.Scanner;

public class Memo {
    String Title;
    String Date;
    String Content;

    void write(Scanner sc) { //작성
        System.out.println("제목을 입력하세요.");
        Title = sc.nextLine();

        System.out.println("내용을 입력하세요.");
        Content = sc.nextLine();
    }
    void read() { //읽기
        System.out.println(Content);
    }
    void edit(Scanner sc) { //편집
        System.out.println(Content);
        System.out.print("수정할 내용을 입력하세요.");
        Content = sc.nextLine();
    }

    void delete() { //삭제

    }
}