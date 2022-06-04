package com.cydeo.tests.day09;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice_01 {

    @Test

    public void test1 (){
        Faker faker = new Faker();
        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());

        System.out.println(faker.name().fullName());

        System.out.println(faker.numerify("####-###-###"));
        faker.numerify("312-###-####") ;

        System.out.println(faker.letterify("???-????"));
        System.out.println(faker.bothify("??#-##-?####"));

        System.out.println(faker.finance().creditCard());

    }
}
