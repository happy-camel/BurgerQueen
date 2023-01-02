package app.product.subproduct;

import app.product.Product;

public class BurgerSet extends Product {
    private Hamburger hamberger;
    private Side side;
    private Drink drink;
    //포함관계


    public BurgerSet(String name, int price, int kcal, Hamburger hamberger, Side side, Drink drink) {
        super(name, price, kcal);
        this.hamberger = hamberger;
        this.side = side;
        this.drink = drink;
    }

    public Hamburger getHamberger() {
        return hamberger;
    }

    public Side getSide() {
        return side;
    }

    public Drink getDrink() {
        return drink;
    }
    // 세트를 구성할 때에 생성자를 통해서 세트를 구성할 것이므로 setter x
}
