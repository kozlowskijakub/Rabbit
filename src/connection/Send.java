package connection;

import android.util.Log;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: jakub
 * Date: 10/17/13
 * Time: 2:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Send {

    private static final String QUEUE_NAME = "hello";

    public static void main(String[] argv) {

        try {
            // server connection
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            Connection connection = factory.newConnection();
            Channel channerl = connection.createChannel();

        } catch (IOException e) {
            Log.e("IOException", e.toString());
        }

    }
}
