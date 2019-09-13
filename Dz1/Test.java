public class Test{
    public static void main(){
        ClassKot kot = new ClassKot();
        ClassTigr tigr = new ClassTigr();
        ClassKitty kitty = new ClassKitty();

        /*Инкапсуляция*/
        tigr.go(1,1);
        kitty.go(1,1);
        kot.run(1,1);
        /*Наследование*/
        System.out.print("\ntigr: ",tigr.x," ",tigr.y);
        /*Полиморфизм*/
        tigr.run(2,0);
        kitty.run(2,0);
        kot.run(2,0);

        System.out.print("\n\ntigr: ",tigr.x," ",tigr.y);
        System.out.print("\nkitty: ",kitty.x," ",kitty.y);
        System.out.print("\nkot: ",kot.x," ",kot.y);
    }
}