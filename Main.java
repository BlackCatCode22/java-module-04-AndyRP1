// ar 10/1/24
// TodaysDate.ava


import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {



        System.out.printf("\n Welcome to dates and animal class");

        //Create a Date object to represent the current date
        Date today =new Date ();

        //Define the desired date
        SimpleDateFormat formatter = new SimpleDateFormat("yy-MM-dd")

        //Format the date and store it in a string
        String strTodaysDate= formatter.format(today);

        System.out.println(today's date in the format yyyy-MM-dd"+strTodaysDate);



        //Write java code to calculate birthdates for the aimals and then create a method that returns
        //fpr the animals birthdays


        //input: "4 year old female hyena, born in spring"
        //Processing : find the age and brith season
        // 		and hen use decision control structures to
        //		calculate the date.

        //parse the string
        String strStarting = "4 year old female hyena, born in spring, tan color, 70 pounds, from friguia";
        //split the string on ","
        String[]arrayOfStrPartsOncomma=strStarting.split(regex:,"")
        //output the array elements
        //this is a for :each loop- very handy when examining array elements.
        for (String thePart: arrayofStrPartsOnComma){
            Systen.out.Println("element of the String is :"+ thePart);
        }
        String[ arrayofStrPartsOnSpace = arrayOfstrPartsOnComma[0].split(regex");
        for (String thePart : arrayOfStrPartsOnSpace){
            System.outPrintln("element of the string is "+ the part);

            String ageInYears = arrayOfStrPartsOnSpace[0]
            String animalBirthSeason = arrayOfStrPartsOnSpace02[2];
            System.out.println("the age in yeas of the animal is ;" +ageInYears);
            System.out.println ("the seasons of birth of the animal is : animals birth season);


                    String animalBirthdate=","



            if(animalBirthSeason.contains("spring")){
                animalsBirthdate="2020-03-21"
