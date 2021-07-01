package main;

import errors.applayers.ControllersLayer;
import errors.applayers.DaoLayer;
import errors.applayers.ServiceLayer;
import errors.exceptions.ControllersLayerException;
import streamApi.Animal;
import streamApi.Classification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        try {
            testExceptions();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        testStreams();
    }

    private static void testExceptions() throws ControllersLayerException {
        ControllersLayer controllersLayer = new ControllersLayer(new ServiceLayer(new DaoLayer()));
        controllersLayer.run();
    }


    public static void testStreams() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cat", 5, false, Classification.PREDATOR));
        animals.add(new Animal("fish", 2, false, Classification.OMNIVOROUS));
        animals.add(new Animal("elephant", 6, false, Classification.HERBIVORE));
        animals.add(new Animal("lion", 9, false, Classification.PREDATOR));
        animals.add(new Animal("eager", 3, true, Classification.PREDATOR));
        animals.add(new Animal("squirrel", 8, false, Classification.HERBIVORE));
        animals.add(new Animal("turtle", 40, false, Classification.OMNIVOROUS));
        animals.add(new Animal("giraffe", 40, false, Classification.HERBIVORE));

        // Фильтруем список по enum
//        List<Animal> herbians = animals.stream().filter(animal -> animal.getClassification().equals(streamApi.Classification.HERBIVORE))
//                .collect(Collectors.toList());
//        System.out.println(herbians);

//        System.out.println();
//        // Фильтруем список по boolean полю
//        List<streamApi.Animal> flyingAnimals = animals.stream().filter(animal -> animal.canFly()).collect(Collectors.toList());
//        System.out.println(flyingAnimals);
//        System.out.println();
//        List<streamApi.Animal> dogs = animals.stream().filter(animal -> animal.getSpecie().equals("dog"))
//                .collect(Collectors.toList());
//        //Вернёт пустой список, так как у нас нет собак
//        System.out.println(dogs);

//        List<Animal> animalsByAge = animals.stream().sorted(Comparator.comparing(Animal::getAge))
//                .collect(Collectors.toList());


//        System.out.println(animalsByAge);
//        //Возрастающая сортировка по типу int
//        List<streamApi.Animal> animalsByClassification = animals.stream().sorted(Comparator.comparing(Animal::getClassification))
//                .collect(Collectors.toList());


//        //Сортировка по классификации произойдёт в том порядке, в котором перечислены типы в enum
//        System.out.println();

        //Сравнения AllMath, AnyMatch, noneMatch, принимают в качестве параметра предикат(лямбду)
//        boolean isDog = animals.stream().anyMatch(animal -> animal.getAge() == 9);
//        System.out.println(isDog);


//        animals.stream().sorted(Comparator.comparing(Animal::getAge).thenComparing(Animal::getClassification))
//                .forEach(System.out::println);
//        System.out.println();

//        animals.stream().sorted(Comparator.comparing(Animal::getAge).thenComparing(Animal::getClassification))
//                .forEach(System.out::println);

        //метод peek()
//        List<Animal> list = animals.stream().peek(animal -> animal.setSpecie(animal.getSpecie().toUpperCase()))
//                .collect(Collectors.toList());
//        list.forEach(System.out::println);
//        System.out.println(species);
//        System.out.println();


//        Получаем из коллекции животных коллекцию строк
//        метод map() преобразует каждый элемент стрима в другой элемент.
//        На выходе можем получить коллекцию объектов другого типа
        List<Animal> speciesInUpperCase = animals.stream().map(animal -> new Animal(animal.getSpecie()))
                .collect(Collectors.toList());
        speciesInUpperCase.forEach(System.out::println);
//        System.out.println(speciesInUpperCase);
    }

}

