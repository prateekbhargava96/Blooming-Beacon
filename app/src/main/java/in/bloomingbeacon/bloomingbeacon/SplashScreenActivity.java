package in.bloomingbeacon.bloomingbeacon;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Making the activity fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        imageView = (ImageView) findViewById(R.id.app_logo);
        constraintLayout = (ConstraintLayout) findViewById(R.id.constraint_splash);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha_splash);
        animation.reset();
        constraintLayout.clearAnimation();
        constraintLayout.startAnimation(animation);

        animation = AnimationUtils.loadAnimation(this, R.anim.translate_splash);
        animation.reset();
        imageView.clearAnimation();
        imageView.startAnimation(animation);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        }, 3500);
    }
}