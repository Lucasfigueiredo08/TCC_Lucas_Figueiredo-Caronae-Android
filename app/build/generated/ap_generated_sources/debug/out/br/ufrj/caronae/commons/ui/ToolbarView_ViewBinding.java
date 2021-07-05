// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.commons.ui;

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

public class ToolbarView_ViewBinding implements Unbinder {
  private ToolbarView target;

  private View view2131230990;

  private View view2131230982;

  private View view2131230983;

  @UiThread
  public ToolbarView_ViewBinding(ToolbarView target) {
    this(target, target);
  }

  @UiThread
  public ToolbarView_ViewBinding(final ToolbarView target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.mTitle, "field 'mTitle' and method 'onClickTitle'");
    target.mTitle = Utils.castView(view, R.id.mTitle, "field 'mTitle'", TextView.class);
    view2131230990 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickTitle();
      }
    });
    view = Utils.findRequiredView(source, R.id.mIconBack, "field 'mIconBack' and method 'onClickBack'");
    target.mIconBack = Utils.castView(view, R.id.mIconBack, "field 'mIconBack'", TextView.class);
    view2131230982 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickBack();
      }
    });
    view = Utils.findRequiredView(source, R.id.mIconNext, "field 'mIconNext' and method 'onClickNext'");
    target.mIconNext = Utils.castView(view, R.id.mIconNext, "field 'mIconNext'", TextView.class);
    view2131230983 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickNext();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ToolbarView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTitle = null;
    target.mIconBack = null;
    target.mIconNext = null;

    view2131230990.setOnClickListener(null);
    view2131230990 = null;
    view2131230982.setOnClickListener(null);
    view2131230982 = null;
    view2131230983.setOnClickListener(null);
    view2131230983 = null;
  }
}
