package com.example.notestar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NotesStarAdapter extends RecyclerView.Adapter<NotesStarAdapter.NotesStarViewHolder> {
          private   ArrayList<NoteStar> notes;

    public NotesStarAdapter(ArrayList<NoteStar> notes) {
        this.notes = notes;
    }

    @NonNull
    @Override
    public NotesStarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_star_item, parent, false);
        return new NotesStarViewHolder(view);    // передали макет
    }

    @Override
    public void onBindViewHolder(@NonNull NotesStarViewHolder holder, int position) {     //здесь происходит связывание данных NoteStar и View элементов макета  note_star_item.xm, находящегося на RecyclerView
            NoteStar note  = notes.get(position);
            holder.textViewPosition.setText(Integer.toString(note.getPosition()));
            holder.imageViewPhoto.setImageResource(note.getImageResourceId());
            holder.textViewName.setText(note.getName());
            holder.textViewDescription.setText(note.getDescription());
    }

    @Override
    public int getItemCount() {
        return notes.size();                //возвращает кол-во записей массива
    }

    public class NotesStarViewHolder extends RecyclerView.ViewHolder {

       private TextView textViewPosition;
       private ImageView imageViewPhoto;
       private TextView textViewName;
       private TextView textViewDescription;

        public NotesStarViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewPosition = itemView.findViewById(R.id.textViewPosition);
            imageViewPhoto = itemView.findViewById(R.id.imageViewPhoto);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewDescription = itemView.findViewById((R.id.textViewDescription));
        }


    }

}
