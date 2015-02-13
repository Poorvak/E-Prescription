package com.example.inpl_serne.e_prescription;

import android.content.DialogInterface;
import android.content.Context;
import android.app.AlertDialog;
/**
 * Created by INPL-SERNE on 2/11/2015.
 */
//the name of the class makes it clear that SessionAlert makes an alert for re-login or already login
public class SessionAlert {
    //user defined method showAlertDialog to show the dialog box
    //Context is a class with parameter as context, title is used for box title, message is used for the message to be displayed
    //
    public void showAlertDialog(Context context, String title, String message, Boolean status) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        if ( status != null ) {
            alertDialog.setIcon((status) ? R.drawable.thumbs_up : R.drawable.failure );
        }
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which ) {

            }
        });
        alertDialog.show();
    }
}
