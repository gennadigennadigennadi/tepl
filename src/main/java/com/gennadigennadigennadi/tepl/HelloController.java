package com.gennadigennadigennadi.tepl;

import com.gennadigennadigennadi.tepl.model.Ingredient;
import net.minidev.json.JSONObject;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hallo Holly!";
    }

    @RequestMapping("/example")
    public Object example(Map<String, Object> model) {
        Ingredient ingredient = new Ingredient();
        ingredient.name = "zuccini";

        return ingredient;
    }
}