package top.bilibililike.ddplayer.widgets.fragments.home.bangumi;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import top.bilibililike.ddplayer.R;
import top.bilibililike.ddplayer.base.BaseFragment;

public class BangumiSeasonFragment extends BaseFragment {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    public void finishCreateView(Bundle state) {
        initRecyclerView();
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_bangumi;
    }

    @Override
    public void notifyDataSetChanged(Object[] t) {

    }

    private void initRecyclerView(){
        List list = new ArrayList();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new BangumiListAdapter(getActivity(),list));
    }
}
