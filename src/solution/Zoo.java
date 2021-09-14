package solution;

import java.util.ArrayList;

public class Zoo {

        private String name;
        private double latitude;
        private double longitude;
        private ArrayList<Animal> zooAnimals;

        public Zoo(String name, double lat, double lon)
        {

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

        }
        public static void main(String[] args)
        {

        }
}