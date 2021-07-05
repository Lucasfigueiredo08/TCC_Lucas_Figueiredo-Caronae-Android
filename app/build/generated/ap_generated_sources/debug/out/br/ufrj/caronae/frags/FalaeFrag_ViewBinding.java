// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.frags;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FalaeFrag_ViewBinding implements Unbinder {
  private FalaeFrag target;

  private View view2131231076;

  @UiThread
  public FalaeFrag_ViewBinding(final FalaeFrag target, View source) {
    this.target = target;

    View view;
    target.message_et = Utils.findRequiredViewAsType(source, R.id.message_et, "field 'message_et'", EditText.class);
    view = Utils.findRequiredView(source, R.id.reason_et, "method 'reason_et'");
    view2131231076 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.reason_et();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    FalaeFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.message_et = null;

    view2131231076.setOnClickListener(null);
    view2131231076 = null;
  }
}
