package ch05_data2;

public class StringLength {
    public static void main(String[] args) {
        String lang = "Java";
        String series = " in easy steps";
        String title = lang.concat(series);
        System.out.printf("\"%s\" содержит %d символов", title, title.length());
    }
}
