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

  public static String pigLatin(String s){
    List<String> digraphs = Arrays.asList("bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr");
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    String ans = "";
    if (Arrays.asList(vowels).contains(s.charAt(0)) || s.length() == 1) {
      ans = (s + "hay");
    } else if (digraphs.contains(s.substring(0,2))) {
      ans = (s.substring(2) + s.substring(0, 2) + "hay");
    } else {
      ans = (s.substring(1) + s.charAt(0) + "hay");
    }
    return (ans.toLowerCase());
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
