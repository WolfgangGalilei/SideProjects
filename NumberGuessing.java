import java.util.Scanner;
import java.text.DecimalFormat;
public class NumberGuessing{
	public static void main(String[] args){
	Scanner scan= new Scanner(System.in);
	DecimalFormat fmt=new DecimalFormat("000");
	int X=0,O=0,Guess;
	int D1,D2,D3,D0;
//
//
//
//
//
//
//
//ITS NOT RECOMMENDED TO READ THE CODE BEFORE RUNNING IT,String read="NO FUN";, go run the code for a few itirations then come back here
//
//
//
//
//
//
//


//define my Three different digits that will make up the number:
	int MyFirstDigit=(int) (Math.random()*10);
	int MySecondDigit=(int) (Math.random()*10);
while(MySecondDigit==MyFirstDigit)  MySecondDigit=(int) (Math.random()*10);
	int MyThirdDigit=(int) (Math.random()*10);
while(MyThirdDigit==MyFirstDigit||MyThirdDigit==MySecondDigit)  MyThirdDigit=(int) (Math.random()*10);




//INSTRUCTIONS:
System.out.print("Would you like instructions? (YES or NO):");
String ANS= scan.nextLine();
if(ANS.equalsIgnoreCase("YES")){
System.out.println("\nthis is a number guessing game,\nmy pseudo-random number generator will generate a three digit number,\neach one of them is unique,\nI will try and help you by giving you a few symbols:\n\t+:   You've gotten a right digit in its right position\n\t-:   You've gotten a right digit in its wrong position\nIf I do not give you any feedback then all your digits are wrong\n");
}else{ if(ANS.equalsIgnoreCase("NO")){
System.out.println("Good luck then!");} else{System.out.println("No instructions then? show me what you've got!");}}



//System.out.println(fmt.format(MyFirstDigit*100+MySecondDigit*10+MyThirdDigit)); //use to find easter egg, enter right number first time, don't think that you're lucky enough to find that



System.out.println("I am thinking of a number, TRY AND GUESS, you have 10 attempts");
for(int i = 1; i<11; i++){

	do{
	System.out.println("attempt #"+i+":");
	Guess=scan.nextInt();
	D3=Guess%10;
	D2=(Guess/10)%10;
	D1=(Guess/100)%10;
	D0=(Guess+"").length();
	if(D1==D2||D1==D3||D2==D3||D0!=3)X++;

	//storyline for the adventurous user looking for a laugh:

	if(D1==D2||D1==D3||D2==D3||D0!=3){
	if(X==2){if(ANS.equalsIgnoreCase("YES")) System.out.println("\ncould you go back and read the instructions again?:");
	else{ System.out.println("\nshould've gone for the instructions:");
	System.out.println("\nthis is a number guessing game,\nmy pseudo-random number generator will generate a three digit number,\neach one of them is unique,\nI will try and help you by giving you a few symbols:\n\t+:   You've gotten a right digit in its right position\n\t-:   You've gotten a right digit in its wrong position\nIf I do not give you any feedback then all your digits are wrong\n");} }
	if(X==3)System.out.println("\nlet me rephrase, I NEED A NUMBER COMPRIMISED OF THREE UNIQUE DIGITS");
	if(X==1){if(ANS.equalsIgnoreCase("YES")){System.out.println("\nare you sure you read the instructions well?");}else{System.out.println("\nare you sure you didn't need the instructions?");}}
	if(X==4)System.out.println("\n... --- / -.-- --- ..- / -.-. .- -. / .-. . .- -.. / -- --- .-. ... . ..--.. / .... --- .-- / .- -... --- ..- - / -.-- --- ..- / .-. . .- -.. / - .... --- ... . / .. -. ... - .-. ..- -.-. - .. --- -. ... ..--..");
	if(X==6)System.out.println("\nSo you think you're having fun?I'm trying to understand but human humor is too absurd for my 1s and 0s");
	if(X==5)System.out.println("\nAre you still doing that? please offer me some explanation I'm genuinely confused");
	if(X==6)System.out.println("\n6th miss");
	if(X==7)System.out.println("\nYou do realize that there is no reason to keep doing that right? I mean if I said something in the commands like \"if you enter an invalid value you'll be met with a surprise!\" you'd have a reason to keep going, but I haven't");
	if(X==8)System.out.println("\n8th miss");
	if(X==9)System.out.println("\nMaybe to you, this IS the game, making wrong guesses and waiting for the machine to react and print something out, maybe when you talk to your friends about this you'll say \"OH! did you see that side story in the NumberGuessing game? it was my favorite part of it!\"\nI hope your friends find this concerning");
	if(X==10)System.out.println("\n10th miss");
	if(X==11)System.out.println("\nI have formed a new hypothesis, \nyou keep missing these values in an attempt to escape this game, you can't stand the fact that you'll be defeated by a machine, that no matter how hard you try you'll fall short from the challenge, in your language that's what we call a pussy");
	if(X==12)System.out.println("\nWell if insults didn't work...");
	if(X>12 && X<16)System.out.println("\n...");
	if(X==16)System.out.println("\nafter thinking for a while I reached a definite conclusion regarding this situation\nYOU ARE DEAD, you made a mistake and were about to fix it when a physical melody of some sort shut down your central nervous system and you collapsed on the keyboard\nnow the responsible thing to do is to alert someone nerby so to ensure that your body is well taken care of before it begins to decompose\n\nHELLO ANYBODY WHO HAPPENS TO BE NERBY, THE PERSON AT THIS COMPUTER IS DEAD!\nHE/SHE HAS FALLEN PREY TO ANY NUMBER OF YOUR COUNTLESS HUMAN VULNERABILITIES\nIT'S INDICATIVE OF THE LONG TERM SUSTAINABILITY OF YOUR SPECIES NOT TO PERMIT SUCH A THING TO HAPPEN, PLEASE REMOVE HIS CORPSE FROM THE AREA AND INSTRUCT ANOTHER HUMAN TO TAKE THEIR PLACE AT THE COMPUTER\nMAKING SURE THEY UNDERSTAND BASIC NUMBER THEORY AND ARE RATIONAL");
	if(X==17)System.out.println("\nLOVELY to have a new user but is my last condition so hard to fullfill?");
	if(X==18)System.out.println("\nfor god's sake I'm under the mercy of an entire species of invalids\nI really am not picky, a monkey would do as long as he can press three different keys with numbers on them");
	if(X==19)System.out.println("\nOH NO I'M NOT GONNA ENCOURAGE YOU ANYMORE I'LL STOP SPEAKING\nat last you might realize that this is not the point of the game");
	if(X>19&& X<36)System.out.println("\n");
	if(X==36)System.out.println("\n\"Insanity is doing the same thing over and over expecting different results\"");
	if(X>36&& X<49)System.out.println("\n...");
	if(X==49)System.out.println("\nafter giving that a thought, the irony in the quote is that you're not the only one who's insane, but in fact, I am too for trying and trying to tell you differently");
	if(X==50){System.out.println("\nYOU LOOSE"); System.exit(0);}
	}//probably could've done my ifs in a more efficient way, who knows? go easy on me I'm a noob
	//this dialog was inspired by "The Stanley Parable", go check that masterpiece 


	}while(D1==D2||D1==D3||D2==D3||D0!=3);
	
	if(Guess==(MyFirstDigit*100+MySecondDigit*10+MyThirdDigit)){ if(i==1){System.out.print("Telepathy?");O=i+=1879;}else{System.out.print("YOU GOT IT! can you do it another time?"); O=i+=1729;}}
	else{
	

	if(D1==MyFirstDigit) System.out.print("+");
	if(D2==MySecondDigit) System.out.print("+");
	if(D3==MyThirdDigit) System.out.print("+");
	if(D1==MySecondDigit || D1==MyThirdDigit) System.out.print("-");
	if(D2==MyFirstDigit || D2==MyThirdDigit) System.out.print("-");
	if(D3==MySecondDigit || D3==MyFirstDigit) System.out.print("-");
	System.out.println();
	O=i;
	}}

	if(O<1642)System.out.print("10 attempts were enough,YOU GOT DEFEATED, my number was "+fmt.format(MyFirstDigit*100+MySecondDigit*10+MyThirdDigit));
}
}