package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
//http://localhost:8080/greeting?name=Bill&?answer=gg
/**
 * Created by Vladok on 18.11.2016.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private static final String template1 = "Message = %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=GET)
    public Greeting greeting(@RequestParam(value="name", required=true, defaultValue="NAME") String name,
                             @RequestParam(value="answer", required=true, defaultValue="ANSWER") String message) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name),String.format(template1, message));
    }

}