package tr.com.turkcellteknoloji.demo.ndk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText edtNumber = (EditText) findViewById(R.id.number);
		final EditText edtPower = (EditText) findViewById(R.id.power);
		final TextView txtResult = (TextView) findViewById(R.id.result);
		Button btnCalculate = (Button) findViewById(R.id.calculate);
		btnCalculate.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				int number = Integer.valueOf(edtNumber.getText().toString());
				int power = Integer.valueOf(edtPower.getText().toString());
				int result = ExponentialWrapper.exponential(number, power);
				txtResult.setText("Sonuç:" + result);
			}
		});
	}

}
