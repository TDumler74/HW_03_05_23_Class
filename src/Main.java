public class Main {
  //Задача 1
  //Создайте класс Soda (для определения типа газированной воды).
  //
  //У класса должен быть конструктор, принимающий 1 аргумент при инициализации - строку добавка (например, "малина"), отвечающий за добавку к выбираемому лимонаду.
  //
  //Напишите для этого класса геттер и сеттер.
  //
  //Используйте этот класс в вашей программе:
  //
  //создайте газировку
  //выведите её добавку
  //измените добавку
  //выведите новую добавку

  public static void main(String[] args) {

    Soda voda = new Soda(" малина");
    System.out.println("Мы предлагаем воду с добавкой вкуса: " + voda.getDobavka() + '\n');
    voda.setDobavka("клубника");
    System.out.println("Вы заказали со вкусом: " + voda.getDobavka());

    /*
    Мы предлагаем воду с добавкой вкуса:  малина

    Вы заказали со вкусом: клубника
     */
  }
}