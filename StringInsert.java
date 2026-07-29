package Lacture13;
public class StringInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        sb.insert(0,'S');
        System.out.println(sb);
    }
}
