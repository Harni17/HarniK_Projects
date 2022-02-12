package com.HarniK.Authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.HarniK.Authentication.controllers.AuthenticationController;
import com.HarniK.Authentication.entities.User;
import com.HarniK.Authentication.exceptions.UserNotFoundException;
import com.HarniK.Authentication.services.AuthenticationService;

@SpringBootApplication
@Import({
      AuthenticationController.class,
      UserNotFoundException.class,
      AuthenticationService.class,
      User.class
})
public class AuthenticationApplication {

   public static void main(String[] args) {
      SpringApplication.run(AuthenticationApplication.class, args);
   }

}