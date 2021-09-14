package solution;

import java.util.ArrayList;

public class Zoo {

        private String name;
        private double latitude;
        private double longitude;
        private ArrayList<Animal> zooAnimals;

        public Zoo(String name, double lat, double lon)
        {
        	zooAnimals = new ArrayList<Animal>();
        	if(lat < 0)
        	{
        		latitude = 0;
        	}
        	else
        	{
        		this.latitude = lat;
        	}
        	if(lon < 0)
        	{
        		longitude = 0;
        	}
        	else
        	{
        		this.longitude = lon;
        	}
        	
        	this.name = name;
        }

        public double getLatitude()
        {
                return latitude;
        }

        public double getLongitude()
        {
                return longitude;
        }

        public String getName()
        {
                return name;
        }
        public void setName(String name)
        {
                this.name = name;
        }
        public int getNumOfAnimals()
        {
                return zooAnimals.size();
        }
        public void addAnimal(Animal animal)
        {
                zooAnimals.add(animal);
        }
        public void testAnimals()
        {
        	System.out.println("Zoo Name: " + getName());
        	System.out.println("Latitude: " + getLatitude());
        	System.out.println("Longitude: " + getLongitude());
        	System.out.println("Zoo Animal Count: " + getNumOfAnimals());
        }
        public static void main(String[] args)
        {
            Zoo zoo = new Zoo("theZoo", 1, 2);
            Cat cat = new Cat(zoo, "Cat");
            Coyote coyote = new Coyote(zoo, "Coyote");
            Dog dog = new Dog(zoo, "Dog");
            FeralCat feralCat = new FeralCat(zoo, "FeralCat");
            Hippo hippo = new Hippo(zoo, "Hippo");
            Lion lion = new Lion(zoo, "Lion");
            WildDog wildDog = new WildDog(zoo, "WildDog");
            Wolf wolf = new Wolf(zoo, "Wolf");
            zoo.addAnimal(cat);
            zoo.addAnimal(coyote);
            zoo.addAnimal(dog);
            zoo.addAnimal(feralCat);
            zoo.addAnimal(hippo);
            zoo.addAnimal(lion);
            zoo.addAnimal(wildDog);
            zoo.addAnimal(wolf);
            zoo.testAnimals();
        }
}