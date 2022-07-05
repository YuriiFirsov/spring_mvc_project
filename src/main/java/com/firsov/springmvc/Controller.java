package com.firsov.springmvc;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Date;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String callStartPage(){
        return "start-page";
    }

    @RequestMapping("/test")
    public  String callTestPage(){
        return "test-page";
    }

    @RequestMapping("/form")
    public String callFormPage(){
        return "form-page";
    }

    @RequestMapping("/welcome")
    public String callWelcomePage(HttpServletRequest request, Model model){
        String surname = request.getParameter("surname").toUpperCase();

        model.addAttribute("surname", surname);

        model.addAttribute("title", "многоуважаемый");

        Date date = new Date();

        model.addAttribute("date", date);


        return "welcome-page";
    }

    @RequestMapping("/person-getting-data")
    public String callPersonGetDataPage(Model model){

        model.addAttribute("person", new Person());

        return "person/getting-data";
    }

    @RequestMapping("/person-displaying-data")
    public String callPersonDisplayingDataPage(@Valid @ModelAttribute("person") Person person
    , BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "person/getting-data";
        } else {
            return "person/displaying-data";
        }


    }
}
