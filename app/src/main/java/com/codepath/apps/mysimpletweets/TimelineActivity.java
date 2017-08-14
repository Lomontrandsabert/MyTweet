package com.codepath.apps.mysimpletweets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.astuetz.PagerSlidingTabStrip;

public class TimelineActivity extends ActionBarActivity {

   // private TweetListFragment fragmentTweetsList;
   // ArrayList <Tweet> tweets;
   // TweetsArrayAdapter aTweets;
   // private ListView lvTweets;
   // private RecyclerView rvTweets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        //showFragmentDialog();

        ViewPager vpPager = (ViewPager) findViewById(R.id.viewpager);

        vpPager.setAdapter(new TweetsPagerAdapter(getSupportFragmentManager()));
        //
        PagerSlidingTabStrip tabStrip = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        //
        tabStrip.setViewPager(vpPager);
        //lvTweets = (ListView) findViewById(R.id.lvTweets);
        // rvTweets = (RecyclerView) findViewById(R.id.rvTweets);
        //
       // tweets = new ArrayList<>();
        //

        //
        // lvTweets.setAdapter(aTweets);
        //rvTweets.setAdapter(aTweets);
        //
      //  if (savedInstanceState == null) {

        //    fragmentTweetsList = (TweetListFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_timeline);
   //     }
    }

   // private void showFragmentDialog() {
     //   FragmentManager fm = getSupportFragmentManager();
       // FragmentDialog fragmentDialog = FragmentDialog.newInstance("ivProfilePhoto");
   //     fragmentDialog.show(fm, "fragment_tweet");
    // }

    //
  //  private void populateTimeline() {
    //    client.getHomeTimeline(new JsonHttpResponseHandler(){
  //      //ArrayList tweets
            //Adapter aTweets;
      //      @Override
        //    public void onSuccess(int statusCode, Header[] headers, JSONArray json) {
            //    Log.d("DEBUG", json.toString());
                //

          //      aTweets =new TweetsArrayAdapter(getApplicationContext(), tweets);
              //  rvTweets.setAdapter(aTweets);
                // fragmentTweetsList.aadAll(Tweet.fromJSONArray(json));
                // rvTweets.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
               /* aTweets = new TweetsArrayAdapter(getApplicationContext(), tweets);
                tweets.addAll(Tweet.fromJSONArray(json));
                rvTweets.setAdapter(aTweets);
                rvTweets.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                aTweets.notifyDataSetChanged();*/

        //        Log.d("DEBUG", aTweets.toString());
          //  }

            //
         //   @Override
           // public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
             //   if(errorResponse != null)
               //     Log.d("DEBUG", errorResponse.toString());

                // if(throwable != null)
                   // throwable.printStackTrace();
           // }
        // });
    // }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //
        getMenuInflater().inflate(R.menu.timeline, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //
        int id = item.getItemId();

        //
     //   if (id == R.id.action_settings) {
          //  showFragmentDialog();
      //      return true;
      //  }

       return super.onOptionsItemSelected(item);
    }

    public void onProfileView(MenuItem mi) {
        Intent i = new Intent(this, ProfileActivity.class);
        startActivity(i);
    }
   // public void SendTweet(View view) {
   // }

   // public String getRelativeTimeAgo(String rawJsonDate) {
       // String twitterFormat = "EEE MMM dd HH:mm:ss ZZZZZ yyyy";
       // SimpleDateFormat sf = new SimpleDateFormat(twitterFormat, Locale.ENGLISH);
       // sf.setLenient(true);

       // String relativeDate = "";
       // try {
           // long dateMillis = sf.parse(rawJsonDate).getTime();
           // relativeDate = DateUtils.getRelativeTimeSpanString(dateMillis,
         //           System.currentTimeMillis(), DateUtils.SECOND_IN_MILLIS).toString();
       // } catch (ParseException e) {
         //   e.printStackTrace();
       // } catch (java.text.ParseException e) {
         //   e.printStackTrace();
       // }

     //   return relativeDate;
   // }
    //

    public class TweetsPagerAdapter extends FragmentPagerAdapter {
       // final int PAGE_COUNT = 2;
        private String tabTitles[] = {"Home", "Mentions"};

        public TweetsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new HomeTimelineFragment();
            } else if (position == 1) {
                return new MentionsTimelineFragment();
            } else {
                return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }

        @Override
        public int getCount() {
            return tabTitles.length;
        }
    }
}