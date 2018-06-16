package pl.springbootdocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by muller on 2018-06-16.
 */
@RestController
public class RestSample {

    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello";
    }
}
