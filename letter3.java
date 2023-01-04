import java.util.Scanner;
public class letter3{
public static void main(String[] args){
System.out.println("\t\n\"Determine Vowel or Consonent letter\"");
Scanner input = new Scanner(System.in);
char let;
System.out.println("Enter a letter : ");
let = input.next().charAt(0);

if (let=='A'||let=='a'||let=='E'||let=='e'||let=='I'||let=='i'||let=='O'||let=='o'||let=='U'||let=='u'){
System.out.println("This letter is Vowel");
}



else {System.out.println("This letter is Consonent");}


}
}