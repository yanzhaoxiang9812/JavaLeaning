package marble;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Marble extends Thread{
    Table table = null;
    int x,y,xdir,ydir;
    public Marble(Table _table,int _x,int _y,int _xdir,int _ydir){
        table = _table;
        x = _x; //  x坐标
        y = _y; //  y坐标
        xdir = _xdir;   //  x方向速度
        ydir = _ydir;   //  y方向速度
    }
    public void run(){
        while (true){
            if ((x>(table.getSize().width) - 25) || (x<0))
                xdir *= (-1);// 超过X边界反方向运行。
            if ((y>(table.getSize().width) - 25) || (y<0))
                ydir *= (-1);// 超过Y边界反方向运行。
            x += xdir;//    坐标递增，实现移动。
            y += ydir;
            try {
                //  延时
                sleep(30);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");;
            }
            table.repaint();
            //重绘图形
        }
    }
    public void draw(Graphics graphics){
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x,y,30,30);
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x+5,y+5,8,6);
    }
}
class Table extends JFrame implements ActionListener{
    Button start = new Button("开始");
    Marble marbles[] = new Marble[5];//球线程类对象数组
    int v  = 5;//设置速度
    public Table(){
        super("子弹台球");
        setSize(1000,1000);
        setBackground(Color.cyan);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(start);
        start.addActionListener(this);
        validate();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0 ; i < marbles.length ; i++){
            //  随机产生球的位置和速度
            int xdir = i * (1 - i * (int)Math.round(Math.random())) + v;
            int ydir = i * (1 - i * (int)Math.round(Math.random())) + v;
            int x = (int)(getSize().width * Math.random());
            int y = (int)(getSize().height * Math.random());;
            //实例化球线程对象
            marbles[i] = new Marble(this,x,y,xdir,ydir);
            marbles[i].start();
        }
    }
    public void paint(Graphics graphics){
        super.paint(graphics);
        for (int i = 0 ; i < marbles.length ; i++){
            if (marbles[i] != null){
                marbles[i].draw(graphics);
            }
        }
    }
}
class Test{
    public static void main(String[] args) {
        Table table = new Table();
    }
}
