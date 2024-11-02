import java.util.Scanner;

public class EasyEssay { //allows you to see information about essay copy and pasted

    static void charCount(String msg){
        int count=0;
        for (int i=0; i<msg.length()-1;i++) {
            if (msg.charAt(i) != ' ') count++;
        }

        System.out.println("character count is: "+count);
    }

    static void wordCount(String msg){

        int count = 0;

        for (int i=0; i<msg.length()-1;i++) {
            if (msg.charAt(i) == ' ') count++;
        }
        System.out.println("word count is: "+(count+1));
    }

    static void sentenceCount(String msg){
        int count = 0;

        for (int i=0; i<msg.length()-1;i++) {
            if (msg.charAt(i) == '.' && msg.charAt(i+1) == ' ') count++;
        }
        if (msg.charAt(msg.length() - 1) == '.') count++;
        System.out.println("sentence count is: "+count);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter assignment: ");
        String txt = input.nextLine();

        charCount(txt);
        wordCount(txt);
        sentenceCount(txt);

        }
    }
