package software.unf.dk.activitiesexercise;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {


    private EditText recipient, subject, message;
    private Button send, addPhoto;
    private TextView reply;
    private ImageView photoIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Super Mail App 9001");

        recipient = (EditText) findViewById(R.id.etRecipient);
        subject = (EditText) findViewById(R.id.etSubject);
        message = (EditText) findViewById(R.id.etMessage);
        send = (Button) findViewById(R.id.bSend);
        addPhoto = (Button) findViewById(R.id.bAddPhoto);
        reply = (TextView) findViewById(R.id.tvReply);
        photoIV = (ImageView) findViewById(R.id.ivPhoto);
    }

    /**
     * Bliver kaldt når der trykkes på knappen "SEND".
     *
     * Lav et intent til at starte Recipient activity'en.
     * Send recipient, subject og message data med dit intent.
     *
     * Hvis du vil have et svar tilbage, så husk at få implementeret "onActivityResult"-metoden.
     *
     * @param view
     */
    public void send(View view) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    /**
     * Bliver kaldt når der trykkes på knappen "TILFØJ BILLEDE".
     *
     * Lav et intent der starter kameraet, så der kan komme et billede tilbage.
     *
     * @param view
     */
    public void addPhoto(View view) {

    }
}
