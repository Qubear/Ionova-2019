public class ClassTigr extends ClassKot
{
    public int color,size;

    @Override
    public void ClassTigr(){
        this.kX=0;
        this.kY=0;
        this.kZ=0;
    }

    public go(double x,double y){
        this.goX(x);
        this.goY(y);
    }
    public jump(double x,double y){
        this.jumpZ(1);
        this.goX(x);
        this.goY(y);
    }


        /*Полиморфизм*/
    @Override
    public run(double y,double x){
        this.goX(x*10);
        this.goY(y*10);
    }
}