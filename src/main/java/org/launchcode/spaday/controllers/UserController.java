package org.launchcode.spaday.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("user")

public class UserController {

    @GetMapping("add")
    @ResponseBody
    public String displayAddUserForm(Model model) {
        //
        return "user/add";
    }

//    @PostMapping("user")
//    @ResponseBody
//    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
//        // add form submission handling code here
//    }


}


