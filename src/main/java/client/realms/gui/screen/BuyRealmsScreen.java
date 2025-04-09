package yarnwrap.client.realms.gui.screen;
public class BuyRealmsScreen { public net.minecraft.client.realms.gui.screen.BuyRealmsScreen wrapperContained; public BuyRealmsScreen(net.minecraft.client.realms.gui.screen.BuyRealmsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List realmsImages() { return wrapperContained.realmsImages; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public boolean trialAvailable() { return wrapperContained.trialAvailable; }
// public yarnwrap.client.gui.widget.ButtonWidget trialButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.trialButton); }
// public int realmsImageIndex() { return wrapperContained.realmsImageIndex; }
// public int realmsImageDisplayTime() { return wrapperContained.realmsImageDisplayTime; }
// public yarnwrap.text.Text POPUP_TEXT() { return new yarnwrap.text.Text(wrapperContained.POPUP_TEXT); }
// public yarnwrap.text.Text CLOSE_TEXT() { return new yarnwrap.text.Text(wrapperContained.CLOSE_TEXT); }
// public yarnwrap.util.Identifier POPUP_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.POPUP_BACKGROUND_TEXTURE); }
// public yarnwrap.util.Identifier TRIAL_AVAILABLE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TRIAL_AVAILABLE_TEXTURE); }
// public yarnwrap.client.gui.screen.ButtonTextures CROSS_BUTTON_TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.CROSS_BUTTON_TEXTURES); }
// public int getLeft() { return wrapperContained.getLeft(); }
// public int getTop() { return wrapperContained.getTop(); }
// public int getRight() { return wrapperContained.getRight(); }
// public int getBottom() { return wrapperContained.getBottom(); }
public void refreshImages(yarnwrap.resource.ResourceManager resourceManager) { wrapperContained.refreshImages(resourceManager.wrapperContained); }
public void drawTrialAvailableTexture(yarnwrap.client.gui.DrawContext context,yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.drawTrialAvailableTexture(context.wrapperContained,button.wrapperContained); }

}