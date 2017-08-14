package com.codepath.apps.mysimpletweets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codepath.apps.mysimpletweets.models.Tweet;

import java.util.ArrayList;
import java.util.List;


public class TweetListFragment extends Fragment {

    ArrayList<Tweet> tweets;
    TweetsArrayAdapter aTweets;
    // private ListView lvTweets;
 //   private RecyclerView rvTweets;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tweet, parent, false);
  //      rvTweets = (RecyclerView) v.findViewById(R.id.rvTweets);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        tweets = new ArrayList<>();
        aTweets = new TweetsArrayAdapter(getActivity(), tweets);
    }

  //  public void aadAll(List<Tweet> tweets) {
    //    aTweets.addAll(tweets);
    }
//}

