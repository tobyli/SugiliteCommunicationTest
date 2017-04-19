package edu.cmu.hcii.sugilitecommunicationtest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class CommunicationActivity extends AppCompatActivity {
    Integer messageType;
    String eventBody;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getIntent().getExtras() != null) {
            messageType = getIntent().getIntExtra("messageType", 0);
            eventBody = getIntent().getStringExtra("eventBody");
            AlertDialog dialog = new AlertDialog.Builder(this)
                    .setTitle("New Event " + messageType)
                    .setMessage(eventBody)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                    .create();
            dialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
            dialog.show();
            System.out.println(eventBody);
        }
        finish();
    }
}
