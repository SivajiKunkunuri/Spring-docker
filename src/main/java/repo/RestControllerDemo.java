package repo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {

    @GetMapping
    public String getName(){
        return "Rajesh Kummari";
    }

}
