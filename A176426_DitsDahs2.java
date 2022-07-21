public class A176426_DitsDahs2 {

    public A176426_DitsDahs2 right, left;
    public char chr;
    public final char EMPTY = ' ';

    public A176426_DitsDahs2() {
        chr = EMPTY;
        left = null;
        right = null;
    }

    public A176426_DitsDahs2 getRightnode() {
        return right;
    }
    public void setRightnode(A176426_DitsDahs2 rightnode) {
        this.right = rightnode;
    }
 
    public A176426_DitsDahs2 getLeftnode() {
        return left;
    }
    public void setLeftnode(A176426_DitsDahs2 leftnode) {
        this.left = leftnode;
    }
    
    public char getCharac() {
        return chr;
    }
    public void setCharac(char chr) {
        this.chr = chr;
    }
    
    
    
    
    
    
}