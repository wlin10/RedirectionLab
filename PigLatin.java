import java.util.*;
public class PigLatin{

  public static String pigLatinSimple(String s){
    if (s.equals("")) {
      return s;
    }
    if (s.charAt(0) == 'a' ||
    s.charAt(0) == 'e' ||
    s.charAt(0) == 'i' ||
    s.charAt(0) == 'o' ||
    s.charAt(0) == 'u' ||
    s.length() == 1) {
      return (s + "hay");
    } else {
      String x = (s.substring(1) + s.charAt(0));
      return (x + "hay");
    }
  }

  public static void main( String[]args ){
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner( System.in );
      //use hasNextLine()/nextLine() to loop over
      //all of the data
      while(n.hasNextLine()) {
        Scanner n1 = new Scanner(n.nextLine());
        while(n1.hasNext()) {
          System.out.print(pigLatinSimple(n1.next()) + " ");
        }
        System.out.println();
      }
      n.close();

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }

}
