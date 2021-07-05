// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.frags;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RideSearchFrag_ViewBinding implements Unbinder {
  private RideSearchFrag target;

  private View view2131231185;

  private View view2131231187;

  private View view2131230820;

  private View view2131230968;

  private View view2131231210;

  private View view2131231127;

  @UiThread
  public RideSearchFrag_ViewBinding(final RideSearchFrag target, View source) {
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
    target.isGoing_tv = Utils.findRequiredViewAsType(source, R.id.tab1_tv, "field 'isGoing_tv'", TextView.class);
    target.isLeaving_tv = Utils.findRequiredViewAsType(source, R.id.tab2_tv, "field 'isLeaving_tv'", TextView.class);
    view = Utils.findRequiredView(source, R.id.center_et, "field 'center_et' and method 'centerEt'");
    target.center_et = Utils.castView(view, R.id.center_et, "field 'center_et'", TextView.class);
    view2131230820 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.centerEt();
      }
    });
    view = Utils.findRequiredView(source, R.id.location_et, "field 'location_et' and method 'locationEt'");
    target.location_et = Utils.castView(view, R.id.location_et, "field 'location_et'", TextView.class);
    view2131230968 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.locationEt();
      }
    });
    view = Utils.findRequiredView(source, R.id.time_et, "field 'time_et' and method 'timeEt'");
    target.time_et = Utils.castView(view, R.id.time_et, "field 'time_et'", TextView.class);
    view2131231210 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.timeEt();
      }
    });
    view = Utils.findRequiredView(source, R.id.search_bt, "method 'searchBt'");
    view2131231127 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.searchBt();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    RideSearchFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.isGoing_bt = null;
    target.isLeaving_bt = null;
    target.isGoing_tv = null;
    target.isLeaving_tv = null;
    target.center_et = null;
    target.location_et = null;
    target.time_et = null;

    view2131231185.setOnClickListener(null);
    view2131231185 = null;
    view2131231187.setOnClickListener(null);
    view2131231187 = null;
    view2131230820.setOnClickListener(null);
    view2131230820 = null;
    view2131230968.setOnClickListener(null);
    view2131230968 = null;
    view2131231210.setOnClickListener(null);
    view2131231210 = null;
    view2131231127.setOnClickListener(null);
    view2131231127 = null;
  }
}
