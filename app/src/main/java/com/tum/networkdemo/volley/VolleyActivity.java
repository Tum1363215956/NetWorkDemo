package com.tum.networkdemo.volley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.tum.networkdemo.R;

import java.util.HashMap;
import java.util.Map;

public class VolleyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley);
    }

    public void onClick(View view){
        volley_Get();
    }

    public void onPost(View view){
        volley_Post();
    }

   /* private void volley_Get() {
        String url = "http://apis.juhe.cn/mobile/get?phone=13666666666&key=335adcc4e891ba4e4be6d7534fd54c5d";
        StringRequest request = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String arg0) {
                        Toast.makeText(VolleyActivity.this, arg0,
                                Toast.LENGTH_LONG).show();
                        Log.i("TGA","TGA:"+arg0);
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError arg0) {
                Toast.makeText(VolleyActivity.this, "网络请求失败",
                        Toast.LENGTH_LONG).show();
            }
        });
        request.setTag("abcGet");
        VolleyApplation.getHttpQueue().add(request);
    }*/

    private void volley_Get(){
        String url = "http://apis.juhe.cn/mobile/get?phone=13666666666&key=335adcc4e891ba4e4be6d7534fd54c5d";
        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Toast.makeText(VolleyActivity.this, s,
                        Toast.LENGTH_LONG).show();
                Log.i("TGA", "TGA:" + s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(VolleyActivity.this, "网络请求失败",
                        Toast.LENGTH_LONG).show();
            }
        });
        request.setTag("abcGet");
        VolleyApplation.getHttpQueue().add(request);
    }


    /*private void volley_Post() {
        String url = "http://apis.juhe.cn/mobile/get?";
        StringRequest request = new StringRequest(Method.POST, url,
                new Listener<String>() {

                    @Override
                    public void onResponse(String arg0) {
                        Toast.makeText(MainActivity.this, arg0,
                                Toast.LENGTH_LONG).show();
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError arg0) {
                Toast.makeText(MainActivity.this, "网络请求失败",
                        Toast.LENGTH_LONG).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("phone", "13666666666");
                map.put("key", "335adcc4e891ba4e4be6d7534fd54c5d");
                return map;
            }
        };
        request.setTag("abcPost");
        MyApplication.getHttpQueue().add(request);
    }*/

    private void volley_Post(){
        String url = "http://apis.juhe.cn/mobile/get?";
        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Toast.makeText(VolleyActivity.this, s,
                        Toast.LENGTH_LONG).show();
                Log.i("TGA","TGA Post："+s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(VolleyActivity.this, "网络请求失败",
                        Toast.LENGTH_LONG).show();

            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("phone", "13666666666");
                map.put("key", "335adcc4e891ba4e4be6d7534fd54c5d");
                return map;
            }
        };
        request.setTag("abcPost");
        VolleyApplation.getHttpQueue().add(request);
    }
}
