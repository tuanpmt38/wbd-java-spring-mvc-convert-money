package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {

    @GetMapping("/index")
    public String loadIndex(){
        return "index";
    }

    @RequestMapping(value = "/convert",method = RequestMethod.POST)
    public String convertMoney(ModelMap modelMap, @RequestParam("rate")float rate, @RequestParam("usd")float usd){

        float vnd = rate * usd;

        modelMap.addAttribute("usd", usd);
        modelMap.addAttribute("vnd", vnd);
        return "index";
    }
}