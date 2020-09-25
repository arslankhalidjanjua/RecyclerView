package com.example.drawyerlayout123;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.Item> {
    Context context;
    ArrayList<DAshboardModel> models = new ArrayList<>();
    public DashboardAdapter(Context context){
        this.context = context;
        this.models = models;
        setData();

    }
    private void setData(){
        DAshboardModel d1 = new DAshboardModel(String.valueOf(R.drawable.ic_item_a), "item 1",String.valueOf(R.color.c_a));
        DAshboardModel d2 = new DAshboardModel(String.valueOf(R.drawable.ic_item_b), "item 2",String.valueOf(R.color.c_b));
        DAshboardModel d3 = new DAshboardModel(String.valueOf(R.drawable.ic_item_c), "item 3",String.valueOf(R.color.c_c));
        DAshboardModel d4 = new DAshboardModel(String.valueOf(R.drawable.ic_item_d), "item 4",String.valueOf(R.color.c_d));

        models.add(d1);
        models.add(d2);
        models.add(d3);
        models.add(d4);
        models.add(d1);
        models.add(d2);
        models.add(d3);
        models.add(d4);
        models.add(d1);
        models.add(d2);
        models.add(d3);
        models.add(d4);
        //call me
        // i am closing. i have some friend outside
       // sir kab smjha deingy and drawarer layout kesy dalna isme

                // yar apko day time bola taa abi mujy ussky sath jana he is waiting



    }
    @Override
    public DashboardAdapter.Item onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.model_item, parent, false);;
        return new DashboardAdapter.Item(contactView);
    }

    @Override
    public void onBindViewHolder(DashboardAdapter.Item holder, int position) {
       holder.setDataItem(models.get(position));
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class Item extends RecyclerView.ViewHolder {
        TextView textTv;
        ImageView iconIv;
        CardView itemCv;

        public Item(@NonNull View itemView) {
            super(itemView);
            textTv = itemView.findViewById(R.id.itemTv);
            iconIv = itemView.findViewById(R.id.itemIv);
            itemCv = itemView.findViewById(R.id.itemCv);

        }

        public void setDataItem(DAshboardModel model){
            textTv.setText(model.getText());
            iconIv.setImageDrawable(context.getResources().getDrawable(Integer.parseInt(model.getIcon())));
            itemCv.setCardBackgroundColor(ContextCompat.getColor(context, Integer.parseInt(model.getColor())));
        }
    }
}
