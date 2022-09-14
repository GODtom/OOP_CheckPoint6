public class A1083331_checkpoint6_terrestrialAnimals extends A1083331_checkpoint6_creatures implements A1083331_checkpoint6_behavior {
    public A1083331_checkpoint6_terrestrialAnimals(String name,String sound,String consume,String speed){
        /*********************************The TODO This Time (Checkpoint6) ********************************
         * 
         * TODO(3): Here you have to finish the constructor upon giving the parameters.
         * 
         **********************************The End of the TODO**************************************/
        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/ 
        super(name,sound,consume,speed);
        /********************************************************************************************
         END OF YOUR CODE
         ********************************************************************************************/
    }
        /*********************************The TODO This Time (Checkpoint6) ********************************
         * 
         * TODO(4): Here you have to override the inherited  methods move(),speak(), and feed().
         * Hint1: For a terrestrial animal, you should print out "I can run!" upon the move() method is called. (USE println)
         * Hint2: For a terrestrial animal, you should print out the sound that specify in the csv file upon the speak() method is called. (USE println)
         * Hint3: For a terrestrial animal, you should print out the consume in the csv file upon the feed() method is called. (USE println)
         * e.g: As for a frog, "move()" ----> I can run!
         *                      "speak()" ----> croak
         *                      "feed()"  ----> worms
         **********************************The End of the TODO**************************************/

        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/ 
        @Override
        public void move(){
        	System.out.println("I can run!");
        }
        @Override
        public void speak(){
        	System.out.println(this.sound);
        }
        @Override
        public void feed(){
         	System.out.println(this.consume);       	
        }
        /********************************************************************************************
         END OF YOUR CODE
         ********************************************************************************************/

        /*********************************The TODO This Time (Checkpoint3) ********************************
         * 
         * TODO(5): Here you have to implement the inherited abstract method evolve().
         * Hint1: For a terrestrial animal, you should change the name of the creature to "name of the creature,The superior".
         * e.g: As for a frog, after "evolve()",frog.name="frog,The superior"
         **********************************The End of the TODO**************************************/

        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/ 
        @Override
        public void evolve(){
        	this.name=this.name+",The superior";
        }
        /********************************************************************************************
         END OF YOUR CODE
         ********************************************************************************************/
        public void act(){
            System.out.println(this.name+":");
            speak();
            feed();
            move();
            System.out.println("----------");

        }
    

}
