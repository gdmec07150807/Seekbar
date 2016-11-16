package cn.edu.gdmec.c07150807.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private SeekBar seekbar;
    private TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekbar= (SeekBar) findViewById(R.id.seekbars);
        tv1= (TextView) findViewById(R.id.current);
        tv2= (TextView) findViewById(R.id.status);
        seekbar.setProgress(30);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv1.setText("当前进度："+progress+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                tv1.setText("正在拖动进度条");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                tv1.setText("停止拖动进度条");
            }
        });
    }
}
