import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Objects;
import java.util.Scanner;

/*
为某个酒店编写程序:酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
1、该系统的用户是:酒店前台。
2、酒店使用一个二维数组来模拟。"Room[]0]rooms ; "
3、酒店中的每一个房间应该是一个java对象: Room
4、每一个房间Room应该有:房间编号、房间类型、房间是否空闲．
5、系统应该对外提供的功能:
可以预定房间:用户输入房间编号，订房。可以退房:用户输入房间编号,退房。
可以查看所有房间的状态:用户输入某个指令应该可以查看所有房间状态。

 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("============欢迎=============");
        Hotel hotel = new Hotel();
        System.out.println("输入’1‘查看房间列表     "  +
                "输入‘2’订房    "  +"输入’3‘退房    "+
                "输入’0‘退出程序"

        );
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入序号：");
            int i = scanner.nextInt();
            if(i == 1){
                hotel.print();
            }else if(i == 2){
                System.out.println("请输入需订房间编号：");
                Scanner scanner1 = new Scanner(System.in);
                hotel.order(scanner1.nextInt());
            }else if(i == 3){
                System.out.println("请输入需退房间编号：");
                Scanner scanner2 = new Scanner(System.in);
                hotel.exit(scanner2.nextInt());
            }else if(i == 0){
                System.out.println("再见");
                break;
            }else {
                System.out.println("输入有误，请重新输入");
            }
        }

    }
}
class Room{
    private int no;//房间编号
    private String type;//房间类型
    private boolean status;//房间状态

    //构造方法
    public Room() {
    }
    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    //set get
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    //重写equlas方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return getNo() == room.getNo();
    }

    //重写toString
    @Override
    public String toString() {
        return "【"+type + "房" + no + "当前"+ (status ? "空闲】" : "占用】");
    }
}
class Hotel{
    private Room[][] rooms;
    void order(int roomNum){
       Room room = rooms[roomNum / 100 -1][roomNum % 100 -1];
       room.setStatus(false);
    }
    void exit(int roomNum){
        Room room = rooms[roomNum / 100 -1][roomNum % 100 -1];
        room.setStatus(true);
    }
    void print(){
        for(int i = 0 ; i < rooms.length ; i++){
            for(int j = 0 ; j < rooms[i].length ; j++){
                System.out.print(rooms[i][j]);
            }
        }
        System.out.println();
    }
    public Hotel() {
        rooms = new Room[3][10];
        for(int i = 0 ; i <rooms.length ; i++){
            for(int j = 0 ; j < rooms[i].length ; j++){
               if(i==0) {rooms[i][j] = new Room(100*(i+1) + j + 1,"单人" ,true);}
                else if(i==1) {rooms[i][j] = new Room(100*(i+1) + j + 1,"幸福双人" ,true);}
                  else if(i==2) {rooms[i][j] = new Room(100*(i+1) + j + 1,"总统" ,true);}
            }
        }
    }
    public Hotel(Room[][] rooms) {
        this.rooms = rooms;
    }
}