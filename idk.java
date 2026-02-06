import java.util.Scanner;

public class idk {

  public static void main(String[] args) {
    Scanner ns = new Scanner(System.in);
    boolean run = true;

    chara c1 = new guerrer("Alice", 80, 300, "p", "p","i", "", 3);
    chara c2 = new guerrer("Bob", 100, 300, "p", "","p", "", 3);

    c1.atacar(c2.atk, c2.element);//atackar a c1


  }
}
