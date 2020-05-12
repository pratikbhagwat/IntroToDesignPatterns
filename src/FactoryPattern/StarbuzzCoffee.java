package FactoryPattern;

import java.util.Scanner;

public class StarbuzzCoffee {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base coffee option");
        System.out.println("1.Filter Coffee");
        System.out.println("2.House Blend");

        Coffee beverage = getBaseCoffeeInstance( Integer.parseInt( input.nextLine() ) , input);

        while (true){
            System.out.println("Enter the condiment  option");
            System.out.println("1.Milk");
            System.out.println("2.Mocha");
            System.out.println("3.Thats all");
            int option = input.nextInt();
            if (option !=3){
                beverage = getBeverageWithAddedCondiment(beverage,option);
            }else {
                break;
            }
        }


        System.out.println("your order " + beverage.getDescription());
        System.out.println("cost " + beverage.getCost());

    }

    private static Coffee getBeverageWithAddedCondiment(Coffee beverage, int i) throws Exception {
        if (i ==1){
            return new Milk(beverage);
        }else if(i ==2){
            return new Mocha(beverage);
        }else {
            throw new Exception("enter correct input");
        }
    }

    private static Coffee getBaseCoffeeInstance(int parseInt , Scanner input) throws Exception {
        System.out.println("Enter size");
        System.out.println("1.Tall");
        System.out.println("2.Grande");
        System.out.println("3.Venti");
        int option = input.nextInt();
        CoffeeFactory coffeeFromBandraBranch = new StarBuzzBandra(parseInt,option);
        CoffeeFactory coffeeFromGoregaonBranch = new StarBuzzGoregaon(parseInt,option);

//        return coffeeFromBandraBranch.orderCoffee();
        return coffeeFromGoregaonBranch.orderCoffee();
    }
}
