public class Main {
    public static void main(String args[]){

    Hero hero1=new Hero("Дедка", 64, "человек", "уже седой", " Бабка, иди репку тянуть!");
    Hero hero2=new Hero("Бабка","человек","уже седая", " Внучка, иди репкутянуть!");
    Hero hero3=new Hero("Внучка", "девочка", "рыжая-бесстыжая", " Жучка, иди репку тянуть!");
    Hero hero4=new Hero("Жучка", 9, " Кошка, иди репку тянуть!");
    Hero hero5=new Hero("Кошка", "кошачьи", "пёстрая немножко", " Мышка, иди репку тянуть!");
    Hero hero6=new Hero("Мышка", 2, "грызун", "серенький", " Вытянули!!! Будем есть!!!");

    hero1.say();
    hero2.say();
    hero3.say();
    hero4.say();
    hero5.say();
    hero6.say();
}
}
