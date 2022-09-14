import java.util.ArrayList;
import java.io.*;
public class A1083331_checkpoint6_zoo {
    public static void main(String[] args) {
        //Description: Name of the csv file.
        String DATA=args[0];
        ArrayList<A1083331_checkpoint6_terrestrialAnimals> land=new ArrayList<>();
        ArrayList<A1083331_checkpoint6_aquatilia> water=new ArrayList<>();
        /*********************************The TODO This Time (Checkpoint3) ********************************
         * 
         * TODO(1): This time, you have to read in a csv file, then use checkans() method to check answer.
         * !!!IMPORTANT!!! Noted that if you change the name of a file, you may also need to check if the code that isn't marked as TODO 
         * needs to be modified as well. !!!IMPORTANT!!!
         * 
         **********************************The End of the TODO**************************************/

        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/ 
        import_csv(DATA,land,water);
        checkans(land,water);

        /********************************************************************************************
         END OF YOUR CODE
         ********************************************************************************************/

    }
    public static void import_csv(String filename,ArrayList<A1083331_checkpoint6_terrestrialAnimals> land,ArrayList<A1083331_checkpoint6_aquatilia> water){
        /*********************************The TODO This Time (Checkpoint3) ********************************
         * 
         * TODO(2): Here you have to read in the data and store them into the ArrayList. e.g: Frog is a terrestrial animal,
         * so it should be added to ArrayList named "land".
         * Hint1: Noted that you only need to record name,sound,consume, and speed.
         **********************************The End of the TODO**************************************/

        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/ 
        try{
        FileReader fileReader = new FileReader(filename);
        BufferedReader buff = new BufferedReader(fileReader);
        String stop=buff.readLine();
        while((stop=buff.readLine())!=null){
	        String[] read;
	        read=stop.split(",");
	        if(read[4].equals("terrestrial")){
	        	A1083331_checkpoint6_terrestrialAnimals temp=new A1083331_checkpoint6_terrestrialAnimals(read[0],read[1],read[2],read[3]);
	        	land.add(temp);
	        }
	        if(read[4].equals("aquatic")){
	        	A1083331_checkpoint6_aquatilia temp=new A1083331_checkpoint6_aquatilia(read[0],read[1],read[2],read[3]);
	        	water.add(temp);
	        }	        
        }
        buff.close();
        }
        catch(IOException e){
            System.out.println("Oops!Tricks on you!");
            System.exit(0);
        }       
        /********************************************************************************************
         END OF YOUR CODE
         ********************************************************************************************/
    }
    //Check answer
    //Noted that if you change the filename, you may need to modified the following code.
    public static void checkans(ArrayList<A1083331_checkpoint6_terrestrialAnimals> land,ArrayList<A1083331_checkpoint6_aquatilia> water){
        land.get(0).give_birth(land.get(1));
        land.get(2).give_birth(water.get(1));
        land.get(3).give_birth();
        water.get(3).evolve();
        water.get(3).act();
    }
}
