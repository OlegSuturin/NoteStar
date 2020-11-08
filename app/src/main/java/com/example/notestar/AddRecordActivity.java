package com.example.notestar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class AddRecordActivity extends AppCompatActivity {
    private EditText editTextNumberPosition;
    private EditText editTextNameStar;
    private EditText editTextMultiLineDcr;
    private Spinner spinnerNumberImg;
    private Button buttonApply;

    private ArrayList<String> imageId = new ArrayList<>();

    private NotesStarDatabase database;

    private boolean editRecord;
    private NoteStar noteStar;
    private int id;
    private int position;
    private String name;
    private String description;
    private int imageResourceId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) actionBar.hide();

        editTextNumberPosition = findViewById(R.id.editTextNumberPosition);
        editTextNameStar = findViewById(R.id.editTextNameStar);
        editTextMultiLineDcr = findViewById(R.id.editTextMultiLineDcr);
        spinnerNumberImg = findViewById(R.id.spinnerNumberImg);
        buttonApply = findViewById(R.id.buttonApply);

        Intent intent = getIntent();
       // if (intent.hasExtra("editRecord"))

        editRecord = intent.getBooleanExtra("editRecord", false);

       // Toast.makeText(this, ""+ editRecord, Toast.LENGTH_SHORT).show();
        if(editRecord){
            buttonApply.setText(R.string.label_button_edit_record);

            id = intent.getIntExtra("id", -1);
            position = intent.getIntExtra("position", 0);
            name = intent.getStringExtra("name");
            description = intent.getStringExtra("description");
            imageResourceId =  intent.getIntExtra("imageResourceId", R.drawable.brezhneva);

            editTextNumberPosition.setText(Integer.toString(position));
            editTextNameStar.setText(name);
            editTextMultiLineDcr.setText(description);


        } else{
            buttonApply.setText(R.string.label_button_add_record);
        }
  /*      imageId.add(Integer.toString(R.drawable.brezhneva));
        imageId.add(Integer.toString(R.drawable.ivleevanast));
        imageId.add(Integer.toString(R.drawable.dakotarita));
        imageId.add(Integer.toString(R.drawable.shishkovarating));
        imageId.add(Integer.toString(R.drawable.utyasheva));
        imageId.add(Integer.toString(R.drawable.koka));
        imageId.add(Integer.toString(R.drawable.aizadolmatova));
        imageId.add(Integer.toString(R.drawable.bonyarating));
        imageId.add(Integer.toString(R.drawable.branovskaya));
        imageId.add(Integer.toString(R.drawable.lopyreva)); */


    }

    public void onClickAddRecordInDB(View view) {

            position = Integer.parseInt(editTextNumberPosition.getText().toString().trim());
            name = editTextNameStar.getText().toString().trim();
            description = editTextMultiLineDcr.getText().toString().trim();


        if(isField(name, description)) {
            database = NotesStarDatabase.getInstance(this);


            if(editRecord){
                noteStar = new NoteStar(id,position, name, description, imageResourceId);
                database.notesStarDao().updateNoteStar(noteStar);
            } else{
                noteStar = new NoteStar(position, name, description, R.drawable.brezhneva);
                database.notesStarDao().insertNoteStar(noteStar);
            }


            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else
            Toast.makeText(this, "Не заполнены поля!", Toast.LENGTH_SHORT).show();

    }

    private boolean isField(String name, String description) {

        return !name.isEmpty() && !description.isEmpty();
    }


}