package com.example.myappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ProblemActivity extends AppCompatActivity {
    TextView cnt;
    ImageView animalImage;
    EditText edit_animal_name;
    Button check_btn;
    int count;
    int pos=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);
        count = 0;
        cnt = findViewById(R.id.cnt);
        animalImage = findViewById(R.id.animalImage);
        edit_animal_name = findViewById(R.id.editText);
        check_btn = findViewById(R.id.btnCheck);

        check_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_input = edit_animal_name.getText().toString();
                String name[] = {"반달가슴곰", "곰", "북극곰", "고양이", "소", "악어", "다람쥐", "강아지", "도마뱀", "두더지", "코끼리", "여우", "개구리", "기린", "고슴도치", "하마", "햄스터", "말", "주머니쥐", "캥거루", "암사자", "숫사자", "땃쥐", "코알라", "돼지", "토끼", "사슴", "양", "뱀", "호랑이", "거북이", "쥐"};
                edit_animal_name.setText("");
                if (name[pos].equals(user_input)) {
                    count++;
                    pos++;
                    cnt.setText(count + "/32");
                    if(count==32){
                        Toast.makeText(ProblemActivity.this, "모든 문제를 다 맞추셨습니다!!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(ProblemActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } else {
                    Toast.makeText(ProblemActivity.this, "땡~!", Toast.LENGTH_SHORT).show();
                }

                switch (pos) {
                    case 0:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.bandalgasmgom));
                        break;
                    case 1:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.bear));
                        break;
                    case 2:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.bukgkgom));
                        break;
                    case 3:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                        break;
                    case 4:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.cow));
                        break;
                    case 5:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.crocodile));
                        break;
                    case 6:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.daramge));
                        break;
                    case 7:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.dog));
                        break;
                    case 8:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.domabam));
                        break;
                    case 9:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.duthege));
                        break;
                    case 10:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.elephant));
                        break;
                    case 11:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.fox));
                        break;
                    case 12:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.frog));
                        break;
                    case 13:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.giraffe));
                        break;
                    case 14:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.gosmdochi));
                        break;
                    case 15:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.hama));
                        break;
                    case 16:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.hamster));
                        break;
                    case 17:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.horse));
                        break;
                    case 18:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.jumunimouse));
                        break;
                    case 19:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.kangol));
                        break;
                    case 20:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.lion_female));
                        break;
                    case 21:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.lion_male));
                        break;
                    case 22:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.mouse));
                        break;
                    case 23:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.noala));
                        break;
                    case 24:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                        break;
                    case 25:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.rabbit));
                        break;
                    case 26:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.sasm));
                        break;
                    case 27:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.sheep));
                        break;
                    case 28:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.snake));
                        break;
                    case 29:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.tiger));
                        break;
                    case 30:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.turtle));
                        break;
                    case 31:
                        animalImage.setImageDrawable(getResources().getDrawable(R.drawable.jumunimouse));
                        break;
                }

            }
        });
    }
}
