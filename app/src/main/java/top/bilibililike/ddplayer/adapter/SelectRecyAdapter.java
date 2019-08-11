package top.bilibililike.ddplayer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.entity.search.SearchBangumiBean;

public class SelectRecyAdapter extends RecyclerView.Adapter {
    private Context mContext;
    private List dataList;
    private onClickListener listener;
    public SelectRecyAdapter(Context context,List dataList){
        this.mContext = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_select_recycler_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (dataList.get(0) instanceof SearchBangumiBean.DataBean.ItemsBean.EpisodesBean){
            SearchBangumiBean.DataBean.ItemsBean.EpisodesBean episodeBean = (SearchBangumiBean.DataBean.ItemsBean.EpisodesBean) dataList.get(position);
            TextView textView = holder.itemView.findViewById(R.id.tv_position);
            textView.setText(episodeBean.getIndex());
            textView.setOnClickListener( v-> listener.onClick(episodeBean.getIndex()+""));
        }else if (dataList.get(0) instanceof SearchBangumiBean.DataBean.ItemsBean.EpisodesNewBean){
            SearchBangumiBean.DataBean.ItemsBean.EpisodesNewBean episodeBean = (SearchBangumiBean.DataBean.ItemsBean.EpisodesNewBean) dataList.get(position);
            TextView textView = holder.itemView.findViewById(R.id.tv_position);
            textView.setText(episodeBean.getTitle());
            textView.setOnClickListener( v-> listener.onClick(episodeBean.getTitle()+""));
        }
    }

    @Override
    public int getItemCount() {
        if (dataList != null){
            return dataList.size();
        }else {
            return 0;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public void notifyDataSetChange(List dataList){
        this.dataList = dataList;
        notifyDataSetChanged();
    }

    public interface onClickListener{
        void onClick(String title);
    }

    public void setOnClickListener(onClickListener listener){
        this.listener = listener;
    }
}
