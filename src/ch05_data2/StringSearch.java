package ch05_data2;

public class StringSearch {
    public static void main(String[] args) {
        String[] books = {
                "Java in easy steps",
                "XML in easy steps",
                "HTML in easy steps",
                "CSS in easy steps",
                "Gone With the Wind",
                "Drop the Defense"
        };
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;

        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].substring(0, 4) + " | ");
            if (books[i].endsWith("in easy steps")) counter1++;
            if (books[i].startsWith("Java")) counter2++;
            if (books[i].indexOf("easy") == -1) counter3++;
        }


        System.out.printf("\n\nНайдено %d книг из серии \"in easy steps\"\n", counter1);
        System.out.printf("Найдено %d названий \"Java\"\n", counter2);
        System.out.printf("Найдено %d других названий\n", counter3);
    }
}
