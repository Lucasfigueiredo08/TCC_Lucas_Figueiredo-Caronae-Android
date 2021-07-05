// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.acts;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MenuOptionsAct_ViewBinding implements Unbinder {
  private MenuOptionsAct target;

  private View view2131230769;

  @UiThread
  public MenuOptionsAct_ViewBinding(MenuOptionsAct target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MenuOptionsAct_ViewBinding(final MenuOptionsAct target, View source) {
    this.target = target;

    View view;
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
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131230769.setOnClickListener(null);
    view2131230769 = null;
  }
}
