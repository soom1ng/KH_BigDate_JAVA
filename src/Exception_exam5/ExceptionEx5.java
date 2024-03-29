package Exception_exam5;

import java.io.FileWriter;
import java.io.IOException;

// finally : 프로그램 실행 도중 예외가 발생 할 가능성이 있는 코드에 try 구문을 걸게 되는데 ,
// 이때 예외가 발생하면 catch 구문으로 진행하고 그렇지 않음ㄴ 아래 코드가 실행 됨 .
// 이 경우 , 예외 여부에 상관 없이 항상 실행 되어야 할 구문이 있다면 finally 로 처리 할 수 있음 .

public class ExceptionEx5 {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("test.txt");
            f.write("test");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
