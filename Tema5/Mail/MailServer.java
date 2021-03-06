package Tema5.Mail;


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class MailServer {
    // Storage for the arbitrary number of mail items to be stored
    // on the server.
    private List<MailItem> items;

    /**
     * Construct a mail server.
     */
    public MailServer()
    {
        items = new ArrayList<>();
    }

    /**
     * Return how many mail items are waiting for a user.
     *  The user to check for.
     *  How many items are waiting.
     */
    public int howManyMailItems(String who)
    {
        int count = 0;
        for(MailItem item : items) {
            if(item.getTo().equals(who)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Return the next mail item for a user or null if there
     * are none.
     * The user requesting their next item.
     * The user's next item.
     */
    public MailItem getNextMailItem(String who)
    {
        Iterator<MailItem> it = items.iterator();
        while(it.hasNext()) {
            MailItem item = it.next();
            if(item.getTo().equals(who)) {
                it.remove();
                return item;
            }
        }
        return null;
    }

    /**
     * Add the given mail item to the message list.
     * The mail item to be stored on the server.
     */
    public void post(MailItem item)
    {
        items.add(item);
    }
}
