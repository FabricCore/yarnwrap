package yarnwrap.client.gui.screen;
public class TitleScreen { public net.minecraft.client.gui.screen.TitleScreen wrapperContained; public TitleScreen(net.minecraft.client.gui.screen.TitleScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public long backgroundFadeStart() { return wrapperContained.backgroundFadeStart; }
// public void backgroundFadeStart(long value) { wrapperContained.backgroundFadeStart = value; }
// public static long backgroundFadeStart() { return net.minecraft.client.gui.screen.TitleScreen.backgroundFadeStart; }
// public static void backgroundFadeStart(long value, ) { net.minecraft.client.gui.screen.TitleScreen.backgroundFadeStart = value; }

// public boolean doBackgroundFade() { return wrapperContained.doBackgroundFade; }
// public void doBackgroundFade(boolean value) { wrapperContained.doBackgroundFade = value; }
// public static boolean doBackgroundFade() { return net.minecraft.client.gui.screen.TitleScreen.doBackgroundFade; }
// public static void doBackgroundFade(boolean value, ) { net.minecraft.client.gui.screen.TitleScreen.doBackgroundFade = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.gui.screen.TitleScreen.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.gui.screen.TitleScreen.LOGGER = value; }

// public yarnwrap.client.gui.screen.SplashTextRenderer splashText() { return new yarnwrap.client.gui.screen.SplashTextRenderer(wrapperContained.splashText); }
// public void splashText(yarnwrap.client.gui.screen.SplashTextRenderer value) { wrapperContained.splashText = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.SplashTextRenderer splashText() { return new yarnwrap.client.gui.screen.SplashTextRenderer(net.minecraft.client.gui.screen.TitleScreen.splashText); }
// public static void splashText(yarnwrap.client.gui.screen.SplashTextRenderer value, ) { net.minecraft.client.gui.screen.TitleScreen.splashText = value.wrapperContained; }

// public yarnwrap.client.gui.widget.ButtonWidget buttonResetDemo() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.buttonResetDemo); }
// public void buttonResetDemo(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.buttonResetDemo = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.ButtonWidget buttonResetDemo() { return new yarnwrap.client.gui.widget.ButtonWidget(net.minecraft.client.gui.screen.TitleScreen.buttonResetDemo); }
// public static void buttonResetDemo(yarnwrap.client.gui.widget.ButtonWidget value, ) { net.minecraft.client.gui.screen.TitleScreen.buttonResetDemo = value.wrapperContained; }

// public yarnwrap.client.realms.gui.screen.RealmsNotificationsScreen realmsNotificationGui() { return new yarnwrap.client.realms.gui.screen.RealmsNotificationsScreen(wrapperContained.realmsNotificationGui); }
// public void realmsNotificationGui(yarnwrap.client.realms.gui.screen.RealmsNotificationsScreen value) { wrapperContained.realmsNotificationGui = value.wrapperContained; }
// public static yarnwrap.client.realms.gui.screen.RealmsNotificationsScreen realmsNotificationGui() { return new yarnwrap.client.realms.gui.screen.RealmsNotificationsScreen(net.minecraft.client.gui.screen.TitleScreen.realmsNotificationGui); }
// public static void realmsNotificationGui(yarnwrap.client.realms.gui.screen.RealmsNotificationsScreen value, ) { net.minecraft.client.gui.screen.TitleScreen.realmsNotificationGui = value.wrapperContained; }

// public yarnwrap.text.Text COPYRIGHT() { return new yarnwrap.text.Text(wrapperContained.COPYRIGHT); }
// public void COPYRIGHT(yarnwrap.text.Text value) { wrapperContained.COPYRIGHT = value.wrapperContained; }
// public static yarnwrap.text.Text COPYRIGHT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.TitleScreen.COPYRIGHT); }
// public static void COPYRIGHT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.TitleScreen.COPYRIGHT = value.wrapperContained; }

// public java.lang.String DEMO_WORLD_NAME() { return wrapperContained.DEMO_WORLD_NAME; }
// public void DEMO_WORLD_NAME(java.lang.String value) { wrapperContained.DEMO_WORLD_NAME = value; }
// public static java.lang.String DEMO_WORLD_NAME() { return net.minecraft.client.gui.screen.TitleScreen.DEMO_WORLD_NAME; }
// public static void DEMO_WORLD_NAME(java.lang.String value, ) { net.minecraft.client.gui.screen.TitleScreen.DEMO_WORLD_NAME = value; }

// public yarnwrap.client.gui.LogoDrawer logoDrawer() { return new yarnwrap.client.gui.LogoDrawer(wrapperContained.logoDrawer); }
// public void logoDrawer(yarnwrap.client.gui.LogoDrawer value) { wrapperContained.logoDrawer = value.wrapperContained; }
// public static yarnwrap.client.gui.LogoDrawer logoDrawer() { return new yarnwrap.client.gui.LogoDrawer(net.minecraft.client.gui.screen.TitleScreen.logoDrawer); }
// public static void logoDrawer(yarnwrap.client.gui.LogoDrawer value, ) { net.minecraft.client.gui.screen.TitleScreen.logoDrawer = value.wrapperContained; }

// public yarnwrap.text.Text NARRATOR_SCREEN_TITLE() { return new yarnwrap.text.Text(wrapperContained.NARRATOR_SCREEN_TITLE); }
// public void NARRATOR_SCREEN_TITLE(yarnwrap.text.Text value) { wrapperContained.NARRATOR_SCREEN_TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text NARRATOR_SCREEN_TITLE() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.TitleScreen.NARRATOR_SCREEN_TITLE); }
// public static void NARRATOR_SCREEN_TITLE(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.TitleScreen.NARRATOR_SCREEN_TITLE = value.wrapperContained; }

// public float backgroundAlpha() { return wrapperContained.backgroundAlpha; }
// public void backgroundAlpha(float value) { wrapperContained.backgroundAlpha = value; }
// public static float backgroundAlpha() { return net.minecraft.client.gui.screen.TitleScreen.backgroundAlpha; }
// public static void backgroundAlpha(float value, ) { net.minecraft.client.gui.screen.TitleScreen.backgroundAlpha = value; }

public TitleScreen(boolean doBackgroundFade) { this.wrapperContained = new net.minecraft.client.gui.screen.TitleScreen(doBackgroundFade); }
public TitleScreen(boolean doBackgroundFade,yarnwrap.client.gui.LogoDrawer logoDrawer) { this.wrapperContained = new net.minecraft.client.gui.screen.TitleScreen(doBackgroundFade,logoDrawer.wrapperContained); }
// public java.util.concurrent.CompletableFuture loadTexturesAsync(yarnwrap.client.texture.TextureManager textureManager,java.util.concurrent.Executor executor) { return wrapperContained.loadTexturesAsync(textureManager.wrapperContained,executor); }
// public static java.util.concurrent.CompletableFuture loadTexturesAsync(yarnwrap.client.texture.TextureManager textureManager,java.util.concurrent.Executor executor, ) { return net.minecraft.client.gui.screen.TitleScreen.loadTexturesAsync(textureManager.wrapperContained,executor); }
// public void method_19857(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19857(button.wrapperContained); }
// public static void method_19857(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.TitleScreen.method_19857(button.wrapperContained); }
// public void method_19858(boolean button) { wrapperContained.method_19858(button); }
// public static void method_19858(boolean button, ) { net.minecraft.client.gui.screen.TitleScreen.method_19858(button); }
// public void onMultiplayerButtonPressed(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.onMultiplayerButtonPressed(button.wrapperContained); }
// public static void onMultiplayerButtonPressed(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.TitleScreen.onMultiplayerButtonPressed(button.wrapperContained); }
// public void method_19861(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19861(button.wrapperContained); }
// public static void method_19861(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.TitleScreen.method_19861(button.wrapperContained); }
// public void method_19862(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19862(button.wrapperContained); }
// public static void method_19862(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.TitleScreen.method_19862(button.wrapperContained); }
// public void method_19863(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19863(button.wrapperContained); }
// public static void method_19863(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.TitleScreen.method_19863(button.wrapperContained); }
// public void method_19864(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19864(button.wrapperContained); }
// public static void method_19864(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.TitleScreen.method_19864(button.wrapperContained); }
// public void method_20109(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_20109(button.wrapperContained); }
// public static void method_20109(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.TitleScreen.method_20109(button.wrapperContained); }
// public void onDemoDeletionConfirmed(boolean delete) { wrapperContained.onDemoDeletionConfirmed(delete); }
// public static void onDemoDeletionConfirmed(boolean delete, ) { net.minecraft.client.gui.screen.TitleScreen.onDemoDeletionConfirmed(delete); }
// public void initWidgetsNormal(int y,int spacingY) { wrapperContained.initWidgetsNormal(y,spacingY); }
// public static void initWidgetsNormal(int y,int spacingY, ) { net.minecraft.client.gui.screen.TitleScreen.initWidgetsNormal(y,spacingY); }
// public void initWidgetsDemo(int y,int spacingY) { wrapperContained.initWidgetsDemo(y,spacingY); }
// public static void initWidgetsDemo(int y,int spacingY, ) { net.minecraft.client.gui.screen.TitleScreen.initWidgetsDemo(y,spacingY); }
// public boolean isRealmsNotificationsGuiDisplayed() { return wrapperContained.isRealmsNotificationsGuiDisplayed(); }
// public static boolean isRealmsNotificationsGuiDisplayed() { return net.minecraft.client.gui.screen.TitleScreen.isRealmsNotificationsGuiDisplayed(); }
// public boolean canReadDemoWorldData() { return wrapperContained.canReadDemoWorldData(); }
// public static boolean canReadDemoWorldData() { return net.minecraft.client.gui.screen.TitleScreen.canReadDemoWorldData(); }
// public void method_41198(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_41198(button.wrapperContained); }
// public static void method_41198(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.TitleScreen.method_41198(button.wrapperContained); }
// public yarnwrap.text.Text getMultiplayerDisabledText() { return new yarnwrap.text.Text(wrapperContained.getMultiplayerDisabledText()); }
// public static yarnwrap.text.Text getMultiplayerDisabledText() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.TitleScreen.getMultiplayerDisabledText()); }
// public void setWidgetAlpha(float alpha) { wrapperContained.setWidgetAlpha(alpha); }
// public static void setWidgetAlpha(float alpha, ) { net.minecraft.client.gui.screen.TitleScreen.setWidgetAlpha(alpha); }

}