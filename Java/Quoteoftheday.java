import java.util.Random;
public class Quoteoftheday {
    private static final String[] quotes = {
        "The only way to do great work is to love what you do. - Steve Jobs",
        "Innovation distinguishes between a leader and a follower. - Steve Jobs",
        "Your time is limited, so don't waste it living someone else's life. - Steve Jobs",
        "Stay hungry, stay foolish. - Steve Jobs",
        "Be yourself; everyone else is already taken. - Oscar Wilde",
        "In three words I can sum up everything I've learned about life: it goes on. - Robert Frost",
        "The only thing necessary for the triumph of evil is for good men to do nothing. - Edmund Burke"
    };

    public static String getQuote() {
        Random random = new Random();
        int index = random.nextInt(quotes.length);
        return quotes[index];
    }
    public static void main(String[] args) {
        String quote = getQuote();
        System.out.println("Quote of the Day:");
        System.out.println(quote);
    }
}
