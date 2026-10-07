package arrayofStrings;

public class Ex2 {

    public static void main(String[] args) {
    	
    
        String firstname[] = {"vishnu" , "Venkata" ," Naga", "Sai"};
        String lastname[] = {"Kunapareddy"};
        
        
        
        StringBuffer sb = new StringBuffer();
        
        
        	
        for(int i = 0;i < lastname.length;i++) {
        	sb.append(firstname[i]).append(" / ") . append(lastname[i]);
        }
        
        System.out.println(sb.toString());
    }
    
    
}
