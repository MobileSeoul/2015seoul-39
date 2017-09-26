package io.nuri.hangangalza.data;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by chayongbin on 15. 10. 31..
 */
public class TourLoadData {

    private Context mContext;
    private String json;

    public TourLoadData(Context context) {
        mContext = context;
    }

    public ArrayList<TourData> getJsonData() {

        ArrayList<TourData> tourDataArrayList = new ArrayList<TourData>();

        JSONArray tourJsonArray;
        String name;
        String link;

        String json = getJson();
        TourData tourData;

        try {
            JSONObject tour = new JSONObject(json);
            tourJsonArray = tour.getJSONArray("tour");
            for (int i = 0; i < tourJsonArray.length(); i++) {
                JSONObject jsonObject = tourJsonArray.getJSONObject(i);
                name = jsonObject.getString("name");
                link = jsonObject.getString("Link");

                tourData = new TourData(name, link);
                tourDataArrayList.add(tourData);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return tourDataArrayList;

    }

    public String getJson() {

        json = "{\n" +
                "\t\"tour\" : \n" +
                "\t[\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"행주산성\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=125562\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"강서습지 생태공원 \",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=809490\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"꿩고개공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.terms.naver.com/entry.nhn?docId=1252104&cid=40942&categoryId=31922\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"방화공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.terms.naver.com/entry.nhn?docId=1252236&cid=40942&categoryId=31922\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"노을공원\",\n" +
                "\t\t\t\"Link\" : \"https://ko.m.wikipedia.org/wiki/월드컵공원\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"월드컵공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=128021\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"난지캠핑장\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=131740\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"하늘공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.terms.naver.com/entry.nhn?docId=2031764&cid=42856&categoryId=42856\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"난지한강공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=127859\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"평화의 공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.terms.naver.com/entry.nhn?docId=1222476&cid=40942&categoryId=31922\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"서울월드컵경기장\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=131712\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"망원한강공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=1059638\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"안양천\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=814153\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"양화한강공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=1059877\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"선유도\",\n" +
                "\t\t\t\"Link\" : \"http://m.terms.naver.com/entry.nhn?docId=764054&cid=43740&categoryId=44178\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"선유도공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=127700\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"서울마리나\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=1362516\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"국회의사당\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=126827\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"밤섬\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=809741\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"샛강\",\n" +
                "\t\t\t\"Link\" : \"http://m.navercast.naver.com/mobile_contents.nhn?rid=172&contents_id=56055\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"샛강 생태공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=809596\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"여의도\",\n" +
                "\t\t\t\"Link\" : \"http://m.terms.naver.com/entry.nhn?docId=581218&cid=46617&categoryId=46617\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"여의도공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=127955\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"여의도 한강공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=1059479\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"63빌딩\",\n" +
                "\t\t\t\"Link\" : \"http://m.terms.naver.com/entry.nhn?docId=1081761&cid=40942&categoryId=33083\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"용산전자상가\",\n" +
                "\t\t\t\"Link\" : \"http://m.terms.naver.com/entry.nhn?docId=1187540&cid=40942&categoryId=32166\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"사육신공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=126523\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"노들섬\",\n" +
                "\t\t\t\"Link\" : \"http://m.terms.naver.com/entry.nhn?docId=764051&cid=43740&categoryId=44178\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"이촌한강공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=970636\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"현충원\",\n" +
                "\t\t\t\"Link\" : \"http://m.terms.naver.com/entry.nhn?docId=1066824&cid=40942&categoryId=34709\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"국립중앙박물관\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=129703\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"용산가족공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=126499\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"서래섬\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=753983\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"무지개 분수\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=729167\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"반포한강공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=970138\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"세빛섬\",\n" +
                "\t\t\t\"Link\" : \"http://m.terms.naver.com/entry.nhn?docId=2070617&cid=40942&categoryId=34709\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"잠원한강공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=970342\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"신사동 가로수길\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=987720\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"압구정\",\n" +
                "\t\t\t\"Link\" : \" http://m.terms.naver.com/entry.nhn?docId=404052&cid=43722&categoryId=43722 \"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"서울숲\",\n" +
                "\t\t\t\"Link\" : \"http://m.terms.naver.com/entry.nhn?docId=1225621&cid=40942&categoryId=31922\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"압구정 로데오 거리\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=126823\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"뚝섬한강공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=1030763\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"잠실한강공원\",\n" +
                "\t\t\t\"Link\" : \" http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=970460\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"석촌호수\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=754052 \"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"롯데월드\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=126498\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"성내천\",\n" +
                "\t\t\t\"Link\" : \"http://m.terms.naver.com/entry.nhn?docId=1284214&cid=40942&categoryId=34709\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"올림픽공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=126532\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"몽촌토성\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=127525\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"광나루 한강공원\",\n" +
                "\t\t\t\"Link\" : \" http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=250252\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"암사 생태공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=814195\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"구리시민 한강공원\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=228874\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"풍납토성\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=127525\"\n" +
                "\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\t\t\t\"name\" : \"서울암사동유적지\",\n" +
                "\t\t\t\"Link\" : \"http://m.visitkorea.or.kr/LocalAreaMain.do?method=getDetailDB&cid=126519\"\n" +
                "\n" +
                "\t\t}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t]\n" +
                "}";

        return json; }
}
