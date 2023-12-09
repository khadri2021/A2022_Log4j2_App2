package com.khadri.spring.rest;


import com.khadri.spring.rest.account.Account;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        Logger log = LogManager.getLogger(Main.class);

        log.fatal("Fatal logging");
        log.error("Error logging");
        log.warn("Warn logging");
        log.info("Info logging");
        log.debug("Debug logging");
        log.trace("Trace logging");

        Account account = new Account();
        account.createAccount(11222333L);
     }
}