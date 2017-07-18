

package Generic;

import java.util.ArrayList;
import java.util.List;

class AnimalManager<T>{

        private List<T> animals;

        public void output(){
                if(animals!=null && !animals.isEmpty()){
                        for(int i=0;i<animals.size();i++){
                                System.out.println("Animal "+(i+1)+"\t"+animals.get(i));
                               
                        }
                }
        }

        public void setAnimals(List<T> animals){
                this.animals = animals;
        }

        public List<T> getAnimals(){
                if(animals==null){
                        animals = new ArrayList<T>();
                }
                return this.animals;
        }
}
class Dog{
        private String name;

        public Dog(String name){
                this.name = name;
        }

        public String getName(){
                return this.name;
        }

        public void setName(String name){
                this.name = name;
        }

        public String toString(){
                return this.name;
        }

}
class Cat{
        private String name;

        public Cat(String name){
                this.name = name;
        }

        public String getName(){
                return this.name;
        }

        public void setName(String name){
                this.name = name;
        }

        public String toString(){
                return this.name;
        }

}
class TestAnimal{
        public static void main(String... args){
                AnimalManager<Dog> managerDog = new AnimalManager<Dog>();
//                managerDog.getAnimals().add(new Dog("Dog 1 name"));
//                managerDog.getAnimals().add(new Dog("Dog 2 name"));
                managerDog.output();

                System.out.println("/------------------------------------------------------/");

                AnimalManager<Cat> managerCat = new AnimalManager<Cat>();
                managerCat.getAnimals().add(new Cat("Cat 1 name"));
                managerCat.getAnimals().add(new Cat("Cat 2 name"));
                managerCat.output();
              
                
        }

}