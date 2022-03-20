import java.time.LocalDate;

public class Shift {
    
    private boolean[] pattern;
    private LocalDate start;

    public Shift(boolean[] pattern, LocalDate start)
    {
        this.pattern = pattern;
        this.start = start;
    }

    public boolean[] getPattern()
    {
        return pattern;
    }

    public void setDuration(boolean[] pattern)
    {
        this.pattern = pattern;
    }

    public LocalDate getStart()
    {
        return start;
    }

    public void setStart(LocalDate start)
    {
        this.start = start;
    }

    public boolean isOnShift(LocalDate date)
    {
        return isOnShift(pattern, start, date);
    }

    public static boolean isOnShift(boolean[] pattern, LocalDate start, LocalDate date)
    {
        int remainder = 0;
        if(start.isAfter(date))
        {
            remainder = pattern.length - (int) date.datesUntil(start).count() % pattern.length;
        } else {
            remainder = (int) start.datesUntil(date).count() % pattern.length;
        }
        return pattern[remainder];
    }
}
