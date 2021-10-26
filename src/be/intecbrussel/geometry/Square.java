package be.intecbrussel.geometry;

public class Square extends Rectangle {

    @Override
    public  void setLength( double length) { setSide(length);
        super.setWidth(length);}

    @Override
    public void setWidth ( double Width) { setSide(Width);}



    public  void setSide ( double side ) {


        super.setLength(side);
        super.setWidth(side);










    }



    }




