package org.ua.deth.servlets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class ServletMVC {

    @RequestMapping(value = "/Servlet", method = RequestMethod.POST)
    public String getPage(@RequestParam("name") String param, Model model, @RequestParam("email") String email, HttpSession session) {
        session.setAttribute("name", param);
        session.setAttribute("email", email);
        return "test";
    }

    @RequestMapping(value = "/Surname", method = RequestMethod.GET)
    public String getSurname(@RequestParam("surname") String surname, HttpSession session){
        session.setAttribute("surname", surname);
        return "surname";
    }


    @RequestMapping(value = "/FatherName", method = RequestMethod.GET)
    public ModelAndView getSurname(@RequestParam("fatherName") String fatherName, Model session){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("fatherName", fatherName);
        modelAndView.setViewName("all");
        return modelAndView;
    }
}
