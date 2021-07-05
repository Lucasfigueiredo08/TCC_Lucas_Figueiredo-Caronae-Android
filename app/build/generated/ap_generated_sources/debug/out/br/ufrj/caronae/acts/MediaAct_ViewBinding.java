// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.acts;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import br.ufrj.caronae.R;
import br.ufrj.caronae.commons.ui.ToolbarView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MediaAct_ViewBinding implements Unbinder {
  private MediaAct target;

  @UiThread
  public MediaAct_ViewBinding(MediaAct target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MediaAct_ViewBinding(MediaAct target, View source) {
    this.target = target;

    target.mMainTabLayout = Utils.findRequiredViewAsType(source, R.id.mMainTabLayout, "field 'mMainTabLayout'", TabLayout.class);
    target.mMainViewPager = Utils.findRequiredViewAsType(source, R.id.mMainViewPager, "field 'mMainViewPager'", ViewPager.class);
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.mToolbar, "field 'mToolbar'", ToolbarView.class);

    Context context = source.getContext();
    Resources res = context.getResources();
    target._tabGallery = res.getString(R.string.library);
    target._tabPhoto = res.getString(R.string.photo);
  }

  @Override
  @CallSuper
  public void unbind() {
    MediaAct target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mMainTabLayout = null;
    target.mMainViewPager = null;
    target.mToolbar = null;
  }
}
