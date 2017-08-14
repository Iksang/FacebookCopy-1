package kr.co.tjeit.facebookcopy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Locale;

import kr.co.tjeit.facebookcopy.data.FriendRequestData;

public class ViewUserInfoActivity extends AppCompatActivity {

    FriendRequestData mFriendRequestData = null;
    private android.widget.TextView userNameTxt;
    private android.widget.TextView commonFriendsCountTxt;
    private android.widget.TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_user_info);
        mFriendRequestData = (FriendRequestData) getIntent().getSerializableExtra("친구요청데이터");

//      받아온 데이터를 화면에 출력.
        bindViews();
        setupEvents();
        setValues();
    }

    private void setValues() {
        userNameTxt.setText(mFriendRequestData.getRequestUserData().getUserName());
        String friendsCountStr = String.format(Locale.KOREA, "함께 아는 친구 %d명", mFriendRequestData.getCommonFriendsCount());
        commonFriendsCountTxt.setText(friendsCountStr);
    }

    private void setupEvents() {

    }

    private void bindViews() {
        this.textView = (TextView) findViewById(R.id.textView);
        this.commonFriendsCountTxt = (TextView) findViewById(R.id.commonFriendsCountTxt);
        this.userNameTxt = (TextView) findViewById(R.id.userNameTxt);

    }
}
