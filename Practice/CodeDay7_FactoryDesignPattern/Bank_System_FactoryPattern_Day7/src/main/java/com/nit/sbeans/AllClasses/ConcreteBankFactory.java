package com.nit.sbeans.AllClasses;

import com.nit.sbeans.Interfaces.Bank;
import com.nit.sbeans.Interfaces.BankFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConcreteBankFactory implements BankFactory {
   @Autowired
    SBI sbi;
   @Autowired
   HDFC hdfc;
   private Bank bank = null;

    public Bank createBank(String bankType) {

        if(bankType.equalsIgnoreCase("SBI")){
            bank= new SBI();
        } else if (bankType.equalsIgnoreCase("HDFC")) {
            bank=new HDFC();
        }
        return bank;
    }
}
