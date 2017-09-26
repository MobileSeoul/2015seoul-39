package io.nuri.hangangalza;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;


import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import io.nuri.hangangalza.main.MainActivity;
import io.nuri.hangangalza.utils.ImageUtils;

/**
 * Created by chayongbin on 15. 10. 23..
 */
public class StartActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        int imageFile = R.drawable.splash;
        Glide.with(this).load(imageFile).into(imageView);

        initialize();
    }

    private void initialize()
    {
//        Handler handler = new Handler() {
//            @Override
//            public void handleMessage(Message msg)
//            {
//                finish();    // 액티비티 종료
//            }
//        };
//
//        handler.sendEmptyMessageDelayed(0, 3000);    // ms, 3초후 종료시킴

        Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);

                Intent intent = new Intent(StartActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        handler.sendEmptyMessageDelayed(0, 3000);
    }

}
