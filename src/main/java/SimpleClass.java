import java.time.LocalDate;
public class SimpleClass {
    public static void main(String[] args) {
        new SimpleClass().add(1, 2);
    }
    /**
     * Adds firstNumber and b
     * @param firstNumber the first number
     * @param b the second number
     */
    public int add(int firstNumber, int b) {
        return firstNumber + b;
    }


    public class DateUtils {
        public static boolean isNowBetween(LocalDate startingDate, LocalDate
                endingDate) {
            LocalDate date = LocalDate.now();
            return date.isBefore(endingDate) && date.isAfter(startingDate);
        }
        public static boolean isDateBetween(LocalDate date, LocalDate startingDate,
                                            LocalDate endingDate) {
            return date.isBefore(endingDate) && date.isAfter(startingDate);
        }
    }
}

