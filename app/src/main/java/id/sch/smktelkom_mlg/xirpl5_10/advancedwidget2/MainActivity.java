package id.sch.smktelkom_mlg.xirpl5_10.advancedwidget2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.editTextNama)
    EditText etNAMA;
    @BindView(R.id.textViewhasil)
    TextView tvhasil;
    @BindColor(R.color.colorAccent)
    int colorAccent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        tvhasil.setTextColor(colorAccent);
    }

    @OnClick(R.id.buttonproses)
    public void doproccess(){
        tvhasil.setText("Nama Anda: "+etNAMA.getText());
    }
}
