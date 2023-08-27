import java.util.*;
class CollectionMethods{
    public static void main(String[] args){
        ArrayList<String> namesList = new ArrayList<String>();
        namesList.add("Anthony");
        namesList.add("Alex");
        namesList.add("Andrew");
        namesList.add("Antonio");
        namesList.add("Antash");
        namesList.add("Alexander");
        namesList.add("Bravo");
        namesList.add("Charlie");
        
        for(String each : namesList){
            System.out.println(each);
        }
        System.out.println("\n");
        //sort the array
        Collections.sort(namesList);
        for(String each : namesList){
            System.out.println(each);
        }
        System.out.println("\n");
        //shuffle the array
        Collections.shuffle(namesList);
        for(String each : namesList){
            System.out.println(each);
        }
        
        //search for name and output index
        String findName = "Anthony";
        String invalidName = "Delta";
        int nameIndex = namesList.indexOf(findName);
        int nonNameIndex = namesList.indexOf(invalidName);
        
        System.out.println("Location of " + findName  + ": " + (nameIndex + 1));
        
        if(nonNameIndex == -1){
            System.out.println("Location of " + invalidName + " was not found." + "\n");
        }
        else {
            System.out.println("Location of " + invalidName + ": " + (nonNameIndex + 1) + "\n");
        }
        
        //convert array back into ArrayList
        String[] toArray = new String[8];
        toArray = namesList.toArray(toArray);
        List<String> nameList = Arrays.asList(toArray);
        for(String each : nameList){
        System.out.println(each);
}
    }   
}