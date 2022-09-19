public class Parametarized_Constructor {
    private int id=10;
    private String Name="Ruban";
    Parametarized_Constructor(int id,String Name){
        this.id=id;
        this.Name=Name;
    }
    void get(){
        System.out.println("Name: "+this.Name);
        System.out.println("ID: "+this.id);
    }
    public static void main(String[] args) {
        Parametarized_Constructor p=new Parametarized_Constructor(117, "Ruban Pathak");
        //p.Name="Hagu";
        p.get();
    }
}                          
