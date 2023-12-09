package com.khadri.spring.rest.account;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Account {

    private Logger logger = LogManager.getLogger(Account.class);
    public void createAccount(Long accNo){
        logger.info("Enter into createAccount method");
        logger.trace("Account number"+accNo);
    }
}
