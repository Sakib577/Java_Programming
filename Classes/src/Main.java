
public class Main {
  int x = 5;
  void s() {
    System.out.println(x);
  }
}
class sakib extends Main {
  void m() {
    System.out.println("xxx");
  }
}

class Second {
  public static void main(String[] args) {
    // Main myObj = new Main();
    // System.out.println(myObj.x);

    // sakib sa = new sakib();

    // sa.s();

    Main sj = new Main();
    sj.x = 10;
    sj.s();
  }
}
