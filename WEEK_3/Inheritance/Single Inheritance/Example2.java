import java.util.*;
class Person{
    String name;
    Date dob;
    int mobileNo;
    void readData(String n,Date d,int m){
        name=n;
        dob=d;
        mobileNo=m;
    }
    void printData(){
        System.out.println("Name: "+name);
        System.out.println("date of birth: "+dob);
        //dob.printDate();
        System.out.println("Mobile: "+mobileNo);
    }
}

class Student extends Person{
    String institution;
    int[] quali=new int[20];
    int rollNo;
    int[] marks=new int[5];

    void printBioData(){
        printData();
        System.out.println("Institution: "+institution);
        System.out.println("RollNo: "+rollNo);
        for(int i=0;i<quali.length;i++){
            System.out.println("Marks"+i+":"+quali[i]);
        }
        for(int i=0;i<marks.length;i++){
            System.out.println("Result"+i+":"+marks[i]);
        }
    }
}

class Employee extends Person{
    int empNo;
    int[] salaryHistory=new int[12];
    String organisation;
    String designation;
    Date doj;
    void printSalary(){
        for(int i=0;i<salaryHistory.length;i++){
            System.out.println("Salary"+i+":"+salaryHistory[i]);
        }
    }
}

class Example2{
   public static void main(String[] args) {
        Person p=new Person();
        Student s[]=new Student[100];
        Employee e[]=new Employee[50];
    }
}