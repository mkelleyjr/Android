/* Michael L. Kelley Jr.
 * 02/02/2013
 * Android button creation
 * A button that goes to a specific site when the user clicks on it
 */


package com.example.buttontest;

//Imports needed for button program

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {
	
	Button button; 		//Define the button

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addListenerOnButton();
        
    }

    //Code for the button located on Android layout
    
      public void addListenerOnButton() {
      
    	  button = (Button) findViewById(R.id.button1);
    	  button.setOnClickListener(new OnClickListener() {
    	  
    		  //Listen for 'click' and go to specific url location
    		  
    		  @Override
    		  public void onClick(View arg0){
    			  
    			  Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/mkelleyjr"));
    			  startActivity(browserIntent);
    		  }
    	  });
    	  }
}

      
    

