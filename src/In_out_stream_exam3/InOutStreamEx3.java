package In_out_stream_exam3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 바이트 출력 스트림의 최상위 추상 클래스 OutputStream
// 문자 출력 스트림의 최상위 추상 클래스는 Write 입니다.
public class InOutStreamEx3 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("test.txt");
         char[] data = "김수민 초깜찍".toCharArray();
//        String data = "이민영 바보";
        for(int i = 0; i < data.length; i++) {
            writer.write(data[i]);
        }

//        writer.write(data);
        writer.flush(); // write() 이후에 버퍼를 비움 .
        writer.close(); // 스트림의 자원을 반납하고 닫음 .


    }
}
