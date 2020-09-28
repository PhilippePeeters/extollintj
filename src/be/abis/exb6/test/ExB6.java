package be.abis.exb6.test;

import be.abis.exb6.model.Address;

public class ExB6 {

    public static void main(String[] args) {

        Address adr1 = new Address("Leuvenstraat","69","5236","Leuven","Belgium","BE");
        System.out.println("Adresse : " + adr1.getStreet());
        System.out.println("Adresse : " + adr1.getCountry());

    }
}
