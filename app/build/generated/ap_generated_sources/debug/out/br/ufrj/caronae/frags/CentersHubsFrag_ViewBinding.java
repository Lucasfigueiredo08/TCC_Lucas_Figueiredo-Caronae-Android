// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.frags;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CentersHubsFrag_ViewBinding implements Unbinder {
  private CentersHubsFrag target;

  @UiThread
  public CentersHubsFrag_ViewBinding(CentersHubsFrag target, View source) {
    this.target = target;

    target.mainLayout = Utils.findRequiredViewAsType(source, R.id.main_layout, "field 'mainLayout'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CentersHubsFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mainLayout = null;
  }
}
