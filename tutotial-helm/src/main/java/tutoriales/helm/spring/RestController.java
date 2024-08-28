package tutoriales.helm.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

    @GetMapping("test")
    public String helm() {
        return "Hello World!";
    }

}
