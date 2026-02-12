package backendspring.sis1;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class InfoController {
    @GetMapping("/info")
    public Map<String, Object> getInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("student", "Ayaulym");
        response.put("course", "Spring Framework");
        response.put("week", 1);
        return response;
    }

    @PostMapping("/add")
    public Map<String, Object> add(@RequestBody AdditionRequest request) {
        int result = request.getA() + request.getB();
        Map<String, Object> response = new HashMap<>();
        response.put("result", result);
        return response;
    }
}
