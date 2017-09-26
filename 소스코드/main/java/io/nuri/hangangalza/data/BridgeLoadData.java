package io.nuri.hangangalza.data;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import io.nuri.hangangalza.data.BridgeData;

/**
 * Created by chayongbin on 15. 10. 22..
 */
public class BridgeLoadData {

    private Context mContext;
    private String json;

    public BridgeLoadData(Context context) {
        mContext = context;
    }

    public ArrayList<BridgeData> getJsonData() {

        ArrayList<BridgeData> bridgeInfoList = new ArrayList<BridgeData>();

        JSONArray bridgeJsonArray;
        int br_id;
        String bridge_kr;
        String bridge_en;
        String bridge_image;

        String json = getJson();
        BridgeData bridgeData;

        try {

            JSONObject bridge = new JSONObject(json);
            bridgeJsonArray = bridge.getJSONArray("bridge");
            for (int i = 0; i < bridgeJsonArray.length(); i++) {
                JSONObject jsonObject = bridgeJsonArray.getJSONObject(i);
                br_id = jsonObject.getInt("br_id");
                bridge_kr = jsonObject.getString("bridge_kr");
                bridge_en = jsonObject.getString("bridge_en");
                bridge_image = jsonObject.getString("bridge_image");

                bridgeData = new BridgeData(br_id, bridge_kr, bridge_en, bridge_image);
                bridgeInfoList.add(bridgeData);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return bridgeInfoList;
    }

    public String getJson() {

        json = "{\n" +
                "  \"bridge\": [\n" +
                "    {\n" +
                "      \"br_id\": 1,\n" +
                "      \"bridge_kr\": \"행주대교\",\n" +
                "      \"bridge_en\": \"HangJu Bridge\",\n" +
                "      \"bridge_image\": \"hangju\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 2,\n" +
                "      \"bridge_kr\": \"방화대교\",\n" +
                "      \"bridge_en\": \"BangHaw Bridge\",\n" +
                "      \"bridge_image\": \"banghaw\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 3,\n" +
                "      \"bridge_kr\": \"가양대교\",\n" +
                "      \"bridge_en\": \"GaYang Bridge\",\n" +
                "      \"bridge_image\": \"gayang\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 4,\n" +
                "      \"bridge_kr\": \"성산대교\",\n" +
                "      \"bridge_en\": \"SungSan Bridge\",\n" +
                "      \"bridge_image\": \"sungsan\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 5,\n" +
                "      \"bridge_kr\": \"양화대교\",\n" +
                "      \"bridge_en\": \"Yang Haw Bridge\",\n" +
                "      \"bridge_image\": \"yanghaw\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 6,\n" +
                "      \"bridge_kr\": \"당산철교\",\n" +
                "      \"bridge_en\": \"DangSan Rail Bridge\",\n" +
                "      \"bridge_image\": \"dangsan_rail\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 7,\n" +
                "      \"bridge_kr\": \"서강대교\",\n" +
                "      \"bridge_en\": \"SuGang Bridge\",\n" +
                "      \"bridge_image\": \"sugang\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 8,\n" +
                "      \"bridge_kr\": \"마포대교\",\n" +
                "      \"bridge_en\": \"MaPo Bridge\",\n" +
                "      \"bridge_image\": \"mapo\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 9,\n" +
                "      \"bridge_kr\": \"원효대교\",\n" +
                "      \"bridge_en\": \"OneHo Bridge\",\n" +
                "      \"bridge_image\": \"oneho\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 10,\n" +
                "      \"bridge_kr\": \"한강철교\",\n" +
                "      \"bridge_en\": \"HanGang Rial Bridge\",\n" +
                "      \"bridge_image\": \"hangang_rail\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 11,\n" +
                "      \"bridge_kr\": \"한강대교\",\n" +
                "      \"bridge_en\": \"HanGang Bridge\",\n" +
                "      \"bridge_image\": \"hangang\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 12,\n" +
                "      \"bridge_kr\": \"동작대교\",\n" +
                "      \"bridge_en\": \"DongJack Bridge\",\n" +
                "      \"bridge_image\": \"dongjack\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 13,\n" +
                "      \"bridge_kr\": \"반포대교\",\n" +
                "      \"bridge_en\": \"BanPo Bridge\",\n" +
                "      \"bridge_image\": \"banpo\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 14,\n" +
                "      \"bridge_kr\": \"한남대교\",\n" +
                "      \"bridge_en\": \"HanNam Bridge\",\n" +
                "      \"bridge_image\": \"hannam\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 15,\n" +
                "      \"bridge_kr\": \"동호대교\",\n" +
                "      \"bridge_en\": \"DongHo Bridge\",\n" +
                "      \"bridge_image\": \"dongho\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 16,\n" +
                "      \"bridge_kr\": \"성수대교\",\n" +
                "      \"bridge_en\": \"SungSu Bridge\",\n" +
                "      \"bridge_image\": \"sungsu\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 17,\n" +
                "      \"bridge_kr\": \"영동대교\",\n" +
                "      \"bridge_en\": \"YungDong Bridge\",\n" +
                "      \"bridge_image\": \"yungdong\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 18,\n" +
                "      \"bridge_kr\": \"청담대교\",\n" +
                "      \"bridge_en\": \"ChungDam Bridge\",\n" +
                "      \"bridge_image\": \"chungdam\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 19,\n" +
                "      \"bridge_kr\": \"잠실대교\",\n" +
                "      \"bridge_en\": \"ZamSil Bridge\",\n" +
                "      \"bridge_image\": \"zamsil\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 20,\n" +
                "      \"bridge_kr\": \"잠실철교\",\n" +
                "      \"bridge_en\": \"ZaSil Rail Bridge\",\n" +
                "      \"bridge_image\": \"zamsil_rail\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 21,\n" +
                "      \"bridge_kr\": \"올림픽대교\",\n" +
                "      \"bridge_en\": \"Olympic Bridge\",\n" +
                "      \"bridge_image\": \"olympic\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 22,\n" +
                "      \"bridge_kr\": \"천호대교\",\n" +
                "      \"bridge_en\": \"ChunHo Bridge\",\n" +
                "      \"bridge_image\": \"chunho\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 23,\n" +
                "      \"bridge_kr\": \"광진교\",\n" +
                "      \"bridge_en\": \"GwangZin Bridge\",\n" +
                "      \"bridge_image\": \"gwangzin\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"br_id\": 24,\n" +
                "      \"bridge_kr\": \"구리암사대교\",\n" +
                "      \"bridge_en\": \"GuriArmSa Bridge\",\n" +
                "      \"bridge_image\": \"guriarmsa\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        return json;
    }

}
