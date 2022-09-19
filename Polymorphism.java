interface MyCamera {
    void TakeSnap();

    void RecordVideo();

    default void recordingIn4k() {
        greet();
        System.out.println("Recording start");
    }

    private void greet() {
        System.out.println("Good Morning");
    }
}

interface MyWiFi {
    String[] GetNetworks();

    void ConnectToNetworks(String network);
}

class MyCellPhone {
    void CallNumber(int pno) {
        System.out.println("Connecting To........." + pno);
    }

    void Pickcall() {
        System.out.println("Connecting........");
    }
}

class MySmartphone extends MyCellPhone implements MyCamera, MyWiFi {
    public void TakeSnap() {
        System.out.println("Taking Photos");
    }

    public void RecordVideo() {
        System.out.println("Recording video");
    }

    public String[] GetNetworks() {
        System.out.println("Getting Your Networks");
        String[] Networklist = { "Ruban", "Altab", "Sovon" };
        return Networklist;
    }

    public void ConnectToNetworks(String Network) {
        System.out.println("Connecting To..... " + Network);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
    }
}
