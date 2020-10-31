package com.example.notestar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StarNominationAdapter extends RecyclerView.Adapter<StarNominationAdapter.StarNominationsHolder> {
    private ArrayList<StarNomination> nominations;

    public StarNominationAdapter(ArrayList<StarNomination> nominations) {
        this.nominations = nominations;
    }

    @NonNull
    @Override
    public StarNominationsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.star_nomination_item, parent, false);
        return new StarNominationsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StarNominationsHolder holder, int position) {
        StarNomination nomination = nominations.get(position);
        holder.textViewNomination.setText(nomination.getNomination());
        holder.textViewPlace.setText(Integer.toString(nomination.getPlace()));
    }

    @Override
    public int getItemCount() {
        return nominations.size();
    }

    public class StarNominationsHolder extends RecyclerView.ViewHolder {
        private TextView textViewNomination;
        private TextView textViewPlace;

        public StarNominationsHolder(@NonNull View itemView) {
            super(itemView);
            textViewNomination = itemView.findViewById(R.id.textViewNomination);
            textViewPlace = itemView.findViewById(R.id.textViewPlace);
        }
    }


}
