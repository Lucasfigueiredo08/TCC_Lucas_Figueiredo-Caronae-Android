// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.acts;

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

public class ProfileAct_ViewBinding implements Unbinder {
  private ProfileAct target;

  private View view2131231242;

  private View view2131231083;

  private View view2131230769;

  @UiThread
  public ProfileAct_ViewBinding(ProfileAct target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ProfileAct_ViewBinding(final ProfileAct target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.user_pic_iv, "field 'user_pic_iv' and method 'showProfilePhoto'");
    target.user_pic_iv = Utils.castView(view, R.id.user_pic_iv, "field 'user_pic_iv'", ImageView.class);
    view2131231242 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showProfilePhoto();
      }
    });
    target.phone_icon = Utils.findRequiredViewAsType(source, R.id.phone_icon, "field 'phone_icon'", ImageView.class);
    target.name_tv = Utils.findRequiredViewAsType(source, R.id.name_tv, "field 'name_tv'", TextView.class);
    target.title_tv = Utils.findRequiredViewAsType(source, R.id.title_ride, "field 'title_tv'", TextView.class);
    target.profile_tv = Utils.findRequiredViewAsType(source, R.id.profile_tv, "field 'profile_tv'", TextView.class);
    target.createdAt_tv = Utils.findRequiredViewAsType(source, R.id.createdAt_tv, "field 'createdAt_tv'", TextView.class);
    target.ridesOffered_tv = Utils.findRequiredViewAsType(source, R.id.ridesOffered_tv, "field 'ridesOffered_tv'", TextView.class);
    target.ridesTaken_tv = Utils.findRequiredViewAsType(source, R.id.ridesTaken_tv, "field 'ridesTaken_tv'", TextView.class);
    target.phone_tv = Utils.findRequiredViewAsType(source, R.id.phone_tv, "field 'phone_tv'", TextView.class);
    target.mFriends_tv = Utils.findRequiredViewAsType(source, R.id.mutual_friends_tv, "field 'mFriends_tv'", TextView.class);
    view = Utils.findRequiredView(source, R.id.report_bt, "method 'reportBt'");
    view2131231083 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.reportBt();
      }
    });
    view = Utils.findRequiredView(source, R.id.back_bt, "method 'backToRide'");
    view2131230769 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.backToRide();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ProfileAct target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.user_pic_iv = null;
    target.phone_icon = null;
    target.name_tv = null;
    target.title_tv = null;
    target.profile_tv = null;
    target.createdAt_tv = null;
    target.ridesOffered_tv = null;
    target.ridesTaken_tv = null;
    target.phone_tv = null;
    target.mFriends_tv = null;

    view2131231242.setOnClickListener(null);
    view2131231242 = null;
    view2131231083.setOnClickListener(null);
    view2131231083 = null;
    view2131230769.setOnClickListener(null);
    view2131230769 = null;
  }
}
