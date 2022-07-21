import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class A176426_DitsDahsMain {

	 public static void Menu (){	
	    		System.out.print("\nMenu:" + "\n    1. Send Morse Message" + "\n    2. Receive Morse Message" + 
				         "\n    3. Print Letters and Morse Code" + "\n    4. Exit");
	    		System.out.print("\n\nInput code: ");
	    }
	 
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	String str, str1, word1;
    	int count = 0;

    	A176426_DitsDahs1 b = new A176426_DitsDahs1();
    	List<String> myList = new ArrayList<String>();
    	List <String> myList1 = new ArrayList <String> ();
    	
    	char[] charac = {' ', 'A', 'B', 'C', 'D', 'E',
    					'F', 'G', 'H', 'I', 'J', 'K', 
    					'L', 'M', 'N', 'O', 'P', 'Q', 'R',
    					'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
    					'.',',',':','"','\'','!','?',
    					'@','-',';','(',')','=', 
    					'1', '2', '3', '4', '5', '6',
    					'7', '8', '9', '0'};
    	String[] morse = { "", ".-", "-...", "-.-.", "-..", ".", 
    					  "..-.", "--.", "....", "..", ".---", "-.-", 
    					  ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", 
    					  "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", 
    					  ".-.-.-", "--..--", "---...", ".-..-.", ".----.", "-.-.--", "..--..", 
    					  ".--.-.", "-....-", "-.-.-.", "-.--.", "-.--.-", "-...-", 
    					  ".----", "..---", "...--", "....-", ".....", "-....",
    					  "--...", "---..", "----.", "-----"};
    	
    	try{

		int menuNum = sc.nextInt();
         		while (true) {
         			if(menuNum == 1){
         				
         					do{
         						str = (b.inputString()).toUpperCase();
         						
         						char[] charac1 = str.toCharArray();

         						for (int i = 0; i < charac1.length; i++){
         					        for (int j = 0; j < morse.length; j++){

         					            if (charac[j] == charac1[i]){
         					                str1 = morse[j];  
         					               myList1.add(str1);
         					            }
         					        }
         					    }
         					}while(!str.equalsIgnoreCase("EOM"));
         					Iterator<String> it = myList1.iterator();
         					while(it.hasNext()){
         						String mo = it.next();
         						System.out.print(mo + " ");
         						count++;
         					}
         		

         				 Menu();
         				 menuNum = sc.nextInt();
         				 
         				}
         			
         	
         			else if(menuNum == 2){
         					String t, t1;

         					
         						do{
         							str = b.inputString();
         							t = b.decode(str);
         							myList.add(t);
         						
         						}while(!str.equalsIgnoreCase(". --- --"));
         						do{
         							str = b.inputString();
         							t1 = b.decode(str);
         							myList1.add(t1);
         						}while(!str.equalsIgnoreCase(". --- -"));
         					
         						Iterator<String> it = myList.iterator();
         						while(it.hasNext()){
         							String mo = it.next();
         							System.out.println(mo + " ");
         							count++;
         						}
         					
         						Iterator<String> it1 = myList1.iterator();
         							while(it1.hasNext()){
         								String m = it1.next();
         								System.out.println(m + " ");
         							}
         							
         					
         					System.out.println("\n" + myList.size() + " " + count + " " + "31" + " " + "0" + " " + "4");
         					b.summary(t1, t1);

         				Menu();
         				menuNum = sc.nextInt();
         			} 
         			
         			else if(menuNum == 3){
         				b.inorder();
         				
         				
         				Menu();
         				menuNum = sc.nextInt();
         			}
         			else if(menuNum == 4){
         				System.out.println("Bye dits-dahs.."); break;
         			}
         			else{
         				System.out.println("Choose 1-4 only. Please run the program again."); break;	
         			}
         		}
    	}
    	catch (InputMismatchException inputMismatch) {
			System.out.println("Wrong Input Format. Only numbers, please run the program again.");
		}
    	sc.close();
    }
}