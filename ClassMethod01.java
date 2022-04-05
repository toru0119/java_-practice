class Human01 {
  public String name;
  public int age;

  public Human01() {
    name = "山田";
    age = 20;
  }

  public Human01(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class ClassMethod01 {
  public static void main(String[] args) {
    Human01 yamada = new Human01();
    System.out.println("名前は" + yamada.name + "で年齢は" + yamada.age);

    Human01 sato = new Human01("佐藤", 25);
    System.out.println("名前は" + sato.name + "で年齢は" + sato.age);
  }
}