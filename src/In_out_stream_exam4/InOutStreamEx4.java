package In_out_stream_exam4;
// Reader 는 문자 스트림의 최상위 추상 클래스입니다.

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class InOutStreamEx4 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test.txt");
//        int readData;
//        while (true) {
//            readData = reader.read(); // 한 개의 문자(2 byte)를 읽어 4 byte int 타입으로 반환
//            if(readData == -1) break;
//            System.out.println((char) readData);

        int readNo;
        char[] cBuf = new char[256];
        String data ="";
        while (true) {
            readNo = reader.read(cBuf);
            if (readNo == -1) break;
            data += new String(cBuf, 0, readNo);
        }
        System.out.println(data);
        reader.close();
    }
}
