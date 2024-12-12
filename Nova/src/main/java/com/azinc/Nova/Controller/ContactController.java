package com.azinc.Nova.Controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.azinc.Nova.Model.Contact;
import com.azinc.Nova.Service.ContactService;

@Controller
public class ContactController {
    
    Logger log = Logger.getLogger(ContactController.class.getName());
    @RequestMapping("contact")
    public String contact() {
        return "contact";
    }

    // @RequestMapping("saveMsg")
    // public ModelAndView saveMsg(@RequestParam String name, @RequestParam String mobileNum, @RequestParam String email, @RequestParam String subject, @RequestParam String message) {
    //     log.info("name: " + name);
    //     log.info("mobileNum: " + mobileNum);
    //     log.info("email: " + email);
    //     log.info("subject: " + subject);
    //     log.info("message: " + message);
    //     return new ModelAndView("redirect:/contact");
    // }

    @RequestMapping("saveMsg")
    public ModelAndView saveMsg(Contact contact) {
        ContactService contactService = new ContactService();
        contactService.saveMsg(contact);
        return new ModelAndView("redirect:/contact");
    }
}
