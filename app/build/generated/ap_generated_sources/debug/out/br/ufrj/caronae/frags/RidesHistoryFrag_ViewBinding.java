// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.frags;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RidesHistoryFrag_ViewBinding implements Unbinder {
  private RidesHistoryFrag target;

  @UiThread
  public RidesHistoryFrag_ViewBinding(RidesHistoryFrag target, View source) {
    this.target = target;

    target.rvRides = Utils.findRequiredViewAsType(source, R.id.rvRides, "field 'rvRides'", RecyclerView.class);
    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'refreshLayout'", SwipeRefreshLayout.class);
    target.noRides = Utils.findRequiredViewAsType(source, R.id.norides_tv, "field 'noRides'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RidesHistoryFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvRides = null;
    target.refreshLayout = null;
    target.noRides = null;
  }
}
