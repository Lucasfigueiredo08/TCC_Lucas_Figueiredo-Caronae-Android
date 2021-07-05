// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.frags;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.facebook.login.widget.LoginButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyProfileEditFrag_ViewBinding implements Unbinder {
  private MyProfileEditFrag target;

  private View view2131230824;

  private View view2131230968;

  private View view2131230804;

  @UiThread
  public MyProfileEditFrag_ViewBinding(final MyProfileEditFrag target, View source) {
    this.target = target;

    View view;
    target.name_tv = Utils.findRequiredViewAsType(source, R.id.name_tv, "field 'name_tv'", TextView.class);
    target.profile_tv = Utils.findRequiredViewAsType(source, R.id.profile_tv, "field 'profile_tv'", TextView.class);
    target.createdAt_tv = Utils.findRequiredViewAsType(source, R.id.createdAt_tv, "field 'createdAt_tv'", TextView.class);
    view = Utils.findRequiredView(source, R.id.changePhotoText, "field 'changePhoto' and method 'userPic'");
    target.changePhoto = Utils.castView(view, R.id.changePhotoText, "field 'changePhoto'", TextView.class);
    view2131230824 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.userPic();
      }
    });
    target.ridesOffered_tv = Utils.findRequiredViewAsType(source, R.id.ridesOffered_tv, "field 'ridesOffered_tv'", TextView.class);
    target.ridesTaken_tv = Utils.findRequiredViewAsType(source, R.id.ridesTaken_tv, "field 'ridesTaken_tv'", TextView.class);
    target.email_et = Utils.findRequiredViewAsType(source, R.id.email_et, "field 'email_et'", EditText.class);
    target.phoneNumber_et = Utils.findRequiredViewAsType(source, R.id.phoneNumber_et, "field 'phoneNumber_et'", EditText.class);
    view = Utils.findRequiredView(source, R.id.location_et, "field 'location_et' and method 'locationEt'");
    target.location_et = Utils.castView(view, R.id.location_et, "field 'location_et'", EditText.class);
    view2131230968 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.locationEt();
      }
    });
    target.carModel_et = Utils.findRequiredViewAsType(source, R.id.carModel_et, "field 'carModel_et'", EditText.class);
    target.carColor_et = Utils.findRequiredViewAsType(source, R.id.carColor_et, "field 'carColor_et'", EditText.class);
    target.carPlate_et = Utils.findRequiredViewAsType(source, R.id.carPlate_et, "field 'carPlate_et'", EditText.class);
    view = Utils.findRequiredView(source, R.id.carOwner_sw, "field 'carOwner_sw' and method 'carOwnerSw'");
    target.carOwner_sw = Utils.castView(view, R.id.carOwner_sw, "field 'carOwner_sw'", SwitchCompat.class);
    view2131230804 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.carOwnerSw();
      }
    });
    target.car_lay = Utils.findRequiredViewAsType(source, R.id.car_lay, "field 'car_lay'", RelativeLayout.class);
    target.loginButton = Utils.findRequiredViewAsType(source, R.id.login_button, "field 'loginButton'", LoginButton.class);
    target.user_pic = Utils.findRequiredViewAsType(source, R.id.user_pic, "field 'user_pic'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyProfileEditFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.name_tv = null;
    target.profile_tv = null;
    target.createdAt_tv = null;
    target.changePhoto = null;
    target.ridesOffered_tv = null;
    target.ridesTaken_tv = null;
    target.email_et = null;
    target.phoneNumber_et = null;
    target.location_et = null;
    target.carModel_et = null;
    target.carColor_et = null;
    target.carPlate_et = null;
    target.carOwner_sw = null;
    target.car_lay = null;
    target.loginButton = null;
    target.user_pic = null;

    view2131230824.setOnClickListener(null);
    view2131230824 = null;
    view2131230968.setOnClickListener(null);
    view2131230968 = null;
    view2131230804.setOnClickListener(null);
    view2131230804 = null;
  }
}
