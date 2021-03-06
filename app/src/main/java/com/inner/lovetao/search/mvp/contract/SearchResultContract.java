package com.inner.lovetao.search.mvp.contract;

import com.inner.lovetao.core.TaoResponse;
import com.inner.lovetao.tab.bean.ProductItemBean;
import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IView;

import java.util.List;

import io.reactivex.Observable;


/**
 * desc:
 * Created by xcz
 */
public interface SearchResultContract {
    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {
        void getSearchResultData(List<ProductItemBean> searchResultList);

    }

    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {
        Observable<TaoResponse<List<ProductItemBean>>> getSearchData(int pageNum, int pageSize, String title);

        Observable<TaoResponse<List<ProductItemBean>>> getSearchSortData(int pageNum, int pageSize, String title,String sortName);

        Observable<TaoResponse<List<ProductItemBean>>> getSearchSortsData(int pageNum, int pageSize, String title,String sortName,String sortOrder);
    }
}
