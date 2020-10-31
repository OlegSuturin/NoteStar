package com.example.notestar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewStar;
    private RecyclerView recyclerViewNomination;

    private TextView textViewPosition;
    private ImageView imageViewPhoto;
    private TextView textViewName;
    private TextView textViewDescription;

    private ArrayList<NoteStar> arrayNotesStar;
    private ArrayList<StarNomination> arrayStarNominations;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewStar = findViewById(R.id.recyclerViewStar);
        recyclerViewNomination = findViewById(R.id.recyclerViewNomination);


        textViewPosition = findViewById(R.id.textViewDescription);
        imageViewPhoto = findViewById(R.id.imageViewPhoto);
        textViewName = findViewById(R.id.textViewName);
        textViewDescription = findViewById(R.id.textViewDescription);

        arrayNotesStar = new ArrayList<>();

        arrayNotesStar.add(new NoteStar(1, "Вера Брежнева", "Певица, телеведущая, актриса, экс-участница группы «ВИА Гра», посол доброй воли программы ЮНЭЙДС от ООН, основательница бьюти-марки", R.drawable.brezhneva));
        arrayNotesStar.add(new NoteStar(2, "Настя Ивлеева", "Телеведущая, актриса, youtube-блогер", R.drawable.ivleevanast));
        arrayNotesStar.add(new NoteStar(3, "Рита Дакота", "Певица, автор песен, финалистка \"Фабрики звезд\"", R.drawable.dakotarita));
        arrayNotesStar.add(new NoteStar(4, "Алена Шишкова", "Модель и лицо модных марок. Заняла третье место в конкурсе красоты \"Мисс России-2012\"", R.drawable.shishkovarating));
        arrayNotesStar.add(new NoteStar(5, "Ляйсан Утяшева", "Мастер спорта по художественной гимнастике, призер соревнований, теле- и радиоведущая, актриса, ведет свой канал о похудении", R.drawable.utyasheva));
        arrayNotesStar.add(new NoteStar(6, "Виктория Лопырева", "Телеведущая, модель, посол чемпионата мира по футболу-2018, обладательница титула \"Мисс России-2003\"", R.drawable.lopyreva));
        arrayNotesStar.add(new NoteStar(7, "Клава Кока", "Певица и популярный youtube-блогер. Настоящее имя - Клавдия Высокова", R.drawable.koka));
        arrayNotesStar.add(new NoteStar(8, "Айза Долматова", "Бьюти-блогер, дизайнер украшений, владелица сети бутиков, а также телеведущая, актриса и рэп-исполнительница под именем A(Z)IZA. Бывшая жена рэпера Гуфа", R.drawable.aizadolmatova));
        arrayNotesStar.add(new NoteStar(9, "Виктория Боня", "Теле- и радиоведущая, модель, бьюти-блогер", R.drawable.bonyarating));
        arrayNotesStar.add(new NoteStar(10, "Юлия Барановская", "Теле- и радиоведущая и писательница, бывшая гражданская жена футболиста Андрея Аршавина и мать его троих детей", R.drawable.branovskaya));

        arrayStarNominations = new ArrayList<>();

        arrayStarNominations.add(new StarNomination("Вера Брежнева", "авто", 3));
        arrayStarNominations.add(new StarNomination("Вера Брежнева", "бьюти", 1));
        arrayStarNominations.add(new StarNomination("Вера Брежнева", "кино", 2));
        arrayStarNominations.add(new StarNomination("Вера Брежнева", "мода", 3));
        arrayStarNominations.add(new StarNomination("Вера Брежнева", "музыка", 8));



        NotesStarAdapter adapterNotes = new NotesStarAdapter(arrayNotesStar);
        recyclerViewStar.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewStar.setAdapter(adapterNotes);

        StarNominationAdapter adapterNominations = new StarNominationAdapter(arrayStarNominations);
        recyclerViewNomination.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerViewNomination.setAdapter(adapterNominations);

    }
}