package ;


/**
 * Given a string "aaaaabbbbbbbbbccccpqrstuv" would print "a5b9c4pqrstuv"
 * @author Rakesh Chouhan
 */
public class StringCompression {

    public static void main(String[] args) {
        System.out.println(compress1("aaaaabbbbbbbbbccccpqrstuv"));
    }

// Using Char array
    public static String compress(String a){
        if(a.length()<2){return a;}
        if(a.length()==2){if(a.charAt(0)==a.charAt(1)){return a.charAt(0)+"2";}else{return a;}}
        for(int i=0;i<a.length();i++){
            int c=i+1;
            while(c<a.length()&&a.charAt(c)==a.charAt(i)){
                c++;
            }
            if(c-i!=1){
                a=a.substring(0,i+1)+(c-i)+a.substring(c);i++;
            }

        }
        return a;
    }


// Using StringBuilder
    public static String compress1(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char[] chars = str.toCharArray();
        StringBuilder builder = new StringBuilder();

        int count = 1;

        char prev = chars[0];
        for (int i = 1; i < chars.length; i++) {
            char current = chars[i];
            if (current == prev) {
                count++;
            } else {
                builder = (count > 1) ? builder.append(prev).append(count) : builder.append(prev);
                count = 1;
            }
            prev = current;
        }
        return builder.append(prev).toString();
    }
}
