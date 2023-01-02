package app.product.subproduct;

import app.product.Product;

public class Hamburger extends Product {
    private boolean IsBurgerSet;
    private int burgerSetPrice;

    public Hamburger(int id, String name, int price, int kcal, boolean IsBurgerSet, int burgerSetPrice) {
        super(id, name, price, kcal);
        this.IsBurgerSet = IsBurgerSet;
        this.burgerSetPrice = burgerSetPrice;
    }

    public boolean IsBurgerSet() {
        return IsBurgerSet;
    }

    public void setIsBurgerSet(boolean IsBurgerSet) {
        this.IsBurgerSet = IsBurgerSet;
    }

    public int getBurgerSetPrice() {
        return burgerSetPrice;
    }

    public void setBurgerSetPrice(int burgerSetprice) {
        this.burgerSetPrice = burgerSetprice;
    }
}
