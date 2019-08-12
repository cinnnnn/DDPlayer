package top.bilibililike.ddplayer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Observable;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.entity.search.SearchBangumiBean;
import top.bilibililike.ddplayer.entity.search.SearchBean;
import top.bilibililike.ddplayer.entity.search.SearchLiveBean;

public class SearchRecyAdapter extends RecyclerView.Adapter<SearchRecyAdapter.ViewHolder> {


    private List dataList;
    private Context mContext;
    public Unbinder unbinder;
    String type = "normal";

    private OnItemClickedListener listener;


    public SearchRecyAdapter(Context context, List dataList,String type) {
        this.dataList = dataList;
        this.mContext = context;
        this.type = type;
    }

    public void setClickListener(OnItemClickedListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        if (type.equals("normal")) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_bangumi_list, parent, false);
        } else if (type.equals("bangumi")) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_search_bangumi, parent, false);
        }

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (type.equals("normal")) {
            holder.itemLiner.setOnClickListener(itemLiner -> listener.onClick(dataList.get(position), type));
            SearchBean.DataBean.ItemBean itemBean = (SearchBean.DataBean.ItemBean) dataList.get(position);
            Glide.with(mContext)
                    .load(itemBean.getCover())
                    .into(holder.imvCover);
            holder.tvComments.setText(itemBean.getDanmaku() + "");
            holder.tvPlays.setText(itemBean.getPlay() + "");
            holder.tvTitle.setText(itemBean.getTitle());
        } else if (type.equals("bangumi")) {
            SearchBangumiBean.DataBean.ItemsBean itemsBean = (SearchBangumiBean.DataBean.ItemsBean) dataList.get(position);
            List<SearchBangumiBean.DataBean.ItemsBean.EpisodesBean> episodeList = itemsBean.getEpisodes();
            Glide.with(mContext)
                    .load(itemsBean.getCover())
                    .into(holder.imvCover);
            holder.tvTitle.setText(itemsBean.getTitle());
            int time = itemsBean.getPtime();
            String result1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time * 1000));
            holder.tvDetail.setText(result1.substring(0, 4) + " | " + itemsBean.getBadge() + " | " + itemsBean.getArea());
            holder.txTag.setText(itemsBean.getStyle());
            holder.txvScore.setText(itemsBean.getRating() + "");
            holder.txvPeople.setText(itemsBean.getVote()+"人");
            if (episodeList != null){
                if (episodeList.size()>6){
                    holder.txvCid1.setText(itemsBean.getEpisodes().get(0).getIndex());
                    holder.txvCid2.setText(itemsBean.getEpisodes().get(1).getIndex());
                    holder.txvCid3.setText("...");
                    holder.txvCid4.setText(episodeList.get(episodeList.size()-3).getIndex()+"");
                    holder.txvCid5.setText(episodeList.get(episodeList.size()-2).getIndex()+"");
                    holder.txvCid6.setText(episodeList.get(episodeList.size()-1).getIndex()+"");

                }
                if (episodeList.size() == 1){
                    holder.txvCid1.setText(itemsBean.getEpisodes().get(0).getIndex());
                    holder.txvCid2.setVisibility(View.INVISIBLE);
                    holder.txvCid3.setVisibility(View.INVISIBLE);
                    holder.txvCid4.setVisibility(View.INVISIBLE);
                    holder.txvCid5.setVisibility(View.INVISIBLE);
                    holder.txvCid6.setVisibility(View.INVISIBLE);
                }else if (episodeList.size() == 2){
                    holder.txvCid1.setText(itemsBean.getEpisodes().get(0).getIndex());
                    holder.txvCid2.setText(itemsBean.getEpisodes().get(1).getIndex());
                    holder.txvCid3.setVisibility(View.INVISIBLE);
                    holder.txvCid4.setVisibility(View.INVISIBLE);
                    holder.txvCid5.setVisibility(View.INVISIBLE);
                    holder.txvCid6.setVisibility(View.INVISIBLE);
                }else if (episodeList.size() == 3){
                    holder.txvCid1.setText(itemsBean.getEpisodes().get(0).getIndex());
                    holder.txvCid2.setText(itemsBean.getEpisodes().get(1).getIndex());
                    holder.txvCid3.setText(itemsBean.getEpisodes().get(2).getIndex());
                    holder.txvCid4.setVisibility(View.INVISIBLE);
                    holder.txvCid5.setVisibility(View.INVISIBLE);
                    holder.txvCid6.setVisibility(View.INVISIBLE);
                }else if (episodeList.size() == 4){
                    holder.txvCid1.setText(itemsBean.getEpisodes().get(0).getIndex());
                    holder.txvCid2.setText(itemsBean.getEpisodes().get(1).getIndex());
                    holder.txvCid3.setText(itemsBean.getEpisodes().get(2).getIndex());
                    holder.txvCid4.setText(itemsBean.getEpisodes().get(3).getIndex());
                    holder.txvCid5.setVisibility(View.INVISIBLE);
                    holder.txvCid6.setVisibility(View.INVISIBLE);
                }else if (episodeList.size() == 5){
                    holder.txvCid1.setText(itemsBean.getEpisodes().get(0).getIndex());
                    holder.txvCid2.setText(itemsBean.getEpisodes().get(1).getIndex());
                    holder.txvCid3.setText(itemsBean.getEpisodes().get(2).getIndex());
                    holder.txvCid4.setText(itemsBean.getEpisodes().get(3).getIndex());
                    holder.txvCid5.setText(itemsBean.getEpisodes().get(4).getIndex());
                    holder.txvCid6.setVisibility(View.INVISIBLE);
                }else if (episodeList.size() == 6){
                    holder.txvCid1.setText(itemsBean.getEpisodes().get(0).getIndex());
                    holder.txvCid2.setText(itemsBean.getEpisodes().get(1).getIndex());
                    holder.txvCid3.setText(itemsBean.getEpisodes().get(2).getIndex());
                    holder.txvCid4.setText(itemsBean.getEpisodes().get(3).getIndex());
                    holder.txvCid5.setText(itemsBean.getEpisodes().get(4).getIndex());
                    holder.txvCid6.setText(itemsBean.getEpisodes().get(5).getIndex());;
                }
            }


            holder.txvCid1.setOnClickListener(txvCid1 -> listener.onClick(holder.txvCid1,dataList.get(position),"bangumi"));
            holder.txvCid2.setOnClickListener(txvCid2 -> listener.onClick(holder.txvCid2,dataList.get(position),"bangumi"));
            holder.txvCid3.setOnClickListener(txvCid3 -> listener.onClick(holder.txvCid3,dataList.get(position),"bangumi"));
            holder.txvCid4.setOnClickListener(txvCid4 -> listener.onClick(holder.txvCid4,dataList.get(position),"bangumi"));
            holder.txvCid5.setOnClickListener(txvCid5 -> listener.onClick(holder.txvCid5,dataList.get(position),"bangumi"));
            holder.txvCid6.setOnClickListener(txvCid6 -> listener.onClick(holder.txvCid6,dataList.get(position),"bangumi"));

        } else if (type.equals("live")) {
            SearchLiveBean.DataBean.LiveRoomBean.ItemsBean itemsBean = (SearchLiveBean.DataBean.LiveRoomBean.ItemsBean) dataList.get(position);
            Glide.with(mContext)
                    .load(itemsBean.getCover())
                    .into(holder.imvCover);
            holder.tvTitle.setText(itemsBean.getTitle());
        }
    }

    @Override
    public int getItemCount() {
        if (dataList == null) return 0;
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //common
        @BindView(R.id.imv_cover)
        ImageView imvCover;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.item_liner)
        LinearLayout itemLiner;
        //bangumi
        TextView tvDetail ;
        TextView txTag ;
        TextView txvScore ;
        TextView txvPeople ;
        TextView txvCid1 ;
        TextView txvCid2;
        TextView txvCid3 ;
        TextView txvCid4 ;
        TextView txvCid5 ;
        TextView txvCid6 ;
        TextView txvGotoPlay ;
        TextView txvFollow ;
        //normal
        //normal
        TextView tvPlays;
        TextView tvComments;
        //live


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            unbinder = ButterKnife.bind(this, itemView);
             if (type.equals("normal")){
                 tvPlays = itemView.findViewById(R.id.tv_plays);
                 tvComments = itemView.findViewById(R.id.tv_comments);
             }else if (type.equals("bangumi")){
                 tvDetail = itemView.findViewById(R.id.tv_detail);
                 txTag  = itemView.findViewById(R.id.tx_tag);;
                 txvScore = itemView.findViewById(R.id.txv_score);;
                 txvPeople = itemView.findViewById(R.id.txv_people);;
                 txvCid1 = itemView.findViewById(R.id.txv_cid1);
                 txvCid2 = itemView.findViewById(R.id.txv_cid2);
                 txvCid3 = itemView.findViewById(R.id.txv_cid3);
                 txvCid4 = itemView.findViewById(R.id.txv_cid4);
                 txvCid5 = itemView.findViewById(R.id.txv_cid5);
                 txvCid6 = itemView.findViewById(R.id.txv_cid6);
                 txvGotoPlay = itemView.findViewById(R.id.txv_goto_play);
                 txvFollow = itemView.findViewById(R.id.txv_follow);
             }

        }
    }

    public class BangumiViewHolder extends ViewHolder {
        //Bangumi
        @BindView(R.id.tv_detail)
        TextView tvDetail;
        @BindView(R.id.tx_tag)
        TextView txTag;
        @BindView(R.id.txv_score)
        TextView txvScore;
        @BindView(R.id.txv_people)
        TextView txvPeople;
        @BindView(R.id.txv_cid1)
        TextView txvCid1;
        @BindView(R.id.txv_cid2)
        TextView txvCid2;
        @BindView(R.id.txv_cid3)
        TextView txvCid3;
        @BindView(R.id.txv_cid4)
        TextView txvCid4;
        @BindView(R.id.txv_cid5)
        TextView txvCid5;
        @BindView(R.id.txv_cid6)
        TextView txvCid6;
        @BindView(R.id.txv_goto_play)
        TextView txvGotoPlay;
        @BindView(R.id.txv_follow)
        TextView txvFollow;
        public BangumiViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public class NormalViewHolder extends ViewHolder {
        //normal
        @BindView(R.id.tv_plays)
        TextView tvPlays;
        @BindView(R.id.tv_comments)
        TextView tvComments;
        public NormalViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public void notifyDataSetChange(List dataList, String type) {
        this.dataList = dataList;
        this.type = type;
        notifyDataSetChanged();
    }

    public interface OnItemClickedListener {
        void onClick(Object dataBean, String type);
        void onClick(View view,Object dataBean,String type);
    }

    public List getDataList(){
        return dataList;
    }


}
