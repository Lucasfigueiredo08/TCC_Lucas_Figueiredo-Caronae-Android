// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.acts;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyProfileAct_ViewBinding implements Unbinder {
  private MyProfileAct target;

  private View view2131230884;

  private View view2131230769;

  private View view2131230794;

  @UiThread
  public MyProfileAct_ViewBinding(MyProfileAct target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyProfileAct_ViewBinding(final MyProfileAct target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.edit_bt, "field 'edit_bt' and method 'onTouchEditButton'");
    target.edit_bt = Utils.castView(view, R.id.edit_bt, "field 'edit_bt'", TextView.class);
    view2131230884 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTouchEditButton();
      }
    });
    view = Utils.findRequiredView(source, R.id.back_bt, "field 'back' and method 'backMenuTouch'");
    target.back = Utils.castView(view, R.id.back_bt, "field 'back'", RelativeLayout.class);
    view2131230769 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.backMenuTouch();
      }
    });
    view = Utils.findRequiredView(source, R.id.cancel_bt, "field 'cancel' and method 'backCancelTouch'");
    target.cancel = Utils.castView(view, R.id.cancel_bt, "field 'cancel'", RelativeLayout.class);
    view2131230794 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.backCancelTouch();
      }
    });
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progress_bar, "field 'progressBar'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyProfileAct target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.edit_bt = null;
    target.back = null;
    target.cancel = null;
    target.progressBar = null;

    view2131230884.setOnClickListener(null);
    view2131230884 = null;
    view2131230769.setOnClickListener(null);
    view2131230769 = null;
    view2131230794.setOnClickListener(null);
    view2131230794 = null;
  }
}
