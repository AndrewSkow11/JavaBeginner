package ch04_data;

public class Loops {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.printf("args[%d]==%s\n", i, args[i]);
            }
        }


        String[] htm = {
                "HTML", "in", "easy", "steps"
        };

        int j = 0;

        while (j < htm.length) {

            System.out.printf("htm[%d]==%s\n", j, htm[j]);
            j++;
        }


        String[] xml = {
                "XML", "in", "easy", "steps"
        };

        int k = 0;

        if (xml.length > 0) do {
            System.out.printf("\t\txml[%d]==%s\n", k, xml[k]);
            k++;
        } while (k < xml.length);


    }
}
