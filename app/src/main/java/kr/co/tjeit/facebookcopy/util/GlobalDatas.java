package kr.co.tjeit.facebookcopy.util;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.facebookcopy.data.FriendRequestData;
import kr.co.tjeit.facebookcopy.data.MessageData;
import kr.co.tjeit.facebookcopy.data.NewsfeedData;
import kr.co.tjeit.facebookcopy.data.NotificationData;

/**
 * Created by user on 2017-08-08.
 */

public class GlobalDatas {

    public static int loginUserId = 10;

    public static List<FriendRequestData> friendRequestDatas = new ArrayList<>();
    public static List<NotificationData> notificationDatas = new ArrayList<>();
    public static List<NewsfeedData> newsfeedDatas = new ArrayList<>();
    public static List<MessageData> messageDatas = new ArrayList<>();

    public static void initDatas() {
        friendRequestDatas.clear();
        friendRequestDatas.add(new FriendRequestData("",7,"고동윤"));
        friendRequestDatas.add(new FriendRequestData("",1,"권성민"));
        friendRequestDatas.add(new FriendRequestData("",10,"김현철"));
        friendRequestDatas.add(new FriendRequestData("",15,"박석영"));
        friendRequestDatas.add(new FriendRequestData("",8,"박수현"));
        friendRequestDatas.add(new FriendRequestData("",7,"박영주"));
        friendRequestDatas.add(new FriendRequestData("",4,"손익상"));
        friendRequestDatas.add(new FriendRequestData("",8,"이승헌"));
        friendRequestDatas.add(new FriendRequestData("",10,"이요한"));
        friendRequestDatas.add(new FriendRequestData("",12,"최종환"));
        friendRequestDatas.add(new FriendRequestData("",13,"한상열"));


        notificationDatas.clear();
        notificationDatas.add(new NotificationData("", "10명이 내 글을 좋아합니다.", 1, 1));
        notificationDatas.add(new NotificationData("", "~~가 내 글에 댓글을 남겼습니다.", 2, 40));
        notificationDatas.add(new NotificationData("", "~~가 회원님을 팔로우 합니다.", 3, 70));
        notificationDatas.add(new NotificationData("", "~~가 내 댓글을 좋아합니다.", 4, 230));
        notificationDatas.add(new NotificationData("", "~~가 친구 요청을 수락했습니다.", 5, 600));


        newsfeedDatas.clear();
        newsfeedDatas.add(new NewsfeedData("http://naver.com", "", 2, "네이버로 링크를 걸어주는 뉴스피드입니다.", 12));
        newsfeedDatas.add(new NewsfeedData("http://google.com", "", 10, "구글로 링크를 걸어주는 뉴스피드입니다.", 5));
        newsfeedDatas.add(new NewsfeedData("", "", 45, "일기처럼 글만 적힌 뉴스피드.", 125));
        newsfeedDatas.add(new NewsfeedData("", "", 230, "사진 올린 뉴스피드.", 2453));
        newsfeedDatas.add(new NewsfeedData("", "", 800, "동영상 뉴스피드", 121371));

    }

}









