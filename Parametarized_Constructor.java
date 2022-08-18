public class Parametarized_Constructor {
    int id;
    String Name;
    Parametarized_Constructor(int id,String Name){
        this.id=id;
        this.Name=Name;
    }
    public static void main(String[] args) {
        Parametarized_Constructor p=new Parametarized_Constructor(117, "Ruban Pathak");
        System.out.println("Name: "+p.Name);
        System.out.println("ID: "+p.id);
    }
}                          
