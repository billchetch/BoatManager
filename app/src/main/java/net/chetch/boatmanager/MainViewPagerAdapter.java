package net.chetch.boatmanager;

import net.chetch.cmalarms.AlarmPanelFragment;

import net.chetch.cmengineroom.EnginesFragment;
import net.chetch.cmengineroom.PumpsFragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MainViewPagerAdapter extends FragmentStateAdapter {

   public MainViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
      super(fragmentActivity);
   }

   @NonNull
   @Override
   public Fragment createFragment(int position) {
      Fragment page = null;
      switch(position){
         case 0:
            page = new AlarmPanelFragment();
            break;
         case 1:
            page = new EnginesFragment();
            break;
         case 2:
            page = new PumpsFragment();
            break;
      }

      return page;
   }

   @Override
   public int getItemCount() {
      return 2;
   }
}
