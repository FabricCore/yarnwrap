package yarnwrap.client.gui.screen;
public class DeathScreen { public net.minecraft.client.gui.screen.DeathScreen wrapperContained; public DeathScreen(net.minecraft.client.gui.screen.DeathScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean isHardcore() { return wrapperContained.isHardcore; }
// public void isHardcore(boolean value) { wrapperContained.isHardcore = value; }
// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public void message(yarnwrap.text.Text value) { wrapperContained.message = value.wrapperContained; }
// public int ticksSinceDeath() { return wrapperContained.ticksSinceDeath; }
// public void ticksSinceDeath(int value) { wrapperContained.ticksSinceDeath = value; }
// public yarnwrap.text.Text scoreText() { return new yarnwrap.text.Text(wrapperContained.scoreText); }
// public void scoreText(yarnwrap.text.Text value) { wrapperContained.scoreText = value.wrapperContained; }
// public java.util.List buttons() { return wrapperContained.buttons; }
// public void buttons(java.util.List value) { wrapperContained.buttons = value; }
// public yarnwrap.client.gui.widget.ButtonWidget titleScreenButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.titleScreenButton); }
// public void titleScreenButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.titleScreenButton = value.wrapperContained; }
// public yarnwrap.util.Identifier DRAFT_REPORT_ICON_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.DRAFT_REPORT_ICON_TEXTURE); }
// public void DRAFT_REPORT_ICON_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.DRAFT_REPORT_ICON_TEXTURE = value.wrapperContained; }
public DeathScreen(yarnwrap.text.Text message,boolean isHardcore) { this.wrapperContained = new net.minecraft.client.gui.screen.DeathScreen(message.wrapperContained,isHardcore); }
// public void method_19809(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19809(button.wrapperContained); }
// public yarnwrap.text.Style getTextComponentUnderMouse(int mouseX) { return new yarnwrap.text.Style(wrapperContained.getTextComponentUnderMouse(mouseX)); }
// public void quitLevel() { wrapperContained.quitLevel(); }
// public void method_47938(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_47938(button.wrapperContained); }
// public void method_47939(boolean confirmed) { wrapperContained.method_47939(confirmed); }
// public void onTitleScreenButtonClicked() { wrapperContained.onTitleScreenButtonClicked(); }
// public void setButtonsActive(boolean active) { wrapperContained.setButtonsActive(active); }
// public void fillBackgroundGradient(yarnwrap.client.gui.DrawContext context,int width,int height) { wrapperContained.fillBackgroundGradient(context.wrapperContained,width,height); }

}