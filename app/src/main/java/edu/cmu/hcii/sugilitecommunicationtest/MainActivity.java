package edu.cmu.hcii.sugilitecommunicationtest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context context;
    private final static String CALL_BACK_STRING = "NULL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startRecordingOnClick (View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final EditText editText = new EditText(this);
        builder.setTitle("Set script name")
                .setView(editText)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String scriptName = editText.getText().toString();
                        Toast.makeText(context , "start new recording " + scriptName, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent("edu.cmu.hcii.sugilite.COMMUNICATION");
                        intent.putExtra("messageType", "START_RECORDING");
                        intent.putExtra("arg1", scriptName);
                        intent.putExtra("arg2", CALL_BACK_STRING);
                        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivityForResult(intent, 1);

                    }
                }).show();


    }

    public void endRecordingOnClick (View view){
        Toast.makeText(this, "end recording ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent("edu.cmu.hcii.sugilite.COMMUNICATION");
        intent.putExtra("messageType", "END_RECORDING");
        intent.putExtra("arg1", "NULL");
        intent.putExtra("arg2", CALL_BACK_STRING);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivityForResult(intent, 1);

    }

    public void endTrackingOnClick (View view){
        Toast.makeText(this, "end tracking ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent("edu.cmu.hcii.sugilite.COMMUNICATION");
        intent.putExtra("messageType", "END_TRACKING");
        intent.putExtra("arg1", "NULL");
        intent.putExtra("arg2", CALL_BACK_STRING);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivityForResult(intent, 1);

    }

    public void startTrackingOnClick (View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final EditText editText = new EditText(this);
        builder.setTitle("Set script name")
                .setView(editText)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String scriptName = editText.getText().toString();
                        Toast.makeText(context , "start new tracking " + scriptName, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent("edu.cmu.hcii.sugilite.COMMUNICATION");
                        intent.putExtra("messageType", "START_TRACKING");
                        intent.putExtra("arg1", scriptName);
                        intent.putExtra("arg2", CALL_BACK_STRING);
                        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivityForResult(intent, 1);

                    }
                }).show();


    }

    public void runScriptOnClick (View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final EditText editText = new EditText(this);
        builder.setTitle("Set script name")
                .setView(editText)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String scriptName = editText.getText().toString();
                        Toast.makeText(context, "running the script " + scriptName, Toast.LENGTH_SHORT).show();Intent intent = new Intent("edu.cmu.hcii.sugilite.COMMUNICATION");
                        intent.putExtra("messageType", "RUN_SCRIPT");
                        intent.putExtra("arg1", scriptName);
                        intent.putExtra("arg2", CALL_BACK_STRING);
                        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivityForResult(intent, 1);

                    }
                }).show();
    }

    public void getScriptOnClick (View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final EditText editText = new EditText(this);
        builder.setTitle("Set script name")
                .setView(editText)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String scriptName = editText.getText().toString();
                        Toast.makeText(context, "getting the script " + scriptName, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent("edu.cmu.hcii.sugilite.COMMUNICATION");
                        intent.putExtra("messageType", "GET_SCRIPT");
                        intent.putExtra("arg1", scriptName);
                        intent.putExtra("arg2", "NULL");
                        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivityForResult(intent, 1);
                    }
                }).show();
    }

    public void getTrackingListOnClick (View view){
        Toast.makeText(this, "getting tracking list", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent("edu.cmu.hcii.sugilite.COMMUNICATION");
        intent.putExtra("messageType", "GET_TRACKING_LIST");
        intent.putExtra("arg1", "NULL");
        intent.putExtra("arg2", "NULL");
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivityForResult(intent, 1);

    }

    public void getTrackingOnClick (View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final EditText editText = new EditText(this);
        builder.setTitle("Set tracking name")
                .setView(editText)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String scriptName = editText.getText().toString();
                        Toast.makeText(context, "getting the tracking " + scriptName, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent("edu.cmu.hcii.sugilite.COMMUNICATION");
                        intent.putExtra("messageType", "GET_TRACKING");
                        intent.putExtra("arg1", scriptName);
                        intent.putExtra("arg2", "NULL");
                        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivityForResult(intent, 1);
                    }
                }).show();
    }

    public void getScriptListOnClick (View view){
        Toast.makeText(this, "getting script list", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent("edu.cmu.hcii.sugilite.COMMUNICATION");
        intent.putExtra("messageType", "GET_SCRIPT_LIST");
        intent.putExtra("arg1", "NULL");
        intent.putExtra("arg2", "NULL");
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivityForResult(intent, 1);

    }

    public void clearTrackingListOnClick (View view){
        Toast.makeText(this, "clearing script list", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent("edu.cmu.hcii.sugilite.COMMUNICATION");
        intent.putExtra("messageType", "CLEAR_TRACKING_LIST");
        intent.putExtra("arg1", "NULL");
        intent.putExtra("arg2", "NULL");
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivityForResult(intent, 1);
    }

    public void registerBroadcastingOnClick (View view){
        Toast.makeText(this, "register for broadcasting", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent("edu.cmu.hcii.sugilite.BROADCASTING");
        intent.putExtra("messageType", "REGISTER");
        intent.putExtra("arg1", "edu.cmu.hcii.sugilitecommunicationtest.COMMUNICATION");
        startActivityForResult(intent, 1);
    }

    public void unregisterBroadcastingOnClick (View view){
        Toast.makeText(this, "unregister for broadcasting", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent("edu.cmu.hcii.sugilite.BROADCASTING");
        intent.putExtra("messageType", "UNREGISTER");
        intent.putExtra("arg1", "edu.cmu.hcii.sugilitecommunicationtest.COMMUNICATION");
        startActivityForResult(intent, 1);
        startActivityForResult(intent, 1);
    }

    public void runJsonOnClick (View view){
        Toast.makeText(this, "running json", Toast.LENGTH_SHORT).show();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final EditText editText = new EditText(this);
        builder.setTitle("Enter JSON")
                .setView(editText)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String scriptName = editText.getText().toString();
                        Intent intent = new Intent("edu.cmu.hcii.sugilite.COMMUNICATION");
                        intent.putExtra("messageType", "RUN_JSON");
                        intent.putExtra("arg1", editText.getText().toString());
                        intent.putExtra("arg2", "edu.cmu.hcii.sugilitecommunicationtest.COMMUNICATION");
                        startActivityForResult(intent, 1);
                    }
                }).show();
    }

    public void addJsonScriptOnClick (View view){
        Toast.makeText(this, "saving json", Toast.LENGTH_SHORT).show();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final EditText editText = new EditText(this);
        builder.setTitle("Enter JSON")
                .setView(editText)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String scriptName = editText.getText().toString();
                        Intent intent = new Intent("edu.cmu.hcii.sugilite.COMMUNICATION");
                        intent.putExtra("messageType", "ADD_JSON_AS_SCRIPT");
                        intent.putExtra("arg1", editText.getText().toString());
                        intent.putExtra("arg2", "edu.cmu.hcii.sugilitecommunicationtest.COMMUNICATION");
                        startActivityForResult(intent, 1);
                    }
                }).show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                String result = data.getStringExtra("result");
                if(result != null){
                    TextView resultView = (TextView)findViewById(R.id.communication_result);
                    resultView.setText(result);
                }

            }
            if (resultCode == Activity.RESULT_CANCELED) {
            }
        }
    }

}
