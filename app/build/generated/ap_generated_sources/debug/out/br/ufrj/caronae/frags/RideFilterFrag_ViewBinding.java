// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.frags;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RideFilterFrag_ViewBinding implements Unbinder {
  private RideFilterFrag target;

  private View view2131230968;

  private View view2131230820;

  private View view2131231127;

  @UiThread
  public RideFilterFrag_ViewBinding(final RideFilterFrag target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.location_et, "field 'location_et' and method 'locationEt'");
    target.location_et = Utils.castView(view, R.id.location_et, "field 'location_et'", EditText.class);
    view2131230968 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.locationEt();
      }
    });
    view = Utils.findRequiredView(source, R.id.center_et, "field 'center_et' and method 'centerEt'");
    target.center_et = Utils.castView(view, R.id.center_et, "field 'center_et'", EditText.class);
    view2131230820 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.centerEt();
      }
    });
    view = Utils.findRequiredView(source, R.id.search_bt, "field 'search_bt' and method 'search'");
    target.search_bt = Utils.castView(view, R.id.search_bt, "field 'search_bt'", Button.class);
    view2131231127 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.search();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    RideFilterFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.location_et = null;
    target.center_et = null;
    target.search_bt = null;

    view2131230968.setOnClickListener(null);
    view2131230968 = null;
    view2131230820.setOnClickListener(null);
    view2131230820 = null;
    view2131231127.setOnClickListener(null);
    view2131231127 = null;
  }
}
