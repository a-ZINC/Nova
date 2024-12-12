package com.azinc.Nova.Service;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.azinc.Nova.Model.Contact;

@Service
public class ContactService {
    Logger log = Logger.getLogger(ContactService.class.getName());
    public Boolean saveMsg(Contact contact) {
        Boolean status = false;
        log.info(contact.toString());
        // Db save logic
        return status;
    }
}
