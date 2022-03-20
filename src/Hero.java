public class Hero {
    String name;
    int age;
    String p_type;
    String fur_color;
    String some_say;
    Hero(){    }
    Hero(int age, String p_type, String fur_color, String some_say) {
        this.age = age;
        this.p_type = p_type;
        this.fur_color = fur_color;
        this.some_say=some_say;
    }
    Hero(String name, int age, String some_say) {
        this.name = name;
        this.age = age;
        this.some_say=some_say;
    }
    Hero(String name, int age,String p_type, String fur_color, String some_say) {
        this.name = name;
        this.age = age;
        this.p_type = p_type;
        this.fur_color = fur_color;
        this.some_say=some_say;
    }
    Hero(String name, String p_type, String fur_color, String some_say) {
        this.name = name;
        this.p_type = p_type;
        this.fur_color = fur_color;
        this.some_say=some_say;
    }
    void say() {
        System.out.println("Привет, я  " + this.name + " " + this.age + " годков. Я " + this.p_type + " . Цвет " + this.fur_color + " . Тянут-потянут, вытянуть не могут." + some_say );
    }
}