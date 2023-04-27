package String_buffer;
// StringBuffer : 객체 생성 후 사용, 문자열 추가 시 기존의 문자열이 수정 됨, 동기화 지원(멀티 쓰레드에서 안전함)
// StringBuilder : 객체 생성 후 사용, 문자열 추가 시 수정 됨, 동기화 지원안됨, 성능은 우수함 .
// String : 객체 생성 필요없음, 문자열 추가 시 계속 새로운 문자열이 만들어 짐, 문자열 추가가 길어지면 성능 저하 됨 .
// append() : 문자열을 추가 할 때 사용
// insert() : 특정 위치에 문자열을 삽입
public class StringBufferMain {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        sb.append("Hello");
//        sb.append(" ");
//        sb.append("to JAVA");
//        sb.append(" ");
//        sb.append("Python");
//        System.out.println(sb);
//
//        String st = "Hello";
//        st += " ";
//        st += "to JAVA";
//        st += " ";
//        st += "Python";
//        System.out.println(st);

        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("JAVA");
        sb.insert(0, "안녕하세요! ");

        // sb.delete(2, 5); // 1번 인덱스에서 3번 미만이 지워짐 (1, 2인덱스가 해당됨 .)
        System.out.println(sb);

        System.out.println(sb.substring(7));
        System.out.println(sb.substring(0, 7));
    }
}
