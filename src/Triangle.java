public class Triangle {
   public static String triangleClassification(int a, int b, int c ){
       String result = "";
       if(a<0|| b<0||c<0){
           result= "Không phải là tam giác";
       }else {
           if(a==b&& a==c){
               result= "Tam giác đều";
           }
       }
       return result;
   }
}
