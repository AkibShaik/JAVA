                                          //OOPS__001

package OOPS_COMPLETE;

public class OOPS__001 {
    public static void main(String[] args) {

        Student s1=new Student();
     /* s1.rno=22;
        s1.name="Akibzaved";
        s1.marks=44.5f;  */

        s1.ChangeName("Md NadimShaikh");
        s1.printInfo();

        Student s2=new Student(32,"KabirSingh",88.7f);        //passing value with parameters
        s2.printInfo();

        Student random=new Student(s1);   //passing the copy of s1
        random.printInfo();

        Student random2=new Student();   //in java(oops) object are stored in Stack not in heap
        random2.printInfo();

        //one (object) put into two (object)
        Student one=new Student();
        Student two=one;
        one.name="something something";
        System.out.println(two.name);
    }
}

//create com.kunal.greeting.hello.a class
class Student{
    int rno;
    String name;
    float marks;

    void printInfo(){
        System.out.println(this.name);
        System.out.println(this.rno);   //this keyword is used here for helping in reference for object
        System.out.println(this.marks);
    }
    void ChangeName(String newName){     // effect
        this.name=newName;
    }
    Student(){       // No parameters
        //this is how you call com.kunal.greeting.hello.a constructor  from another constructor
        this(123,"default person",90.6f);
    }

    Student(int enroll,String name,float marks){     //with parameters
        this.rno=enroll;
        this.name=name;             //==>this name is different  (think about method[function])
        this.marks=marks;
    }
    Student(Student other){    ///copy the value of s1 in other will be pass ==> this is also called as copy Constructor
        this.name=other.name;
        this.rno=other.rno;
        this.marks=other.marks;

    }
}

/* Points:-
          1. in java(oops) object are stored in Stack not in heap memory
          2. Constructor are automatically called when an object are instantiated(created)
             it 2 types  (1).with parameters, (2).without parameters
             .you can create object put perivious value which is called copy Constructor
             .you can call constructor  from another constructor
 */

//==>



