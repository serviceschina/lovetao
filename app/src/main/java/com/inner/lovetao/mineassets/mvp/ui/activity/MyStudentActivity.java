package com.inner.lovetao.mineassets.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;

import com.inner.lovetao.R;
import com.inner.lovetao.mineassets.di.component.DaggerMyStudentComponent;
import com.inner.lovetao.mineassets.mvp.contract.MyStudentContract;
import com.inner.lovetao.mineassets.mvp.presenter.MyStudentPresenter;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * desc:
 * Created by xcz
 */
public class MyStudentActivity extends BaseActivity<MyStudentPresenter> implements MyStudentContract.View {

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerMyStudentComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_my_student; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }
}
