package io.nuri.hangangalza.main;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.app.AlertDialog;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.xgc1986.parallaxPagerTransformer.ParallaxPagerTransformer;

import java.util.ArrayList;

import io.nuri.hangangalza.StartActivity;
import io.nuri.hangangalza.data.BridgeData;
import io.nuri.hangangalza.data.BridgeInfoData;
import io.nuri.hangangalza.data.BridgeInfoLoadData;
import io.nuri.hangangalza.data.BridgeLoadData;
import io.nuri.hangangalza.R;
import io.nuri.hangangalza.map.AllBridgeViewActivity;
import io.nuri.hangangalza.map.MapActivity;
import io.nuri.hangangalza.tour.TourActivity;
import io.nuri.hangangalza.utils.AppInformationActivity;

public class MainActivity extends FragmentActivity {

    ViewPager mPager;
    PagerAdapter mAdapter;

    RelativeLayout leftRL;
    DrawerLayout drawerLayout;
    ListView listView;
    private BridgeLoadData bridgeLoadData;
    private ArrayList<BridgeData> bridgeDataArrayList = new ArrayList<BridgeData>();

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String str = intent.getStringExtra("id");

        initPager();

        if (str != null){
            int idx = Integer.parseInt(str);
            mPager.setCurrentItem(idx + 240);
        }


        // DrawerLayout Create Setting
        leftRL = (RelativeLayout)findViewById(R.id.whatYouWantInLeftDrawer);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);

        // Listview Create Setting
//        listView = (ListView) findViewById(R.id.navi_list);
//        listView.setAdapter(new NavigationAdapter(this, bridgeDataArrayList));
//        listView.setOnItemClickListener(new ListViewItemClickListener());

    }

    public void AllView(View view){
        Intent allIntent = new Intent(this, AllBridgeViewActivity.class);
        allIntent.putExtra("lat", "37.568671");
        allIntent.putExtra("lng", "127.132305");
        allIntent.putExtra("name", "");
        this.startActivity(allIntent);
    }

    public void Info(View view){
        Intent intent = new Intent(this, AppInformationActivity.class);
        this.startActivity(intent);
    }

    public void History(View view) {
        Intent intent = new Intent(this, TourActivity.class);

        intent.putExtra("link", "http://hangang.seoul.go.kr/archives/903");
        this.startActivity(intent);
        return;
    }

    public void Gusuk(View view) {
        Intent intent = new Intent(this, TourActivity.class);

        intent.putExtra("link", "http://m.visitkorea.or.kr/mobileweb/home/index.jsp");
        this.startActivity(intent);
        return;
    }

    public void VisitSeoul(View view) {
        Intent intent = new Intent(this, TourActivity.class);

        intent.putExtra("link", "http://m.visitseoul.net/kr/m/index.do?_method=main");
        this.startActivity(intent);
        return;
    }

    public void Hangang(View view) {
        Intent intent = new Intent(this, TourActivity.class);

        intent.putExtra("link", "http://hangang.seoul.go.kr");
        this.startActivity(intent);
        return;
    }

    private class ListViewItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            if(position != 24) {
                if (mPager.getCurrentItem() == position) {
                    drawerLayout.closeDrawer(leftRL);
                } else {
                    mPager.setCurrentItem(position);
                    drawerLayout.closeDrawer(leftRL);
                }
            } else {

                //@TODO App Information Actitivty

                AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(view.getContext(), R.style.AppTheme));
                builder.setTitle("앱 정보")
                        .setMessage("현재 앱 버전은 v.1.0.0 버전입니다")
                        .setCancelable(false)
                        .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                            // 취소 버튼 클릭시 설정
                            public void onClick(DialogInterface dialog, int whichButton) {
                                dialog.cancel();
                            }
                        });
                AlertDialog dialog = builder.create();    // 알림창 객체 생성
                dialog.show();    // 알림창 띄우기
            }

        }
    }

    public void onMenu(View view){
        drawerLayout.openDrawer(leftRL);
    }

    public static Context getContext(){
        return getContext();
    }

    private void initPager(){

        // 페이저 등록
        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setBackgroundColor(0xFF000000);

        ParallaxPagerTransformer pt = new ParallaxPagerTransformer((R.id.image));
        pt.setBorder(0);
        pt.setSpeed(1f);
        mPager.setPageTransformer(false, pt);

        mAdapter = new PagerAdapter(getSupportFragmentManager());
        mAdapter.setPager(mPager); //only for this transformer

        bridgeLoadData = new BridgeLoadData(this);

        bridgeDataArrayList = bridgeLoadData.getJsonData();

        for (int i = 0; i < 24; i++) {
            String name = bridgeDataArrayList.get(i).getBridge_kr();
            String image = bridgeDataArrayList.get(i).getBridge_image();
            int id = bridgeDataArrayList.get(i).getBr_id();

            Bundle bundle = new Bundle();
            bundle.putString("image", image);
            bundle.putString("name", name);
            bundle.putString("id", String.valueOf(id));
            PagerFragment pagerFragment = new PagerFragment();
            pagerFragment.setArguments(bundle);

            mAdapter.add(pagerFragment);
        }

        mPager.setAdapter(mAdapter);
        mPager.setCurrentItem(mPager.getChildCount() + 240, false);

        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
            getActionBar().show();
        }

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();

        return super.onOptionsItemSelected(item);
    }
}