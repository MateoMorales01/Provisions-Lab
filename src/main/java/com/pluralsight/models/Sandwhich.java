package com.pluralsight.models;

import java.util.List;

public class Sandwhich  extends MenuItem{
    private List<Topping> toppings;
    private String bread;
    private String size;
    private boolean toasted;
    private boolean extraMeat;
    private boolean extraCheese;
    private boolean extraSauce;

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public Sandwhich(List<Topping> toppings, String bread, String size, boolean toasted, boolean extraMeat, boolean extraCheese, boolean extraSauce) {
        this.toppings = toppings;
        this.bread = bread;
        this.size = size;
        this.toasted = toasted;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
        this.extraSauce = extraSauce;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public boolean isExtraSauce() {
        return extraSauce;
    }

    public void setExtraSauce(boolean extraSauce) {
        this.extraSauce = extraSauce;
    }

    //price math
    @Override
    public double getPrice() {
        double price = 0;

        //base price
        switch (size) {
            case "4" -> price += 5.50;
            case "8" -> price += 7.00;
            case "12" -> price += 8.50;
        }

        // TOPPING COSTS
        for (Topping topping : toppings) {

            String type = topping.getType();

            // MEAT
            if (type.equals("meat")) {
                if (size.equals("4")) price += 1.00;
                else if (size.equals("8")) price += 2.00;
                else price += 3.00;

                if (topping.isExtra()) {
                    if (size.equals("4")) price += 0.50;
                    else if (size.equals("8")) price += 1.00;
                    else price += 1.50;
                }
            }

            // CHEESE
            else if (type.equals("cheese")) {
                if (size.equals("4")) price += 0.75;
                else if (size.equals("8")) price += 1.50;
                else price += 2.25;

                if (topping.isExtra()) {
                    if (size.equals("4")) price += 0.30;
                    else if (size.equals("8")) price += 0.60;
                    else price += 0.90;
                }
            }

            else if (type.equals("sauce")) {
                if (size.equals("4")) price += 0.75;
                else if (size.equals("8")) price += 1.50;
                else price += 2.25;

                if (topping.isExtra()) {
                    if (size.equals("4")) price += 0.30;
                    else if (size.equals("8")) price += 0.60;
                    else price += 0.90;
                }
            }



        }

        return price;
    }


    @Override
    public String toString() {
        String output = "";

        output += size + "\" " + bread;
        if (toasted) {
            output += " (toasted)";
        }
        output += "\n";

        for (Topping t : toppings) {
            output += "  - " + t.toString() + "\n";
        }

        output += "Total: $" + String.format("%.2f", getPrice());

        return output;
    }
}
