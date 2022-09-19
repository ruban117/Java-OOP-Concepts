class Base {
    int x;

    public void SetX(int x) {
        System.out.print("We Are In Base Class Now!!!");
        this.x = x;
    }

    public int GetX() {
        System.out.print("This Is Our Base Class Of Value x= ");
        return x;
    }
}

class Derive extends Base {
    int y;

    public void SetY(int y) {
        System.out.print("We Are In Derived Class Now!!!");
        this.y = y;
    }

    public int GetY() {
        System.out.print("This Is Our Base Class Of Value y= ");
        return y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        Derive d = new Derive();
        d.SetX(5);
        System.out.println();
        System.out.println(d.GetX());
    }
}
