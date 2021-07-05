// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.frags;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OptionsMenuFrag_ViewBinding implements Unbinder {
  private OptionsMenuFrag target;

  private View view2131231241;

  private View view2131231012;

  private View view2131230923;

  private View view2131230898;

  private View view2131230897;

  private View view2131231194;

  private View view2131230726;

  @UiThread
  public OptionsMenuFrag_ViewBinding(final OptionsMenuFrag target, View source) {
    this.target = target;

    View view;
    target.name_tv = Utils.findRequiredViewAsType(source, R.id.name_tv, "field 'name_tv'", TextView.class);
    target.profile_tv = Utils.findRequiredViewAsType(source, R.id.profile_tv, "field 'profile_tv'", TextView.class);
    view = Utils.findRequiredView(source, R.id.user_pic, "field 'user_pic' and method 'clickProfileImage'");
    target.user_pic = Utils.castView(view, R.id.user_pic, "field 'user_pic'", ImageView.class);
    view2131231241 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickProfileImage();
      }
    });
    view = Utils.findRequiredView(source, R.id.myprofile_btn, "field 'myProfile_btn' and method 'openMyProfile'");
    target.myProfile_btn = Utils.castView(view, R.id.myprofile_btn, "field 'myProfile_btn'", TextView.class);
    view2131231012 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openMyProfile();
      }
    });
    view = Utils.findRequiredView(source, R.id.history_btn, "field 'history_btn' and method 'openHistory'");
    target.history_btn = Utils.castView(view, R.id.history_btn, "field 'history_btn'", TextView.class);
    view2131230923 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openHistory();
      }
    });
    view = Utils.findRequiredView(source, R.id.faq_btn, "field 'faq_btn' and method 'openFAQ'");
    target.faq_btn = Utils.castView(view, R.id.faq_btn, "field 'faq_btn'", TextView.class);
    view2131230898 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openFAQ();
      }
    });
    view = Utils.findRequiredView(source, R.id.falae_btn, "field 'falae_btn' and method 'openFalae'");
    target.falae_btn = Utils.castView(view, R.id.falae_btn, "field 'falae_btn'", TextView.class);
    view2131230897 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openFalae();
      }
    });
    view = Utils.findRequiredView(source, R.id.termsofuse_btn, "field 'termsOfUse_btn' and method 'openTermsOfUse'");
    target.termsOfUse_btn = Utils.castView(view, R.id.termsofuse_btn, "field 'termsOfUse_btn'", TextView.class);
    view2131231194 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openTermsOfUse();
      }
    });
    view = Utils.findRequiredView(source, R.id.about_btn, "field 'about_btn' and method 'openAbout'");
    target.about_btn = Utils.castView(view, R.id.about_btn, "field 'about_btn'", TextView.class);
    view2131230726 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openAbout();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    OptionsMenuFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.name_tv = null;
    target.profile_tv = null;
    target.user_pic = null;
    target.myProfile_btn = null;
    target.history_btn = null;
    target.faq_btn = null;
    target.falae_btn = null;
    target.termsOfUse_btn = null;
    target.about_btn = null;

    view2131231241.setOnClickListener(null);
    view2131231241 = null;
    view2131231012.setOnClickListener(null);
    view2131231012 = null;
    view2131230923.setOnClickListener(null);
    view2131230923 = null;
    view2131230898.setOnClickListener(null);
    view2131230898 = null;
    view2131230897.setOnClickListener(null);
    view2131230897 = null;
    view2131231194.setOnClickListener(null);
    view2131231194 = null;
    view2131230726.setOnClickListener(null);
    view2131230726 = null;
  }
}
