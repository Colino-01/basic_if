public class DistinctValues{
    public static void main(String[] args){
    
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
 if(n1==n2 && n2==n3){
    System.out.println("Son iguales");
 }
 else if ((n1 != n2) && (n2 != n3) && (n1 != n3)){
     System.out.println("Son distintos los tres");
 }
 
 else if ((n1 != n2) && (n1 != n3) && (n3 == n2)){
     System.out.println("solo hay dos distintos");
 }
 
 else if ((n1 == n2) && (n1 != n3) && (n3 != n2)){
    System.out.println("solo hay dos distintos");
 }
 else if ((n1 != n2) && (n1 == n3) && (n3 != n2)){
    System.out.println("solo hay dos distintos");
 }
 
  }
}

