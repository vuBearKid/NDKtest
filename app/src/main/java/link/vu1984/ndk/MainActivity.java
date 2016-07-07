package link.vu1984.ndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("TAG","aaaaa");

        ((Button) findViewById(R.id.butt1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = VUCpp.VUadd(9,10);
                Toast.makeText(MainActivity.this,"9+10="+sum,Toast.LENGTH_SHORT).show();
            }
        });
        ((Button) findViewById(R.id.butt2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                String str = VUCpp.StrFromJni(random.nextInt(100) % 3);
                Toast.makeText(MainActivity.this,"native要说话了："+str,Toast.LENGTH_SHORT).show();
            }
        });
        ((Button) findViewById(R.id.butt3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ((Button) findViewById(R.id.butt4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ((Button) findViewById(R.id.butt5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
