package software.unf.dk.activitiesexercise;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Recipient extends Activity {
    private TextView recipient, subject, message;
    private EditText replyMessage;
    private Button back, reply;
    private ImageView photoIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipient);
        recipient = (TextView) findViewById(R.id.tvRecipient);
        subject = (TextView) findViewById(R.id.tvSubject);
        message = (TextView) findViewById(R.id.tvMessage);
        replyMessage = (EditText) findViewById(R.id.etReply);
        back = (Button) findViewById(R.id.bBack);
        reply = (Button) findViewById(R.id.bReply);
        photoIV = (ImageView) findViewById(R.id.ivPhoto);


        // Modtag intentet fra "MainActivity", og udfyld
        // recipient, subject og message TextViews.



    }

    /**
     * Kaldes når der trykkes på knappen "BACK".
     *
     * Afslut aktiviteten.
     *
     * @param view
     */
    public void back(View view) {

    }

    /**
     * Kaldes når der trykkes på knappen "REPLY".
     *
     * Lav et intent der sender svar teksten tilbage, og afslut aktiviteten.
     *
     * @param view
     */
    public void reply(View view){

    }
}
