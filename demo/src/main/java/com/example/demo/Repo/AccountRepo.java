package com.example.demo.Repo;

import com.example.demo.Account.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepo extends MongoRepository<Account, String> {


}
