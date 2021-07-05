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

public class WelcomeAct_ViewBinding implements Unbinder {
  private WelcomeAct target;

  private View view2131230853;

  @UiThread
  public WelcomeAct_ViewBinding(WelcomeAct target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WelcomeAct_ViewBinding(final WelcomeAct target, View source) {
    this.target = target;

    View view;
    target.welcometv = Utils.findRequiredViewAsType(source, R.id.welcome_title, "field 'welcometv'", TextView.class);
    view = Utils.findRequiredView(source, R.id.continue_bt, "method 'goToProfile'");
    view2131230853 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.goToProfile();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    WelcomeAct target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.welcometv = null;

    view2131230853.setOnClickListener(null);
    view2131230853 = null;
  }
}
