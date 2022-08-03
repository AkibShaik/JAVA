                                         //TOPIC: 1
public class Variable {
    public static void main(String[] args) {
        int b=323;
        double c=3.14;
        float d=4.86f;
        boolean e=true;
        char l='$';
        String Song_name="Last_Ride";
        System.out.println("Fav Song: "+Song_name);


    //Swap program
        String x="Moose_Wala";
        String y="Emiway_Bantai";

        String temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping Singers");
        System.out.println("Singer_X: "+x);
        System.out.println("Singer_Y: "+y);

    }
}


                                         //TOPIC: 2
import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter your FAV Song: ");
        String name=scan.nextLine();
        System.out.print("Enter Your Age: ");
        int age= scan.nextInt();

        System.out.println("Your FAV Song is: "+name);
        System.out.println("Your Age is : "+age);

    }
}


                                       //TOPIC: 3
import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter your FAV Song: ");
        String name=scan.nextLine();
        System.out.print("Enter Your Age: ");
        int age= scan.nextInt();

        System.out.println("Your FAV Song is: "+name);
        System.out.println("Your Age is : "+age);

    }
}



                                        //TOPIC: 4
import javax.swing.*;
public class GUI_INTRO {
    public static void main(String[] args) {
        //By Default it takes Strings
        String name= JOptionPane.showInputDialog("Enter Your name! ");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        //it will show u error because it takes String but u are store in int datatype so i was put here Integer.parseInt
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter Your age! "));
        JOptionPane.showMessageDialog(null,"You are "+age+"year Old");

        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height "));
        JOptionPane.showMessageDialog(null,"You are "+height+"cm tall");
    }
}



                                     //TOPIC: 5
import java.util.Scanner;

public class MATH_CLASS {
    public static void main(String[] args){
        double x=-23.86;
        double  y=7.888;
        System.out.println("Absolute value of reult: "+Math.abs(x));                  //return value without sign
        System.out.println("Suare root of y using floor: "+Math.floor(Math.sqrt(y)));   //floor is used for down value
        System.out.println("Suare root of y using ceil : "+Math.ceil(Math.sqrt(y)));    //ceil is for upper value


        //Find Hypotenious of tringle
        double m,n;
        double h;

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter side x: ");
        m=scan.nextDouble();
        System.out.print("Enter side y: ");
        n=scan.nextDouble();

        h=Math.sqrt((x*x)+(y*y));
        System.out.println("Hypotenous is: "+h);

    }
}



                                       //TOPIC: 6
import java.util.Random;

public class RANDOM_NUMBERS {
    public static void main(String[] args) {
        Random random=new Random();

        int x=random.nextInt(9)+1;   //random number b/w 0-10
        System.out.println(x);

        double y=random.nextDouble();
        System.out.println(y);

        boolean m=random.nextBoolean();
        System.out.println(m);

        System.out.println(random.nextGaussian());  //returns double value
    }
}



                                         //TOPIC: 7
import java.util.Scanner;
public class IF_ELSE {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scan.nextInt();

        if(num%2==0){
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
    }
}



                                       //TOPIC: 8
import java.util.Scanner;

public class SWITCHE_CASE {
    public static void main(String[] args) {

        //GRADE Program using switch case
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Marks Please ");
        int num=scan.nextInt();
        if(num==0 || num>100){
            System.out.println("Invalid Number!");
        } else if (num<33) {
            System.out.println("try next time you will do it Legend Bro :/ ");
        }

        //Inhance Switch case:: with multiple values
        switch (num/10){

            case 10,9->System.out.println("A");
            case  8,7-> System.out.println("B");
            case  6,5-> System.out.println("C");
            case  4,3-> System.out.println("D");
        }

    }
}



                                             //TOPIC: 9
public class ARRAY {
    public static void main(String[] args) {

//      String cars[]={"BMW","Farrai","Tesla","TATA"};      My_Way to decleration :)
        String[] cars =new String[4];                     //2nd Way to decleration
        cars[0]="BMW";
        cars[1]="Fararri";
        cars[2]="Tesla";
        cars[3]="TATA";

        for(String i:cars){
            System.out.println(i);
        }
    }
}
// 2D Array
public class ARRAY_2D {
    public static void main(String[] args) {
        //for Without Input 2D-Array Declaration
        String[][] cars={{"BMW","Ferrari","Corvette"},
                          {"Tata","Range_Rover","Tesla",},
                          {"Maclern","Honda","tayota"}};


        //From User Input
        Scanner scan=new Scanner(System.in);
        String[][] actors=new String[3][3];

        System.out.println("Enter your Fav Actors!");
        for (int i=0;i<actors.length;i++){
            for(int j=0;j<actors.length;j++){
                actors[i][j]=scan.nextLine();
            }
        }
        System.out.println("Your favourite Actors is: ");
        for (int i=0;i<actors.length;i++){
            for(int j=0;j<actors.length;j++){
                System.out.print(actors[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}


 
                                            //TOPIC: 10
import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String name="Amit Badana ";

        //String Method==>useful
        System.out.println(name.equals("Amit Badana"));
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("d"));
        System.out.println(name.replace('a','e'));
        System.out.println(name.isEmpty());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());


        //String Method CWH
        String Subject="Computer_Science";
        int length=Subject.length();
        System.out.println(length);

        String lowerstring=Subject.toLowerCase();
        System.out.println(lowerstring);

        String Upperstring=Subject.toUpperCase();
        System.out.println(Upperstring);

        String name1="   Target Lock   ";
        System.out.println(name1.trim());  //removeSpace

        String d="Bro Code";
        System.out.println(d.substring(2));
        System.out.println(d.substring(1,8));

        System.out.println("using replace: "+d.replace('r','R'));
        System.out.println("part of string replace:  "+d.replace("Bro","Legend"));

        System.out.println("Start with bro or not: "+d.startsWith("Bro"));
        System.out.println("Start with bro or not: "+d.endsWith("ro"));
        System.out.println("Character at index 4: "+d.charAt(4));
        System.out.println("First Occurence of String index: "+d.indexOf("od"));

        String m_name="Alianoian";
        System.out.println("Search with given Index Present at index: "+m_name.indexOf("an",5));

        System.out.println("Last occur index of String "+m_name.lastIndexOf("an"));
        System.out.println("given index tak search: "+m_name.lastIndexOf("an",4));
        System.out.println("string is equal or not: "+m_name.equals("Alian"));

        System.out.println("I am Escape Sequence\r Character akko");

    }
}



                                                //TOPIC: 11
public class WRAPPER_CLASS {
    public static void main(String[] args) {
        //Wrapper_Class = provides a way to use primitive data_types as reference data types
        /* primitive         reference
           boolean           Boolean
           char              Character
           int               Integer
           double            Double
         */

       /* Autoboxing:- The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing
                    ex:- int to Integer, long to Long, float to Float, boolean to Boolean, double to Double, and short to Short. */
        int a=5;
        Integer in=a;
        Boolean x=true;
        Double pi=3.14;

       /* Unboxing: It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing.
                   ex:– conversion of Integer to int, Long to long, Double to double, etc.   */
        Integer i=345;
        int py=i;

    }
}



                                               //TOPIC: 12
import java.util.ArrayList;

public class ARRAY_LIST {
    public static void main(String[] args) {

        //ArrayList:- Element can be added and removed after compilation phase. it store reference data type
        ArrayList<String> food=new ArrayList<String>();
        food.add("Pizza");
        food.add("hamburger");
        food.add("Hotdog");

        food.set(2,"Chiken Biryani");      //set index 2 via Chiken Biryani
        food.remove(1);              //remove string at index 1
        food.clear();                     //clear all element from array which are added


        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}

//--> 2D_ArrayList
import java.util.ArrayList;               

public class ARRAYLIST_2D {
    public static void main(String[] args) {
        //2-D ArrayList:- in type we put ArrayList<String>
        ArrayList<ArrayList<String>> GroceryList=new ArrayList<ArrayList<String>>();

        ArrayList<String>backeryList=new ArrayList<String>();
        backeryList.add("Pasta");
        backeryList.add("Bread");
        backeryList.add("Donuts");

        ArrayList<String> produceList=new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinkList=new ArrayList<String>();
        drinkList.add("Cock");
        drinkList.add("Due");
        drinkList.add("coffee");

        //add all three list inside GroceryList
        GroceryList.add(backeryList);
        GroceryList.add(produceList);
        GroceryList.add(drinkList);

        //Access element of 2D-Arraylist
        System.out.println(GroceryList);          //Print all array element inside GroceryList
        System.out.println(GroceryList.get(0).get(1));    //access a perticular single  element
        System.out.println(GroceryList.get(2));    //access 3rd row

    }
}



                                         //TOPIC: 13
public class METHOD {
    public static void main(String[] args) {
        //METHOD:- a block of code that is executed whenever it is called upon
        String name="AkibZaved";
        int age=18;
        hello(name,age);

        int x=32,y=34;
        System.out.println(add(x,y));
    }
    static void hello(String name,int age){
            System.out.println("Your name is: "+name);
            System.out.println("Your age is: "+age);
    }
    static int add(int x,int y){
        int result=x+y;
        return result;
    }
}

//-->METHOD_OVERLOADING
public class OVERLOADED_METHODS {
    public static void main(String[] args) {
        /* Overloaded Method:-method that share same name but have different parameters'
                               method_name + parameters=method_Signature       */
       double x=2.0,s=3.4,y=3.9,z=1.3;

    }
    //Jisme match usne kiya fatch :)
    static int add(int a,int b){
        System.out.println("This is OverLoaded Method #1");
        return a+b;
    }
    static int add(int a,int b,int c){
        System.out.println("This is OverLoaded Method #2");
        return a+b+c;
    }
    static int add(int a,int b,int c,int d){
        System.out.println("This is OverLoaded Method #3");
        return a+b+c+d;
    }
    static double add(double a,double b,double c){
        System.out.println("This is OverLoaded Method #4");
        return a+b+c;
    }
}



 
                                         //TOPIC: 14
public class FINAL_KEYWORD {
    public static void main(String[] args) {
        final double PI=3.14159;
        // PI=3.9;     can not be update
        System.out.println(PI);
    }
}
//-->Expression
public class Expression {
    public static void main(String[] args) {
        double friends=10;
        friends/=3;
        friends--;
        System.out.println((double) friends);    //without write here (double) U can also Print Decimal Portion Because of your friends datatype is double;
    }
}


                                      //


















































