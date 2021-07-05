// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.components.gallery;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GalleryPickerFragment_ViewBinding implements Unbinder {
  private GalleryPickerFragment target;

  @UiThread
  public GalleryPickerFragment_ViewBinding(GalleryPickerFragment target, View source) {
    this.target = target;

    target.mGalleryRecyclerView = Utils.findRequiredViewAsType(source, R.id.mGalleryRecyclerView, "field 'mGalleryRecyclerView'", RecyclerView.class);
    target.mPreview = Utils.findRequiredViewAsType(source, R.id.mPreview, "field 'mPreview'", ImageView.class);
    target.mAppBarContainer = Utils.findRequiredViewAsType(source, R.id.mAppBarContainer, "field 'mAppBarContainer'", AppBarLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GalleryPickerFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mGalleryRecyclerView = null;
    target.mPreview = null;
    target.mAppBarContainer = null;
  }
}
