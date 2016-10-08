package org.ua.deth.servlets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ServletMVC {

    @RequestMapping(value = "/Servlet", method = RequestMethod.POST)
    public String getPage(@RequestParam("name") String param, Model model){
        model.addAttribute("name", param);

        return "test";
    }
}
