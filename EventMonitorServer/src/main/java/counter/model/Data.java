package counter.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONObject;

public class Data {
    private String state;
    private Ticket data;

    public String getState(){
        return this.state;
    }
    public String getData() { return this.data.toString(); }

}
