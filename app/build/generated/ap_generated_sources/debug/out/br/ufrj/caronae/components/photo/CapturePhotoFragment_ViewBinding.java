// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.components.photo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import br.ufrj.caronae.R;
import br.ufrj.caronae.commons.cameraview.CameraView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CapturePhotoFragment_ViewBinding implements Unbinder {
  private CapturePhotoFragment target;

  private View view2131230977;

  private View view2131230980;

  private View view2131230989;

  @UiThread
  public CapturePhotoFragment_ViewBinding(final CapturePhotoFragment target, View source) {
    this.target = target;

    View view;
    target.mCameraPhotoView = Utils.findRequiredViewAsType(source, R.id.mCameraPhotoView, "field 'mCameraPhotoView'", CameraView.class);
    view = Utils.findRequiredView(source, R.id.mBtnTakePhoto, "field 'mBtnTakePhoto' and method 'onTakePhotoClick'");
    target.mBtnTakePhoto = Utils.castView(view, R.id.mBtnTakePhoto, "field 'mBtnTakePhoto'", ImageView.class);
    view2131230977 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTakePhotoClick();
      }
    });
    target.mShutter = Utils.findRequiredView(source, R.id.mShutter, "field 'mShutter'");
    view = Utils.findRequiredView(source, R.id.mFlashPhoto, "field 'mFlashPhoto' and method 'onChangeFlashState'");
    target.mFlashPhoto = Utils.castView(view, R.id.mFlashPhoto, "field 'mFlashPhoto'", ImageView.class);
    view2131230980 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onChangeFlashState();
      }
    });
    view = Utils.findRequiredView(source, R.id.mSwitchCamera, "field 'mSwitchCamera' and method 'onSwitchCamera'");
    target.mSwitchCamera = Utils.castView(view, R.id.mSwitchCamera, "field 'mSwitchCamera'", ImageView.class);
    view2131230989 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSwitchCamera();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    CapturePhotoFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mCameraPhotoView = null;
    target.mBtnTakePhoto = null;
    target.mShutter = null;
    target.mFlashPhoto = null;
    target.mSwitchCamera = null;

    view2131230977.setOnClickListener(null);
    view2131230977 = null;
    view2131230980.setOnClickListener(null);
    view2131230980 = null;
    view2131230989.setOnClickListener(null);
    view2131230989 = null;
  }
}
