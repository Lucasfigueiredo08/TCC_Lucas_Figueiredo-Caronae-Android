// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.frags;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AllRidesFrag_ViewBinding implements Unbinder {
  private AllRidesFrag target;

  private View view2131231185;

  private View view2131231187;

  @UiThread
  public AllRidesFrag_ViewBinding(final AllRidesFrag target, View source) {
    this.target = target;

    View view;
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewpager, "field 'viewPager'", ViewPager.class);
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
  }

  @Override
  @CallSuper
  public void unbind() {
    AllRidesFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.viewPager = null;
    target.isGoing_bt = null;
    target.isLeaving_bt = null;
    target.isGoing_tv = null;
    target.isLeaving_tv = null;

    view2131231185.setOnClickListener(null);
    view2131231185 = null;
    view2131231187.setOnClickListener(null);
    view2131231187 = null;
  }
}
