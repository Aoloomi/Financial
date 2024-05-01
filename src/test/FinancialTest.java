package test;

import controller.FinancialController;
import model.bl.FinancialBl;
import model.da.FinancialDa;
import model.entity.Financial;
import model.entity.enums.FType;

import java.sql.SQLException;
import java.time.LocalDateTime;


public class FinancialTest {
    public static void main(String[] args) throws Exception {
//        Financial financial = Financial.builder()
//                .amount(2400)
//                .fType(FType.Outcome)
//                .dateTime(LocalDateTime.now())
//                .description("Buy SSD")
//                .id(6)
//                .build();
//
//        System.out.println(financial);

//        FinancialDa financialDa = new FinancialDa();
//        financialDa.save(financial);
//        financialDa.edit(financial);
//        financialDa.remove(2);
//        System.out.println(financialDa.findAll());
//        System.out.println(financialDa.findById(10));
//        System.out.println(financialDa.findByFType("Outcome"));

//        ######Financial Business Logic PASSED######

//        FinancialBl.save(financial);
//        FinancialBl.edit(financial);
//        FinancialBl.remove(6);
//        System.out.println(FinancialBl.findAll());
//        System.out.println(FinancialBl.findById(5));
//        System.out.println(FinancialBl.findByFType("Outcome"));

        //        ######Financial Controller PASSED######

//        System.out.println(FinancialController.save(4500,"Income", LocalDateTime.now(),"Sell Gold"));
//        System.out.println(FinancialController.edit(3,45000,"Outcome", LocalDateTime.now(),"Buy Gold"));
//        System.out.println(FinancialController.remove(3));
//        System.out.println(FinancialController.findAll());
//        System.out.println(FinancialController.findById(4));
//        System.out.println(FinancialController.findByFType("Income"));

    }
}
