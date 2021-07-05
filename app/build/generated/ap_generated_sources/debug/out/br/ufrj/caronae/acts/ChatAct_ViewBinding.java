// Generated code from Butter Knife. Do not modify!
package br.ufrj.caronae.acts;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import br.ufrj.caronae.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.github.clans.fab.FloatingActionButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatAct_ViewBinding implements Unbinder {
  private ChatAct target;

  private View view2131230769;

  private View view2131231142;

  @UiThread
  public ChatAct_ViewBinding(ChatAct target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChatAct_ViewBinding(final ChatAct target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.back_bt, "field 'backBtn' and method 'backRide'");
    target.backBtn = Utils.castView(view, R.id.back_bt, "field 'backBtn'", RelativeLayout.class);
    view2131230769 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.backRide();
      }
    });
    target.chatMsgs_rv = Utils.findRequiredViewAsType(source, R.id.chatMsgs_rv, "field 'chatMsgs_rv'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.send_bt, "field 'send_bt' and method 'sendBt'");
    target.send_bt = Utils.castView(view, R.id.send_bt, "field 'send_bt'", FloatingActionButton.class);
    view2131231142 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.sendBt();
      }
    });
    target.msg_et = Utils.findRequiredViewAsType(source, R.id.msg_et, "field 'msg_et'", EditText.class);
    target.headerText = Utils.findRequiredViewAsType(source, R.id.chat_header_text, "field 'headerText'", TextView.class);
    target.cardLoadingMessages = Utils.findRequiredViewAsType(source, R.id.card_loading_menssages_sign, "field 'cardLoadingMessages'", CardView.class);
    target.loadMessageText = Utils.findRequiredViewAsType(source, R.id.loading_message_text, "field 'loadMessageText'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChatAct target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.backBtn = null;
    target.chatMsgs_rv = null;
    target.send_bt = null;
    target.msg_et = null;
    target.headerText = null;
    target.cardLoadingMessages = null;
    target.loadMessageText = null;

    view2131230769.setOnClickListener(null);
    view2131230769 = null;
    view2131231142.setOnClickListener(null);
    view2131231142 = null;
  }
}
