package ua.edu.cbs.lms.hometask_oop_8.task5;

public class Main {
    public static void main(String[] args) {

        try {
            Animal animal = Animal.addedAnimal("Васька", 45, false);

            System.out.println(animal);
            System.out.println(animal.hashCode());


            Animal newAnimal = animal;

            System.out.println(animal.equals(newAnimal));

            Animal otherAnimal = Animal.addedAnimal("Васька", 45, true);

            System.out.println(newAnimal.equals(otherAnimal));

        }catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
