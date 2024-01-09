package Kiosk;

public class Hamburger extends Menu {
    public int menuPrice;

    public int getPrice() {
        return menuPrice;
    }

    public Hamburger(int menuNumber, String menuName, String menuDesc, int menuPrice) {
        super(menuNumber, menuName, menuDesc);
        this.menuPrice = menuPrice;
    }

    public void getMenuToString() {
        System.out.println(getMenuNumber() + ". " + getMenuName() + " | " + getMenuDesc() + " | " + getPrice());
    }
}
