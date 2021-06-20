/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/20/2021
 *   Time: 6:52 AM
 *   File: HomeController.java
 */

package com.example.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/home")
    public String home(@RequestBody Email email) {
        System.out.println(email);
        emailService.sendEmail(email.getTo(), email.getSubject(), email.getMessage());
        return "mail successfully send";
    }
}