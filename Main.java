import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
 class Student {

   private String name;
   private int id;
   private String address;
   private String phoneNumber;
   private String email;
   private String major;
   private String tution;
   private int numberOfCredit;
   private String GPA;
   private double tutionPayment;
   private String schedule;
   public Student() {

       this.name = "";
       this.id = 100;
       this.address = "";
       this.phoneNumber = "";
       this.email = "";
       this.major = "";
       this.tution = "";
       this.numberOfCredit = 0;
       this.GPA = "";
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public int getId() {
       return id;
   }

   public void setId(int id) {
       this.id = id;
   }

   public String getAddress() {
       return address;
   }

   public void setAddress(String address) {
       this.address = address;
   }

   public String getPhoneNumber() {
       return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
       this.phoneNumber = phoneNumber;
   }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
   }

   public String getMajor() {
       return major;
   }

   public void setMajor(String major) {
       this.major = major;
   }

   public String getTution() {
       return tution;
   }

   public void setTution(String tution) {
       this.tution = tution;
   }

   public int getNumberOfCredit() {
       return numberOfCredit;
   }

   public void setNumberOfCredit(int numberOfCredit) {
       this.numberOfCredit = numberOfCredit;
   }

   public String getGPA() {
       return GPA;
   }

   public void setGPA(String gPA) {
       GPA = gPA;
   }

   public double getTutionPayment() {
       return tutionPayment;
   }

   public void setTutionPayment(double tutionPayment) {
       this.tutionPayment = tutionPayment;
   }
  
  

   public String getSchedule() {
       return schedule;
   }

   public void setSchedule(String schedule) {
       this.schedule = schedule;
   }

   @Override
   public String toString() {
       return "Student [name=" + name + ", id=" + id + "\naddress=" + address + ", phoneNumber=" + phoneNumber
               + ", email=" + email + ", major=" + major + "\ntution=" + tution + ", numberOfCredit=" + numberOfCredit
               + ", GPA=" + GPA + ", tutionPayment=" + tutionPayment + "]";
   }

}
class Main {

   static ArrayList<Student> students;

   public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       students = new ArrayList<>();
       int option;
       System.out.println("WELCOME TO STUDENT MANAGEMENT SYSTEM: ");
       do {
           menu();
           System.out.print("Please choose any option: ");
           option = scan.nextInt();
           switch (option) {
           case 1:
               addNewStudent();
               break;

           case 2:
               editStudent();
               break;

           case 3:
               removeStudent();
               break;

           case 4:
               searchStudent();
               break;

           case 5:
               manageTutionPayment();
               break;

           case 6:
               updateGPA();
               break;

           case 7:
               printStudentSchedule();
               break;

           case 8:
               printAllStudent();
               break;

           case 9:
               System.out.println("Thanks for using SMS");
               System.out.println("Bye!");
               break;

           default:
               System.out.println("Invalid Choice! Try Again..");
               break;
           }
       } while (option != 9);
   }

   private static void menu() {

       System.out.println("\n\t1. Add New Student\n" + "\t2. Edit A Student\n" + "\t3. Remove A Student\n"
               + "\t4. Search A Student\n" + "\t5. Manage tution payment\n" + "\t6. Update GPA\n"
               + "\t7. Print Student Shedule\n" + "\t8. Print all Students\n" + "\t9. Exit");
   }

   private static void addNewStudent() {

       Scanner scan = new Scanner(System.in);
       System.out.print("Enter Student's name: ");
       String name = scan.nextLine();
       System.out.print("Enter Student's id: ");
       int id = scan.nextInt();
       scan.nextLine();
       System.out.print("Enter Student's address: ");
       String address = scan.nextLine();
       System.out.print("Enter Studnet's Phone number: ");
       String phoneNumber = scan.nextLine();
       System.out.print("Enter Student's email address: ");
       String email = scan.nextLine();
       System.out.print("Enter Student's major: ");
       String major = scan.nextLine();
       System.out.print("Enter Student's tution subject: ");
       String tution = scan.nextLine();
       System.out.print("Enter Student's nubmer of credits: ");
       int numberOfCredits = scan.nextInt();
       scan.nextLine();
       System.out.print("Enter Student Current GPA: ");
       String GPA = scan.nextLine();
       System.out.print("Enter Student's tution payment($500 per Student):");
       double tutionPayment = scan.nextDouble();
       scan.nextLine();
       System.out.print("Enter Student's Schedule: ");
       String schedule = scan.nextLine();

       Student student = new Student();
       student.setName(name);
       student.setEmail(email);
       student.setAddress(address);
       student.setGPA(GPA);
       student.setId(id);
       student.setMajor(major);
       student.setPhoneNumber(phoneNumber);
       student.setTution(tution);
       student.setTutionPayment(tutionPayment);
       student.setNumberOfCredit(numberOfCredits);
       student.setSchedule(schedule);
       students.add(student);

   }

   private static void editStudent() {

       Scanner scan = new Scanner(System.in);
       System.out.print("Enter Student id: ");
       int id = scan.nextInt();
       scan.nextLine();
       int flag = 0;
       for (Student student : students) {

           if (student.getId() == id) {
               flag = 1;
               System.out.print("Enter Student's address: ");
               String address = scan.nextLine();
               System.out.print("Enter Studnet's Phone number: ");
               String phoneNumber = scan.nextLine();
               System.out.print("Enter Student's email address: ");
               String email = scan.nextLine();
               System.out.print("Enter Student's major: ");
               String major = scan.nextLine();
               System.out.print("Enter Student's tution subject: ");
               String tution = scan.nextLine();
               System.out.print("Enter Student's nubmer of credits: ");
               int numberOfCredits = scan.nextInt();
               scan.nextLine();
               System.out.print("Enter Student Current GPA: ");
               String GPA = scan.nextLine();
               System.out.print("Enter Student's tution payment($500 per Student):");
               double tutionPayment = scan.nextDouble();
               scan.nextLine();
               System.out.print("Enter Student's Schedule: ");
               String schedule = scan.nextLine();
               student.setEmail(email);
               student.setAddress(address);
               student.setGPA(GPA);
               student.setMajor(major);
               student.setPhoneNumber(phoneNumber);
               student.setTution(tution);
               student.setTutionPayment(tutionPayment);
               student.setNumberOfCredit(numberOfCredits);
               student.setSchedule(schedule);
           }
       }
       if (flag == 0) {

           System.out.println("No student information by this id ");
       }

   }

   private static void removeStudent() {

       Scanner scan = new Scanner(System.in);
       System.out.print("Enter Student id: ");
       int id = scan.nextInt();
       scan.nextLine();
       int flag = 0;
       Iterator<Student> itr = students.iterator();
       while (itr.hasNext()) {
           Student x = (Student) itr.next();
           if (x.getId() == id)
               flag = 1;
           itr.remove();
       }
       if (flag == 0) {

           System.out.println("No student information by this id ");
       }

   }

   private static void searchStudent() {

       Scanner scan = new Scanner(System.in);
       System.out.print("Enter Student id: ");
       int id = scan.nextInt();
       scan.nextLine();
       int flag = 0;
       for (Student student : students) {

           if (student.getId() == id) {
               flag = 1;
               System.out.println(student.toString());
           }
       }

       if (flag == 0) {

           System.out.println("No student information by this id ");
       }
   }

   private static void manageTutionPayment() {

       Scanner scan = new Scanner(System.in);
       System.out.print("Enter Student id: ");
       int id = scan.nextInt();
       scan.nextLine();
       int flag = 0;
       for (Student student : students) {

           if (student.getId() == id) {
               flag = 1;
               if (student.getTutionPayment() == 500) {

                   System.out.println("Student need to pay NIL");
               } else {

                   System.out.println("Student need to pay $" + (500 - student.getTutionPayment()));
               }
           }
       }

       if (flag == 0) {

           System.out.println("No student information by this id ");
       }

   }

   private static void updateGPA() {

       Scanner scan = new Scanner(System.in);
       System.out.print("Enter Student id: ");
       int id = scan.nextInt();
       scan.nextLine();
       int flag = 0;
       for (Student student : students) {

           if (student.getId() == id) {
               flag = 1;

               System.out.print("Enter Student GPA: ");
               String GPA = scan.nextLine();
               student.setGPA(GPA);
           }
       }

       if (flag == 0) {

           System.out.println("No student information by this id ");
       }
   }

   private static void printStudentSchedule() {

       Scanner scan = new Scanner(System.in);
       System.out.print("Enter Student id: ");
       int id = scan.nextInt();
       scan.nextLine();
       int flag = 0;
       for (Student student : students) {

           if (student.getId() == id) {
               flag = 1;

               System.out.println("Student Schedule is: " + student.getSchedule());
           }
       }

       if (flag == 0) {

           System.out.println("No student information by this id ");
       }

   }

   private static void printAllStudent() {

       for (Student student : students) {

           System.out.println(student.toString());
       }
   }

}