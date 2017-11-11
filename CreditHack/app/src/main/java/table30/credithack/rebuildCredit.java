package table30.credithack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rebuildCredit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rebuild_credit);
    }

    public void goToBadScore(View view){
        status.questions="Hey I have just the right tips and tricks for you!\n Here are some tips to improve your credit score.";
                status.answer="Apply for a secured credit card\n" +
                        "Keep track of your credit history from all 3 bureaus \n" +
                        "Apply for a card with very little or no annual fee";
        Intent intent= new Intent(this,respons.class);
        startActivity(intent);
    }

    public void goToGoodScore(View view){
        status.questions="Awesome you are on the right track! Here’s some things you should know!";
                status.answer="Utilize your credit wisely(spend only 10% of your credit limit to avoid risks)\n" +
                        "Make sure to pay full monthly. \n" +
                        "Keep track of your credit history from all 3 bureaus";
        Intent intent= new Intent(this,respons.class);
        startActivity(intent);

    }



}
