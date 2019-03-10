package com.inner.lovetao.loginregister;

import com.inner.lovetao.core.TaoResponse;
import com.inner.lovetao.loginregister.bean.TbLoginBean;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * desc:用户相关接口
 * Created by xcz
 * on 2019/3/10.
 */
public interface UserApi {
    /**
     * @param loginBean 淘宝返回的数据
     * @return
     */
    @POST("/api/aitao/add/user")
    Observable<TaoResponse<String>> syncUser(@Body TbLoginBean loginBean);

    /**
     * 获取手机验证码
     *
     * @param phone
     * @return
     */
    @FormUrlEncoded
    @POST("/api/aitao/api/sendSms")
    Observable<TaoResponse> getPhoneCode(@Field("phone") String phone);

    /**
     * @param phone
     * @return
     */
    @FormUrlEncoded
    @POST("/api/aitao/phone/binding")
    Observable<TaoResponse> bindPhone(@Field("phone") String phone,
                                      @Field("verifyCode") String verifyCode,
                                      @Field("InvitationCode") String InvitationCode,
                                      @Body TbLoginBean loginBean
    );
}
