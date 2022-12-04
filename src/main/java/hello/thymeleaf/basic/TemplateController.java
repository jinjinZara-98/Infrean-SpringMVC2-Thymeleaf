package hello.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//반환값이 논리경로면 @Controller
@Controller
@RequestMapping("/template")
public class TemplateController {

    @GetMapping("/fragment")
    public String template() {
        return "template/fragment/fragmentMain";
    }

    @GetMapping("/layout")
    public String layout() {
        return "template/layout/layoutMain";
    }

    @GetMapping("/layoutExtend")
    public String layoutExtends() {
        return "template/layoutExtend/layoutExtendMain";
    }
}
