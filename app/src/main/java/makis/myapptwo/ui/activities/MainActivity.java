package makis.myapptwo.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import makis.myapptwo.R;


public class MainActivity extends AppCompatActivity{

    private Button mButton0;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button mButtonMinus;
    private Button mButtonPlus;
    private Button mButtonDrob;
    private Button mButtonMnoj;
    private Button mButtonPercent;
    private Button mButtonRovno;

    private TextView mTextView;




    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton0 = (Button) findViewById(R.id.num_0);
        mButton1 = (Button) findViewById(R.id.num_1);
        mButton2 = (Button) findViewById(R.id.num_2);
        mButton3 = (Button) findViewById(R.id.num_3);
        mButton4 = (Button) findViewById(R.id.num_4);
        mButton5 = (Button) findViewById(R.id.num_5);
        mButton6 = (Button) findViewById(R.id.num_6);
        mButton7 = (Button) findViewById(R.id.num_7);
        mButton8 = (Button) findViewById(R.id.num_8);
        mButton9 = (Button) findViewById(R.id.num_9);
        mButtonMinus = (Button) findViewById(R.id.button_minus);
        mButtonPlus = (Button) findViewById(R.id.button_plus);
        mButtonDrob = (Button) findViewById(R.id.button_drob);
        mButtonMnoj = (Button) findViewById(R.id.button_mnoj);
        mButtonPercent = (Button) findViewById(R.id.button_percent);
        mButtonRovno = (Button) findViewById(R.id.button_rovno);
        mTextView = (TextView) findViewById(R.id.textViewOut);



        mButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.num_0,
                        Toast.LENGTH_SHORT).show();

            }
        });
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.num_1,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("1");
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.num_2,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("2");

            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.num_3,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("3");
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.num_4,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("4");
            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.num_5,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("5");
            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.num_6,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("6");
            }
        });
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.num_7,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("7");
            }
        });
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.num_8,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("8");
            }
        });
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.num_9,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("9");
            }
        });
        mButtonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.minus,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("-");
            }
        });
        mButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.plus,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("+");
            }
        });
        mButtonMnoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.mnoj,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("*");
            }
        });
        mButtonDrob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.drob,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("/");
            }
        });
        mButtonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.percent,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("%");
            }
        });
        mButtonRovno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Слушает кнопку и отвечает. Ответ надо связать с экраном.
                Toast.makeText(MainActivity.this,
                        R.string.ronvo,
                        Toast.LENGTH_SHORT).show();
                mTextView.setText("=");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
