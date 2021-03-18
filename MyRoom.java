public class MyRoom {
    String bedSize;
    String roomColor;
    Boolean window;
    public MyRoom(String bs, String rc, Boolean w){
        bedSize = bs;
        roomColor = rc;
        window = w;
    }
    public void sleep(){
        System.out.println("Its sleep time. ZZZZ.");
    }

    public static void main(String[] args) {
        MyRoom secondRoom = new MyRoom("Queen", "Off-white", true);
        secondRoom.sleep();
    }
}
