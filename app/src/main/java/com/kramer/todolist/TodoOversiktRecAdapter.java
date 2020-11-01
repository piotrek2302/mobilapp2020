package com.kramer.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TodoOversiktRecAdapter extends RecyclerView.Adapter<TodoOversiktRecAdapter.TodoViewHolder> {

    private List<Liste> mToDo;
    private Context context;

    public TodoOversiktRecAdapter(Context context)
    {
        this.context = context;
    }

    class TodoViewHolder extends RecyclerView.ViewHolder{

        TextView txvTittel;
        TextView txvInnhold;
        TextView txvDatoLaget;
        TextView txvDatoEndret;

        public TodoViewHolder(View itemView){
            super(itemView);
            txvTittel = itemView.findViewById(R.id.radTittel);
            txvInnhold = itemView.findViewById(R.id.radInnhold);
            txvDatoLaget = itemView.findViewById(R.id.radDatoLaget);
            txvDatoEndret = itemView.findViewById(R.id.radDatoEndret);
        }

    }


    @Override
    public TodoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View row_view = inflater.inflate(R.layout.liste_rec_view, parent, false);
        TodoViewHolder myviewholder = new TodoViewHolder(row_view);
        return myviewholder;
    }

    @Override
    public void onBindViewHolder(TodoViewHolder holder, int position) {
        Liste currentListe = mToDo.get(position);
        holder.txvTittel.setText(currentListe.getTittel());
        holder.txvDatoLaget.setText(currentListe.getdato_laget().toString());
        holder.txvDatoEndret.setText(currentListe.getdato_endret().toString());
    }

    @Override
    public int getItemCount() {
        if (mToDo == null)
        return 0;
        else return mToDo.size();
    }


    public void setData (List<Liste> toDoListe)
    {
        mToDo = toDoListe;
        notifyDataSetChanged();
    }

    public List<Liste> getData(){
        return mToDo;
    }



}
