class Box{
    int width,height,depth;

    //with all dimention
    Box(int w, int h, int d){
        width=w;
        height=h;
        depth=d;
    }

    //for cube
    Box(){
        width=height=depth=0;
    }

    //for constructor use when the cube is created
    Box(double length){
        length=width=height=depth;
    }

    double volume(){
        return width*height*depth;
    }
}
class CnstructorOverloading{
    public static void main(String[] args) {
        Box b1=new Box(14,15,16);
        Box b2=new Box();
        Box cube=new Box(15);
        double vol;
        vol=b1.volume();
        System.out.println("Volume Of Box 1 Is: "+vol);
        vol=b2.volume();
        System.out.println("Volume Of Box 2 Is: "+vol);
        vol=cube.volume();
        System.out.println("Volume Of The Cube Is: "+vol);
    }
}