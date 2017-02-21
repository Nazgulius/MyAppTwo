package makis.myapptwo.ui.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import makis.myapptwo.R;


public class MainActivity extends Activity implements OnClickListener {

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
    private Button mBtClear;
    private Button mBtPoint;

    private Boolean add_button;
    private String style_calc;
    private LinearLayout llExtra;
    SharedPreferences sp;

    // делаем переменные кнопок
    private int [] buttonIds;
    private Button [] arraysBt;

    // делаем переменные окон
    private TextView mTextView;

    // делаем переменные операторов арифметических действий
    private int operand1, operand2, flagAction, len;
    private double result;


    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка кнопок и  делаем слушателей
        buttonIds = new int[]{R.id.num_0, R.id.num_1, R.id.num_2, R.id.num_3, R.id.num_4, R.id.num_5,
                R.id.num_6, R.id.num_7, R.id.num_8, R.id.num_9, R.id.button_minus, R.id.button_plus,
                R.id.button_drob, R.id.button_mnoj,R.id.button_percent, R.id.button_rovno, R.id.clear,
                R.id.point};

        arraysBt = new Button[]{mButton0, mButton1, mButton2, mButton3, mButton4, mButton5, mButton6,
                mButton7, mButton8, mButton9, mButtonMinus, mButtonPlus, mButtonDrob, mButtonMnoj,
                mButtonPercent, mButtonRovno, mBtClear, mBtPoint};

        sp = PreferenceManager.getDefaultSharedPreferences(this);
        llExtra = (LinearLayout)findViewById(R.id.llExtra);

        len = arraysBt.length;
        for (int i = 0; i < len; i++){
            arraysBt[i] = (Button) findViewById(buttonIds[i]);
            arraysBt[i].setOnClickListener(this);
        }

        // привязка окна текста
        mTextView = (TextView) findViewById(R.id.textViewOut);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.num_1:
                ClickNumber(1);
                break;

            case R.id.num_2:
                ClickNumber(2);
                break;

            case R.id.num_3:
                ClickNumber(3);
                break;

            case R.id.num_4:
                ClickNumber(4);
                break;

            case R.id.num_5:
                ClickNumber(5);
                break;

            case R.id.num_6:
                ClickNumber(6);
                break;

            case R.id.num_7:
                ClickNumber(7);
                break;

            case R.id.num_8:
                ClickNumber(8);
                break;

            case R.id.num_9:
                ClickNumber(9);
                break;

            case R.id.num_0:
                ClickNumber(0);
                break;

            case R.id.button_plus:
                if(flagAction == 0)flagAction = 1;
                break;

            case R.id.button_minus:
                if(flagAction == 0)flagAction = 2;
                break;

            case R.id.button_mnoj:
                if(flagAction == 0)flagAction = 3;
                break;

            case R.id.button_drob:
                if(flagAction == 0)flagAction = 4;
                break;

            case R.id.button_rovno:
                switch(flagAction){
                    case 1:
                        result = operand1 + operand2;
                        break;

                    case 2:
                        result = operand1 - operand2;
                        break;

                    case 3:
                        result = operand1 * operand2;
                        break;

                    case 4:
                        result =(double) operand1 / (double) operand2;
                        break;

                    default:
                        Toast.makeText(this, "Операция не задана", Toast.LENGTH_LONG);
                }

                if(flagAction != 0){
                    mTextView.setText(Double.toString(result));
                    clearVariables();
                }
                break;

            case R.id.clear:
                clearVariables();
                mTextView.setText(Integer.toString(operand1));
                break;
        }
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
        add_button = sp.getBoolean("add_button", false);

        style_calc = sp.getString("style_calc", "1");

        int flag_visiblity = View.INVISIBLE;

        if(add_button)flag_visiblity = View.VISIBLE;

        llExtra.setVisibility(flag_visiblity);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){

            case R.id.options_menu:
                startActivity(new Intent(this, PrefActivity.class));
                break;

            case R.id.about_menu:
                startActivity(new Intent(this, AboutActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);

    }

    private void ClickNumber(int num){

        if(flagAction == 0){
            operand1 = operand1*10 + num;
            mTextView.setText(Integer.toString(operand1));

        }else{
            operand2 = operand2*10 + num;
            mTextView.setText(Integer.toString(operand2));
        }
    }

    private void clearVariables(){
        operand1 = 0;
        operand2 = 0;
        result = 0;
        flagAction = 0;
    }
}
