package yarnwrap.client.gui.screen;
public class DeathScreen { public net.minecraft.client.gui.screen.DeathScreen wrapperContained; public DeathScreen(net.minecraft.client.gui.screen.DeathScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean isHardcore() { return wrapperContained.isHardcore; }
// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public int ticksSinceDeath() { return wrapperContained.ticksSinceDeath; }
// public yarnwrap.text.Text scoreText() { return new yarnwrap.text.Text(wrapperContained.scoreText); }
// public java.util.List buttons() { return wrapperContained.buttons; }
// public yarnwrap.client.gui.widget.ButtonWidget titleScreenButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.titleScreenButton); }
// public yarnwrap.util.Identifier DRAFT_REPORT_ICON_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.DRAFT_REPORT_ICON_TEXTURE); }
// public yarnwrap.text.Style getTextComponentUnderMouse(int mouseX) { return new yarnwrap.text.Style(wrapperContained.getTextComponentUnderMouse(mouseX)); }
// public void quitLevel() { wrapperContained.quitLevel(); }
// public void onTitleScreenButtonClicked() { wrapperContained.onTitleScreenButtonClicked(); }
// public void setButtonsActive(boolean active) { wrapperContained.setButtonsActive(active); }
// public void fillBackgroundGradient(yarnwrap.client.gui.DrawContext context,int width,int height) { wrapperContained.fillBackgroundGradient(context.wrapperContained,width,height); }

}