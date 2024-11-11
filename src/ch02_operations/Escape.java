package ch02_operations;

/*
Числовые и текстовые значения в джава-программах известны как литералы,
на самом деле ничего не представляют, это просто символы, которые
вы видите

\ - управляющая последовательность

\n - перевод строки
\t - табуляция
\b - шаг назад (забой)
\r - возврат каретки
\f - перевод страницы
\\ -
\'
\"
 */


public class Escape {
    public static void main(String[] args) {
        String header = "\n\tНЬЮ-ЙОРК ПРОГНОЗ НА 3 ДНЯ:\n";
        header += "\n\tДень\t\tМакс\tМин\tОсадки\n";
        header += "\t----\t\t----\t---\t------\n";

        String forecast = "\tВоскресенье\t68F\t\t48F\tЯсно\n";
        forecast += "\tПонедельник\t69F\t\t57F\tЯсно\n";
        forecast += "\tВторник\t\t71F\t\t50F\tОблачность\n";


        System.out.println(header + forecast);
    }
}
