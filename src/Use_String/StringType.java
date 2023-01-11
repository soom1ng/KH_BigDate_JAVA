package Use_String;
// equals 메소드 : 두 개의 문자열이 동일한지 비교하여 결과값을 리턴
public class StringType {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Java";
//        String c = "Hello";
//        System.out.println(a.equals(b)); // a의 문자열과 b의 문자열을 비교
//        System.out.println(a.equals(c)); // a와 c를 비교
//        System.out.println(a.equalsIgnoreCase("hello")); // 대소문자의 구분을 하지 않음 .
//        System.out.println(a == c); // 문자열의 내용을 비교하지 x, 문자열의 참조 주소를 비교하는 것

        String d = "Hello Jav Java";
        // indexOf() : 문자열에 특정 문자 혹은 문자열이 시작되는 인덱스를 리턴
        // System.out.println(d.indexOf("Java"));

        // contains() : 문자열에서 특정 문자열의 포함 여부를 리턴
//        System.out.println(d.contains("Hello")); // 대소문자를 구분함 .
//        System.out.println(d.contains("HELLO")); // 대소문자를 구분함 .

        // charAt() : 문자열에서 특정 위치의 문자를 리턴
        System.out.println(d.charAt(3));

        // replaceAll() : 문자열 중 특정 문자열을 다른 문자열로 대체할 때 사용함 .
        String language = "Java, Python, C, C++, JavaScrpt, Kotlin, Swift";
        System.out.println(language.replaceAll("Kotlin", "Jet Brain"));
        System.out.println(language.replaceAll("JavaScript", ""));

        // subString() : 문자열에서 특정 문자열을 뽑아 낼 때 사용
        String e = "Hello Java";
        System.out.println(e.substring(6)); // 시작 인덱스부터 끝까지 추출
        System.out.println(e.substring(1, 4)); // 시작 인덱스부터 종료 인덱스 미만까지 추출

        // toUpoerCase() / toLowerCase() : 문자열을 모두 대문자 또는 소문자로 변경
        System.out.println(e.toUpperCase());
        System.out.println(e.toLowerCase());

        // trim() : 문자열의 앞 뒤에 있는 공백 제거
        String str = " 자바 프로그래밍 ! ! ! ! ! ";
        System.out.println(str.trim());

        // split()
        String split = "a:b:c:d";
        String[] result = split.split(":"); // : 단위로 쪼개져서, 출력값 : {"a", "b", "c", "d"}


        // 문자열 포멧팅이란 ? 문자열에 특정 문자를 삽입하는 방법 (삽입을 위해서는 서식이 필요함 .)
//        System.out.printf("자바 프로그래밍을 %s 합시다.\n", "공부");
        String newStr = "";
        newStr = String.format("자바 프로그래밍을 %s 합시다.\n","공부");
        System.out.println(newStr);
        int number = 10;
        String day = "three";
        newStr = String.format("I ate %d apples. So I was sick for %s days.", number, day);
        System.out.println(newStr);

        String newStr2 = "I ate " + number + " apples. So I was sick for " + day + " days.";
        System.out.println(newStr2);

        // toCharArray() : 문자열을 문자 배열로 뱐환
        String name = "김수민";
        char[] arrName = name.toCharArray(); // 문자열을 문자로 구성 된 배열로 만듬 .
        System.out.println(name);
        System.out.println(arrName);
    }
}
