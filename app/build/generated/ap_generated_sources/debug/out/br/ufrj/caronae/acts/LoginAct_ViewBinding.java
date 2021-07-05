// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.acts;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginAct_ViewBinding implements Unbinder {
  private LoginAct target;

  private View view2131230972;

  private View view2131231142;

  private View view2131230935;

  @UiThread
  public LoginAct_ViewBinding(LoginAct target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginAct_ViewBinding(final LoginAct target, View source) {
    this.target = target;

    View view;
    target.token_et = Utils.findRequiredViewAsType(source, R.id.token_et, "field 'token_et'", EditText.class);
    target.idUFRJ_et = Utils.findRequiredViewAsType(source, R.id.idUfrj_et, "field 'idUFRJ_et'", EditText.class);
    view = Utils.findRequiredView(source, R.id.login_manually, "field 'loginManually' and method 'toggleLoginMode'");
    target.loginManually = Utils.castView(view, R.id.login_manually, "field 'loginManually'", TextView.class);
    view2131230972 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.toggleLoginMode();
      }
    });
    view = Utils.findRequiredView(source, R.id.send_bt, "field 'loginButton' and method 'startLegacyLogin'");
    target.loginButton = Utils.castView(view, R.id.send_bt, "field 'loginButton'", Button.class);
    view2131231142 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.startLegacyLogin();
      }
    });
    target.backgroundLeft = Utils.findRequiredViewAsType(source, R.id.background_left, "field 'backgroundLeft'", RelativeLayout.class);
    target.backgroundRight = Utils.findRequiredViewAsType(source, R.id.background_right, "field 'backgroundRight'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.institution_login_button, "field 'institutionLoginButton' and method 'openExternalLogin'");
    target.institutionLoginButton = Utils.castView(view, R.id.institution_login_button, "field 'institutionLoginButton'", RelativeLayout.class);
    view2131230935 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openExternalLogin();
      }
    });
    target.onLoading = Utils.findRequiredViewAsType(source, R.id.loading_login, "field 'onLoading'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginAct target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.token_et = null;
    target.idUFRJ_et = null;
    target.loginManually = null;
    target.loginButton = null;
    target.backgroundLeft = null;
    target.backgroundRight = null;
    target.institutionLoginButton = null;
    target.onLoading = null;

    view2131230972.setOnClickListener(null);
    view2131230972 = null;
    view2131231142.setOnClickListener(null);
    view2131231142 = null;
    view2131230935.setOnClickListener(null);
    view2131230935 = null;
  }
}
