package statustwitter;

import twitter4j.Paging;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Clase para recobrar los twitts del morrazo
 * @author damian
 */
public class StatusTwitter {

    /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws TwitterException {
        Twitter twitter;
ConfigurationBuilder cb = new ConfigurationBuilder();
cb.setDebugEnabled(true)
.setOAuthConsumerKey("x")
.setOAuthConsumerSecret("x")
.setOAuthAccessToken("x")
.setOAuthAccessTokenSecret("x");
twitter = new TwitterFactory(cb.build()).getInstance();

Paging pagina = new Paging();
     
        Twitter andypsamp = new TwitterFactory().getInstance();
 
        Query query = new Query("#Cangas");
        QueryResult result = andypsamp.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        }
    }
}
