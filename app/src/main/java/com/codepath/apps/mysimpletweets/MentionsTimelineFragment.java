package com.codepath.apps.mysimpletweets;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.codepath.apps.mysimpletweets.models.Tweet;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class MentionsTimelineFragment extends TweetListFragment {


    private TwitterClient client;
    //  ArrayList<Tweet> tweets;
    // TweetsArrayAdapter aTweets;
    // private ListView lvTweets;
    // private RecyclerView rvTweets;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_timeline);
        //showFragmentDialog();

        //
        //lvTweets = (ListView) findViewById(R.id.lvTweets);
        //   rvTweets = (RecyclerView) findViewById(R.id.rvTweets);
        //
        //   tweets = new ArrayList<>();
        //

        //
        // lvTweets.setAdapter(aTweets);
        //rvTweets.setAdapter(aTweets);
        //
        client = TwitterApplication.getRestClient();
        populateTimeline();
    }

    //   private void showFragmentDialog() {
    //      FragmentManager fm = getSupportFragmentManager();
    // FragmentDialog fragmentDialog = FragmentDialog.newInstance("ivProfilePhoto");
    //     fragmentDialog.show(fm, "fragment_tweet");
    // }

    //
    private void populateTimeline() {
        client.getMentionsTimeline(new JsonHttpResponseHandler() {
            //ArrayList tweets
            //Adapter aTweets;
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray json) {
                Log.d("DEBUG", json.toString());
                //

                //     aTweets =new TweetsArrayAdapter(getApplicationContext(), tweets);
                //   rvTweets.setAdapter(aTweets);
               // aadAll(Tweet.fromJSONArray(json));
                // rvTweets.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
               /* aTweets = new TweetsArrayAdapter(getApplicationContext(), tweets);
                tweets.addAll(Tweet.fromJSONArray(json));
                rvTweets.setAdapter(aTweets);
                rvTweets.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                aTweets.notifyDataSetChanged();*/

                // Log.d("DEBUG", aTweets.toString());
            }

            //
            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                //if(errorResponse != null)
                Log.d("DEBUG", errorResponse.toString());

                // if(throwable != null)
                //   throwable.printStackTrace();
            }
        });
    }

}
