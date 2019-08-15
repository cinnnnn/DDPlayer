package top.bilibililike.ddplayer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.entity.bigoLive.BigoLiveBean;

public class BigoLiveRecyAdapter extends RecyclerView.Adapter<BigoLiveRecyAdapter.ViewHolder> {

    private Context mContext;
    private List<BigoLiveBean> bigoLiveBeanList;
    private Unbinder unbinder;
    private onClickListener listener;

    public BigoLiveRecyAdapter(Context context, List<BigoLiveBean> liveBeans) {
        this.mContext = context;
        this.bigoLiveBeanList = liveBeans;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_recy_small_cover_v2, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BigoLiveBean liveBean = bigoLiveBeanList.get(position);
        Glide.with(mContext)
                .load(liveBean.getData5())
                .into(holder.coverImg);
        holder.tvTitle.setText("转播Man："+liveBean.getNickName());
        holder.tvUpNickname.setText("bigoID"+liveBean.getBigoID());
        holder.itemView.setOnClickListener( v-> listener.onClick(position));
    }

    @Override
    public int getItemCount() {
        if (bigoLiveBeanList == null){
            return 0;
        }else {
            return bigoLiveBeanList.size();
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.cover_img)
        ImageView coverImg;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_up_nickname)
        TextView tvUpNickname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            unbinder = ButterKnife.bind(this,itemView);
        }
    }


    public void notifyDataSetChange(List<BigoLiveBean> dataList,boolean isFinish) {
        this.bigoLiveBeanList = dataList;
        notifyDataSetChanged();
    }



    public void unBind(){
        unbinder.unbind();
    }

    public void setClickListener(onClickListener listener){
        this.listener = listener;
    }

    public interface onClickListener{
        void onClick(int position);
    }
}
