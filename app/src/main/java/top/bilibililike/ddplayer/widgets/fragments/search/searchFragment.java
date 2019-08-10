package top.bilibililike.ddplayer.widgets.fragments.search;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import butterknife.BindView;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseFragment;

public class searchFragment extends BaseFragment {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    public void finishCreateView(Bundle state) {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //recyclerView.setAdapter(getActivity(),null,"type");
    }

    @Override
    protected int getLayoutID() {
        return R.layout.layout_recycler_view;
    }

    /**
     * @param t t[0] bean:JavaBean normal:SearchNormalBean bangumi:SearchBangumiBean live:SearchLiveBean
     *          t[1] type:String
     */
    @Override
    public void notifyDataSetChanged(Object[] t) {

    }
}
