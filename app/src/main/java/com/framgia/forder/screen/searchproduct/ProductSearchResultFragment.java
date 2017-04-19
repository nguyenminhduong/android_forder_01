package com.framgia.forder.screen.searchproduct;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.framgia.forder.R;
import com.framgia.forder.databinding.FragmentProductSearchResultBinding;

/**
 * Searchproduct Screen.
 */
public class ProductSearchResultFragment extends Fragment {

    private ProductSearchResultContract.ViewModel mViewModel;

    public static ProductSearchResultFragment newInstance() {
        return new ProductSearchResultFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        mViewModel = new ProductSearchResultViewModel();

        ProductSearchResultContract.Presenter presenter = new ProductSearchResultPresenter(mViewModel);
        mViewModel.setPresenter(presenter);

        FragmentProductSearchResultBinding binding =
                DataBindingUtil.inflate(inflater, R.layout.fragment_product_search_result, container,
                        false);
        binding.setViewModel((ProductSearchResultViewModel) mViewModel);
        return binding.getRoot();
    }
}