package yarnwrap.client.gui.screen;
public class TitleScreen { public net.minecraft.client.gui.screen.TitleScreen wrapperContained; public TitleScreen(net.minecraft.client.gui.screen.TitleScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public long backgroundFadeStart() { return wrapperContained.backgroundFadeStart; }
// public boolean doBackgroundFade() { return wrapperContained.doBackgroundFade; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.client.gui.screen.SplashTextRenderer splashText() { return new yarnwrap.client.gui.screen.SplashTextRenderer(wrapperContained.splashText); }
// public yarnwrap.client.gui.widget.ButtonWidget buttonResetDemo() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.buttonResetDemo); }
// public yarnwrap.client.realms.gui.screen.RealmsNotificationsScreen realmsNotificationGui() { return new yarnwrap.client.realms.gui.screen.RealmsNotificationsScreen(wrapperContained.realmsNotificationGui); }
// public yarnwrap.text.Text COPYRIGHT() { return new yarnwrap.text.Text(wrapperContained.COPYRIGHT); }
// public java.lang.String DEMO_WORLD_NAME() { return wrapperContained.DEMO_WORLD_NAME; }
// public yarnwrap.client.gui.LogoDrawer logoDrawer() { return new yarnwrap.client.gui.LogoDrawer(wrapperContained.logoDrawer); }
// public yarnwrap.text.Text NARRATOR_SCREEN_TITLE() { return new yarnwrap.text.Text(wrapperContained.NARRATOR_SCREEN_TITLE); }
// public float backgroundAlpha() { return wrapperContained.backgroundAlpha; }
public java.util.concurrent.CompletableFuture loadTexturesAsync(yarnwrap.client.texture.TextureManager textureManager,java.util.concurrent.Executor executor) { return wrapperContained.loadTexturesAsync(textureManager.wrapperContained,executor); }
// public void onMultiplayerButtonPressed(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.onMultiplayerButtonPressed(button.wrapperContained); }
// public void onDemoDeletionConfirmed(boolean delete) { wrapperContained.onDemoDeletionConfirmed(delete); }
// public void initWidgetsNormal(int y,int spacingY) { wrapperContained.initWidgetsNormal(y,spacingY); }
// public void initWidgetsDemo(int y,int spacingY) { wrapperContained.initWidgetsDemo(y,spacingY); }
// public boolean isRealmsNotificationsGuiDisplayed() { return wrapperContained.isRealmsNotificationsGuiDisplayed(); }
// public boolean canReadDemoWorldData() { return wrapperContained.canReadDemoWorldData(); }
// public yarnwrap.text.Text getMultiplayerDisabledText() { return new yarnwrap.text.Text(wrapperContained.getMultiplayerDisabledText()); }
// public void setWidgetAlpha(float alpha) { wrapperContained.setWidgetAlpha(alpha); }

}