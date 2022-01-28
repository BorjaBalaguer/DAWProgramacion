package Tema5;

public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String displayString;    // simulates the actual display
    
 
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }


    public ClockDisplay(int hour, int minute, int second)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute, second);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        seconds.increment();
        if(seconds.getValue() == 0){
            minutes.increment();
                if(minutes.getValue() == 0) {  // it just rolled over!
                    hours.increment();
                }
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute, int second)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue() + ":" +
                        seconds.getDisplayValue();
    }
}
