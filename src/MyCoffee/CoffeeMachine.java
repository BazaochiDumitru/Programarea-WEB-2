package MyCoffee;

import java.util.*;

public class CoffeeMachine {
    private Boolean pay(Integer banknoteNominal) {
        Scanner scanner = new Scanner(System.in);
        banknoteNominal = scanner.nextInt();
        if (banknoteNominal == 5 || banknoteNominal == 10) {
            return true;
        }
        return false;
    }

    private String choose(Integer option) {
        Scanner scanner2 = new Scanner(System.in);
        option = scanner2.nextInt();
        if (option == 1) {
            return "Coffee";
        } else if (option == 2) {
            return "Cappuccino";
        } else if (option == 3) {
            return "Americano";
        } else if (option == 4) {
            return "Expresso";
        } else if (option == 5) {
            return "Mocha";
        }
        return "Incorrect option";
    }

    private String chooseSugar(Integer option2) {
        Scanner scanner2 = new Scanner(System.in);
        option2 = scanner2.nextInt();
        if (option2 == 1) {
            return "With sugar";
        } else if (option2 == 2) {
            return "Without sugar";
        }
        return "Incorrect option. Please try again.";
    }

    private String chooseMilk(Integer option3) {
        Scanner scanner3 = new Scanner(System.in);
        option3 = scanner3.nextInt();
        if (option3 == 1) {
            return "With milk";
        } else if (option3 == 2) {
            return "Without milk";
        }
        return "Incorrect option. Please try again.";
    }

    private void showInfo(String message) {
        System.out.println(message);
    }

    private String done(String coffeeType) {
        return coffeeType;
    }

    public void prepare() {
        String coffeeType = "";
        String sugar = "";
        String milk = "";
        this.showInfo("Please insert banknote. Banknotes Possible\n 5$ \n 10$");
        if (this.pay(5)) {
            this.showInfo("What kind of coffee you like? " +
                    "Please enter 1 - 5\n 1. Coffee\n 2. Cappuccino\n 3. Americano\n 4. Expresso\n 5. Mocha");
            coffeeType = this.choose(1);
            /*this.showInfo(
                    "Your choice is: " + coffeeType
            );*/
            this.showInfo("Do you like " + coffeeType + " with sugar or without. " +
                    "Please enter 1 or 2. \n 1. With sugar \n 2. Without sugar");
            sugar = this.chooseSugar(1);
            /*this.showInfo(
                    "Your choice is: " + coffeeType + " " + sugar
            );*/
            this.showInfo("Do you like " + coffeeType + " with milk or without. " +
                    "Please enter 1 or 2. \n 1. With milk \n 2. Without milk");
            milk = this.chooseMilk(1);
            this.showInfo(
                    "Your choice is: " + coffeeType + " " + sugar + " & " + milk
            );
            this.showInfo("Preparing... Please wait.");
            this.showInfo(
                    "Done: " + this.done(coffeeType + " " + sugar + " & " + milk)
            );
        } else {
            this.showInfo("Please insert correct banknote");
        }
    }
}
