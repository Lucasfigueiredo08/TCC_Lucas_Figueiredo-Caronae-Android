// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.frags;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RideOfferFrag_ViewBinding implements Unbinder {
  private RideOfferFrag target;

  private View view2131231185;

  private View view2131231187;

  private View view2131231005;

  private View view2131231231;

  private View view2131231253;

  private View view2131231207;

  private View view2131230915;

  private View view2131231115;

  private View view2131231182;

  private View view2131230753;

  private View view2131231081;

  private View view2131231210;

  private View view2131231022;

  private View view2131230820;

  private View view2131231110;

  private View view2131231142;

  @UiThread
  public RideOfferFrag_ViewBinding(final RideOfferFrag target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.tab1, "field 'isGoing_bt' and method 'goingTabSelected'");
    target.isGoing_bt = Utils.castView(view, R.id.tab1, "field 'isGoing_bt'", RelativeLayout.class);
    view2131231185 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.goingTabSelected();
      }
    });
    view = Utils.findRequiredView(source, R.id.tab2, "field 'isLeaving_bt' and method 'leavingTabSelected'");
    target.isLeaving_bt = Utils.castView(view, R.id.tab2, "field 'isLeaving_bt'", RelativeLayout.class);
    view2131231187 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.leavingTabSelected();
      }
    });
    target.days_lo = Utils.findRequiredViewAsType(source, R.id.days_lo, "field 'days_lo'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.monday_cb, "field 'monday_cb' and method 'monClick'");
    target.monday_cb = Utils.castView(view, R.id.monday_cb, "field 'monday_cb'", RelativeLayout.class);
    view2131231005 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.monClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.tuesday_cb, "field 'tuesday_cb' and method 'tueClick'");
    target.tuesday_cb = Utils.castView(view, R.id.tuesday_cb, "field 'tuesday_cb'", RelativeLayout.class);
    view2131231231 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.tueClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.wednesday_cb, "field 'wednesday_cb' and method 'wedClick'");
    target.wednesday_cb = Utils.castView(view, R.id.wednesday_cb, "field 'wednesday_cb'", RelativeLayout.class);
    view2131231253 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.wedClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.thursday_cb, "field 'thursday_cb' and method 'thuClick'");
    target.thursday_cb = Utils.castView(view, R.id.thursday_cb, "field 'thursday_cb'", RelativeLayout.class);
    view2131231207 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.thuClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.friday_cb, "field 'friday_cb' and method 'friClick'");
    target.friday_cb = Utils.castView(view, R.id.friday_cb, "field 'friday_cb'", RelativeLayout.class);
    view2131230915 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.friClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.saturday_cb, "field 'saturday_cb' and method 'satClick'");
    target.saturday_cb = Utils.castView(view, R.id.saturday_cb, "field 'saturday_cb'", RelativeLayout.class);
    view2131231115 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.satClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.sunday_cb, "field 'sunday_cb' and method 'sunClick'");
    target.sunday_cb = Utils.castView(view, R.id.sunday_cb, "field 'sunday_cb'", RelativeLayout.class);
    view2131231182 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.sunClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.add_slot, "field 'addSlotButton' and method 'addSlotClick'");
    target.addSlotButton = Utils.castView(view, R.id.add_slot, "field 'addSlotButton'", RelativeLayout.class);
    view2131230753 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.addSlotClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.remove_slot, "field 'removeSlotButton' and method 'removeSlotClick'");
    target.removeSlotButton = Utils.castView(view, R.id.remove_slot, "field 'removeSlotButton'", RelativeLayout.class);
    view2131231081 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.removeSlotClick();
      }
    });
    target.isGoing_tv = Utils.findRequiredViewAsType(source, R.id.tab1_tv, "field 'isGoing_tv'", TextView.class);
    target.isLeaving_tv = Utils.findRequiredViewAsType(source, R.id.tab2_tv, "field 'isLeaving_tv'", TextView.class);
    target.mon_tv = Utils.findRequiredViewAsType(source, R.id.mon_tv, "field 'mon_tv'", TextView.class);
    target.tue_tv = Utils.findRequiredViewAsType(source, R.id.tue_tv, "field 'tue_tv'", TextView.class);
    target.wed_tv = Utils.findRequiredViewAsType(source, R.id.wed_tv, "field 'wed_tv'", TextView.class);
    target.thu_tv = Utils.findRequiredViewAsType(source, R.id.thu_tv, "field 'thu_tv'", TextView.class);
    target.fri_tv = Utils.findRequiredViewAsType(source, R.id.fri_tv, "field 'fri_tv'", TextView.class);
    target.sat_tv = Utils.findRequiredViewAsType(source, R.id.sat_tv, "field 'sat_tv'", TextView.class);
    target.sun_tv = Utils.findRequiredViewAsType(source, R.id.sun_tv, "field 'sun_tv'", TextView.class);
    view = Utils.findRequiredView(source, R.id.time_et, "field 'time_et' and method 'time_et'");
    target.time_et = Utils.castView(view, R.id.time_et, "field 'time_et'", TextView.class);
    view2131231210 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.time_et();
      }
    });
    target.slotNumber = Utils.findRequiredViewAsType(source, R.id.slots_n, "field 'slotNumber'", TextView.class);
    target.remove_tv = Utils.findRequiredViewAsType(source, R.id.remove_tv, "field 'remove_tv'", TextView.class);
    target.add_tv = Utils.findRequiredViewAsType(source, R.id.add_tv, "field 'add_tv'", TextView.class);
    target.radioGroup2 = Utils.findRequiredViewAsType(source, R.id.radioGroup2, "field 'radioGroup2'", RadioGroup.class);
    view = Utils.findRequiredView(source, R.id.neighborhood_et, "field 'neighborhood_et' and method 'neighborhoodEt'");
    target.neighborhood_et = Utils.castView(view, R.id.neighborhood_et, "field 'neighborhood_et'", EditText.class);
    view2131231022 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.neighborhoodEt();
      }
    });
    target.place_et = Utils.findRequiredViewAsType(source, R.id.place_et, "field 'place_et'", EditText.class);
    target.way_et = Utils.findRequiredViewAsType(source, R.id.way_et, "field 'way_et'", EditText.class);
    view = Utils.findRequiredView(source, R.id.center_et, "field 'center_et' and method 'centerEt'");
    target.center_et = Utils.castView(view, R.id.center_et, "field 'center_et'", EditText.class);
    view2131230820 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.centerEt();
      }
    });
    target.description_et = Utils.findRequiredViewAsType(source, R.id.description_et, "field 'description_et'", EditText.class);
    view = Utils.findRequiredView(source, R.id.routine_cb, "field 'routine_cb' and method 'routineCb'");
    target.routine_cb = Utils.castView(view, R.id.routine_cb, "field 'routine_cb'", SwitchCompat.class);
    view2131231110 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.routineCb();
      }
    });
    target.scrollView = Utils.findRequiredViewAsType(source, R.id.scrollView, "field 'scrollView'", ScrollView.class);
    view = Utils.findRequiredView(source, R.id.send_bt, "method 'sendBt'");
    view2131231142 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.sendBt();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    RideOfferFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.isGoing_bt = null;
    target.isLeaving_bt = null;
    target.days_lo = null;
    target.monday_cb = null;
    target.tuesday_cb = null;
    target.wednesday_cb = null;
    target.thursday_cb = null;
    target.friday_cb = null;
    target.saturday_cb = null;
    target.sunday_cb = null;
    target.addSlotButton = null;
    target.removeSlotButton = null;
    target.isGoing_tv = null;
    target.isLeaving_tv = null;
    target.mon_tv = null;
    target.tue_tv = null;
    target.wed_tv = null;
    target.thu_tv = null;
    target.fri_tv = null;
    target.sat_tv = null;
    target.sun_tv = null;
    target.time_et = null;
    target.slotNumber = null;
    target.remove_tv = null;
    target.add_tv = null;
    target.radioGroup2 = null;
    target.neighborhood_et = null;
    target.place_et = null;
    target.way_et = null;
    target.center_et = null;
    target.description_et = null;
    target.routine_cb = null;
    target.scrollView = null;

    view2131231185.setOnClickListener(null);
    view2131231185 = null;
    view2131231187.setOnClickListener(null);
    view2131231187 = null;
    view2131231005.setOnClickListener(null);
    view2131231005 = null;
    view2131231231.setOnClickListener(null);
    view2131231231 = null;
    view2131231253.setOnClickListener(null);
    view2131231253 = null;
    view2131231207.setOnClickListener(null);
    view2131231207 = null;
    view2131230915.setOnClickListener(null);
    view2131230915 = null;
    view2131231115.setOnClickListener(null);
    view2131231115 = null;
    view2131231182.setOnClickListener(null);
    view2131231182 = null;
    view2131230753.setOnClickListener(null);
    view2131230753 = null;
    view2131231081.setOnClickListener(null);
    view2131231081 = null;
    view2131231210.setOnClickListener(null);
    view2131231210 = null;
    view2131231022.setOnClickListener(null);
    view2131231022 = null;
    view2131230820.setOnClickListener(null);
    view2131230820 = null;
    view2131231110.setOnClickListener(null);
    view2131231110 = null;
    view2131231142.setOnClickListener(null);
    view2131231142 = null;
  }
}
