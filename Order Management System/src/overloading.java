/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zubair
 */
class Buttons {
  public void objoriented() {
    choice info = new choice();
    info.setVisible(true);
  }
}

class Exit extends Buttons {
  public void objoriented() {
    System.exit(0);
  }
}

class Adlogin extends Buttons {
  public void objoriented() {
    admin_login info = new admin_login();
    info.setVisible(true);
  }
}

class Cuslogin extends Buttons {
  public void objoriented() {
    customer_login info = new customer_login();
    info.setVisible(true);
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Buttons welcome = new Buttons();  
    Buttons myExit = new Exit();  
    Buttons myAdlogin = new Adlogin();  
    Buttons myCuslogin = new Cuslogin();  

    welcome.objoriented();
    myExit.objoriented();
    myAdlogin.objoriented();
    myCuslogin.objoriented();
  }
}