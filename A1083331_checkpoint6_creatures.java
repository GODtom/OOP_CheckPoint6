public abstract class A1083331_checkpoint6_creatures {
    protected String name,sound,consume,speed;
    public A1083331_checkpoint6_creatures(String name,String sound,String consume,String speed){
        this.name=name;
        this.sound=sound;
        this.consume=consume;
        this.speed=speed;
    }
    //Species evolution
    /*********************************The TODO This Time (Checkpoint6) ********************************
     * TODO(9): Finish the abstract method.
    **********************************The End of the TODO**************************************/

    /********************************************************************************************
        START OF YOUR CODE
    ********************************************************************************************/ 
    public abstract void evolve();
    public abstract void act();
    /********************************************************************************************
         END OF YOUR CODE
    ********************************************************************************************/
         
    //Sexual reproduction
    public void give_birth(A1083331_checkpoint6_creatures mate){
        System.out.println("-----Sexual reproduction-----");
        /*********************************The TODO This Time (Checkpoint6) ********************************
         * 
         * TODO(10): Here you have simulate the sexual reproduction. You first have to call the mate's act() method, then print out the formula.The formula is as follow:
         * If the parent both live in water or on land, then you should print out "the name of itself+the name of the mate="the sound of itself"+"the sound of the mate"".
         * On the other hand, if the creature itself doesn't live in the same area as its mate's, 
         * then you should print "the name of itself+the name of the mate=Monster!".(Use println)
         * e.g: Frog.give_birth("Cow") ----->"Cow:
                                              mooooooo
                                              grass
                                              I can run!
         *                                    Frog+Cow=croakmooooooo"
         *      Frog.give_birth("Chicken") ---->"Chicken:
                                                 cha-caw
                                                 grain
                                                 I can run!
         *                                       Frog+Chicken=croakcha-caw"
         *      Frog.give_birth("Dolphin") -----> "Dolphin:
                                                   click
                                                   fish
                                                   I can swim!
         *                                         Frog+Dolphin=Monster!"
         * Hint1: To call the method act(), you should implement polymorphism.(No blank is required before each line)
         **********************************The End of the TODO**************************************/

        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/ 
        
        String temp1,temp2;
        temp1=String.valueOf(mate.getClass().getName());
        temp2=String.valueOf(this.getClass().getName());
        if (temp1.equals("A1083331_checkpoint6_terrestrialAnimals")) {
        	A1083331_checkpoint6_creatures t =new A1083331_checkpoint6_terrestrialAnimals(mate.name,mate.sound,mate.consume,mate.speed);
         	t.act();       
	        if(temp1.equals(temp2)){
	        	System.out.println(this.name+"+"+t.name+"="+this.sound+t.sound);
	        }
	        else{
	        	System.out.println(this.name+"+"+t.name+"="+"Monster!");
	        }
        }
        if (temp1.equals("A1083331_checkpoint6_aquatilia")) {
        	A1083331_checkpoint6_creatures t =new A1083331_checkpoint6_aquatilia(mate.name,mate.sound,mate.consume,mate.speed);
        	t.act();        
	        if(temp1.equals(temp2)){
	        	System.out.println(this.name+"+"+t.name+"="+this.sound+t.sound);
	        }
	        else{
	        	System.out.println(this.name+"+"+t.name+"="+"Monster!");
	        }       
        }        

        /********************************************************************************************
         END OF YOUR CODE
        ********************************************************************************************/
    }
    //Asexual reproduction
    public void give_birth(){
        System.out.println("-----Asexual reproduction-----");
        /*********************************The TODO This Time (Checkpoint3) ********************************
         * 
         * TODO(11): Here you will learn what overload is. The method have the same name as give_birth() but with different parameter.
         * If a creature use give_birth() without a mate parameter then you should print out "Name of the creature just clone itselfself!".
         * (Use println, there's a space between the name of the creature and "just".)
         * e.g: Frog.give_birth() -----> "Frog just clone itself!"
         **********************************The End of the TODO**************************************/

        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/
		System.out.println(this.name+" "+"just clone itself!");    
        /********************************************************************************************
         END OF YOUR CODE
         ********************************************************************************************/
    }
}
