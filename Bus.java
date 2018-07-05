public class Bus extends Car{
  static final int cap=60;
  int i = 0;
  int k = 0;
  int totalfee = 0;
  Person[] passengers = new Person[cap];
  public Bus(int a){
    num = a;
  }

  void getOn(Person p){
    if(i >= cap || p.getFee() > p.getMoney()){
      System.out.println(p.getName() +" could not get on the bus");
    }
    else{
      p.changeMoney(p.getFee());
      passengers[i] = p;
      i++;
      totalfee += p.getFee();
        printTotalFee();
    }
  }

  void getOff(Person p){
    for(k=0;k<passengers.length;k++){
      if(passengers[k].getName()==p.getName()){
        System.out.println(p.getName() + " got off the bus");
        for(;k<i-1;k++){
          passengers[k]=passengers[k+1];
        }
        i--;
        break;
      }
      System.out.println(p.getName() + " was not on the bus");
    }
  }

 int getBusNum(){
    return num;
  }

  void printAllPassengers(){
    if(passengers[0]==null){System.out.println("No one is on this");}
    for(k = 0;k < i;k++){
      System.out.println(passengers[k].getName());
    }
  }
  void printTotalFee(){
    System.out.println("Total fee of this bus : " + totalfee);
  }
}
