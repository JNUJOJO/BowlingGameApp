package cn.edu.jnu.x2020100091;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button caculate;
    EditText input_score;
    TextView out_score;
    BowlingGame game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caculate=this.findViewById(R.id.button);
        input_score=this.findViewById(R.id.editTextTextPersonName);
        out_score=this.findViewById(R.id.textView);
        game=new BowlingGame();



        caculate.setOnClickListener(v -> {
            String input_score_string = input_score.getText().toString();
            String []scoreSplide=input_score_string.split("[,，]");
            for (String s : scoreSplide) {
                game.roll(Integer.parseInt(s));
            }
            for(int i=0;i<21-scoreSplide.length;i++)
            {
                game.roll(0);
            }
            out_score.setText("the score is : "+ game.score());
        });

    }
}