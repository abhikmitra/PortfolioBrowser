package android.abhik.portfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class PortfolioActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        final Button btn1 = (Button)findViewById(R.id.button1),
                btn2 = (Button)findViewById(R.id.button2),
                btn3 = (Button)findViewById(R.id.button3),
                btn4 = (Button)findViewById(R.id.button4),
                btn5 = (Button)findViewById(R.id.button5),
                btn6 = (Button)findViewById(R.id.button6);

        View.OnClickListener onClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                CharSequence text = "";
                switch (v.getId()){
                    case R.id.button1:
                        text = "This button will launch SPOTIFY STREAMER APP";
                        break;
                    case R.id.button2:
                        text = "This button will launch SCORES APP";
                        break;
                    case R.id.button3:
                        text = "This button will launch LIBRARY APP";
                        break;
                    case R.id.button4:
                        text = "This button will launch BUILD IT BIGGER APP";
                        break;
                    case R.id.button5:
                        text = "This button will launch XYZ READER APP";
                        break;
                    case R.id.button6:
                        text = "This button will launch BEAUTIFUL APP";
                        break;
                }
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(getApplicationContext(), text, duration);
                toast.show();
            }
        };
        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);
        btn4.setOnClickListener(onClickListener);
        btn5.setOnClickListener(onClickListener);
        btn6.setOnClickListener(onClickListener);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
