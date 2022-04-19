package kr.hs.emirim.yejin.mirim_project_0414_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    CheckBox checkStart;
    ImageView imgv;
    LinearLayout LinearSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearSub = findViewById(R.id.Linear_sub);
        rg = findViewById(R.id.rg);
        checkStart = findViewById(R.id.check_start);
        imgv = findViewById(R.id.imgv);
        Button btnDone = findViewById(R.id.btn_done);
        checkStart.setOnCheckedChangeListener(checkListener);

    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (rg.getCheckedRadioButtonId()) {
                case R.id.rb_dog:
                    imgv.setImageResource(R.drawable.dog);
                    break;
                case R.id.rb_cat:
                    imgv.setImageResource(R.drawable.cat);
                    break;
                case R.id.rb_rabbit:
                    imgv.setImageResource(R.drawable.rabbit);
                    break;
            }
        }
    };


    CompoundButton.OnCheckedChangeListener checkListener = new CompoundButton.OnCheckedChangeListener(){
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
            if(isChecked){
                LinearSub.setVisibility(View.VISIBLE);
            }
            else{
                LinearSub.setVisibility(View.INVISIBLE);
            }
        }
    };
}