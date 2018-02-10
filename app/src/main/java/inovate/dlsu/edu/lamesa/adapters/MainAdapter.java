package inovate.dlsu.edu.lamesa.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import inovate.dlsu.edu.lamesa.R;
import inovate.dlsu.edu.lamesa.listeners.IClickListener;

/**
 * Created by Mavic Reccion on 2/10/2018.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private static final String CLASS_NAME = "MainAdapter";

    private LayoutInflater inflater;

    private IClickListener clickListener;
    private String[] titles;

    public MainAdapter(String[] titles, Context context) {
        this.titles = titles;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = this.inflater.inflate(R.layout.list_item_home, parent, false);
        return new MainViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        holder.title.setText(titles[position]);
    }

    @Override
    public int getItemCount() {
        return this.titles.length;
    }

    public void setClickListener(final IClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void setItems(String[] titles) {
        this.titles = titles;
    }


    class MainViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView title;
        private View container;

        MainViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            container = view;
        }

        @Override
        public void onClick(View view) {
            if(view.getId() == container.getId()) {
                Log.e(CLASS_NAME, "clicked item");
                clickListener.onClick(container, getAdapterPosition());
            }
        }
    }
}
