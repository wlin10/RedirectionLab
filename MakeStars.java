import java.util.*;
public class MakeStars{

  public static String makeStars(String s){
    String stars = "";
    for (int i = 0; i < s.length(); i++){
      stars += '*';
    }
    return stars;
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
          System.out.print(makeStars(n1.next()) + " ");
        }
        System.out.println();
      }
      n.close();

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }

}
