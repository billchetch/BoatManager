package net.chetch.boatmanager;

import net.chetch.cmalarms.AlarmPanelFragment;

import net.chetch.cmengineroom.EnginesPageFragment;
import net.chetch.cmengineroom.PumpsPageFragment;
import net.chetch.cmengineroom.WaterTanksPageFragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MainViewPagerAdapter extends FragmentStateAdapter {

   MainActivity mainActivity;

   public MainViewPagerAdapter(@NonNull MainActivity mainActivity) {
      super(mainActivity);
      this.mainActivity = mainActivity;
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
            page = new EnginesPageFragment();
            break;
         case 2:
            page = new PumpsPageFragment();
            break;
         case 3:
            page = new WaterTanksPageFragment();
            break;
      }

      return page;
   }


   @Override
   public int getItemCount() {
      return 4;
   }
}
