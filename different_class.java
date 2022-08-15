class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name=n;
    }
}

class Samsung{
    public void Ring(){
        System.out.println("Cellphone Ringing");
    }
    public void Vibrating(){
        System.out.println("Cellphone Vibrating");
    }
}

class Square{
    int side;
    public int Area(){
        return side*side;
    }
    public int Perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int width;
    public int Area(){
        return length*width;
    }
    public int Perimeter(){
        return 2*(length+width);
    }
}

class Circle{
    double radius;
    public double Area(){
        return 3.14*radius*radius;
    }
    public double Circumference(){
        return 2*3.14*radius;
    }
}

class different_class {
    public static void main(String[] args) {
        Employee ruban = new Employee();
        ruban.setName("Ruban Pathak");
        ruban.salary = 5000;
        System.out.println(ruban.getSalary());
        System.out.println(ruban.getName());
        Samsung phone=new Samsung();
        phone.Ring();
        phone.Vibrating();
        Square sq=new Square();
        sq.side=7;
        System.out.println("The Area Is: "+sq.Area());
        System.out.println("The Preimeter Is: "+sq.Perimeter());
        Rectangle r=new Rectangle();
        r.length=4;
        r.width=7;
        System.out.println("The Area Of A Rectangle Is: "+r.Area());
        System.out.println("The Perimeter Of A Rectangle Is: "+r.Perimeter());
        Circle c=new Circle();
        c.radius=4;
        System.out.println("The Area Of the Circle Is: "+(double)c.Area());
        System.out.println("The Circumference of the circle is: "+(double)c.Circumference());
    }
}