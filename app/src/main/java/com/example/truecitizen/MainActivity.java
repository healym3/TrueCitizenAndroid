package com.example.truecitizen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.truecitizen.databinding.ActivityMainBinding;
import com.example.truecitizen.model.Question;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Question[] questionBank = new Question[]{
            new Question(R.string.question_amendments, false), //correct: 27
            new Question(R.string.question_constitution, true),
            new Question(R.string.question_declaration, true),
            new Question(R.string.question_independence_rights, true),
            new Question(R.string.question_religion, true),
            new Question(R.string.question_government, false),
            new Question(R.string.question_government_feds, false),
            new Question(R.string.question_government_senators, true),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.questionText.setText(questionBank[0].getAnswerResId());
    }
}