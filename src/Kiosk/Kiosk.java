package Kiosk;

import java.util.Timer;
import java.util.TimerTask;


public class Kiosk {


    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.menuItemsInitailize();     // 메뉴 담아주기
        menu.menuCategoryView();

        menu.menuSelectSwitch();


    }

    // 그만 주문하고싶으면 "주문확정" or "주문취소" 예외처리필요

    // 장바구니에 담긴 내용 꺼내서 게산해서 출력

}

