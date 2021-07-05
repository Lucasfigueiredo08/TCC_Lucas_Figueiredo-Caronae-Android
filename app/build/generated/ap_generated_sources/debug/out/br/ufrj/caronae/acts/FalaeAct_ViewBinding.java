// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.acts;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FalaeAct_ViewBinding implements Unbinder {
  private FalaeAct target;

  private View view2131231142;

  private View view2131230769;

  @UiThread
  public FalaeAct_ViewBinding(FalaeAct target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FalaeAct_ViewBinding(final FalaeAct target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.send_bt, "field 'send_bt' and method 'sendBt'");
    target.send_bt = Utils.castView(view, R.id.send_bt, "field 'send_bt'", TextView.class);
    view2131231142 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.sendBt();
      }
    });
    target.title = Utils.findRequiredViewAsType(source, R.id.activity_back, "field 'title'", TextView.class);
    view = Utils.findRequiredView(source, R.id.back_bt, "method 'backTouch'");
    view2131230769 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.backTouch();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    FalaeAct target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.send_bt = null;
    target.title = null;

    view2131231142.setOnClickListener(null);
    view2131231142 = null;
    view2131230769.setOnClickListener(null);
    view2131230769 = null;
  }
}
