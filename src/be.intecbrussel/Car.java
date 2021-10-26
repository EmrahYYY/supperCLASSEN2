package be.intecbrussel;

public abstract class Car {

    private String color="yellow";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public  void  accelerate (){
        System.out.println("car goes brrrrr");
    }

    public  void  decelerate (){
        System.out.println("car goes slow");
    }


}



