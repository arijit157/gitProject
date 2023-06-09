class Room{
    int length, breadth;
    Room(int x, int y){
        length=x;
        breadth=y;
    }
    int area(){
        return (length * breadth);
    }
}

class BedRoom extends Room{
    int height;
    BedRoom(int l, int b, int h){
        super(l, b);
        height=h;
    }
    int volume(){
        return (length * breadth * height);
    }
}

public class InherTest {
    public static void main(String[] args){
        BedRoom b=new BedRoom(14, 12, 10);
        int area=b.area();
        int vol=b.volume();
        System.out.println("Area = "+area);
        System.out.println("Volume = "+vol);
    }
}
