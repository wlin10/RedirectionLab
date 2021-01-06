import java.util.*;
public class PigLatin{

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
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
      return (x + "ay");
    }
  }

  public static String pigLatin(String s){
    List<String> digraphs = Arrays.asList("bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr");
    String ans = "";
    s = s.toLowerCase();
    if (s.charAt(0) == 'a' ||
    s.charAt(0) == 'e' ||
    s.charAt(0) == 'i' ||
    s.charAt(0) == 'o' ||
    s.charAt(0) == 'u' ||
    s.length() == 1) {
      return (s + "hay");
    } else if (digraphs.contains(s.substring(0,2))) {
      ans = (s.substring(2) + s.substring(0, 2) + "ay");
    } else {
      ans = (s.substring(1) + s.charAt(0) + "ay");
    }
    return (ans.toLowerCase());
  }

  public static String pigLatinBest(String s){
    String ans = "";
    String temp = s;
    char punc = 'a';
    s = s.toLowerCase();
    if (!(Character.isDigit(s.charAt(s.length()-1)) || Character.isLetter(s.charAt(s.length()-1)))) {
      punc = s.charAt(s.length()-1);
      temp = s.substring(0, s.length()-1);
      ans = (pigLatin(temp) + punc);
    } else
    if (!(Character.isLetter(s.charAt(0)))) {
      ans = (s.toLowerCase());
    } else {
      ans = pigLatin(s);
    }
    return ans;
  }

  public static void main( String[]args ){
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner( System.in );
      //use hasNextLine()/nextLine() to loop over
      //all of the data
      String ans = "";

      while(n.hasNextLine()) {
        Scanner n1 = new Scanner(n.nextLine());
        while(n1.hasNext()) {
          ans += (pigLatinBest(n1.next()) + " ");
        }
        ans += ("\n");
      }
      System.out.print(ans.substring(0, ans.length()-1));
      n.close();

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }

}
