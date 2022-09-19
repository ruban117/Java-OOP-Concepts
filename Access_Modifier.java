class Student {

    //members of the class
    private String s_name;
    private String s_add;
    private String s_email;
    private int s_rno;
    private byte s_x;
    private byte s_xii;
    private byte s_bca;

    Student(String n, String add, String email, int rl, byte sec, byte hs, byte bcp) { //parameter passed using constructor
        s_name = n;
        s_add = add;
        s_email = email;
        s_rno = rl;
        s_x = sec;
        s_xii = hs;
        s_bca = bcp;
    }

    public void SetData(String n, String add, String email, int rl, byte sec, byte hs, byte bcp){
        s_name = n;
        s_add = add;
        s_email = email;
        s_rno = rl;
        s_x = sec;
        s_xii = hs;
        s_bca = bcp;
    }
    public void getData(){
        System.out.println("Name: "+s_name);
        System.out.println("Address: "+s_add);
        System.out.println("Email: "+s_email);
        System.out.println("Roll Number: "+s_rno);
        System.out.println("Percentage Of Class 10: "+s_x);
        System.out.println("Percentage Of Class 12: "+s_xii);
        System.out.println("Percentage Of Post Graduation: : "+s_bca);
        if(IsEligible())
        System.out.println("Eligible For Infosys");
        else
        System.out.println("Not Eligible For Infosys");

    }

    private boolean IsEligible() {
        if (s_x >= 60 && s_xii >= 68 && s_bca >= 64)
            return true;
        else
        return false;
    }
}



class Access_Modifier {
    public static void main(String[] args) {
        Student Ruban = new Student("Ruban Pathak", "28, South Baishnab Para Road Post Garifa Dist 24 pgs(North)",
        "rubanpathak706@gmail.com", (byte) 117, (byte) 66, (byte) 79, (byte) 86);//creation of a constructor / creation of an object

        Ruban.SetData("Ruban Pathak", "28, South Baishnab Para Road Post Garifa Dist 24 pgs(North)",
        "rubanpathak706@gmail.com", (byte) 117, (byte) 66, (byte) 79, (byte) 86); //input using methods
        Ruban.getData();
        //Ruban.s_name;

    }
}