public class widening2 {
    public static void main(String[] args) {
        

        int i=25;
        double d=i;
        System.out.println("int to double : "+d);

       
        float f=i;
        System.out.println("int to float :"+f);

        
        boolean b =(i !=0);
        System.out.println("int to boolean :"+b);

       
        String s= Integer.toString(i);
        System.out.println("int to string :"+s);
    }
    
}

// int to double : 25.0
// int to float :25.0
// int to boolean :true
// int to string :25