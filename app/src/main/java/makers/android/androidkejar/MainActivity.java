package makers.android.androidkejar;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    private int jumlah_pesan = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kurang(View view) {
        TextView jumlah =(TextView) findViewById(R.id.quantity_text_view);
        jumlah_pesan = jumlah_pesan - 1;
        jumlah.setText(String.valueOf(jumlah_pesan));
    }

    public void tambah(View view) {
        TextView jumlah = (TextView) findViewById(R.id.quantity_text_view);
        jumlah_pesan = jumlah_pesan + 1;
        jumlah.setText(String.valueOf(jumlah_pesan));
    }

    public void hitung(View view) {
        int bayar = jumlah_pesan * 2;
        TextView bayarTextView = (TextView) findViewById(R.id.price_text_view);
        bayarTextView.setText(String.valueOf(bayar));
    }
}
