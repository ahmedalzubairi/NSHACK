package table30.credithack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void goToLessInterest(View view){
status.questions="Are you a person who has irregular income or you carry an amount money from time to time ?\n" +
        "If so then, you are in the right place! :D\n" +
        "\n" +
        "Here’s some ways you can get yourself to pay less interest rate through credit card\n";
        status.answer="1. Spend your credit amount wisely (maximum of 10% of your credit)\n" +
                "2. Always plan, save money and pay your balance in full every month before the end of grace period.\n" +
                "3. Be aware of promotions like  \"interest-free\" \"same as cash\" and \"no interest if paid in full\". Only accept this kind of offers if you know that you can actually pay within a specific time period.";
        Intent intent= new Intent(this,respons.class);
        startActivity(intent);
    }



    public void goToRebuildCredit(View view){

        Intent intent= new Intent(this,rebuildCredit.class);
        startActivity(intent);
    }
    public void goToRewards(View view){
        status.questions="Do you like bonuses? Do you like travel a lot? Do you want some of the money back from what you are spending?\n" +
                "\n" +
                "Well you came to the right place!\n";
        status.answer="Here is some conditions that helps you become eligible for a credit card that allows you to enjoy these benefits.\n                                                ----------\n\n\n-->You must keep your credit score in a good range by being more literate and responsible with your credit history\n                                                 ----------\n\n\n" +
                "   -->Make sure to pay off your balance in full every month, this will keep you away from dealing with negative interest. \n                                                   ----------\n\n\n" +
                "   -->Expect high APR and be financially literate so you will be able to manage your spendings.";
        Intent intent= new Intent(this,respons.class);
        startActivity(intent);
    }

}
