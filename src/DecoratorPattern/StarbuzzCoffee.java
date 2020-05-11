package DecoratorPattern;

import java.util.Scanner;

public class StarbuzzCoffee {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base coffee option");
        System.out.println("1.Filter Coffee");
        System.out.println("2.House Blend");

        Beverage beverage = getBaseCoffeeInstance( Integer.parseInt( input.nextLine() ) , input);

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

    private static Beverage getBeverageWithAddedCondiment(Beverage beverage, int i) throws Exception {
        if (i ==1){
            return new Milk(beverage);
        }else if(i ==2){
            return new Mocha(beverage);
        }else {
            throw new Exception("enter correct input");
        }
    }

    private static Beverage getBaseCoffeeInstance(int parseInt , Scanner input) throws Exception {
        System.out.println("Enter size");
        System.out.println("1.Tall");
        System.out.println("2.Grande");
        System.out.println("3.Venti");
        int option = input.nextInt();
        if (parseInt ==1){
            if (option ==1){
                return new FilterCoffee(new Tall());
            }else if (option == 2){
                return new FilterCoffee(new Grande());
            }else if (option == 3){
                return new FilterCoffee(new Venti());
            }else {
                throw new Exception("Enter correct input");
            }
        }else if (parseInt == 2) {
            if (option ==1){
                return new HouseBlend(new Tall());
            }else if (option == 2){
                return new HouseBlend(new Grande());
            }else if (option == 3){
                return new HouseBlend(new Venti());
            }else {
                throw new Exception("Enter correct input");
            }
        }else {
            throw new Exception("Enter correct input");
        }
    }
}
