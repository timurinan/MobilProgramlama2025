package com.example.uygulama2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class Fragment_Adapter extends FragmentStateAdapter {

    ArrayList<Fragment_Hesap> fragmentler=new ArrayList<Fragment_Hesap>();
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentler.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentler.size();
    }

    public void addFragment(Fragment_Hesap gelenfragment){
        fragmentler.add(gelenfragment);
    }

    public Fragment_Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }
}
