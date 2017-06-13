package spring.restful.demo.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DELL on 06/13/17.
 */
@RestController
public class GreetingController {
    @RequestMapping("/hello")
    public String greeting(@RequestParam(name = "name") String name,
                           @RequestParam(name = "country", required = false,
                                   defaultValue = "Vietnam") String country) {
        return "Hello " + name + " from " + country;
    }
    @RequestMapping("/hello2")
    public Object greeting2(@RequestParam(name = "name") String name,
                            @RequestParam(name = "country") String country) {
        Map<String, String> result = new HashMap<>();
        result.put("name", name);
        result.put("country", country);
        return result;
    }
}
