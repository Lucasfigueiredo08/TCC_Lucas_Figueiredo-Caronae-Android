// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.components.gallery;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MediaItemView_ViewBinding implements Unbinder {
  private MediaItemView target;

  @UiThread
  public MediaItemView_ViewBinding(MediaItemView target) {
    this(target, target);
  }

  @UiThread
  public MediaItemView_ViewBinding(MediaItemView target, View source) {
    this.target = target;

    target.mMediaThumb = Utils.findRequiredViewAsType(source, R.id.mMediaThumb, "field 'mMediaThumb'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MediaItemView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mMediaThumb = null;
  }
}
