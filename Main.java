//ar 9/24/24
//ArrayListPractice


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        // Create an arraylist of strings
        ArrayList<String> myListOfStrings = new ArrayList<>();


        //Add a few elements to my ArrayList.
        myListOfStrings.add("first");
        myListOfStrings.add("Second");
        myListOfStrings.add("third");

        //Output our ArrayList
        System.out.println("\n myListOfStrings is"+ myListOfStrings);

        //Remove an element.
        myListOfStrings.remove(0);

        //Remove an element
        myListOfStrings.remove("third");

        //Output our ArrayList
        System.out.println("\n After adding a bunch of stuff...");
        System.out.println("\n myListOfStrings is: "+ myListOfStrings);

        //Use a for loop to output each element of our arrayList
        for (int i=0; i<myListOfStrings.size();i++){
            System.out.println("An element in my list is:"+ myListOfStrings.get(i));
        }

        // use a for loop to add some things to our list
        String toAdd = "";
        for(int i=0;i<10;i++){
            toAdd= toAdd + "adding...."+ Integer.toString(i);
            myListOfStrings.add(toAdd);





        }
    }
}