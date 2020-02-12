package techehub;

class Wheel{

    int size;


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class AlloyWheel extends Wheel {

}

class DiscWheel extends Wheel {

}

public class Car {

    Car(){

    }

    Car (Wheel fl, Wheel fr, Wheel bl, Wheel br){
        this.fl= fl;
        this.fr= fr;
        this.bl =bl;
        this.br= br;
    }

    Wheel fl;
    Wheel fr;
    Wheel bl;
    Wheel br;

    public Wheel getFl() {
        return fl;
    }

    public void setFl(Wheel fl) {
        this.fl = fl;
    }

    public Wheel getFr() {
        return fr;
    }

    public void setFr(Wheel fr) {
        this.fr = fr;
    }

    public Wheel getBl() {
        return bl;
    }

    public void setBl(Wheel bl) {
        this.bl = bl;
    }

    public Wheel getBr() {
        return br;
    }

    public void setBr(Wheel br) {
        this.br = br;
    }
}


