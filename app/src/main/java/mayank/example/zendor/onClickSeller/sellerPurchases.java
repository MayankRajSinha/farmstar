package mayank.example.zendor.onClickSeller;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mayank.example.zendor.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class sellerPurchases extends Fragment {


    public sellerPurchases() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seller_purchases, container, false);
    }

}
