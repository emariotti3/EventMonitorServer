package counter.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.json.JSONObject;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Ticket {
    private String date = "";
    private String hour = "";
    private String state = "";

    public Ticket(String ticketdata){
        JSONObject jsonticket = new JSONObject(ticketdata);
        String datetime = jsonticket.get("datetime").toString();
        this.state = jsonticket.get("state").toString();
        this.setTime(datetime);
    }



    private void setTime(String datetimejson){
        SimpleDateFormat gdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try{
            Date d1 = gdf.parse(datetimejson);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
            calendar.setTime(d1);
            this.setDate(sdf.format(d1));
            this.setHour(Integer.toString(calendar.get(Calendar.HOUR_OF_DAY)));
        }catch(ParseException e){
            //do sth
        }
    }

    public String getDate() {
        return this.date;
    }

    public String getHour(){
        return this.hour;
    }

    public String getState(){ return this.state; }

    public void setDate(String datetime){ this.date = datetime; }

    public void setHour(String hour){ this.hour = hour; }

    private String makeSubstring(String s){
        return "\"" + s + "\"";
    }

    @Override    public String toString() {
        JSONObject ticketjson = new JSONObject();
        String s_date = makeSubstring("date") + " " + makeSubstring(this.getDate());
        String s_hour = makeSubstring("hour") + " " + makeSubstring(this.getHour());
        String s_state = makeSubstring("state") + " " + makeSubstring(this.getState());

        return "{" + s_date + "," + s_hour + "," + s_state + "}";
    }
}
