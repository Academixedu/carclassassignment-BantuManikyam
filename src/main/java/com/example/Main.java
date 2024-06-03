package com.example;

public class Main {
    public static void main(String[] args) {
        // Create a new car object
        Car myCar = new Car("Toyota", "Camry", 2020, "Red", 24000.00);
        
        // Display car details
        myCar.displayCarDetails();

        // Modify car details
        myCar.setColor("Blue");
        myCar.setPrice(23000.00);

        // Display updated car details
        System.out.println("\nUpdated Car Details:");
        myCar.displayCarDetails();
        System.out.println(" _________________________________________________");

        //Creating new bank object
        Bank bank = new Bank("APGVB", "Manikyam", "123456", 50000.00);
        bank.displayAccountDetails();
        bank.setAccountHolderName("Nithin");
        bank.setAccountNumber("78952");
        bank.setBalance(4568);
        bank.setBankName("SBI");
        System.out.println("\nUpdated Bank details");
        bank.displayAccountDetails();
        System.out.println("___________________________________________________");

        Student student = new Student("Manikyam",18, "222010405009", "Yes");
        student.displayStudentDetails();
        student.setAge(25);
        student.setMajor("No");
        student.setName("Shashank");
        System.out.println("\nUpdated Suednt Details");
        student.displayStudentDetails();
        student.updateMajor("No");
        System.out.println("___________________________________________________");

        
        Bike bike = new Bike("Yamaha", "Y73", 2023, "Red", 5000.0);
        bike.displayBikeDetails();
        bike.setBrand("Hero");
        bike.setColor("Black");
        bike.setModel("Y74");
        bike.setPrice(60000.0);
        bike.setYear(2035);

        System.out.println("\nUpdated Bike details");
        bike.displayBikeDetails();


    }
}
