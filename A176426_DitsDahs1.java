import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
 
public class A176426_DitsDahs1 {
     
    public A176426_DitsDahs2 root;

    public A176426_DitsDahs1() {
        root = new A176426_DitsDahs2();
        readMorseCode();
    }

    // to read the translated characters to morse codes from a file //
    public void readMorseCode() {
        Scanner sc = null;
        try {
        	File file = new File ("A176426_File2.dat");
            sc = new Scanner(file);
        } 
        catch (FileNotFoundException exception) {
            System.out.println("The file is not found. Make sure it is A176426_File2.dat, not any other files.");
        }
        while (sc.hasNextLine()) {
            String data = sc.nextLine().trim();
            if (data.length() > 0) {
                insertInto(data.substring(1).trim(), data.charAt(0));
            }
        }
    }
    
    // for user to input message or morse message // 
    public static String inputString(){
		Scanner sc = new Scanner(System.in);
	        String passage = sc.nextLine();
	        return passage;
	}
    
    public static String[] word(){
    	String str = " ";
    	String[] wordss = str.split(" ");
    	return wordss;
    }

 
    public void insertInto(String code, char chr) {
    	A176426_DitsDahs2 node = root;
        String s1 = " ";
 
        for (int i = 0; i < code.length(); i++) {
            s1 = code.substring(i, i + 1);
            if (s1.equals(".")) {
                if (node.getLeftnode() != null) {
                	node = node.getLeftnode();
                } else {
                	node.setLeftnode(new A176426_DitsDahs2());
                	node = node.getLeftnode();
                }
            } else {
                if (node.getRightnode() != null) {
                	node = node.getRightnode();
                } else {
                	node.setRightnode(new A176426_DitsDahs2());
                	node = node.getRightnode();
                }
            }
        }
        node.setCharac(chr);
    }
    
    
    public String decode(String str) {
        String s1 = "";
        StringBuffer result = new StringBuffer("");
        A176426_DitsDahs2 node = root;
         
        for (int i = 0; i < str.length(); i++) {
            s1 = str.substring(i, i + 1);
            if (s1.equals(".")) {
                if (node.getLeftnode() != null) {
                	node = node.getLeftnode();
                } else {
                	node.setLeftnode(new A176426_DitsDahs2());
                	node = node.getLeftnode();
                }
                
                
            } else if (s1.equals("-")) {
                if (node.getRightnode() != null) {
                	node = node.getRightnode();
                } else {
                	node.setRightnode(new A176426_DitsDahs2());
                	node = node.getRightnode();
                }
                
                
            } else {
                result = result.append(node.getCharac());
                node = root;
            }
        }
        result = result.append(node.getCharac());
 
        return result.toString();
    }
    
    //to get the inorder for the characters in menu 3
    public void inorder() {        
    	A176426_DitsDahs2 node = root;
        inorderMethod(node);

    }
 
    List<String> inorder = new ArrayList<String>();
    public void inorderMethod(A176426_DitsDahs2 node) {
		if(node == null)
			return;
		
		inorderMethod(node.getLeftnode());
		System.out.print(node.getCharac() + "   ");
		inorderMethod(node.getRightnode());
		
		
	}
    
    public static void summary(String first, String second) {
        if(first.trim().equals(second.trim()))
            System.out.println("Result: Consistent Summary");
        else
            System.out.println("Result: Inconsistent Summary");
        System.out.println();
    }
    
   
    
}