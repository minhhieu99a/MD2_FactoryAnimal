public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal Duc = animalFactory.getAnimal("canine");
        System.out.println(Duc.makeSound());

        Animal Dương =animalFactory.getAnimal("Méooo");
        System.out.println(Dương.makeSound());
    }
}
