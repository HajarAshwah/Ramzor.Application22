package hajar.ashwah.ramzor.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //Thread : 1
        Thread th=new Thread(){
            //Thread : 2
            @Override
            public void run() {
                // المقطع الذي سيعمل بالتزامن مع مقاطع اخرى
                //Thread : 3
                int ms=3*1000;//milliseconds
                try {
                    sleep(ms);
                    finish();
                    startActivity(new Intent(getApplicationContext(),sign_up.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        // Thread : 4
        th.start();
    }
}