package top.bilibililike.ddplayer.widgets.fragments.home.bangumi;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseRecycleViewAdapter;

public class BangumiListAdapter extends BaseRecycleViewAdapter {


    protected BangumiListAdapter(Context context, List list) {
        super(context, list);
    }

    @Override
    protected int getFooterViewResource() {
        return 0;
    }


    @Override
    public void notifyDataChanged(Object bean, boolean isRefresh) {

    }

    @Override
    protected int getViewResource() {
        return R.layout.item_bangumi_list;
    }

    @Override
    protected RecyclerView.ViewHolder getRecycleViewHolder(View view) {
        return new BangumiListHolder(view);
    }

    @Override
    protected void dataRead(RecyclerView.ViewHolder holder, int position) {
        BangumiListHolder mHolder = (BangumiListHolder) holder;
        mHolder.tvTitle.setText(position+"");

    }

    class BangumiListHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imv_cover)
        ImageView imvCover;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_plays)
        TextView tvPlays;
        @BindView(R.id.tv_comments)
        TextView tvComments;
        public BangumiListHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
