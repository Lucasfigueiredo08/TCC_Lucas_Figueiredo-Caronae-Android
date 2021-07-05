// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.acts;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RideDetailAct_ViewBinding implements Unbinder {
  private RideDetailAct target;

  private View view2131230798;

  private View view2131230955;

  private View view2131230908;

  private View view2131231080;

  private View view2131230727;

  private View view2131230769;

  @UiThread
  public RideDetailAct_ViewBinding(RideDetailAct target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RideDetailAct_ViewBinding(final RideDetailAct target, View source) {
    this.target = target;

    View view;
    target.user_pic = Utils.findRequiredViewAsType(source, R.id.user_pic, "field 'user_pic'", ImageView.class);
    target.share_ic = Utils.findRequiredViewAsType(source, R.id.share_ic, "field 'share_ic'", ImageView.class);
    target.clock = Utils.findRequiredViewAsType(source, R.id.clock, "field 'clock'", ImageView.class);
    target.phone_ic = Utils.findRequiredViewAsType(source, R.id.phone_icon, "field 'phone_ic'", ImageView.class);
    target.requesterPhoto = Utils.findRequiredViewAsType(source, R.id.requester_photo, "field 'requesterPhoto'", CircleImageView.class);
    target.back_tv = Utils.findRequiredViewAsType(source, R.id.back_title, "field 'back_tv'", TextView.class);
    target.share_tv = Utils.findRequiredViewAsType(source, R.id.share_tv, "field 'share_tv'", TextView.class);
    target.location_dt = Utils.findRequiredViewAsType(source, R.id.location_dt, "field 'location_dt'", TextView.class);
    target.name_dt = Utils.findRequiredViewAsType(source, R.id.name_dt, "field 'name_dt'", TextView.class);
    target.profile_dt = Utils.findRequiredViewAsType(source, R.id.profile_dt, "field 'profile_dt'", TextView.class);
    target.time_dt = Utils.findRequiredViewAsType(source, R.id.time_dt, "field 'time_dt'", TextView.class);
    target.way_dt = Utils.findRequiredViewAsType(source, R.id.way_dt, "field 'way_dt'", TextView.class);
    target.place_dt = Utils.findRequiredViewAsType(source, R.id.place_dt, "field 'place_dt'", TextView.class);
    target.description_dt = Utils.findRequiredViewAsType(source, R.id.description_dt, "field 'description_dt'", TextView.class);
    target.mFriends_tv = Utils.findRequiredViewAsType(source, R.id.mutual_friends_tv, "field 'mFriends_tv'", TextView.class);
    view = Utils.findRequiredView(source, R.id.cancel_ride, "field 'cancelRide_bt' and method 'cancelRide'");
    target.cancelRide_bt = Utils.castView(view, R.id.cancel_ride, "field 'cancelRide_bt'", TextView.class);
    view2131230798 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.cancelRide();
      }
    });
    view = Utils.findRequiredView(source, R.id.leave_ride, "field 'leaveRide_bt' and method 'leavingRide'");
    target.leaveRide_bt = Utils.castView(view, R.id.leave_ride, "field 'leaveRide_bt'", TextView.class);
    view2131230955 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.leavingRide();
      }
    });
    target.chat_bt = Utils.findRequiredViewAsType(source, R.id.chat_bt, "field 'chat_bt'", TextView.class);
    target.plate_tv = Utils.findRequiredViewAsType(source, R.id.plate_tv, "field 'plate_tv'", TextView.class);
    target.carModel_tv = Utils.findRequiredViewAsType(source, R.id.car_model_tv, "field 'carModel_tv'", TextView.class);
    target.carColor_tv = Utils.findRequiredViewAsType(source, R.id.car_color_tv, "field 'carColor_tv'", TextView.class);
    target.noRiders = Utils.findRequiredViewAsType(source, R.id.no_riders, "field 'noRiders'", TextView.class);
    target.accept_tv = Utils.findRequiredViewAsType(source, R.id.accept_tv, "field 'accept_tv'", TextView.class);
    target.requesterName = Utils.findRequiredViewAsType(source, R.id.requester_name, "field 'requesterName'", TextView.class);
    target.requesterStatus = Utils.findRequiredViewAsType(source, R.id.requester_status, "field 'requesterStatus'", TextView.class);
    target.phone_tv = Utils.findRequiredViewAsType(source, R.id.phone_tv, "field 'phone_tv'", TextView.class);
    target.join_bt = Utils.findRequiredViewAsType(source, R.id.join_bt, "field 'join_bt'", Button.class);
    view = Utils.findRequiredView(source, R.id.finish_bt, "field 'finish_bt' and method 'fButton'");
    target.finish_bt = Utils.castView(view, R.id.finish_bt, "field 'finish_bt'", Button.class);
    view2131230908 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.fButton();
      }
    });
    target.requested_dt = Utils.findRequiredViewAsType(source, R.id.requested_dt, "field 'requested_dt'", Button.class);
    target.joinLayout = Utils.findRequiredViewAsType(source, R.id.can_join, "field 'joinLayout'", RelativeLayout.class);
    target.shareButton = Utils.findRequiredViewAsType(source, R.id.share_bt, "field 'shareButton'", RelativeLayout.class);
    target.locationBackground = Utils.findRequiredViewAsType(source, R.id.title_lay, "field 'locationBackground'", RelativeLayout.class);
    target.carDetails = Utils.findRequiredViewAsType(source, R.id.car_detail, "field 'carDetails'", RelativeLayout.class);
    target.ridersLayout = Utils.findRequiredViewAsType(source, R.id.riders_layout, "field 'ridersLayout'", RelativeLayout.class);
    target.inviteLay = Utils.findRequiredViewAsType(source, R.id.invite_lay, "field 'inviteLay'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.remove_request, "field 'removeRequest' and method 'rRequest'");
    target.removeRequest = Utils.castView(view, R.id.remove_request, "field 'removeRequest'", RelativeLayout.class);
    view2131231080 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.rRequest();
      }
    });
    view = Utils.findRequiredView(source, R.id.accept_request, "field 'acceptRequest' and method 'aRequest'");
    target.acceptRequest = Utils.castView(view, R.id.accept_request, "field 'acceptRequest'", RelativeLayout.class);
    view2131230727 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.aRequest();
      }
    });
    target.requestLay = Utils.findRequiredViewAsType(source, R.id.request, "field 'requestLay'", RelativeLayout.class);
    target.canFinishLay = Utils.findRequiredViewAsType(source, R.id.can_finish, "field 'canFinishLay'", RelativeLayout.class);
    target.ridersProfile = Utils.findRequiredViewAsType(source, R.id.riders_profile, "field 'ridersProfile'", LinearLayout.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.loading_in_progress, "field 'progressBar'", ProgressBar.class);
    view = Utils.findRequiredView(source, R.id.back_bt, "method 'backToMain'");
    view2131230769 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.backToMain();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    RideDetailAct target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.user_pic = null;
    target.share_ic = null;
    target.clock = null;
    target.phone_ic = null;
    target.requesterPhoto = null;
    target.back_tv = null;
    target.share_tv = null;
    target.location_dt = null;
    target.name_dt = null;
    target.profile_dt = null;
    target.time_dt = null;
    target.way_dt = null;
    target.place_dt = null;
    target.description_dt = null;
    target.mFriends_tv = null;
    target.cancelRide_bt = null;
    target.leaveRide_bt = null;
    target.chat_bt = null;
    target.plate_tv = null;
    target.carModel_tv = null;
    target.carColor_tv = null;
    target.noRiders = null;
    target.accept_tv = null;
    target.requesterName = null;
    target.requesterStatus = null;
    target.phone_tv = null;
    target.join_bt = null;
    target.finish_bt = null;
    target.requested_dt = null;
    target.joinLayout = null;
    target.shareButton = null;
    target.locationBackground = null;
    target.carDetails = null;
    target.ridersLayout = null;
    target.inviteLay = null;
    target.removeRequest = null;
    target.acceptRequest = null;
    target.requestLay = null;
    target.canFinishLay = null;
    target.ridersProfile = null;
    target.progressBar = null;

    view2131230798.setOnClickListener(null);
    view2131230798 = null;
    view2131230955.setOnClickListener(null);
    view2131230955 = null;
    view2131230908.setOnClickListener(null);
    view2131230908 = null;
    view2131231080.setOnClickListener(null);
    view2131231080 = null;
    view2131230727.setOnClickListener(null);
    view2131230727 = null;
    view2131230769.setOnClickListener(null);
    view2131230769 = null;
  }
}
