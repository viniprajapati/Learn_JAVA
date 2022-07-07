import shop.Door;

public class Shop {

    public static void main(String[] args) {
        Door door = new Door();
        door.getLock().test();
        if(door.getLock().isUnlocked("abc")){
            System.out.println("welcome, we are open");
        }
        else
        {
            System.out.println("We are closed now, please visit again");
        }
    }

}
