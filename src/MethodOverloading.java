//abstract class
abstract class Animal{
   //abstract method
   public abstract void animalSound();
}
public class MethodOverloading extends Animal{

   public void animalSound(){
	System.out.println("Woof");
   }
   public static void main(String args[]){
	Animal obj = new MethodOverloading();
	obj.animalSound();
   }
}