package kr.co.tjeit.facebookcopy.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import kr.co.tjeit.facebookcopy.R;
import kr.co.tjeit.facebookcopy.adapter.NotificationAdapter;
import kr.co.tjeit.facebookcopy.util.GlobalDatas;

/**
 * Created by user on 2017-08-08.
 */

public class NotificationFragment extends Fragment {

    ListView notificationListView;
    NotificationAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_notification, container, false);
        // 뷰 매핑 반드시 하도록.
        notificationListView = (ListView) v.findViewById(R.id.notificationListView);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setupEvents();
        setValues();

    }

    private void setValues() {

        mAdapter = new NotificationAdapter(getActivity(), GlobalDatas.notificationDatas);
        notificationListView.setAdapter(mAdapter);
    }

    private void setupEvents() {

        notificationListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), position+"번줄 클릭", Toast.LENGTH_SHORT).show();
            }
        });

    }
}






