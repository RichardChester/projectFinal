package com.example.demo.Controller;

import com.example.demo.Account.Account;
import com.example.demo.Repo.AccountRepo;

import javax.xml.ws.RequestWrapper;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Account")
public class AccountController {

    AccountRepo accountRepo;

    // read

    @RequestMapping(value = "/{id}")
    public Account read(@PathVariable long id){
    return accountRepo.findOne(id);
    }

    // write

    //update

    //delete



}
