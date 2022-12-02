package hello.hellospring.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class helloController {

    @GetMapping("hello")//웹에서 hello 메세지를 받으면 아래 함수 실행
    public String hello(Model model){
        model.addAttribute("data","hello!");
        return "hello";
    }
}
