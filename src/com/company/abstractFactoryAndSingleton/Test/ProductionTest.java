package com.company.abstractFactoryAndSingleton.Test;

import com.company.abstractFactoryAndSingleton.Production;
import org.junit.Test;


public class ProductionTest {

    @Test
    public void ProdTest() throws Exception {
        Production production1 = Production.configProd("mazda");
        production1.create();
        System.out.println("------------------------------");
        Production production2 = Production.configProd("toyota");
        production2.create();
        System.out.println("------------------------------");
        try {
            Production production = Production.configProd("bmw");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }




}