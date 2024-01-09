package Kiosk;
public class Chicken extends Menu {
    public int menuPrice;

    public int getPrice() {
        return menuPrice;
    }

    public Chicken(int menuNumber, String menuName, String menuDesc, int menuPrice) {
        super(menuNumber, menuName, menuDesc);
        this.menuPrice = menuPrice;
    }

    public void getMenuToString() {
        System.out.println(getMenuNumber() + ". " + getMenuName() + " | " + getMenuDesc() + " | " + getPrice());
    }
}

