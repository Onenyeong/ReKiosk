//package Kiosk;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class menuDB { 메뉴 디비에 데이터 다 넣기.
//    List<Menu> menu = new ArrayList<>();
//
//    List<Item> hamburger = new ArrayList<>();
//    List<Item> pizza = new ArrayList<>();
//    List<Item> chicken = new ArrayList<>();
//
//    List<Item> drink = new ArrayList<>();
//    HashMap<String,List<Menu>> menuHashMap = new HashMap<>();
//    HashMap<String,List<Item>> itemsHashMap= new HashMap<>();
//
//    menuDB(){
//        drink.add(new Item(1, "코카콜라제로", "음료계의 근본", 2000));
//        drink.add(new Item(2, "펩시제로", "코카콜라의 대항마", 2000));
//        drink.add(new Item(3, "환타", "톡쏘는 오렌지", 1700));
//        drink.add(new Item(4, "사이다", "청량함과 시원함을 동시에", 1800));
//        itemsHashMap.put("Drink",drink);
//
//
//
//        chicken.add(new Item(1, "후라이드치킨", "후라이드 치킨의 교과서", 16000));
//        chicken.add(new Item(2, "양념치킨", "싫어할 사람은 없겠죠?", 18000));
//        chicken.add(new Item(3, "간장치킨", "간장의 짭조롬함을 좋아한다면", 17000));
//        itemsHashMap.put("Chicken",chicken);
//
//
//
//
//        pizza.add(new Item(1, "콤비네이션 피자", "토핑의 조화를 원한다면", 13500));
//        pizza.add(new Item(2, "불새 피자", "불고기와 새우가 만나", 15000));
//        pizza.add(new Item(3, "불갈비 피자", "불갈비를 맛보고싶다면", 16000));
//        pizza.add(new Item(4, "휴게소 피자", "휴게소의 감자와 소시지의 합작", 14000));
//        itemsHashMap.put("Pizza",pizza);
//
//
//
//        hamburger.add(new Item(1, "불고기 버거", "불고기에 소스만 바른 버거", 3800));
//        hamburger.add(new Item(2, "새우 버거", "새우만 넣은 버거", 4200));
//        hamburger.add(new Item(3, "맥스파이시 상하이버거", "꽤나 매운 버거", 5500));
//        hamburger.add(new Item(4, "빅맥", "소고기 들어간 버거", 6400));
//        hamburger.add(new Item(5, "쿼터 파운더 치즈", "치즈 듬뿍 들어간 버거", 7000));
//        itemsHashMap.put("Hamburger",hamburger);
//
//        menu.add(new Menu(1, "Burgers", "햄버거"));
//        menu.add(new Menu(2, "Pizza", "피자"));
//        menu.add(new Menu(3, "Chicken", "치킨"));
//        menu.add(new Menu(4, "Drinks", "음료수"));
//        menu.add(new Menu(5, "OrderCheck", "주문확인 및 주문진행"));
//        menu.add(new Menu(6, "Cancel", "주문취소"));
//        menu.add(new Menu(7, "Clear", "모두비우기"));
//        menuHashMap.put("Main",menu);
//    }
//}
