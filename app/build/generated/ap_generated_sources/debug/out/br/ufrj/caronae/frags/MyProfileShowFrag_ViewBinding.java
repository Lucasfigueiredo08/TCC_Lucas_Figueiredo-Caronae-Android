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

public class MyProfileShowFrag_ViewBinding implements Unbinder {
  private MyProfileShowFrag target;

  private View view2131230975;

  @UiThread
  public MyProfileShowFrag_ViewBinding(final MyProfileShowFrag target, View source) {
    this.target = target;

    View view;
    target.user_pic = Utils.findRequiredViewAsType(source, R.id.user_pic, "field 'user_pic'", ImageView.class);
    target.name_tv = Utils.findRequiredViewAsType(source, R.id.name_tv, "field 'name_tv'", TextView.class);
    target.profile_tv = Utils.findRequiredViewAsType(source, R.id.profile_tv, "field 'profile_tv'", TextView.class);
    target.phone_tv = Utils.findRequiredViewAsType(source, R.id.phone_tv, "field 'phone_tv'", TextView.class);
    target.createdAt_tv = Utils.findRequiredViewAsType(source, R.id.createdAt_tv, "field 'createdAt_tv'", TextView.class);
    target.ridesOffered_tv = Utils.findRequiredViewAsType(source, R.id.ridesOffered_tv, "field 'ridesOffered_tv'", TextView.class);
    target.ridesTaken_tv = Utils.findRequiredViewAsType(source, R.id.ridesTaken_tv, "field 'ridesTaken_tv'", TextView.class);
    target.carPlate_tv = Utils.findRequiredViewAsType(source, R.id.carPlate_tv, "field 'carPlate_tv'", TextView.class);
    target.carModel_tv = Utils.findRequiredViewAsType(source, R.id.carModel_tv, "field 'carModel_tv'", TextView.class);
    target.carColor_tv = Utils.findRequiredViewAsType(source, R.id.carColor_tv, "field 'carColor_tv'", TextView.class);
    view = Utils.findRequiredView(source, R.id.logout_bt, "method 'logoutBt'");
    view2131230975 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.logoutBt();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MyProfileShowFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.user_pic = null;
    target.name_tv = null;
    target.profile_tv = null;
    target.phone_tv = null;
    target.createdAt_tv = null;
    target.ridesOffered_tv = null;
    target.ridesTaken_tv = null;
    target.carPlate_tv = null;
    target.carModel_tv = null;
    target.carColor_tv = null;

    view2131230975.setOnClickListener(null);
    view2131230975 = null;
  }
}
