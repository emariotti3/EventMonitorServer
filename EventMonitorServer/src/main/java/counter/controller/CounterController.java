package counter.controller;
import com.ar.fiuba.tdd.clojure.template;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import counter.model.Rules;
import counter.model.CounterQuery;
import counter.model.Data;

@RestController
public class CounterController {

    @RequestMapping(value= "/initializer", consumes = "application/json", method = RequestMethod.POST)
    public String init_rules(@RequestBody Rules counterRules){
        return template.initializeProcessor(counterRules.getRules()).toString();
    }

    @RequestMapping(value= "/processor", method = RequestMethod.POST)
    public String process_data(@RequestBody Data data){
        return template.processData(data.getState(), data.getData()).toString();
    }

    @RequestMapping(value="/query-counter", method = RequestMethod.POST)
    public String count(@RequestBody CounterQuery query){
        long cvalue = template.queryCount(query.getState(), query.getCounterName(), query.getCounterParams());
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("count", cvalue);
        return jsonObj.toString();

    }

}

