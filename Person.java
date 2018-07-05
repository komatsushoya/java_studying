public abstract class Person{
  protected String name;
  protected int money;
  public Person(String str,int m){
    name = str;
    money = m;
  }
  String getName(){
    return this.name;
  }
  int getMoney(){
    return this.money;
  }

  void changeMoney(int fee){
    money -= fee;
  }

  void print(){
    getName();
    System.out.print("now has");
    getMoney();
    System.out.print("yen");
  }
  int getFee(){
    return 0;
  }
}
