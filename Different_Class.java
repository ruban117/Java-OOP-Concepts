class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    void setname(String n){
        n=name;
    }
}
class Different_Class{
    public static void main(String[] args) {
        Employee ruban=new Employee();
        ruban.salary=5000;
        ruban.setname("Ruban Pathak");
        System.out.println(ruban.getname());
        System.out.println(ruban.getSalary());
    }
}