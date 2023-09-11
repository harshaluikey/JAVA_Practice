package INHERITENCE;

public class SingleInheritanceEx {
    public static void main(String[] args) {
        Swift swift = new Swift();
        swift.display();
        swift.show();

    }
}

 class Car{
    String color;

    public Car(){
        this.color="black";
     }

     public void display(){
         System.out.println("Color of the car is: "+ color);
     }
}

class Swift extends Car{
    public void show(){
        System.out.println("Color of Swift is: "+color);
    }
}

