package top.bilibililike.ddplayer.widgets.fragments.home.recommend;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseRecycleViewAdapter;
import top.bilibililike.ddplayer.entity.AvListBean;

public class HomeRecommendRecyAdapter extends BaseRecycleViewAdapter {

    @Override
    protected int getFooterViewResource() {
        return 0;
    }



    HomeRecommendRecyAdapter(Context context, List list) {
        super(context, list);
    }

    @Override
    public void notifyDataChanged(Object bean,boolean isRefresh) {
        if (bean instanceof List) {
            if (mList == null || mList.size() == 0) {
                this.mList = (List<AvListBean.DataBean.ItemsBean>)bean;
            } else if (isRefresh){
                List<AvListBean.DataBean.ItemsBean> newList = new ArrayList<>();
                newList.addAll((List<AvListBean.DataBean.ItemsBean>) bean);
                newList.addAll(mList);
                this.mList = newList;
            } else {
                this.mList.addAll((List<AvListBean.DataBean.ItemsBean>) bean);
            }
            notifyDataSetChanged();
        }
    }

    @Override
    protected int getViewResource() {
        return R.layout.item_recy_small_cover_v2;
    }

    @Override
    protected RecyclerView.ViewHolder getRecycleViewHolder(View view) {

        return new HomeRecommendRecyHolder(view);
    }

    @Override
    protected void dataRead(RecyclerView.ViewHolder holder, int position) {
        AvListBean.DataBean.ItemsBean itemsBean;
        itemsBean = (AvListBean.DataBean.ItemsBean) mList.get(position);
        HomeRecommendRecyHolder mHolder = (HomeRecommendRecyHolder)holder;
        mHolder.tvPlays.setText(itemsBean.getCover_left_text_1());
        mHolder.tvComments.setText(itemsBean.getCover_left_text_2());
        mHolder.tvLength.setText(itemsBean.getCover_right_text());
        Glide.with(mContext)
                .load(itemsBean.getCover())
                .into(mHolder.coverImg);
        mHolder.tvTitle.setText(itemsBean.getTitle());
        mHolder.tvUpNickname.setText(itemsBean.getArgs().getUp_name());
    }

    class HomeRecommendRecyHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.cover_img)
        ImageView coverImg;
        @BindView(R.id.tv_plays)
        TextView tvPlays;
        @BindView(R.id.tv_comments)
        TextView tvComments;
        @BindView(R.id.tv_length)
        TextView tvLength;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_up_nickname)
        TextView tvUpNickname;
        HomeRecommendRecyHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

    }

    private  class HomeRecommendRecyHeadViewHolder extends RecyclerView.ViewHolder {
        public HomeRecommendRecyHeadViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }


}
