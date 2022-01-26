package be.koder.sandbox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SandboxController {

    @GetMapping(value = "/")
    public String index() {
        return "<h1>Hello, World!</h1>";
    }
}
