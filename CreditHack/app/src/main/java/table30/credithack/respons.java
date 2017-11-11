package table30.credithack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class respons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respons);
        TextView question = (TextView) findViewById(R.id.question);
        question.setText(status.questions);
        TextView answer = (TextView) findViewById(R.id.answer);
        answer.setText(status.answer);

    }

    public void goToMenu(View view){
        status.questions="";
        status.answer="";
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }


}
