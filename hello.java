import java.util.Scanner; //import the scanner class

class hello{
    public static void main(String[] args) {
        Scanner nameAndage = new Scanner(System.in);//Creating a scanner object for input 

        System.out.println("Enter your name and age\n..........\n");
        String name = nameAndage.nextLine();  //user input for name
        System.out.println("Now enter your age");
        int age = nameAndage.nextInt();  //user input for age
        System.out.println("You'r name is " + name + " and age is " + age);
    }
}