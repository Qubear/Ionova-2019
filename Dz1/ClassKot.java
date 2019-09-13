public class ClassKot
{
    public double kX,kY,kZ;

    @Override
    public void ClassKot(){
        this.kX=0;
        this.kY=0;
        this.kZ=0;
    }

    public goX(double x){
        kX=x+kX;
    }
    public goY(double y){
        kY=y+kY;
    }
    public jumpZ(double z){
        kZ=kZ+z;
    }

    @Override
    public run(double y,double x){
        this.goX(x*4);
        this.goY(y*4);
    }
}