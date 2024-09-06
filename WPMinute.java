import java.util.*;
import java.util.Random;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
class WPMinute
{
    static void main() throws InterruptedException
    {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Hi, there! Lets see your typing speed...");
        TimeUnit.SECONDS.sleep(2);

        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        String[] words = 
            {"the","of","and","a","to","in","is","you","that","it","he","was","for",
                "on","are","as","with","his","they","I","at","be","this","have",
                "from","or","one","had","by","word","but","not","what","all","were",
                "we","when","your","can","said","there","use","an","each","which",
                "she","do","how","their","if","will","up","other","about","out",
                "many","then","them","these","so","some","her","would","make","like",
                "him","into","time","has","look","two","more","write","go","see",
                "number","no","way","could","people","my","than","first","water",
                "been","call","who","oil","its","now","find","long","down","day",
                "did","get","come","made","may","part"};

        Scanner scan = new Scanner(System.in);

        String genWord[] = new String[10];
        Random rand = new Random();
        for(int i=0;i<10;i++)
        {
            genWord[i] = words[rand.nextInt(99)];
            System.out.print(genWord[i] + " ");
        }
        System.out.println();

        double start = LocalTime.now().toNanoOfDay();

        String typedWords = scan.nextLine();
        String[] ArrtypedWords = typedWords.split(" ");

        double end = LocalTime.now().toNanoOfDay();
        int wpm = (int) ((((double) (typedWords.length()) / 5) / ((end - start)/1000000000.0)) * 60);

        System.out.println("WPM : " + wpm);

        int count = 0;
        for (int i = 0; i < ArrtypedWords.length; i++) {
            if (genWord[i].equals(ArrtypedWords[i]))
                count++;
        }

        System.out.println("Accuracy : " + ((((double)count)/ArrtypedWords.length)*100) + "%");
    }
}