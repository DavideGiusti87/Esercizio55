/*
Polymorphism 01
Exercise: Polymorphism 1

define a class Animal that has:
an instance variable animalName
a constructor that instantiate animalName
a method animalSound()
achieve polymorphism by using method overloading on animalSound()
if there are no parameters, animalSound() will be Roarr!
if there is just 1 string param called intensity, animalSound() will be:
Roarrrrrrrr! if intensity is high
Roar if intensity is low
Cannot reproduce it properly in other cases
define a tester class where you create an Animal object and call the 2 versions of the method
 */

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Lion");
        System.out.println("The lion roars: "+animal.animalSound());
        System.out.println("The lion roars loudly: "+animal.animalSound("high"));
        System.out.println("The lion roars softly: "+animal.animalSound("low"));
        System.out.println("Does the lion roar? "+animal.animalSound(""));

    }
}
