package com.example.domekwgorach;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private TextView likes;
    private Button like;
    private Button save;
    private Button delete;
    private int likesi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        like = findViewById(R.id.like);
        save = findViewById(R.id.save);
        delete = findViewById(R.id.delete);
        likes = findViewById(R.id.likes);
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liked();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleted();
            }
        });
    }
    void liked() {
        likesi++;
        likes.setText(likesi + " polubień.");
    }
    void deleted() {
        if (likesi != 0) {
            likesi--;
            likes.setText(likesi + " polubień.");
        }
    }
}
