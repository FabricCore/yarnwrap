package yarnwrap.client.realms.gui.screen;
public class BuyRealmsScreen { public net.minecraft.client.realms.gui.screen.BuyRealmsScreen wrapperContained; public BuyRealmsScreen(net.minecraft.client.realms.gui.screen.BuyRealmsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List realmsImages() { return wrapperContained.realmsImages; }
// public void realmsImages(java.util.List value) { wrapperContained.realmsImages = value; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public boolean trialAvailable() { return wrapperContained.trialAvailable; }
// public void trialAvailable(boolean value) { wrapperContained.trialAvailable = value; }
// public yarnwrap.client.gui.widget.ButtonWidget trialButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.trialButton); }
// public void trialButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.trialButton = value.wrapperContained; }
// public int realmsImageIndex() { return wrapperContained.realmsImageIndex; }
// public void realmsImageIndex(int value) { wrapperContained.realmsImageIndex = value; }
// public int realmsImageDisplayTime() { return wrapperContained.realmsImageDisplayTime; }
// public void realmsImageDisplayTime(int value) { wrapperContained.realmsImageDisplayTime = value; }
// public yarnwrap.text.Text POPUP_TEXT() { return new yarnwrap.text.Text(wrapperContained.POPUP_TEXT); }
// public void POPUP_TEXT(yarnwrap.text.Text value) { wrapperContained.POPUP_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text CLOSE_TEXT() { return new yarnwrap.text.Text(wrapperContained.CLOSE_TEXT); }
// public void CLOSE_TEXT(yarnwrap.text.Text value) { wrapperContained.CLOSE_TEXT = value.wrapperContained; }
// public yarnwrap.util.Identifier POPUP_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.POPUP_BACKGROUND_TEXTURE); }
// public void POPUP_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.POPUP_BACKGROUND_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier TRIAL_AVAILABLE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TRIAL_AVAILABLE_TEXTURE); }
// public void TRIAL_AVAILABLE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TRIAL_AVAILABLE_TEXTURE = value.wrapperContained; }
// public yarnwrap.client.gui.screen.ButtonTextures CROSS_BUTTON_TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.CROSS_BUTTON_TEXTURES); }
// public void CROSS_BUTTON_TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value) { wrapperContained.CROSS_BUTTON_TEXTURES = value.wrapperContained; }
// public int getLeft() { return wrapperContained.getLeft(); }
// public int getTop() { return wrapperContained.getTop(); }
// public int getRight() { return wrapperContained.getRight(); }
// public int getBottom() { return wrapperContained.getBottom(); }
public void refreshImages(yarnwrap.resource.ResourceManager resourceManager) { wrapperContained.refreshImages(resourceManager.wrapperContained); }
public void drawTrialAvailableTexture(yarnwrap.client.gui.DrawContext context,yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.drawTrialAvailableTexture(context.wrapperContained,button.wrapperContained); }

}