package solution;

public class Animal {

        private String name;
        private Zoo zoo;
        private int hungerLevel;


        public Animal(Zoo myZoo, String animalName)
        {

        }

        public int getHungerLevel()
        {
                return hungerLevel;
        }

        public void setHungerLevel(int hunger)
        {
           	if (hunger > 10)
        	{
        		hungerLevel = 10;
        	}
           	else if(hunger < 0)
        	{
        		hungerLevel = 0;
        	}
     
        	else 
        	{
        		  hungerLevel = hunger;
        	}
        }
        public String getName()
        {
                return name;
        }
        public void setName(String animalName)
        {
                name = animalName;
        }
        public void sleep()
        {

        }
        public void roam()
        {

        }
        public void makeNoise()
        {

        }
        public void eat()
        {

        }

}