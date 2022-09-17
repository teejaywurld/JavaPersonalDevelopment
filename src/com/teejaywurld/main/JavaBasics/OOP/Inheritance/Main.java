package com.teejaywurld.main.JavaBasics.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Cleopatra", 8, 20, 2, 4, 1,20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        System.out.println();

        Fish fish = new Fish("Shark", 3, 25, 1, 2, 2);
        fish.swim(5);

        System.out.println();

        HondaAccord hondaAccord = new HondaAccord(56);
        hondaAccord.steer(45);
        hondaAccord.accelerate(10);
        hondaAccord.accelerate(10);

        System.out.println();

        CommissionEmployee employee = new CommissionEmployee("Douglas", "Gabriel", "222-22-2222", 10000, .06);

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%n%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%n%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%n%s %s%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%n%s %s%n", "Commission rate is", employee.getCommissionRate());

        employee.setGrossSales(5000);
        employee.setCommissionRate(.1);

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee);

        System.out.println();
        System.out.println("************************************************************************");
        System.out.println();

        BasePlusCommissionEmployee employee1 = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%s %s%n", "First name is", employee1.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee1.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee1.getSocialSecurityNumber());
        System.out.printf("%s %s%n", "Gross sales is", employee1.getGrossSales());
        System.out.printf("%s %s%n", "Commission rate is", employee1.getCommissionRate());
        System.out.printf("%s %s%n", "Base salary is", employee1.getBaseSalary());

        employee1.setBaseSalary(10000);

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee1.toString());
    }
}
