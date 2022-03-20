import java.time.LocalDate;

public class Shifted {
    
    private static final String FALSE = "false -> ";
    private static final String TRUE = "true -> ";

    public static void main(String[] args)
    {
        boolean[] pattern = new boolean[]{true, true, true, true, false, false, false, false};
        LocalDate start = LocalDate.of(2018, 12, 29);
        
        System.out.println(TRUE + Shift.isOnShift(pattern, start, LocalDate.of(2019, 01, 01)));
        System.out.println(FALSE + Shift.isOnShift(pattern, start, LocalDate.of(2019, 01, 02)));
        System.out.println(TRUE + Shift.isOnShift(pattern, start, LocalDate.of(2019, 02, 15)));
        System.out.println(TRUE + Shift.isOnShift(pattern, start, LocalDate.of(2019, 02, 18)));
        System.out.println(FALSE + Shift.isOnShift(pattern, start, LocalDate.of(2019, 02, 28)));
        System.out.println(FALSE + Shift.isOnShift(pattern, start, LocalDate.of(2019, 03, 02)));
        System.out.println(FALSE + Shift.isOnShift(pattern, start, LocalDate.of(2019, 04, 19)));
        System.out.println(TRUE + Shift.isOnShift(pattern, start, LocalDate.of(2019, 04, 30)));
        System.out.println(TRUE + Shift.isOnShift(pattern, start, LocalDate.of(2019, 05, 31)));
        System.out.println(FALSE + Shift.isOnShift(pattern, start, LocalDate.of(2019, 06, 03)));
        System.out.println(TRUE + Shift.isOnShift(pattern, start, LocalDate.of(2019, 06, 07)));
        System.out.println(FALSE + Shift.isOnShift(pattern, start, LocalDate.of(2019, 10, 04)));
        System.out.println(TRUE + Shift.isOnShift(pattern, start, LocalDate.of(2019, 11, 01)));
        System.out.println(FALSE + Shift.isOnShift(pattern, start, LocalDate.of(2019, 12, 31)));
    }
}