package com.nadim.surecare.fcm;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import static com.nadim.surecare.ImportantTools.FCM_SERVER_KEY;

public interface FcmApi {

    @Headers({"Authorization: key="+FCM_SERVER_KEY,
            "Content-Type:application/json"})
    @POST("fcm/send")
    Call<ResponseBody> sendChatNotification(@Body RequestNotificaton requestNotificaton);
}
