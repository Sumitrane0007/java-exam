import java.util.ArrayList;

public class BookClient {
    
    public static void main(String[] args) {
        ArrayList< Books> a1 = new ArrayList<>();
        Books b1=new Books("123", "lord's wedding", "4SR", "HappyEnding", 6, 9);
        Books b2=new Books("123", "lord's wedding", "4SR", "HappyEnding", 6, 9);
        Books b3=new Books("123", "lord's wedding", "4SR", "HappyEnding", 6, 9);
        a1.add(b1);
        a1.add(b2);
        a1.add(b3);


        try{
            for(Books b : a1){
                String s= args[1];
                System.out.println(s);
             b.Display();
            }
        }
        catch(Exception i){
            System.out.println(i);
        }
        finally{
            for(Books b : a1){
                b.Display();
            }
            }
        }
    
    public static Exception ex(){
        return new Exception("thrown error");
    }
    
}
