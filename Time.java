package problem2;

public class Time {
    private Integer hour;
    private Integer minute;
    private Integer second;
    public Integer getHour() {
        return hour;
    }
    public void setHour(Integer hour) {
        this.hour = hour;
    }
    public Integer getMinute() {
        return minute;
    }
    public void setMinute(Integer minute) {
        this.minute = minute;
    }
    public Integer getSecond() {
        return second;
    }
    public void setSecond(Integer second) {
        this.second = second;
    }
    public Time(Integer hour, Integer minute, Integer second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(Integer hour, Integer minute, Integer second)
    {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }
    @Override
    public String toString()
    {
        // return"%02d:%02d:%02d",this.getHour(),this.getMinute(),this.getSecond();
        String hh;
        String mm;
        String ss;
        if(this.getHour()<10)
        {
            hh="0"+this.getHour();
        }
        else{
            hh=""+this.getHour();
        }
        if(this.getMinute()<10)
        {
            mm="0"+this.getMinute();
        }
        else{
            mm = ""+this.getMinute();
        }
        if(this.getSecond()<10)
        {
            ss = "0"+this.getSecond();
        }
        else{
            ss = ""+this.getSecond();
        }
        return hh+":"+mm+":"+ss;
    }
    public Time nextSecond()
    {
        return new Time(this.getHour(),this.getMinute(),this.getSecond()+1);
    }
    public Time prevSecond()
    {
        return new Time(this.getHour(),this.getMinute(),this.getSecond()-1);
    }

}
