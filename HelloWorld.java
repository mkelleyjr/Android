/* Michael L. Kelley Jr. 
 * 02/02/2013
 * HelloWorld.java Android Activity File
 * A simple way to display text on an Android Device
 * This file would be the activity file located under the source directory
 */

package com.example.helloworld;

//Imports needed

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;
import android.view.Menu;

public class HelloWorld extends Activity {

	//Setting up the activity
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        
        //Display the text
        
        TextView text = new TextView(this);
        text.setText("Hello from Michael's Android!"); //What do you want message to say?
        setContentView(text);
    }
    
}
