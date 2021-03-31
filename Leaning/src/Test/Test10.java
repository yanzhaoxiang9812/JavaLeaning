package Test;

import java.util.Arrays;

/*
写一个类Army,代表一支军队，这个类有一个属性weapon数组w(用来存储该军队所拥有的所有武器
该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最;并用这
一大小来初始化数组w。
该类还提供一个方法addweapon (Weapon wa),表示把参数wa所代表的武器加入到数组w中。在这个
类中还定义两个方法attackAll()让w数组中的所有武器攻击:
以及moveAll让w数组中的所有可移动的武器移动。
 */
public class Test10 {
    public static void main(String[] args)  {
        //创建Army
        Army army = new Army(4);
        //创建武器
        Weapon tank = new Tank();
        Weapon cannon = new Cannon();
        Weapon fighter = new Fighter();
        Weapon transportplane = new TransportPlane();
        Weapon tank1 = new Tank();
        //添加武器。
        try {
            army.addWeapon(tank);
            army.addWeapon(cannon);
            army.addWeapon(fighter);
            army.addWeapon(transportplane);
            army.addWeapon(tank1);//武器达到上限，无法添加。
        } catch (AddWeaponException e) {
            System.out.println(e.getMessage());
        }

        //所有可攻击武器攻击
        army.attackAll();

        System.out.println("-------------------------------");
        //所有可移动武器移动
        army.moveAll();

    }
}
interface Moveable{
    //移动行为
    void move();
}
interface Attackable{
    //攻击行为
    void attack();
}
//所有武器父类Weapon
class Weapon{
}
class Army{
    private Weapon[] weapons;
    public Army(int count) {
        this.weapons = new Weapon[count];
    }
    //把所有武器加入到数组里。
    public void addWeapon(Weapon weapon) throws AddWeaponException {
        for(int i = 0 ; i < weapons.length ; i++){
            if(weapons[i] == null){
                weapons[i] = weapon;
                System.out.println(weapon + "添加成功。");
                return;
            }
        }
        throw new AddWeaponException("武器达到上限，无法添加。");

    }
    //所有可攻击武器攻击
    public void attackAll(){
        for(int i = 0 ; i < weapons.length ; i++){
            //判断武器是否可攻击。
            if(weapons[i] instanceof Attackable){
                Attackable attackable = (Attackable)weapons[i];
                attackable.attack();
            }
        }

    }
    //所有可移动武器移动
    public void moveAll(){
        for(int i = 0 ; i < weapons.length ; i++){
            //判断武器是否可移动。
            if(weapons[i] instanceof Moveable){
                Moveable moveable = (Moveable)weapons[i];
                moveable.move();
            }
        }
    }
}
//下面都是武器子类
class Tank extends Weapon implements Moveable,Attackable{
    @Override
    public void move() {
        System.out.println("坦克移动..........");
    }
    @Override
    public void attack() {
        System.out.println("坦克攻击..........");
    }

    @Override
    public String toString() {
        return "Tank";
    }
}
class Cannon extends Weapon implements Attackable{
    @Override
    public void attack() {
        System.out.println("大炮开炮.......");
    }

    @Override
    public String toString() {
        return "Cannon";
    }
}
class Fighter extends Weapon implements Moveable,Attackable{
    @Override
    public void move() {
        System.out.println("战斗机起飞.......");
    }

    @Override
    public void attack() {
        System.out.println("战斗机攻击......");
    }

    @Override
    public String toString() {
        return "Fighter";
    }
}
class TransportPlane extends Weapon implements Moveable{
    @Override
    public void move() {
        System.out.println("运输机起飞.....");
    }

    @Override
    public String toString() {
        return "TransportPlane";
    }
}
//自定义添加武器异常类
class AddWeaponException extends Exception{
    public AddWeaponException() {
    }
    public AddWeaponException(String message) {
        super(message);
    }
}