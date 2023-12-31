package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.PersonService;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;
}
