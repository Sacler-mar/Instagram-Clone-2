package com.ventures.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rateMe(View view) {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=" + this.getPackageName())));
        } catch (android.content.ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/search?q=jawed+habib+chinchwad&rlz=1C1CHBF_enIN885IN885&oq=jawed+habib+&aqs=chrome.4.69i57j0l7.7980j0j7&sourceid=chrome&ie=UTF-8#lrd=0x3bc2b84b19d9c97f:0x5e41f050f4938f29,3,,,")));
        }
    }
}
