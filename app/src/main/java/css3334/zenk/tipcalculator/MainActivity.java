package css3334.zenk.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    //Declare component variables.
    TextView titleTextView;
    TextView billTextView;
    EditText amountEditText;
    TextView partyTextView;
    EditText partyEditText;
    Button calculateButton;
    TextView totalTipTextView;
    TextView tipPersonTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize component variables
        titleTextView = (TextView)findViewById(R.id.tipTextView);
        billTextView = (TextView)findViewById(R.id.billAmountTextView);
        amountEditText = (EditText)findViewById(R.id.billAmountNumberEditText);
        partyTextView = (TextView)findViewById(R.id.numberInPartyTextView);
        partyEditText = (EditText)findViewById(R.id.numberInPartyNumberEditText);
        calculateButton = (Button)findViewById(R.id.calculateButton);
        totalTipTextView = (TextView)findViewById(R.id.totalTipTextView);
        tipPersonTextView = (TextView)findViewById(R.id.tipPerPersonTextView);
    }

    public void calculateClick(View view)
    {
        Double tip;
        Double tipPerPersonAmount;

        tip = Double.parseDouble(amountEditText.getText().toString());
        tip = tip * .10;
        totalTipTextView.setText("Total Tip: " + tip.toString());


        tipPerPersonAmount = tip / Double.parseDouble(partyEditText.getText().toString());
        tipPersonTextView.setText("Tip per Person: " + tipPerPersonAmount.toString());
    }
}
