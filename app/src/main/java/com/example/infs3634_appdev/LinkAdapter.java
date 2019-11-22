package com.example.infs3634_appdev;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class LinkAdapter extends  RecyclerView.Adapter<LinkAdapter.LinkViewHolder> {
    private List<Links> linksToAdapt;

    public void setData(List<Links> linksToAdapt) {
        this.linksToAdapt = linksToAdapt;

    }

    @NonNull
    @Override
    public LinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_titles, parent, false);
        LinkViewHolder viewHolder = new LinkViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LinkViewHolder holder, int position) {
        final Links linksAtPosition = linksToAdapt.get(position);

        holder.titleTextView.setText(linksAtPosition.getLinkDesc());
        holder.link1.setText(linksAtPosition.getLink1());
        holder.link2.setText(linksAtPosition.getLink2());
    }



    public static class LinkViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView titleTextView;
        public TextView link1;
        public TextView link2;

        public LinkViewHolder(View v) {
            super(v);
            view = v;
            titleTextView = v.findViewById(R.id.title);
            link1 = v.findViewById(R.id.link1);
            link2 = v.findViewById(R.id.link2);
        }

        public void bind(final Links links) {
            titleTextView.setText(links.getLinkDesc());
            link1.setText(links.getLink1());
            link2.setText(links.getLink2());

        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}