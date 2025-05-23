package yarnwrap.client.option;
public class GameOptions { public net.minecraft.client.option.GameOptions wrapperContained; public GameOptions(net.minecraft.client.option.GameOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.option.SimpleOption cloudRenderMode() { return new yarnwrap.client.option.SimpleOption(wrapperContained.cloudRenderMode); }
// public void cloudRenderMode(yarnwrap.client.option.SimpleOption value) { wrapperContained.cloudRenderMode = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption cloudRenderMode() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.cloudRenderMode); }
// public static void cloudRenderMode(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.cloudRenderMode = value.wrapperContained; }

public boolean hideServerAddress() { return wrapperContained.hideServerAddress; }
public void hideServerAddress(boolean value) { wrapperContained.hideServerAddress = value; }
// public static boolean hideServerAddress() { return net.minecraft.client.option.GameOptions.hideServerAddress; }
// public static void hideServerAddress(boolean value, ) { net.minecraft.client.option.GameOptions.hideServerAddress = value; }

public yarnwrap.client.option.KeyBinding smoothCameraKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.smoothCameraKey); }
// public void smoothCameraKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.smoothCameraKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding smoothCameraKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.smoothCameraKey); }
// public static void smoothCameraKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.smoothCameraKey = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption chatLinksPrompt() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatLinksPrompt); }
// public void chatLinksPrompt(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatLinksPrompt = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption chatLinksPrompt() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.chatLinksPrompt); }
// public static void chatLinksPrompt(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.chatLinksPrompt = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption showSubtitles() { return new yarnwrap.client.option.SimpleOption(wrapperContained.showSubtitles); }
// public void showSubtitles(yarnwrap.client.option.SimpleOption value) { wrapperContained.showSubtitles = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption showSubtitles() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.showSubtitles); }
// public static void showSubtitles(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.showSubtitles = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption forceUnicodeFont() { return new yarnwrap.client.option.SimpleOption(wrapperContained.forceUnicodeFont); }
// public void forceUnicodeFont(yarnwrap.client.option.SimpleOption value) { wrapperContained.forceUnicodeFont = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption forceUnicodeFont() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.forceUnicodeFont); }
// public static void forceUnicodeFont(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.forceUnicodeFont = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption chatOpacity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatOpacity); }
// public void chatOpacity(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatOpacity = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption chatOpacity() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.chatOpacity); }
// public static void chatOpacity(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.chatOpacity = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding inventoryKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.inventoryKey); }
// public void inventoryKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.inventoryKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding inventoryKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.inventoryKey); }
// public static void inventoryKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.inventoryKey = value.wrapperContained; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public static com.google.gson.Gson GSON() { return net.minecraft.client.option.GameOptions.GSON; }
// public static void GSON(com.google.gson.Gson value, ) { net.minecraft.client.option.GameOptions.GSON = value; }

public yarnwrap.client.option.KeyBinding togglePerspectiveKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.togglePerspectiveKey); }
// public void togglePerspectiveKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.togglePerspectiveKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding togglePerspectiveKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.togglePerspectiveKey); }
// public static void togglePerspectiveKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.togglePerspectiveKey = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption chatHeightUnfocused() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatHeightUnfocused); }
// public void chatHeightUnfocused(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatHeightUnfocused = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption chatHeightUnfocused() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.chatHeightUnfocused); }
// public static void chatHeightUnfocused(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.chatHeightUnfocused = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption fov() { return new yarnwrap.client.option.SimpleOption(wrapperContained.fov); }
// public void fov(yarnwrap.client.option.SimpleOption value) { wrapperContained.fov = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption fov() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.fov); }
// public static void fov(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.fov = value.wrapperContained; }

public boolean advancedItemTooltips() { return wrapperContained.advancedItemTooltips; }
public void advancedItemTooltips(boolean value) { wrapperContained.advancedItemTooltips = value; }
// public static boolean advancedItemTooltips() { return net.minecraft.client.option.GameOptions.advancedItemTooltips; }
// public static void advancedItemTooltips(boolean value, ) { net.minecraft.client.option.GameOptions.advancedItemTooltips = value; }

public java.lang.String fullscreenResolution() { return wrapperContained.fullscreenResolution; }
public void fullscreenResolution(java.lang.String value) { wrapperContained.fullscreenResolution = value; }
// public static java.lang.String fullscreenResolution() { return net.minecraft.client.option.GameOptions.fullscreenResolution; }
// public static void fullscreenResolution(java.lang.String value, ) { net.minecraft.client.option.GameOptions.fullscreenResolution = value; }

// public yarnwrap.client.option.SimpleOption mainArm() { return new yarnwrap.client.option.SimpleOption(wrapperContained.mainArm); }
// public void mainArm(yarnwrap.client.option.SimpleOption value) { wrapperContained.mainArm = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption mainArm() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.mainArm); }
// public static void mainArm(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.mainArm = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption realmsNotifications() { return new yarnwrap.client.option.SimpleOption(wrapperContained.realmsNotifications); }
// public void realmsNotifications(yarnwrap.client.option.SimpleOption value) { wrapperContained.realmsNotifications = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption realmsNotifications() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.realmsNotifications); }
// public static void realmsNotifications(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.realmsNotifications = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding swapHandsKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.swapHandsKey); }
// public void swapHandsKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.swapHandsKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding swapHandsKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.swapHandsKey); }
// public static void swapHandsKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.swapHandsKey = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding sneakKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.sneakKey); }
// public void sneakKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.sneakKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding sneakKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.sneakKey); }
// public static void sneakKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.sneakKey = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.option.GameOptions.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.option.GameOptions.LOGGER = value; }

public yarnwrap.client.option.KeyBinding screenshotKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.screenshotKey); }
// public void screenshotKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.screenshotKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding screenshotKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.screenshotKey); }
// public static void screenshotKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.screenshotKey = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding fullscreenKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.fullscreenKey); }
// public void fullscreenKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.fullscreenKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding fullscreenKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.fullscreenKey); }
// public static void fullscreenKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.fullscreenKey = value.wrapperContained; }

public boolean pauseOnLostFocus() { return wrapperContained.pauseOnLostFocus; }
public void pauseOnLostFocus(boolean value) { wrapperContained.pauseOnLostFocus = value; }
// public static boolean pauseOnLostFocus() { return net.minecraft.client.option.GameOptions.pauseOnLostFocus; }
// public static void pauseOnLostFocus(boolean value, ) { net.minecraft.client.option.GameOptions.pauseOnLostFocus = value; }

// public yarnwrap.client.option.SimpleOption chatHeightFocused() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatHeightFocused); }
// public void chatHeightFocused(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatHeightFocused = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption chatHeightFocused() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.chatHeightFocused); }
// public static void chatHeightFocused(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.chatHeightFocused = value.wrapperContained; }

public net.minecraft.client.option.KeyBinding[] allKeys() { return wrapperContained.allKeys; }
// public void allKeys(net.minecraft.client.option.KeyBinding[] value) { wrapperContained.allKeys = value; }
// public static net.minecraft.client.option.KeyBinding[] allKeys() { return net.minecraft.client.option.GameOptions.allKeys; }
// public static void allKeys(net.minecraft.client.option.KeyBinding[] value, ) { net.minecraft.client.option.GameOptions.allKeys = value; }

// public yarnwrap.client.option.SimpleOption gamma() { return new yarnwrap.client.option.SimpleOption(wrapperContained.gamma); }
// public void gamma(yarnwrap.client.option.SimpleOption value) { wrapperContained.gamma = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption gamma() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.gamma); }
// public static void gamma(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.gamma = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption ao() { return new yarnwrap.client.option.SimpleOption(wrapperContained.ao); }
// public void ao(yarnwrap.client.option.SimpleOption value) { wrapperContained.ao = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption ao() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.ao); }
// public static void ao(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.ao = value.wrapperContained; }

public boolean hudHidden() { return wrapperContained.hudHidden; }
public void hudHidden(boolean value) { wrapperContained.hudHidden = value; }
// public static boolean hudHidden() { return net.minecraft.client.option.GameOptions.hudHidden; }
// public static void hudHidden(boolean value, ) { net.minecraft.client.option.GameOptions.hudHidden = value; }

// public yarnwrap.client.option.SimpleOption mouseSensitivity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.mouseSensitivity); }
// public void mouseSensitivity(yarnwrap.client.option.SimpleOption value) { wrapperContained.mouseSensitivity = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption mouseSensitivity() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.mouseSensitivity); }
// public static void mouseSensitivity(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.mouseSensitivity = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding advancementsKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.advancementsKey); }
// public void advancementsKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.advancementsKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding advancementsKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.advancementsKey); }
// public static void advancementsKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.advancementsKey = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding commandKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.commandKey); }
// public void commandKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.commandKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding commandKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.commandKey); }
// public static void commandKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.commandKey = value.wrapperContained; }

public java.util.List incompatibleResourcePacks() { return wrapperContained.incompatibleResourcePacks; }
public void incompatibleResourcePacks(java.util.List value) { wrapperContained.incompatibleResourcePacks = value; }
// public static java.util.List incompatibleResourcePacks() { return net.minecraft.client.option.GameOptions.incompatibleResourcePacks; }
// public static void incompatibleResourcePacks(java.util.List value, ) { net.minecraft.client.option.GameOptions.incompatibleResourcePacks = value; }

// public yarnwrap.client.option.SimpleOption autoJump() { return new yarnwrap.client.option.SimpleOption(wrapperContained.autoJump); }
// public void autoJump(yarnwrap.client.option.SimpleOption value) { wrapperContained.autoJump = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption autoJump() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.autoJump); }
// public static void autoJump(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.autoJump = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding rightKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.rightKey); }
// public void rightKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.rightKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding rightKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.rightKey); }
// public static void rightKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.rightKey = value.wrapperContained; }

public net.minecraft.client.option.KeyBinding[] hotbarKeys() { return wrapperContained.hotbarKeys; }
// public void hotbarKeys(net.minecraft.client.option.KeyBinding[] value) { wrapperContained.hotbarKeys = value; }
// public static net.minecraft.client.option.KeyBinding[] hotbarKeys() { return net.minecraft.client.option.GameOptions.hotbarKeys; }
// public static void hotbarKeys(net.minecraft.client.option.KeyBinding[] value, ) { net.minecraft.client.option.GameOptions.hotbarKeys = value; }

// public com.google.common.base.Splitter COLON_SPLITTER() { return wrapperContained.COLON_SPLITTER; }
// public void COLON_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.COLON_SPLITTER = value; }
// public static com.google.common.base.Splitter COLON_SPLITTER() { return net.minecraft.client.option.GameOptions.COLON_SPLITTER; }
// public static void COLON_SPLITTER(com.google.common.base.Splitter value, ) { net.minecraft.client.option.GameOptions.COLON_SPLITTER = value; }

// public yarnwrap.client.option.SimpleOption touchscreen() { return new yarnwrap.client.option.SimpleOption(wrapperContained.touchscreen); }
// public void touchscreen(yarnwrap.client.option.SimpleOption value) { wrapperContained.touchscreen = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption touchscreen() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.touchscreen); }
// public static void touchscreen(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.touchscreen = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption mipmapLevels() { return new yarnwrap.client.option.SimpleOption(wrapperContained.mipmapLevels); }
// public void mipmapLevels(yarnwrap.client.option.SimpleOption value) { wrapperContained.mipmapLevels = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption mipmapLevels() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.mipmapLevels); }
// public static void mipmapLevels(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.mipmapLevels = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption fullscreen() { return new yarnwrap.client.option.SimpleOption(wrapperContained.fullscreen); }
// public void fullscreen(yarnwrap.client.option.SimpleOption value) { wrapperContained.fullscreen = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption fullscreen() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.fullscreen); }
// public static void fullscreen(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.fullscreen = value.wrapperContained; }

// public com.google.gson.reflect.TypeToken STRING_LIST_TYPE() { return wrapperContained.STRING_LIST_TYPE; }
// public void STRING_LIST_TYPE(com.google.gson.reflect.TypeToken value) { wrapperContained.STRING_LIST_TYPE = value; }
// public static com.google.gson.reflect.TypeToken STRING_LIST_TYPE() { return net.minecraft.client.option.GameOptions.STRING_LIST_TYPE; }
// public static void STRING_LIST_TYPE(com.google.gson.reflect.TypeToken value, ) { net.minecraft.client.option.GameOptions.STRING_LIST_TYPE = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.option.GameOptions.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.option.GameOptions.client = value.wrapperContained; }

public java.lang.String lastServer() { return wrapperContained.lastServer; }
public void lastServer(java.lang.String value) { wrapperContained.lastServer = value; }
// public static java.lang.String lastServer() { return net.minecraft.client.option.GameOptions.lastServer; }
// public static void lastServer(java.lang.String value, ) { net.minecraft.client.option.GameOptions.lastServer = value; }

// public yarnwrap.client.option.SimpleOption invertYMouse() { return new yarnwrap.client.option.SimpleOption(wrapperContained.invertYMouse); }
// public void invertYMouse(yarnwrap.client.option.SimpleOption value) { wrapperContained.invertYMouse = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption invertYMouse() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.invertYMouse); }
// public static void invertYMouse(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.invertYMouse = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding sprintKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.sprintKey); }
// public void sprintKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.sprintKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding sprintKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.sprintKey); }
// public static void sprintKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.sprintKey = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption guiScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.guiScale); }
// public void guiScale(yarnwrap.client.option.SimpleOption value) { wrapperContained.guiScale = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption guiScale() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.guiScale); }
// public static void guiScale(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.guiScale = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding dropKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.dropKey); }
// public void dropKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.dropKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding dropKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.dropKey); }
// public static void dropKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.dropKey = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption viewDistance() { return new yarnwrap.client.option.SimpleOption(wrapperContained.viewDistance); }
// public void viewDistance(yarnwrap.client.option.SimpleOption value) { wrapperContained.viewDistance = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption viewDistance() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.viewDistance); }
// public static void viewDistance(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.viewDistance = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding pickItemKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.pickItemKey); }
// public void pickItemKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.pickItemKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding pickItemKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.pickItemKey); }
// public static void pickItemKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.pickItemKey = value.wrapperContained; }

public int overrideWidth() { return wrapperContained.overrideWidth; }
public void overrideWidth(int value) { wrapperContained.overrideWidth = value; }
// public static int overrideWidth() { return net.minecraft.client.option.GameOptions.overrideWidth; }
// public static void overrideWidth(int value, ) { net.minecraft.client.option.GameOptions.overrideWidth = value; }

// public yarnwrap.client.option.SimpleOption autoSuggestions() { return new yarnwrap.client.option.SimpleOption(wrapperContained.autoSuggestions); }
// public void autoSuggestions(yarnwrap.client.option.SimpleOption value) { wrapperContained.autoSuggestions = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption autoSuggestions() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.autoSuggestions); }
// public static void autoSuggestions(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.autoSuggestions = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding loadToolbarActivatorKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.loadToolbarActivatorKey); }
// public void loadToolbarActivatorKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.loadToolbarActivatorKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding loadToolbarActivatorKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.loadToolbarActivatorKey); }
// public static void loadToolbarActivatorKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.loadToolbarActivatorKey = value.wrapperContained; }

public yarnwrap.client.tutorial.TutorialStep tutorialStep() { return new yarnwrap.client.tutorial.TutorialStep(wrapperContained.tutorialStep); }
public void tutorialStep(yarnwrap.client.tutorial.TutorialStep value) { wrapperContained.tutorialStep = value.wrapperContained; }
// public static yarnwrap.client.tutorial.TutorialStep tutorialStep() { return new yarnwrap.client.tutorial.TutorialStep(net.minecraft.client.option.GameOptions.tutorialStep); }
// public static void tutorialStep(yarnwrap.client.tutorial.TutorialStep value, ) { net.minecraft.client.option.GameOptions.tutorialStep = value.wrapperContained; }

public boolean useNativeTransport() { return wrapperContained.useNativeTransport; }
public void useNativeTransport(boolean value) { wrapperContained.useNativeTransport = value; }
// public static boolean useNativeTransport() { return net.minecraft.client.option.GameOptions.useNativeTransport; }
// public static void useNativeTransport(boolean value, ) { net.minecraft.client.option.GameOptions.useNativeTransport = value; }

// public yarnwrap.client.option.SimpleOption chatVisibility() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatVisibility); }
// public void chatVisibility(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatVisibility = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption chatVisibility() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.chatVisibility); }
// public static void chatVisibility(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.chatVisibility = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption biomeBlendRadius() { return new yarnwrap.client.option.SimpleOption(wrapperContained.biomeBlendRadius); }
// public void biomeBlendRadius(yarnwrap.client.option.SimpleOption value) { wrapperContained.biomeBlendRadius = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption biomeBlendRadius() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.biomeBlendRadius); }
// public static void biomeBlendRadius(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.biomeBlendRadius = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding saveToolbarActivatorKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.saveToolbarActivatorKey); }
// public void saveToolbarActivatorKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.saveToolbarActivatorKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding saveToolbarActivatorKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.saveToolbarActivatorKey); }
// public static void saveToolbarActivatorKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.saveToolbarActivatorKey = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding backKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.backKey); }
// public void backKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.backKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding backKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.backKey); }
// public static void backKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.backKey = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption particles() { return new yarnwrap.client.option.SimpleOption(wrapperContained.particles); }
// public void particles(yarnwrap.client.option.SimpleOption value) { wrapperContained.particles = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption particles() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.particles); }
// public static void particles(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.particles = value.wrapperContained; }

public java.lang.String language() { return wrapperContained.language; }
public void language(java.lang.String value) { wrapperContained.language = value; }
// public static java.lang.String language() { return net.minecraft.client.option.GameOptions.language; }
// public static void language(java.lang.String value, ) { net.minecraft.client.option.GameOptions.language = value; }

// public yarnwrap.client.option.SimpleOption enableVsync() { return new yarnwrap.client.option.SimpleOption(wrapperContained.enableVsync); }
// public void enableVsync(yarnwrap.client.option.SimpleOption value) { wrapperContained.enableVsync = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption enableVsync() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.enableVsync); }
// public static void enableVsync(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.enableVsync = value.wrapperContained; }

public int overrideHeight() { return wrapperContained.overrideHeight; }
public void overrideHeight(int value) { wrapperContained.overrideHeight = value; }
// public static int overrideHeight() { return net.minecraft.client.option.GameOptions.overrideHeight; }
// public static void overrideHeight(int value, ) { net.minecraft.client.option.GameOptions.overrideHeight = value; }

public yarnwrap.client.option.KeyBinding attackKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.attackKey); }
// public void attackKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.attackKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding attackKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.attackKey); }
// public static void attackKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.attackKey = value.wrapperContained; }

public java.util.List resourcePacks() { return wrapperContained.resourcePacks; }
public void resourcePacks(java.util.List value) { wrapperContained.resourcePacks = value; }
// public static java.util.List resourcePacks() { return net.minecraft.client.option.GameOptions.resourcePacks; }
// public static void resourcePacks(java.util.List value, ) { net.minecraft.client.option.GameOptions.resourcePacks = value; }

// public yarnwrap.client.option.SimpleOption entityShadows() { return new yarnwrap.client.option.SimpleOption(wrapperContained.entityShadows); }
// public void entityShadows(yarnwrap.client.option.SimpleOption value) { wrapperContained.entityShadows = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption entityShadows() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.entityShadows); }
// public static void entityShadows(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.entityShadows = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption mouseWheelSensitivity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.mouseWheelSensitivity); }
// public void mouseWheelSensitivity(yarnwrap.client.option.SimpleOption value) { wrapperContained.mouseWheelSensitivity = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption mouseWheelSensitivity() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.mouseWheelSensitivity); }
// public static void mouseWheelSensitivity(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.mouseWheelSensitivity = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding chatKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.chatKey); }
// public void chatKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.chatKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding chatKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.chatKey); }
// public static void chatKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.chatKey = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption bobView() { return new yarnwrap.client.option.SimpleOption(wrapperContained.bobView); }
// public void bobView(yarnwrap.client.option.SimpleOption value) { wrapperContained.bobView = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption bobView() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.bobView); }
// public static void bobView(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.bobView = value.wrapperContained; }

// public java.util.Set enabledPlayerModelParts() { return wrapperContained.enabledPlayerModelParts; }
// public void enabledPlayerModelParts(java.util.Set value) { wrapperContained.enabledPlayerModelParts = value; }
// public static java.util.Set enabledPlayerModelParts() { return net.minecraft.client.option.GameOptions.enabledPlayerModelParts; }
// public static void enabledPlayerModelParts(java.util.Set value, ) { net.minecraft.client.option.GameOptions.enabledPlayerModelParts = value; }

public yarnwrap.client.option.KeyBinding forwardKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.forwardKey); }
// public void forwardKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.forwardKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding forwardKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.forwardKey); }
// public static void forwardKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.forwardKey = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption attackIndicator() { return new yarnwrap.client.option.SimpleOption(wrapperContained.attackIndicator); }
// public void attackIndicator(yarnwrap.client.option.SimpleOption value) { wrapperContained.attackIndicator = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption attackIndicator() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.attackIndicator); }
// public static void attackIndicator(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.attackIndicator = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption narrator() { return new yarnwrap.client.option.SimpleOption(wrapperContained.narrator); }
// public void narrator(yarnwrap.client.option.SimpleOption value) { wrapperContained.narrator = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption narrator() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.narrator); }
// public static void narrator(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.narrator = value.wrapperContained; }

// public java.io.File optionsFile() { return wrapperContained.optionsFile; }
// public void optionsFile(java.io.File value) { wrapperContained.optionsFile = value; }
// public static java.io.File optionsFile() { return net.minecraft.client.option.GameOptions.optionsFile; }
// public static void optionsFile(java.io.File value, ) { net.minecraft.client.option.GameOptions.optionsFile = value; }

// public yarnwrap.client.option.SimpleOption chatColors() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatColors); }
// public void chatColors(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatColors = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption chatColors() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.chatColors); }
// public static void chatColors(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.chatColors = value.wrapperContained; }

public int glDebugVerbosity() { return wrapperContained.glDebugVerbosity; }
public void glDebugVerbosity(int value) { wrapperContained.glDebugVerbosity = value; }
// public static int glDebugVerbosity() { return net.minecraft.client.option.GameOptions.glDebugVerbosity; }
// public static void glDebugVerbosity(int value, ) { net.minecraft.client.option.GameOptions.glDebugVerbosity = value; }

public yarnwrap.client.option.KeyBinding jumpKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.jumpKey); }
// public void jumpKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.jumpKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding jumpKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.jumpKey); }
// public static void jumpKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.jumpKey = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding useKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.useKey); }
// public void useKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.useKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding useKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.useKey); }
// public static void useKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.useKey = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding spectatorOutlinesKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.spectatorOutlinesKey); }
// public void spectatorOutlinesKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.spectatorOutlinesKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding spectatorOutlinesKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.spectatorOutlinesKey); }
// public static void spectatorOutlinesKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.spectatorOutlinesKey = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding playerListKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.playerListKey); }
// public void playerListKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.playerListKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding playerListKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.playerListKey); }
// public static void playerListKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.playerListKey = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption chatScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatScale); }
// public void chatScale(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatScale = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption chatScale() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.chatScale); }
// public static void chatScale(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.chatScale = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption maxFps() { return new yarnwrap.client.option.SimpleOption(wrapperContained.maxFps); }
// public void maxFps(yarnwrap.client.option.SimpleOption value) { wrapperContained.maxFps = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption maxFps() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.maxFps); }
// public static void maxFps(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.maxFps = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption reducedDebugInfo() { return new yarnwrap.client.option.SimpleOption(wrapperContained.reducedDebugInfo); }
// public void reducedDebugInfo(yarnwrap.client.option.SimpleOption value) { wrapperContained.reducedDebugInfo = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption reducedDebugInfo() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.reducedDebugInfo); }
// public static void reducedDebugInfo(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.reducedDebugInfo = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption chatLinks() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatLinks); }
// public void chatLinks(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatLinks = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption chatLinks() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.chatLinks); }
// public static void chatLinks(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.chatLinks = value.wrapperContained; }

public yarnwrap.client.option.KeyBinding leftKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.leftKey); }
// public void leftKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.leftKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding leftKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.leftKey); }
// public static void leftKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.leftKey = value.wrapperContained; }

public boolean smoothCameraEnabled() { return wrapperContained.smoothCameraEnabled; }
public void smoothCameraEnabled(boolean value) { wrapperContained.smoothCameraEnabled = value; }
// public static boolean smoothCameraEnabled() { return net.minecraft.client.option.GameOptions.smoothCameraEnabled; }
// public static void smoothCameraEnabled(boolean value, ) { net.minecraft.client.option.GameOptions.smoothCameraEnabled = value; }

// public yarnwrap.client.option.SimpleOption chatWidth() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatWidth); }
// public void chatWidth(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatWidth = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption chatWidth() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.chatWidth); }
// public static void chatWidth(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.chatWidth = value.wrapperContained; }

// public java.util.Map soundVolumeLevels() { return wrapperContained.soundVolumeLevels; }
// public void soundVolumeLevels(java.util.Map value) { wrapperContained.soundVolumeLevels = value; }
// public static java.util.Map soundVolumeLevels() { return net.minecraft.client.option.GameOptions.soundVolumeLevels; }
// public static void soundVolumeLevels(java.util.Map value, ) { net.minecraft.client.option.GameOptions.soundVolumeLevels = value; }

// public yarnwrap.client.option.SimpleOption backgroundForChatOnly() { return new yarnwrap.client.option.SimpleOption(wrapperContained.backgroundForChatOnly); }
// public void backgroundForChatOnly(yarnwrap.client.option.SimpleOption value) { wrapperContained.backgroundForChatOnly = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption backgroundForChatOnly() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.backgroundForChatOnly); }
// public static void backgroundForChatOnly(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.backgroundForChatOnly = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption textBackgroundOpacity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.textBackgroundOpacity); }
// public void textBackgroundOpacity(yarnwrap.client.option.SimpleOption value) { wrapperContained.textBackgroundOpacity = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption textBackgroundOpacity() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.textBackgroundOpacity); }
// public static void textBackgroundOpacity(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.textBackgroundOpacity = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption discreteMouseScroll() { return new yarnwrap.client.option.SimpleOption(wrapperContained.discreteMouseScroll); }
// public void discreteMouseScroll(yarnwrap.client.option.SimpleOption value) { wrapperContained.discreteMouseScroll = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption discreteMouseScroll() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.discreteMouseScroll); }
// public static void discreteMouseScroll(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.discreteMouseScroll = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption rawMouseInput() { return new yarnwrap.client.option.SimpleOption(wrapperContained.rawMouseInput); }
// public void rawMouseInput(yarnwrap.client.option.SimpleOption value) { wrapperContained.rawMouseInput = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption rawMouseInput() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.rawMouseInput); }
// public static void rawMouseInput(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.rawMouseInput = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption sneakToggled() { return new yarnwrap.client.option.SimpleOption(wrapperContained.sneakToggled); }
// public void sneakToggled(yarnwrap.client.option.SimpleOption value) { wrapperContained.sneakToggled = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption sneakToggled() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.sneakToggled); }
// public static void sneakToggled(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.sneakToggled = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption sprintToggled() { return new yarnwrap.client.option.SimpleOption(wrapperContained.sprintToggled); }
// public void sprintToggled(yarnwrap.client.option.SimpleOption value) { wrapperContained.sprintToggled = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption sprintToggled() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.sprintToggled); }
// public static void sprintToggled(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.sprintToggled = value.wrapperContained; }

public boolean skipMultiplayerWarning() { return wrapperContained.skipMultiplayerWarning; }
public void skipMultiplayerWarning(boolean value) { wrapperContained.skipMultiplayerWarning = value; }
// public static boolean skipMultiplayerWarning() { return net.minecraft.client.option.GameOptions.skipMultiplayerWarning; }
// public static void skipMultiplayerWarning(boolean value, ) { net.minecraft.client.option.GameOptions.skipMultiplayerWarning = value; }

// public yarnwrap.client.option.SimpleOption chatLineSpacing() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatLineSpacing); }
// public void chatLineSpacing(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatLineSpacing = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption chatLineSpacing() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.chatLineSpacing); }
// public static void chatLineSpacing(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.chatLineSpacing = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption chatDelay() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatDelay); }
// public void chatDelay(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatDelay = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption chatDelay() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.chatDelay); }
// public static void chatDelay(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.chatDelay = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption entityDistanceScaling() { return new yarnwrap.client.option.SimpleOption(wrapperContained.entityDistanceScaling); }
// public void entityDistanceScaling(yarnwrap.client.option.SimpleOption value) { wrapperContained.entityDistanceScaling = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption entityDistanceScaling() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.entityDistanceScaling); }
// public static void entityDistanceScaling(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.entityDistanceScaling = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption graphicsMode() { return new yarnwrap.client.option.SimpleOption(wrapperContained.graphicsMode); }
// public void graphicsMode(yarnwrap.client.option.SimpleOption value) { wrapperContained.graphicsMode = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption graphicsMode() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.graphicsMode); }
// public static void graphicsMode(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.graphicsMode = value.wrapperContained; }

public boolean syncChunkWrites() { return wrapperContained.syncChunkWrites; }
public void syncChunkWrites(boolean value) { wrapperContained.syncChunkWrites = value; }
// public static boolean syncChunkWrites() { return net.minecraft.client.option.GameOptions.syncChunkWrites; }
// public static void syncChunkWrites(boolean value, ) { net.minecraft.client.option.GameOptions.syncChunkWrites = value; }

// public yarnwrap.client.option.SimpleOption distortionEffectScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.distortionEffectScale); }
// public void distortionEffectScale(yarnwrap.client.option.SimpleOption value) { wrapperContained.distortionEffectScale = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption distortionEffectScale() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.distortionEffectScale); }
// public static void distortionEffectScale(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.distortionEffectScale = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption fovEffectScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.fovEffectScale); }
// public void fovEffectScale(yarnwrap.client.option.SimpleOption value) { wrapperContained.fovEffectScale = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption fovEffectScale() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.fovEffectScale); }
// public static void fovEffectScale(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.fovEffectScale = value.wrapperContained; }

// public yarnwrap.client.option.Perspective perspective() { return new yarnwrap.client.option.Perspective(wrapperContained.perspective); }
// public void perspective(yarnwrap.client.option.Perspective value) { wrapperContained.perspective = value.wrapperContained; }
// public static yarnwrap.client.option.Perspective perspective() { return new yarnwrap.client.option.Perspective(net.minecraft.client.option.GameOptions.perspective); }
// public static void perspective(yarnwrap.client.option.Perspective value, ) { net.minecraft.client.option.GameOptions.perspective = value.wrapperContained; }

public boolean joinedFirstServer() { return wrapperContained.joinedFirstServer; }
public void joinedFirstServer(boolean value) { wrapperContained.joinedFirstServer = value; }
// public static boolean joinedFirstServer() { return net.minecraft.client.option.GameOptions.joinedFirstServer; }
// public static void joinedFirstServer(boolean value, ) { net.minecraft.client.option.GameOptions.joinedFirstServer = value; }

public yarnwrap.client.option.KeyBinding socialInteractionsKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.socialInteractionsKey); }
// public void socialInteractionsKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.socialInteractionsKey = value.wrapperContained; }
// public static yarnwrap.client.option.KeyBinding socialInteractionsKey() { return new yarnwrap.client.option.KeyBinding(net.minecraft.client.option.GameOptions.socialInteractionsKey); }
// public static void socialInteractionsKey(yarnwrap.client.option.KeyBinding value, ) { net.minecraft.client.option.GameOptions.socialInteractionsKey = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption hideMatchedNames() { return new yarnwrap.client.option.SimpleOption(wrapperContained.hideMatchedNames); }
// public void hideMatchedNames(yarnwrap.client.option.SimpleOption value) { wrapperContained.hideMatchedNames = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption hideMatchedNames() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.hideMatchedNames); }
// public static void hideMatchedNames(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.hideMatchedNames = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption monochromeLogo() { return new yarnwrap.client.option.SimpleOption(wrapperContained.monochromeLogo); }
// public void monochromeLogo(yarnwrap.client.option.SimpleOption value) { wrapperContained.monochromeLogo = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption monochromeLogo() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.monochromeLogo); }
// public static void monochromeLogo(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.monochromeLogo = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption soundDevice() { return new yarnwrap.client.option.SimpleOption(wrapperContained.soundDevice); }
// public void soundDevice(yarnwrap.client.option.SimpleOption value) { wrapperContained.soundDevice = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption soundDevice() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.soundDevice); }
// public static void soundDevice(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.soundDevice = value.wrapperContained; }

// public int serverViewDistance() { return wrapperContained.serverViewDistance; }
// public void serverViewDistance(int value) { wrapperContained.serverViewDistance = value; }
// public static int serverViewDistance() { return net.minecraft.client.option.GameOptions.serverViewDistance; }
// public static void serverViewDistance(int value, ) { net.minecraft.client.option.GameOptions.serverViewDistance = value; }

// public java.lang.String EMPTY_STRING() { return wrapperContained.EMPTY_STRING; }
// public void EMPTY_STRING(java.lang.String value) { wrapperContained.EMPTY_STRING = value; }
public static java.lang.String EMPTY_STRING() { return net.minecraft.client.option.GameOptions.EMPTY_STRING; }
// public static void EMPTY_STRING(java.lang.String value, ) { net.minecraft.client.option.GameOptions.EMPTY_STRING = value; }

// public yarnwrap.client.option.SimpleOption hideLightningFlashes() { return new yarnwrap.client.option.SimpleOption(wrapperContained.hideLightningFlashes); }
// public void hideLightningFlashes(yarnwrap.client.option.SimpleOption value) { wrapperContained.hideLightningFlashes = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption hideLightningFlashes() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.hideLightningFlashes); }
// public static void hideLightningFlashes(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.hideLightningFlashes = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption chunkBuilderMode() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chunkBuilderMode); }
// public void chunkBuilderMode(yarnwrap.client.option.SimpleOption value) { wrapperContained.chunkBuilderMode = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption chunkBuilderMode() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.chunkBuilderMode); }
// public static void chunkBuilderMode(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.chunkBuilderMode = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption simulationDistance() { return new yarnwrap.client.option.SimpleOption(wrapperContained.simulationDistance); }
// public void simulationDistance(yarnwrap.client.option.SimpleOption value) { wrapperContained.simulationDistance = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption simulationDistance() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.simulationDistance); }
// public static void simulationDistance(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.simulationDistance = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption showAutosaveIndicator() { return new yarnwrap.client.option.SimpleOption(wrapperContained.showAutosaveIndicator); }
// public void showAutosaveIndicator(yarnwrap.client.option.SimpleOption value) { wrapperContained.showAutosaveIndicator = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption showAutosaveIndicator() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.showAutosaveIndicator); }
// public static void showAutosaveIndicator(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.showAutosaveIndicator = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption allowServerListing() { return new yarnwrap.client.option.SimpleOption(wrapperContained.allowServerListing); }
// public void allowServerListing(yarnwrap.client.option.SimpleOption value) { wrapperContained.allowServerListing = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption allowServerListing() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.allowServerListing); }
// public static void allowServerListing(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.allowServerListing = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption directionalAudio() { return new yarnwrap.client.option.SimpleOption(wrapperContained.directionalAudio); }
// public void directionalAudio(yarnwrap.client.option.SimpleOption value) { wrapperContained.directionalAudio = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption directionalAudio() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.directionalAudio); }
// public static void directionalAudio(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.directionalAudio = value.wrapperContained; }

// public yarnwrap.text.Text DARK_MOJANG_STUDIOS_BACKGROUND_COLOR_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.DARK_MOJANG_STUDIOS_BACKGROUND_COLOR_TOOLTIP); }
// public void DARK_MOJANG_STUDIOS_BACKGROUND_COLOR_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.DARK_MOJANG_STUDIOS_BACKGROUND_COLOR_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text DARK_MOJANG_STUDIOS_BACKGROUND_COLOR_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.DARK_MOJANG_STUDIOS_BACKGROUND_COLOR_TOOLTIP); }
// public static void DARK_MOJANG_STUDIOS_BACKGROUND_COLOR_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.DARK_MOJANG_STUDIOS_BACKGROUND_COLOR_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text HIDE_LIGHTNING_FLASHES_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.HIDE_LIGHTNING_FLASHES_TOOLTIP); }
// public void HIDE_LIGHTNING_FLASHES_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.HIDE_LIGHTNING_FLASHES_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text HIDE_LIGHTNING_FLASHES_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.HIDE_LIGHTNING_FLASHES_TOOLTIP); }
// public static void HIDE_LIGHTNING_FLASHES_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.HIDE_LIGHTNING_FLASHES_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text NONE_CHUNK_BUILDER_MODE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.NONE_CHUNK_BUILDER_MODE_TOOLTIP); }
// public void NONE_CHUNK_BUILDER_MODE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.NONE_CHUNK_BUILDER_MODE_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text NONE_CHUNK_BUILDER_MODE_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.NONE_CHUNK_BUILDER_MODE_TOOLTIP); }
// public static void NONE_CHUNK_BUILDER_MODE_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.NONE_CHUNK_BUILDER_MODE_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text BY_PLAYER_CHUNK_BUILDER_MODE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.BY_PLAYER_CHUNK_BUILDER_MODE_TOOLTIP); }
// public void BY_PLAYER_CHUNK_BUILDER_MODE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.BY_PLAYER_CHUNK_BUILDER_MODE_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text BY_PLAYER_CHUNK_BUILDER_MODE_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.BY_PLAYER_CHUNK_BUILDER_MODE_TOOLTIP); }
// public static void BY_PLAYER_CHUNK_BUILDER_MODE_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.BY_PLAYER_CHUNK_BUILDER_MODE_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text NEARBY_CHUNK_BUILDER_MODE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.NEARBY_CHUNK_BUILDER_MODE_TOOLTIP); }
// public void NEARBY_CHUNK_BUILDER_MODE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.NEARBY_CHUNK_BUILDER_MODE_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text NEARBY_CHUNK_BUILDER_MODE_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.NEARBY_CHUNK_BUILDER_MODE_TOOLTIP); }
// public static void NEARBY_CHUNK_BUILDER_MODE_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.NEARBY_CHUNK_BUILDER_MODE_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text FABULOUS_GRAPHICS_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.FABULOUS_GRAPHICS_TOOLTIP); }
// public void FABULOUS_GRAPHICS_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.FABULOUS_GRAPHICS_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text FABULOUS_GRAPHICS_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.FABULOUS_GRAPHICS_TOOLTIP); }
// public static void FABULOUS_GRAPHICS_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.FABULOUS_GRAPHICS_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text FANCY_GRAPHICS_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.FANCY_GRAPHICS_TOOLTIP); }
// public void FANCY_GRAPHICS_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.FANCY_GRAPHICS_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text FANCY_GRAPHICS_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.FANCY_GRAPHICS_TOOLTIP); }
// public static void FANCY_GRAPHICS_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.FANCY_GRAPHICS_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text FAST_GRAPHICS_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.FAST_GRAPHICS_TOOLTIP); }
// public void FAST_GRAPHICS_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.FAST_GRAPHICS_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text FAST_GRAPHICS_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.FAST_GRAPHICS_TOOLTIP); }
// public static void FAST_GRAPHICS_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.FAST_GRAPHICS_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text SCREEN_EFFECT_SCALE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.SCREEN_EFFECT_SCALE_TOOLTIP); }
// public void SCREEN_EFFECT_SCALE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.SCREEN_EFFECT_SCALE_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text SCREEN_EFFECT_SCALE_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.SCREEN_EFFECT_SCALE_TOOLTIP); }
// public static void SCREEN_EFFECT_SCALE_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.SCREEN_EFFECT_SCALE_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text FOV_EFFECT_SCALE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.FOV_EFFECT_SCALE_TOOLTIP); }
// public void FOV_EFFECT_SCALE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.FOV_EFFECT_SCALE_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text FOV_EFFECT_SCALE_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.FOV_EFFECT_SCALE_TOOLTIP); }
// public static void FOV_EFFECT_SCALE_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.FOV_EFFECT_SCALE_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text DARKNESS_EFFECT_SCALE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.DARKNESS_EFFECT_SCALE_TOOLTIP); }
// public void DARKNESS_EFFECT_SCALE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.DARKNESS_EFFECT_SCALE_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text DARKNESS_EFFECT_SCALE_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.DARKNESS_EFFECT_SCALE_TOOLTIP); }
// public static void DARKNESS_EFFECT_SCALE_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.DARKNESS_EFFECT_SCALE_TOOLTIP = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption darknessEffectScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.darknessEffectScale); }
// public void darknessEffectScale(yarnwrap.client.option.SimpleOption value) { wrapperContained.darknessEffectScale = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption darknessEffectScale() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.darknessEffectScale); }
// public static void darknessEffectScale(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.darknessEffectScale = value.wrapperContained; }

// public yarnwrap.text.Text ALLOW_SERVER_LISTING_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.ALLOW_SERVER_LISTING_TOOLTIP); }
// public void ALLOW_SERVER_LISTING_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.ALLOW_SERVER_LISTING_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text ALLOW_SERVER_LISTING_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.ALLOW_SERVER_LISTING_TOOLTIP); }
// public static void ALLOW_SERVER_LISTING_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.ALLOW_SERVER_LISTING_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text DIRECTIONAL_AUDIO_ON_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.DIRECTIONAL_AUDIO_ON_TOOLTIP); }
// public void DIRECTIONAL_AUDIO_ON_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.DIRECTIONAL_AUDIO_ON_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text DIRECTIONAL_AUDIO_ON_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.DIRECTIONAL_AUDIO_ON_TOOLTIP); }
// public static void DIRECTIONAL_AUDIO_ON_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.DIRECTIONAL_AUDIO_ON_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text DIRECTIONAL_AUDIO_OFF_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.DIRECTIONAL_AUDIO_OFF_TOOLTIP); }
// public void DIRECTIONAL_AUDIO_OFF_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.DIRECTIONAL_AUDIO_OFF_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text DIRECTIONAL_AUDIO_OFF_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.DIRECTIONAL_AUDIO_OFF_TOOLTIP); }
// public static void DIRECTIONAL_AUDIO_OFF_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.DIRECTIONAL_AUDIO_OFF_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text TOGGLE_KEY_TEXT() { return new yarnwrap.text.Text(wrapperContained.TOGGLE_KEY_TEXT); }
// public void TOGGLE_KEY_TEXT(yarnwrap.text.Text value) { wrapperContained.TOGGLE_KEY_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TOGGLE_KEY_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.TOGGLE_KEY_TEXT); }
// public static void TOGGLE_KEY_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.TOGGLE_KEY_TEXT = value.wrapperContained; }

// public yarnwrap.text.Text HOLD_KEY_TEXT() { return new yarnwrap.text.Text(wrapperContained.HOLD_KEY_TEXT); }
// public void HOLD_KEY_TEXT(yarnwrap.text.Text value) { wrapperContained.HOLD_KEY_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text HOLD_KEY_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.HOLD_KEY_TEXT); }
// public static void HOLD_KEY_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.HOLD_KEY_TEXT = value.wrapperContained; }

// public yarnwrap.text.Text HIDE_MATCHED_NAMES_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.HIDE_MATCHED_NAMES_TOOLTIP); }
// public void HIDE_MATCHED_NAMES_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.HIDE_MATCHED_NAMES_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text HIDE_MATCHED_NAMES_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.HIDE_MATCHED_NAMES_TOOLTIP); }
// public static void HIDE_MATCHED_NAMES_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.HIDE_MATCHED_NAMES_TOOLTIP = value.wrapperContained; }

// public int MAX_FPS_LIMIT() { return wrapperContained.MAX_FPS_LIMIT; }
// public void MAX_FPS_LIMIT(int value) { wrapperContained.MAX_FPS_LIMIT = value; }
public static int MAX_FPS_LIMIT() { return net.minecraft.client.option.GameOptions.MAX_FPS_LIMIT; }
// public static void MAX_FPS_LIMIT(int value, ) { net.minecraft.client.option.GameOptions.MAX_FPS_LIMIT = value; }

// public yarnwrap.text.Text ONLY_SHOW_SECURE_CHAT_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.ONLY_SHOW_SECURE_CHAT_TOOLTIP); }
// public void ONLY_SHOW_SECURE_CHAT_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.ONLY_SHOW_SECURE_CHAT_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text ONLY_SHOW_SECURE_CHAT_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.ONLY_SHOW_SECURE_CHAT_TOOLTIP); }
// public static void ONLY_SHOW_SECURE_CHAT_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.ONLY_SHOW_SECURE_CHAT_TOOLTIP = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption onlyShowSecureChat() { return new yarnwrap.client.option.SimpleOption(wrapperContained.onlyShowSecureChat); }
// public void onlyShowSecureChat(yarnwrap.client.option.SimpleOption value) { wrapperContained.onlyShowSecureChat = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption onlyShowSecureChat() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.onlyShowSecureChat); }
// public static void onlyShowSecureChat(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.onlyShowSecureChat = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption panoramaSpeed() { return new yarnwrap.client.option.SimpleOption(wrapperContained.panoramaSpeed); }
// public void panoramaSpeed(yarnwrap.client.option.SimpleOption value) { wrapperContained.panoramaSpeed = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption panoramaSpeed() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.panoramaSpeed); }
// public static void panoramaSpeed(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.panoramaSpeed = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption operatorItemsTab() { return new yarnwrap.client.option.SimpleOption(wrapperContained.operatorItemsTab); }
// public void operatorItemsTab(yarnwrap.client.option.SimpleOption value) { wrapperContained.operatorItemsTab = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption operatorItemsTab() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.operatorItemsTab); }
// public static void operatorItemsTab(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.operatorItemsTab = value.wrapperContained; }

// public yarnwrap.text.Text TELEMETRY_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.TELEMETRY_TOOLTIP); }
// public void TELEMETRY_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.TELEMETRY_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text TELEMETRY_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.TELEMETRY_TOOLTIP); }
// public static void TELEMETRY_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.TELEMETRY_TOOLTIP = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption telemetryOptInExtra() { return new yarnwrap.client.option.SimpleOption(wrapperContained.telemetryOptInExtra); }
// public void telemetryOptInExtra(yarnwrap.client.option.SimpleOption value) { wrapperContained.telemetryOptInExtra = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption telemetryOptInExtra() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.telemetryOptInExtra); }
// public static void telemetryOptInExtra(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.telemetryOptInExtra = value.wrapperContained; }

// public yarnwrap.text.Text NOTIFICATION_DISPLAY_TIME_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.NOTIFICATION_DISPLAY_TIME_TOOLTIP); }
// public void NOTIFICATION_DISPLAY_TIME_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.NOTIFICATION_DISPLAY_TIME_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text NOTIFICATION_DISPLAY_TIME_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.NOTIFICATION_DISPLAY_TIME_TOOLTIP); }
// public static void NOTIFICATION_DISPLAY_TIME_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.NOTIFICATION_DISPLAY_TIME_TOOLTIP = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption notificationDisplayTime() { return new yarnwrap.client.option.SimpleOption(wrapperContained.notificationDisplayTime); }
// public void notificationDisplayTime(yarnwrap.client.option.SimpleOption value) { wrapperContained.notificationDisplayTime = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption notificationDisplayTime() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.notificationDisplayTime); }
// public static void notificationDisplayTime(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.notificationDisplayTime = value.wrapperContained; }

public boolean onboardAccessibility() { return wrapperContained.onboardAccessibility; }
public void onboardAccessibility(boolean value) { wrapperContained.onboardAccessibility = value; }
// public static boolean onboardAccessibility() { return net.minecraft.client.option.GameOptions.onboardAccessibility; }
// public static void onboardAccessibility(boolean value, ) { net.minecraft.client.option.GameOptions.onboardAccessibility = value; }

// public yarnwrap.text.Text GLINT_SPEED_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.GLINT_SPEED_TOOLTIP); }
// public void GLINT_SPEED_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.GLINT_SPEED_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text GLINT_SPEED_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.GLINT_SPEED_TOOLTIP); }
// public static void GLINT_SPEED_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.GLINT_SPEED_TOOLTIP = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption glintSpeed() { return new yarnwrap.client.option.SimpleOption(wrapperContained.glintSpeed); }
// public void glintSpeed(yarnwrap.client.option.SimpleOption value) { wrapperContained.glintSpeed = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption glintSpeed() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.glintSpeed); }
// public static void glintSpeed(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.glintSpeed = value.wrapperContained; }

// public yarnwrap.text.Text GLINT_STRENGTH_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.GLINT_STRENGTH_TOOLTIP); }
// public void GLINT_STRENGTH_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.GLINT_STRENGTH_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text GLINT_STRENGTH_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.GLINT_STRENGTH_TOOLTIP); }
// public static void GLINT_STRENGTH_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.GLINT_STRENGTH_TOOLTIP = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption glintStrength() { return new yarnwrap.client.option.SimpleOption(wrapperContained.glintStrength); }
// public void glintStrength(yarnwrap.client.option.SimpleOption value) { wrapperContained.glintStrength = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption glintStrength() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.glintStrength); }
// public static void glintStrength(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.glintStrength = value.wrapperContained; }

// public yarnwrap.text.Text DAMAGE_TILT_STRENGTH_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.DAMAGE_TILT_STRENGTH_TOOLTIP); }
// public void DAMAGE_TILT_STRENGTH_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.DAMAGE_TILT_STRENGTH_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text DAMAGE_TILT_STRENGTH_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.DAMAGE_TILT_STRENGTH_TOOLTIP); }
// public static void DAMAGE_TILT_STRENGTH_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.DAMAGE_TILT_STRENGTH_TOOLTIP = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption damageTiltStrength() { return new yarnwrap.client.option.SimpleOption(wrapperContained.damageTiltStrength); }
// public void damageTiltStrength(yarnwrap.client.option.SimpleOption value) { wrapperContained.damageTiltStrength = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption damageTiltStrength() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.damageTiltStrength); }
// public static void damageTiltStrength(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.damageTiltStrength = value.wrapperContained; }

// public yarnwrap.text.Text HIGH_CONTRAST_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.HIGH_CONTRAST_TOOLTIP); }
// public void HIGH_CONTRAST_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.HIGH_CONTRAST_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text HIGH_CONTRAST_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.HIGH_CONTRAST_TOOLTIP); }
// public static void HIGH_CONTRAST_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.HIGH_CONTRAST_TOOLTIP = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption highContrast() { return new yarnwrap.client.option.SimpleOption(wrapperContained.highContrast); }
// public void highContrast(yarnwrap.client.option.SimpleOption value) { wrapperContained.highContrast = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption highContrast() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.highContrast); }
// public static void highContrast(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.highContrast = value.wrapperContained; }

// public int MAX_SERIALIZABLE_GUI_SCALE() { return wrapperContained.MAX_SERIALIZABLE_GUI_SCALE; }
// public void MAX_SERIALIZABLE_GUI_SCALE(int value) { wrapperContained.MAX_SERIALIZABLE_GUI_SCALE = value; }
// public static int MAX_SERIALIZABLE_GUI_SCALE() { return net.minecraft.client.option.GameOptions.MAX_SERIALIZABLE_GUI_SCALE; }
// public static void MAX_SERIALIZABLE_GUI_SCALE(int value, ) { net.minecraft.client.option.GameOptions.MAX_SERIALIZABLE_GUI_SCALE = value; }

// public yarnwrap.client.option.SimpleOption narratorHotkey() { return new yarnwrap.client.option.SimpleOption(wrapperContained.narratorHotkey); }
// public void narratorHotkey(yarnwrap.client.option.SimpleOption value) { wrapperContained.narratorHotkey = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption narratorHotkey() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.narratorHotkey); }
// public static void narratorHotkey(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.narratorHotkey = value.wrapperContained; }

// public yarnwrap.text.Text HIDE_SPLASH_TEXTS_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.HIDE_SPLASH_TEXTS_TOOLTIP); }
// public void HIDE_SPLASH_TEXTS_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.HIDE_SPLASH_TEXTS_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text HIDE_SPLASH_TEXTS_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.HIDE_SPLASH_TEXTS_TOOLTIP); }
// public static void HIDE_SPLASH_TEXTS_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.HIDE_SPLASH_TEXTS_TOOLTIP = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption hideSplashTexts() { return new yarnwrap.client.option.SimpleOption(wrapperContained.hideSplashTexts); }
// public void hideSplashTexts(yarnwrap.client.option.SimpleOption value) { wrapperContained.hideSplashTexts = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption hideSplashTexts() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.hideSplashTexts); }
// public static void hideSplashTexts(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.hideSplashTexts = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption japaneseGlyphVariants() { return new yarnwrap.client.option.SimpleOption(wrapperContained.japaneseGlyphVariants); }
// public void japaneseGlyphVariants(yarnwrap.client.option.SimpleOption value) { wrapperContained.japaneseGlyphVariants = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption japaneseGlyphVariants() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.japaneseGlyphVariants); }
// public static void japaneseGlyphVariants(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.japaneseGlyphVariants = value.wrapperContained; }

// public yarnwrap.text.Text MENU_BACKGROUND_BLURRINESS_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.MENU_BACKGROUND_BLURRINESS_TOOLTIP); }
// public void MENU_BACKGROUND_BLURRINESS_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.MENU_BACKGROUND_BLURRINESS_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text MENU_BACKGROUND_BLURRINESS_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.MENU_BACKGROUND_BLURRINESS_TOOLTIP); }
// public static void MENU_BACKGROUND_BLURRINESS_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.MENU_BACKGROUND_BLURRINESS_TOOLTIP = value.wrapperContained; }

// public int DEFAULT_MENU_BACKGROUND_BLURRINESS() { return wrapperContained.DEFAULT_MENU_BACKGROUND_BLURRINESS; }
// public void DEFAULT_MENU_BACKGROUND_BLURRINESS(int value) { wrapperContained.DEFAULT_MENU_BACKGROUND_BLURRINESS = value; }
// public static int DEFAULT_MENU_BACKGROUND_BLURRINESS() { return net.minecraft.client.option.GameOptions.DEFAULT_MENU_BACKGROUND_BLURRINESS; }
// public static void DEFAULT_MENU_BACKGROUND_BLURRINESS(int value, ) { net.minecraft.client.option.GameOptions.DEFAULT_MENU_BACKGROUND_BLURRINESS = value; }

// public yarnwrap.client.option.SimpleOption menuBackgroundBlurriness() { return new yarnwrap.client.option.SimpleOption(wrapperContained.menuBackgroundBlurriness); }
// public void menuBackgroundBlurriness(yarnwrap.client.option.SimpleOption value) { wrapperContained.menuBackgroundBlurriness = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption menuBackgroundBlurriness() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.menuBackgroundBlurriness); }
// public static void menuBackgroundBlurriness(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.menuBackgroundBlurriness = value.wrapperContained; }

// public yarnwrap.text.Text REALMS_NOTIFICATIONS_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.REALMS_NOTIFICATIONS_TOOLTIP); }
// public void REALMS_NOTIFICATIONS_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.REALMS_NOTIFICATIONS_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text REALMS_NOTIFICATIONS_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.REALMS_NOTIFICATIONS_TOOLTIP); }
// public static void REALMS_NOTIFICATIONS_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.REALMS_NOTIFICATIONS_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text INACTIVITY_FPS_LIMIT_MINIMIZED_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.INACTIVITY_FPS_LIMIT_MINIMIZED_TOOLTIP); }
// public void INACTIVITY_FPS_LIMIT_MINIMIZED_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.INACTIVITY_FPS_LIMIT_MINIMIZED_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text INACTIVITY_FPS_LIMIT_MINIMIZED_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.INACTIVITY_FPS_LIMIT_MINIMIZED_TOOLTIP); }
// public static void INACTIVITY_FPS_LIMIT_MINIMIZED_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.INACTIVITY_FPS_LIMIT_MINIMIZED_TOOLTIP = value.wrapperContained; }

// public yarnwrap.text.Text INACTIVITY_FPS_LIMIT_AFK_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.INACTIVITY_FPS_LIMIT_AFK_TOOLTIP); }
// public void INACTIVITY_FPS_LIMIT_AFK_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.INACTIVITY_FPS_LIMIT_AFK_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text INACTIVITY_FPS_LIMIT_AFK_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.INACTIVITY_FPS_LIMIT_AFK_TOOLTIP); }
// public static void INACTIVITY_FPS_LIMIT_AFK_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.INACTIVITY_FPS_LIMIT_AFK_TOOLTIP = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption inactivityFpsLimit() { return new yarnwrap.client.option.SimpleOption(wrapperContained.inactivityFpsLimit); }
// public void inactivityFpsLimit(yarnwrap.client.option.SimpleOption value) { wrapperContained.inactivityFpsLimit = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption inactivityFpsLimit() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.inactivityFpsLimit); }
// public static void inactivityFpsLimit(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.inactivityFpsLimit = value.wrapperContained; }

// public yarnwrap.text.Text ROTATE_WITH_MINECART_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.ROTATE_WITH_MINECART_TOOLTIP); }
// public void ROTATE_WITH_MINECART_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.ROTATE_WITH_MINECART_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text ROTATE_WITH_MINECART_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.ROTATE_WITH_MINECART_TOOLTIP); }
// public static void ROTATE_WITH_MINECART_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.ROTATE_WITH_MINECART_TOOLTIP = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption rotateWithMinecart() { return new yarnwrap.client.option.SimpleOption(wrapperContained.rotateWithMinecart); }
// public void rotateWithMinecart(yarnwrap.client.option.SimpleOption value) { wrapperContained.rotateWithMinecart = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption rotateWithMinecart() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.rotateWithMinecart); }
// public static void rotateWithMinecart(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.rotateWithMinecart = value.wrapperContained; }

// public yarnwrap.text.Text HIGH_CONTRAST_BLOCK_OUTLINE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.HIGH_CONTRAST_BLOCK_OUTLINE_TOOLTIP); }
// public void HIGH_CONTRAST_BLOCK_OUTLINE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.HIGH_CONTRAST_BLOCK_OUTLINE_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text HIGH_CONTRAST_BLOCK_OUTLINE_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.HIGH_CONTRAST_BLOCK_OUTLINE_TOOLTIP); }
// public static void HIGH_CONTRAST_BLOCK_OUTLINE_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.HIGH_CONTRAST_BLOCK_OUTLINE_TOOLTIP = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption highContrastBlockOutline() { return new yarnwrap.client.option.SimpleOption(wrapperContained.highContrastBlockOutline); }
// public void highContrastBlockOutline(yarnwrap.client.option.SimpleOption value) { wrapperContained.highContrastBlockOutline = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption highContrastBlockOutline() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.highContrastBlockOutline); }
// public static void highContrastBlockOutline(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.highContrastBlockOutline = value.wrapperContained; }

public boolean startedCleanly() { return wrapperContained.startedCleanly; }
public void startedCleanly(boolean value) { wrapperContained.startedCleanly = value; }
// public static boolean startedCleanly() { return net.minecraft.client.option.GameOptions.startedCleanly; }
// public static void startedCleanly(boolean value, ) { net.minecraft.client.option.GameOptions.startedCleanly = value; }

// public yarnwrap.client.option.SimpleOption cloudRenderDistance() { return new yarnwrap.client.option.SimpleOption(wrapperContained.cloudRenderDistance); }
// public void cloudRenderDistance(yarnwrap.client.option.SimpleOption value) { wrapperContained.cloudRenderDistance = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption cloudRenderDistance() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.cloudRenderDistance); }
// public static void cloudRenderDistance(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.cloudRenderDistance = value.wrapperContained; }

// public yarnwrap.text.Text MUSIC_FREQUENCY_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.MUSIC_FREQUENCY_TOOLTIP); }
// public void MUSIC_FREQUENCY_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.MUSIC_FREQUENCY_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text MUSIC_FREQUENCY_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.MUSIC_FREQUENCY_TOOLTIP); }
// public static void MUSIC_FREQUENCY_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.MUSIC_FREQUENCY_TOOLTIP = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption musicFrequency() { return new yarnwrap.client.option.SimpleOption(wrapperContained.musicFrequency); }
// public void musicFrequency(yarnwrap.client.option.SimpleOption value) { wrapperContained.musicFrequency = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption musicFrequency() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.musicFrequency); }
// public static void musicFrequency(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.musicFrequency = value.wrapperContained; }

// public yarnwrap.text.Text SHOW_NOW_PLAYING_TOAST_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.SHOW_NOW_PLAYING_TOAST_TOOLTIP); }
// public void SHOW_NOW_PLAYING_TOAST_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.SHOW_NOW_PLAYING_TOAST_TOOLTIP = value.wrapperContained; }
// public static yarnwrap.text.Text SHOW_NOW_PLAYING_TOAST_TOOLTIP() { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.SHOW_NOW_PLAYING_TOAST_TOOLTIP); }
// public static void SHOW_NOW_PLAYING_TOAST_TOOLTIP(yarnwrap.text.Text value, ) { net.minecraft.client.option.GameOptions.SHOW_NOW_PLAYING_TOAST_TOOLTIP = value.wrapperContained; }

// public yarnwrap.client.option.SimpleOption showNowPlayingToast() { return new yarnwrap.client.option.SimpleOption(wrapperContained.showNowPlayingToast); }
// public void showNowPlayingToast(yarnwrap.client.option.SimpleOption value) { wrapperContained.showNowPlayingToast = value.wrapperContained; }
// public static yarnwrap.client.option.SimpleOption showNowPlayingToast() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.showNowPlayingToast); }
// public static void showNowPlayingToast(yarnwrap.client.option.SimpleOption value, ) { net.minecraft.client.option.GameOptions.showNowPlayingToast = value.wrapperContained; }

public GameOptions(yarnwrap.client.MinecraftClient client,java.io.File optionsFile) { this.wrapperContained = new net.minecraft.client.option.GameOptions(client.wrapperContained,optionsFile); }
// public yarnwrap.nbt.NbtCompound update(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.update(nbt.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound update(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.client.option.GameOptions.update(nbt.wrapperContained)); }
public void addResourcePackProfilesToManager(yarnwrap.resource.ResourcePackManager manager) { wrapperContained.addResourcePackProfilesToManager(manager.wrapperContained); }
// public static void addResourcePackProfilesToManager(yarnwrap.resource.ResourcePackManager manager, ) { net.minecraft.client.option.GameOptions.addResourcePackProfilesToManager(manager.wrapperContained); }
public float getSoundVolume(yarnwrap.sound.SoundCategory category) { return wrapperContained.getSoundVolume(category.wrapperContained); }
// public static float getSoundVolume(yarnwrap.sound.SoundCategory category, ) { return net.minecraft.client.option.GameOptions.getSoundVolume(category.wrapperContained); }
public yarnwrap.client.option.CloudRenderMode getCloudRenderModeValue() { return new yarnwrap.client.option.CloudRenderMode(wrapperContained.getCloudRenderModeValue()); }
// public static yarnwrap.client.option.CloudRenderMode getCloudRenderModeValue() { return new yarnwrap.client.option.CloudRenderMode(net.minecraft.client.option.GameOptions.getCloudRenderModeValue()); }
public void setPlayerModelPart(yarnwrap.entity.player.PlayerModelPart part,boolean enabled) { wrapperContained.setPlayerModelPart(part.wrapperContained,enabled); }
// public static void setPlayerModelPart(yarnwrap.entity.player.PlayerModelPart part,boolean enabled, ) { net.minecraft.client.option.GameOptions.setPlayerModelPart(part.wrapperContained,enabled); }
public void load() { wrapperContained.load(); }
// public static void load() { net.minecraft.client.option.GameOptions.load(); }
public boolean shouldUseNativeTransport() { return wrapperContained.shouldUseNativeTransport(); }
// public static boolean shouldUseNativeTransport() { return net.minecraft.client.option.GameOptions.shouldUseNativeTransport(); }
public void write() { wrapperContained.write(); }
// public static void write() { net.minecraft.client.option.GameOptions.write(); }
public void sendClientSettings() { wrapperContained.sendClientSettings(); }
// public static void sendClientSettings() { net.minecraft.client.option.GameOptions.sendClientSettings(); }
public float getTextBackgroundOpacity(float fallback) { return wrapperContained.getTextBackgroundOpacity(fallback); }
// public static float getTextBackgroundOpacity(float fallback, ) { return net.minecraft.client.option.GameOptions.getTextBackgroundOpacity(fallback); }
public int getTextBackgroundColor(int fallbackColor) { return wrapperContained.getTextBackgroundColor(fallbackColor); }
// public static int getTextBackgroundColor(int fallbackColor, ) { return net.minecraft.client.option.GameOptions.getTextBackgroundColor(fallbackColor); }
public int getTextBackgroundColor(float fallbackOpacity) { return wrapperContained.getTextBackgroundColor(fallbackOpacity); }
// public static int getTextBackgroundColor(float fallbackOpacity, ) { return net.minecraft.client.option.GameOptions.getTextBackgroundColor(fallbackOpacity); }
// public void method_24230(yarnwrap.nbt.NbtCompound line) { wrapperContained.method_24230(line.wrapperContained); }
// public static void method_24230(yarnwrap.nbt.NbtCompound line, ) { net.minecraft.client.option.GameOptions.method_24230(line.wrapperContained); }
public void setPerspective(yarnwrap.client.option.Perspective perspective) { wrapperContained.setPerspective(perspective.wrapperContained); }
// public static void setPerspective(yarnwrap.client.option.Perspective perspective, ) { net.minecraft.client.option.GameOptions.setPerspective(perspective.wrapperContained); }
public yarnwrap.client.option.Perspective getPerspective() { return new yarnwrap.client.option.Perspective(wrapperContained.getPerspective()); }
// public static yarnwrap.client.option.Perspective getPerspective() { return new yarnwrap.client.option.Perspective(net.minecraft.client.option.GameOptions.getPerspective()); }
public boolean isPlayerModelPartEnabled(yarnwrap.entity.player.PlayerModelPart part) { return wrapperContained.isPlayerModelPartEnabled(part.wrapperContained); }
// public static boolean isPlayerModelPartEnabled(yarnwrap.entity.player.PlayerModelPart part, ) { return net.minecraft.client.option.GameOptions.isPlayerModelPartEnabled(part.wrapperContained); }
// public boolean isTrue(java.lang.String value) { return wrapperContained.isTrue(value); }
// public static boolean isTrue(java.lang.String value, ) { return net.minecraft.client.option.GameOptions.isTrue(value); }
// public boolean isFalse(java.lang.String value) { return wrapperContained.isFalse(value); }
// public static boolean isFalse(java.lang.String value, ) { return net.minecraft.client.option.GameOptions.isFalse(value); }
// public void accept(Object visitor) { wrapperContained.accept(visitor); }
// public static void accept(Object visitor, ) { net.minecraft.client.option.GameOptions.accept(visitor); }
// public java.util.List parseList(java.lang.String content) { return wrapperContained.parseList(content); }
// public static java.util.List parseList(java.lang.String content, ) { return net.minecraft.client.option.GameOptions.parseList(content); }
// public java.lang.String method_37293(com.mojang.datafixers.util.Pair option) { return wrapperContained.method_37293(option); }
// public static java.lang.String method_37293(com.mojang.datafixers.util.Pair option, ) { return net.minecraft.client.option.GameOptions.method_37293(option); }
public java.io.File getOptionsFile() { return wrapperContained.getOptionsFile(); }
// public static java.io.File getOptionsFile() { return net.minecraft.client.option.GameOptions.getOptionsFile(); }
public java.lang.String collectProfiledOptions() { return wrapperContained.collectProfiledOptions(); }
// public static java.lang.String collectProfiledOptions() { return net.minecraft.client.option.GameOptions.collectProfiledOptions(); }
public void setServerViewDistance(int serverViewDistance) { wrapperContained.setServerViewDistance(serverViewDistance); }
// public static void setServerViewDistance(int serverViewDistance, ) { net.minecraft.client.option.GameOptions.setServerViewDistance(serverViewDistance); }
public int getClampedViewDistance() { return wrapperContained.getClampedViewDistance(); }
// public static int getClampedViewDistance() { return net.minecraft.client.option.GameOptions.getClampedViewDistance(); }
public yarnwrap.client.option.SimpleOption getMonochromeLogo() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMonochromeLogo()); }
// public static yarnwrap.client.option.SimpleOption getMonochromeLogo() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getMonochromeLogo()); }
// public int toMouseWheelSensitivitySliderProgressValue(double value) { return wrapperContained.toMouseWheelSensitivitySliderProgressValue(value); }
// public static int toMouseWheelSensitivitySliderProgressValue(double value, ) { return net.minecraft.client.option.GameOptions.toMouseWheelSensitivitySliderProgressValue(value); }
// public void method_41776(yarnwrap.client.render.ChunkBuilderMode value) { wrapperContained.method_41776(value.wrapperContained); }
// public static void method_41776(yarnwrap.client.render.ChunkBuilderMode value, ) { net.minecraft.client.option.GameOptions.method_41776(value.wrapperContained); }
// public void method_41777(java.lang.Boolean value) { wrapperContained.method_41777(value); }
// public static void method_41777(java.lang.Boolean value, ) { net.minecraft.client.option.GameOptions.method_41777(value); }
// public void method_41778(java.lang.Double value) { wrapperContained.method_41778(value); }
// public static void method_41778(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_41778(value); }
// public void method_41779(java.lang.Integer value) { wrapperContained.method_41779(value); }
// public static void method_41779(java.lang.Integer value, ) { net.minecraft.client.option.GameOptions.method_41779(value); }
// public yarnwrap.text.Text getPercentValueText(yarnwrap.text.Text prefix,double value) { return new yarnwrap.text.Text(wrapperContained.getPercentValueText(prefix.wrapperContained,value)); }
// public static yarnwrap.text.Text getPercentValueText(yarnwrap.text.Text prefix,double value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.getPercentValueText(prefix.wrapperContained,value)); }
// public yarnwrap.text.Text getGenericValueText(yarnwrap.text.Text prefix,int value) { return new yarnwrap.text.Text(wrapperContained.getGenericValueText(prefix.wrapperContained,value)); }
// public static yarnwrap.text.Text getGenericValueText(yarnwrap.text.Text prefix,int value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.getGenericValueText(prefix.wrapperContained,value)); }
// public yarnwrap.text.Text getGenericValueText(yarnwrap.text.Text prefix,yarnwrap.text.Text value) { return new yarnwrap.text.Text(wrapperContained.getGenericValueText(prefix.wrapperContained,value.wrapperContained)); }
// public static yarnwrap.text.Text getGenericValueText(yarnwrap.text.Text prefix,yarnwrap.text.Text value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.getGenericValueText(prefix.wrapperContained,value.wrapperContained)); }
public yarnwrap.client.option.SimpleOption getHideLightningFlashes() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getHideLightningFlashes()); }
// public static yarnwrap.client.option.SimpleOption getHideLightningFlashes() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getHideLightningFlashes()); }
// public yarnwrap.text.Text method_41788(yarnwrap.text.Text optionText,java.lang.Double value) { return new yarnwrap.text.Text(wrapperContained.method_41788(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_41788(yarnwrap.text.Text optionText,java.lang.Double value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_41788(optionText.wrapperContained,value)); }
// public yarnwrap.text.Text method_41789(yarnwrap.text.Text optionText,java.lang.Integer value) { return new yarnwrap.text.Text(wrapperContained.method_41789(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_41789(yarnwrap.text.Text optionText,java.lang.Integer value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_41789(optionText.wrapperContained,value)); }
// public yarnwrap.text.Text getPixelValueText(yarnwrap.text.Text prefix,int value) { return new yarnwrap.text.Text(wrapperContained.getPixelValueText(prefix.wrapperContained,value)); }
// public static yarnwrap.text.Text getPixelValueText(yarnwrap.text.Text prefix,int value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.getPixelValueText(prefix.wrapperContained,value)); }
public yarnwrap.client.option.SimpleOption getAo() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getAo()); }
// public static yarnwrap.client.option.SimpleOption getAo() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getAo()); }
// public double toMouseWheelSensitivityValue(int value) { return wrapperContained.toMouseWheelSensitivityValue(value); }
// public static double toMouseWheelSensitivityValue(int value, ) { return net.minecraft.client.option.GameOptions.toMouseWheelSensitivityValue(value); }
// public void method_41796(java.lang.Double value) { wrapperContained.method_41796(value); }
// public static void method_41796(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_41796(value); }
// public void method_41797(java.lang.Integer value) { wrapperContained.method_41797(value); }
// public static void method_41797(java.lang.Integer value, ) { net.minecraft.client.option.GameOptions.method_41797(value); }
public yarnwrap.client.option.SimpleOption getChunkBuilderMode() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChunkBuilderMode()); }
// public static yarnwrap.client.option.SimpleOption getChunkBuilderMode() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getChunkBuilderMode()); }
// public yarnwrap.text.Text method_41799(yarnwrap.text.Text optionText,java.lang.Double value) { return new yarnwrap.text.Text(wrapperContained.method_41799(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_41799(yarnwrap.text.Text optionText,java.lang.Double value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_41799(optionText.wrapperContained,value)); }
// public yarnwrap.text.Text method_41800(yarnwrap.text.Text optionText,java.lang.Integer value) { return new yarnwrap.text.Text(wrapperContained.method_41800(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_41800(yarnwrap.text.Text optionText,java.lang.Integer value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_41800(optionText.wrapperContained,value)); }
public yarnwrap.client.option.SimpleOption getChatHeightUnfocused() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatHeightUnfocused()); }
// public static yarnwrap.client.option.SimpleOption getChatHeightUnfocused() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getChatHeightUnfocused()); }
// public void method_41802(java.lang.Double value) { wrapperContained.method_41802(value); }
// public static void method_41802(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_41802(value); }
public yarnwrap.client.option.SimpleOption getChatHeightFocused() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatHeightFocused()); }
// public static yarnwrap.client.option.SimpleOption getChatHeightFocused() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getChatHeightFocused()); }
// public yarnwrap.text.Text method_41804(yarnwrap.text.Text optionText,java.lang.Double value) { return new yarnwrap.text.Text(wrapperContained.method_41804(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_41804(yarnwrap.text.Text optionText,java.lang.Double value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_41804(optionText.wrapperContained,value)); }
public yarnwrap.client.option.SimpleOption getBiomeBlendRadius() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getBiomeBlendRadius()); }
// public static yarnwrap.client.option.SimpleOption getBiomeBlendRadius() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getBiomeBlendRadius()); }
public yarnwrap.client.option.SimpleOption getMouseWheelSensitivity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMouseWheelSensitivity()); }
// public static yarnwrap.client.option.SimpleOption getMouseWheelSensitivity() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getMouseWheelSensitivity()); }
public yarnwrap.client.option.SimpleOption getRawMouseInput() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getRawMouseInput()); }
// public static yarnwrap.client.option.SimpleOption getRawMouseInput() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getRawMouseInput()); }
public yarnwrap.client.option.SimpleOption getFov() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getFov()); }
// public static yarnwrap.client.option.SimpleOption getFov() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getFov()); }
public yarnwrap.client.option.SimpleOption getAutoJump() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getAutoJump()); }
// public static yarnwrap.client.option.SimpleOption getAutoJump() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getAutoJump()); }
// public void method_42424(java.lang.Double value) { wrapperContained.method_42424(value); }
// public static void method_42424(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_42424(value); }
public yarnwrap.client.option.SimpleOption getAutoSuggestions() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getAutoSuggestions()); }
// public static yarnwrap.client.option.SimpleOption getAutoSuggestions() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getAutoSuggestions()); }
public yarnwrap.client.option.SimpleOption getChatColors() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatColors()); }
// public static yarnwrap.client.option.SimpleOption getChatColors() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getChatColors()); }
// public void method_42428(java.lang.Double value) { wrapperContained.method_42428(value); }
// public static void method_42428(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_42428(value); }
public yarnwrap.client.option.SimpleOption getChatLinks() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatLinks()); }
// public static yarnwrap.client.option.SimpleOption getChatLinks() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getChatLinks()); }
// public int method_42430(java.lang.Double value) { return wrapperContained.method_42430(value); }
// public static int method_42430(java.lang.Double value, ) { return net.minecraft.client.option.GameOptions.method_42430(value); }
public yarnwrap.client.option.SimpleOption getChatLinksPrompt() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatLinksPrompt()); }
// public static yarnwrap.client.option.SimpleOption getChatLinksPrompt() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getChatLinksPrompt()); }
// public yarnwrap.text.Text method_42432(yarnwrap.text.Text optionText,java.lang.Double value) { return new yarnwrap.text.Text(wrapperContained.method_42432(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42432(yarnwrap.text.Text optionText,java.lang.Double value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42432(optionText.wrapperContained,value)); }
public yarnwrap.client.option.SimpleOption getEnableVsync() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getEnableVsync()); }
// public static yarnwrap.client.option.SimpleOption getEnableVsync() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getEnableVsync()); }
// public void method_42434(java.lang.Double value) { wrapperContained.method_42434(value); }
// public static void method_42434(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_42434(value); }
public yarnwrap.client.option.SimpleOption getEntityShadows() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getEntityShadows()); }
// public static yarnwrap.client.option.SimpleOption getEntityShadows() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getEntityShadows()); }
// public yarnwrap.text.Text method_42436(yarnwrap.text.Text optionText,java.lang.Double value) { return new yarnwrap.text.Text(wrapperContained.method_42436(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42436(yarnwrap.text.Text optionText,java.lang.Double value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42436(optionText.wrapperContained,value)); }
public yarnwrap.client.option.SimpleOption getForceUnicodeFont() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getForceUnicodeFont()); }
// public static yarnwrap.client.option.SimpleOption getForceUnicodeFont() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getForceUnicodeFont()); }
public yarnwrap.client.option.SimpleOption getInvertYMouse() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getInvertYMouse()); }
// public static yarnwrap.client.option.SimpleOption getInvertYMouse() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getInvertYMouse()); }
public yarnwrap.client.option.SimpleOption getDiscreteMouseScroll() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getDiscreteMouseScroll()); }
// public static yarnwrap.client.option.SimpleOption getDiscreteMouseScroll() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getDiscreteMouseScroll()); }
public yarnwrap.client.option.SimpleOption getRealmsNotifications() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getRealmsNotifications()); }
// public static yarnwrap.client.option.SimpleOption getRealmsNotifications() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getRealmsNotifications()); }
public yarnwrap.client.option.SimpleOption getAllowServerListing() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getAllowServerListing()); }
// public static yarnwrap.client.option.SimpleOption getAllowServerListing() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getAllowServerListing()); }
public yarnwrap.client.option.SimpleOption getReducedDebugInfo() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getReducedDebugInfo()); }
// public static yarnwrap.client.option.SimpleOption getReducedDebugInfo() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getReducedDebugInfo()); }
public yarnwrap.client.option.SimpleOption getShowSubtitles() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getShowSubtitles()); }
// public static yarnwrap.client.option.SimpleOption getShowSubtitles() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getShowSubtitles()); }
public yarnwrap.client.option.SimpleOption getDirectionalAudio() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getDirectionalAudio()); }
// public static yarnwrap.client.option.SimpleOption getDirectionalAudio() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getDirectionalAudio()); }
public yarnwrap.client.option.SimpleOption getBackgroundForChatOnly() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getBackgroundForChatOnly()); }
// public static yarnwrap.client.option.SimpleOption getBackgroundForChatOnly() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getBackgroundForChatOnly()); }
public yarnwrap.client.option.SimpleOption getTouchscreen() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getTouchscreen()); }
// public static yarnwrap.client.option.SimpleOption getTouchscreen() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getTouchscreen()); }
public yarnwrap.client.option.SimpleOption getFullscreen() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getFullscreen()); }
// public static yarnwrap.client.option.SimpleOption getFullscreen() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getFullscreen()); }
public yarnwrap.client.option.SimpleOption getBobView() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getBobView()); }
// public static yarnwrap.client.option.SimpleOption getBobView() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getBobView()); }
public yarnwrap.client.option.SimpleOption getSneakToggled() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getSneakToggled()); }
// public static yarnwrap.client.option.SimpleOption getSneakToggled() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getSneakToggled()); }
public yarnwrap.client.option.SimpleOption getSprintToggled() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getSprintToggled()); }
// public static yarnwrap.client.option.SimpleOption getSprintToggled() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getSprintToggled()); }
public yarnwrap.client.option.SimpleOption getHideMatchedNames() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getHideMatchedNames()); }
// public static yarnwrap.client.option.SimpleOption getHideMatchedNames() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getHideMatchedNames()); }
public yarnwrap.client.option.SimpleOption getShowAutosaveIndicator() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getShowAutosaveIndicator()); }
// public static yarnwrap.client.option.SimpleOption getShowAutosaveIndicator() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getShowAutosaveIndicator()); }
public yarnwrap.client.option.SimpleOption getDistortionEffectScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getDistortionEffectScale()); }
// public static yarnwrap.client.option.SimpleOption getDistortionEffectScale() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getDistortionEffectScale()); }
public yarnwrap.client.option.SimpleOption getFovEffectScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getFovEffectScale()); }
// public static yarnwrap.client.option.SimpleOption getFovEffectScale() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getFovEffectScale()); }
// public void method_42455(yarnwrap.util.Arm value) { wrapperContained.method_42455(value.wrapperContained); }
// public static void method_42455(yarnwrap.util.Arm value, ) { net.minecraft.client.option.GameOptions.method_42455(value.wrapperContained); }
// public void method_42456(yarnwrap.network.message.ChatVisibility value) { wrapperContained.method_42456(value.wrapperContained); }
// public static void method_42456(yarnwrap.network.message.ChatVisibility value, ) { net.minecraft.client.option.GameOptions.method_42456(value.wrapperContained); }
// public void method_42458(yarnwrap.client.option.AttackIndicator value) { wrapperContained.method_42458(value.wrapperContained); }
// public static void method_42458(yarnwrap.client.option.AttackIndicator value, ) { net.minecraft.client.option.GameOptions.method_42458(value.wrapperContained); }
// public void method_42459(yarnwrap.client.option.CloudRenderMode cloudRenderMode) { wrapperContained.method_42459(cloudRenderMode.wrapperContained); }
// public static void method_42459(yarnwrap.client.option.CloudRenderMode cloudRenderMode, ) { net.minecraft.client.option.GameOptions.method_42459(cloudRenderMode.wrapperContained); }
// public void method_42460(yarnwrap.client.option.GraphicsMode value) { wrapperContained.method_42460(value.wrapperContained); }
// public static void method_42460(yarnwrap.client.option.GraphicsMode value, ) { net.minecraft.client.option.GameOptions.method_42460(value.wrapperContained); }
// public void method_42463(yarnwrap.client.option.NarratorMode value) { wrapperContained.method_42463(value.wrapperContained); }
// public static void method_42463(yarnwrap.client.option.NarratorMode value, ) { net.minecraft.client.option.GameOptions.method_42463(value.wrapperContained); }
// public void method_42464(yarnwrap.client.option.SimpleOption option,yarnwrap.client.option.GraphicsMode graphicsMode) { wrapperContained.method_42464(option.wrapperContained,graphicsMode.wrapperContained); }
// public static void method_42464(yarnwrap.client.option.SimpleOption option,yarnwrap.client.option.GraphicsMode graphicsMode, ) { net.minecraft.client.option.GameOptions.method_42464(option.wrapperContained,graphicsMode.wrapperContained); }
// public void method_42465(yarnwrap.particle.ParticlesMode value) { wrapperContained.method_42465(value.wrapperContained); }
// public static void method_42465(yarnwrap.particle.ParticlesMode value, ) { net.minecraft.client.option.GameOptions.method_42465(value.wrapperContained); }
// public void method_42466(java.lang.Boolean value) { wrapperContained.method_42466(value); }
// public static void method_42466(java.lang.Boolean value, ) { net.minecraft.client.option.GameOptions.method_42466(value); }
// public void method_42467(java.lang.Double value) { wrapperContained.method_42467(value); }
// public static void method_42467(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_42467(value); }
// public void method_42468(java.lang.Integer value) { wrapperContained.method_42468(value); }
// public static void method_42468(java.lang.Integer value, ) { net.minecraft.client.option.GameOptions.method_42468(value); }
public yarnwrap.client.option.SimpleOption getDarknessEffectScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getDarknessEffectScale()); }
// public static yarnwrap.client.option.SimpleOption getDarknessEffectScale() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getDarknessEffectScale()); }
public yarnwrap.client.option.SimpleOption getGamma() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getGamma()); }
// public static yarnwrap.client.option.SimpleOption getGamma() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getGamma()); }
public yarnwrap.client.option.SimpleOption getGuiScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getGuiScale()); }
// public static yarnwrap.client.option.SimpleOption getGuiScale() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getGuiScale()); }
public yarnwrap.client.option.SimpleOption getParticles() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getParticles()); }
// public static yarnwrap.client.option.SimpleOption getParticles() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getParticles()); }
public yarnwrap.client.option.SimpleOption getNarrator() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getNarrator()); }
// public static yarnwrap.client.option.SimpleOption getNarrator() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getNarrator()); }
public yarnwrap.client.option.SimpleOption getSoundDevice() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getSoundDevice()); }
// public static yarnwrap.client.option.SimpleOption getSoundDevice() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getSoundDevice()); }
// public boolean method_42486(yarnwrap.client.option.GraphicsMode graphicsMode) { return wrapperContained.method_42486(graphicsMode.wrapperContained); }
// public static boolean method_42486(yarnwrap.client.option.GraphicsMode graphicsMode, ) { return net.minecraft.client.option.GameOptions.method_42486(graphicsMode.wrapperContained); }
// public yarnwrap.text.Text method_42489(yarnwrap.text.Text optionText,yarnwrap.client.option.NarratorMode value) { return new yarnwrap.text.Text(wrapperContained.method_42489(optionText.wrapperContained,value.wrapperContained)); }
// public static yarnwrap.text.Text method_42489(yarnwrap.text.Text optionText,yarnwrap.client.option.NarratorMode value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42489(optionText.wrapperContained,value.wrapperContained)); }
// public yarnwrap.text.Text method_42491(yarnwrap.text.Text optionText,java.lang.Boolean value) { return new yarnwrap.text.Text(wrapperContained.method_42491(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42491(yarnwrap.text.Text optionText,java.lang.Boolean value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42491(optionText.wrapperContained,value)); }
// public yarnwrap.text.Text method_42492(yarnwrap.text.Text optionText,java.lang.Double value) { return new yarnwrap.text.Text(wrapperContained.method_42492(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42492(yarnwrap.text.Text optionText,java.lang.Double value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42492(optionText.wrapperContained,value)); }
// public yarnwrap.text.Text method_42493(yarnwrap.text.Text optionText,java.lang.Integer value) { return new yarnwrap.text.Text(wrapperContained.method_42493(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42493(yarnwrap.text.Text optionText,java.lang.Integer value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42493(optionText.wrapperContained,value)); }
public yarnwrap.client.option.SimpleOption getMouseSensitivity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMouseSensitivity()); }
// public static yarnwrap.client.option.SimpleOption getMouseSensitivity() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getMouseSensitivity()); }
// public yarnwrap.text.Text method_42497(yarnwrap.text.Text optionText,yarnwrap.client.option.GraphicsMode value) { return new yarnwrap.text.Text(wrapperContained.method_42497(optionText.wrapperContained,value.wrapperContained)); }
// public static yarnwrap.text.Text method_42497(yarnwrap.text.Text optionText,yarnwrap.client.option.GraphicsMode value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42497(optionText.wrapperContained,value.wrapperContained)); }
// public void method_42500(java.lang.Boolean value) { wrapperContained.method_42500(value); }
// public static void method_42500(java.lang.Boolean value, ) { net.minecraft.client.option.GameOptions.method_42500(value); }
// public void method_42501(java.lang.Double value) { wrapperContained.method_42501(value); }
// public static void method_42501(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_42501(value); }
// public void method_42502(java.lang.Integer value) { wrapperContained.method_42502(value); }
// public static void method_42502(java.lang.Integer value, ) { net.minecraft.client.option.GameOptions.method_42502(value); }
public yarnwrap.client.option.SimpleOption getViewDistance() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getViewDistance()); }
// public static yarnwrap.client.option.SimpleOption getViewDistance() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getViewDistance()); }
// public java.lang.Double method_42504(int value) { return wrapperContained.method_42504(value); }
// public static java.lang.Double method_42504(int value, ) { return net.minecraft.client.option.GameOptions.method_42504(value); }
// public yarnwrap.text.Text method_42506(yarnwrap.text.Text optionText,java.lang.Boolean value) { return new yarnwrap.text.Text(wrapperContained.method_42506(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42506(yarnwrap.text.Text optionText,java.lang.Boolean value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42506(optionText.wrapperContained,value)); }
// public yarnwrap.text.Text method_42508(yarnwrap.text.Text optionText,java.lang.Integer value) { return new yarnwrap.text.Text(wrapperContained.method_42508(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42508(yarnwrap.text.Text optionText,java.lang.Integer value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42508(optionText.wrapperContained,value)); }
// public void method_42509(java.lang.String value) { wrapperContained.method_42509(value); }
// public static void method_42509(java.lang.String value, ) { net.minecraft.client.option.GameOptions.method_42509(value); }
public yarnwrap.client.option.SimpleOption getSimulationDistance() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getSimulationDistance()); }
// public static yarnwrap.client.option.SimpleOption getSimulationDistance() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getSimulationDistance()); }
// public java.lang.Integer method_42511(int value) { return wrapperContained.method_42511(value); }
// public static java.lang.Integer method_42511(int value, ) { return net.minecraft.client.option.GameOptions.method_42511(value); }
// public void method_42513(java.lang.Boolean value) { wrapperContained.method_42513(value); }
// public static void method_42513(java.lang.Boolean value, ) { net.minecraft.client.option.GameOptions.method_42513(value); }
// public void method_42514(java.lang.Double value) { wrapperContained.method_42514(value); }
// public static void method_42514(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_42514(value); }
// public void method_42515(java.lang.Integer value) { wrapperContained.method_42515(value); }
// public static void method_42515(java.lang.Integer value, ) { net.minecraft.client.option.GameOptions.method_42515(value); }
// public java.util.Optional method_42516(java.lang.String value) { return wrapperContained.method_42516(value); }
// public static java.util.Optional method_42516(java.lang.String value, ) { return net.minecraft.client.option.GameOptions.method_42516(value); }
public yarnwrap.client.option.SimpleOption getEntityDistanceScaling() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getEntityDistanceScaling()); }
// public static yarnwrap.client.option.SimpleOption getEntityDistanceScaling() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getEntityDistanceScaling()); }
// public java.lang.Double method_42518(int sliderProgressValue) { return wrapperContained.method_42518(sliderProgressValue); }
// public static java.lang.Double method_42518(int sliderProgressValue, ) { return net.minecraft.client.option.GameOptions.method_42518(sliderProgressValue); }
// public void method_42520(java.lang.Boolean value) { wrapperContained.method_42520(value); }
// public static void method_42520(java.lang.Boolean value, ) { net.minecraft.client.option.GameOptions.method_42520(value); }
// public yarnwrap.text.Text method_42522(yarnwrap.text.Text optionText,java.lang.Integer value) { return new yarnwrap.text.Text(wrapperContained.method_42522(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42522(yarnwrap.text.Text optionText,java.lang.Integer value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42522(optionText.wrapperContained,value)); }
// public yarnwrap.text.Text method_42523(yarnwrap.text.Text optionText,java.lang.String value) { return new yarnwrap.text.Text(wrapperContained.method_42523(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42523(yarnwrap.text.Text optionText,java.lang.String value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42523(optionText.wrapperContained,value)); }
public yarnwrap.client.option.SimpleOption getMaxFps() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMaxFps()); }
// public static yarnwrap.client.option.SimpleOption getMaxFps() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getMaxFps()); }
// public yarnwrap.text.Text method_42525(yarnwrap.text.Text optionText,java.lang.Boolean value) { return new yarnwrap.text.Text(wrapperContained.method_42525(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42525(yarnwrap.text.Text optionText,java.lang.Boolean value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42525(optionText.wrapperContained,value)); }
// public void method_42526(java.lang.Double value) { wrapperContained.method_42526(value); }
// public static void method_42526(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_42526(value); }
public yarnwrap.client.option.SimpleOption getCloudRenderMode() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getCloudRenderMode()); }
// public static yarnwrap.client.option.SimpleOption getCloudRenderMode() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getCloudRenderMode()); }
// public void method_42530(java.lang.Boolean value) { wrapperContained.method_42530(value); }
// public static void method_42530(java.lang.Boolean value, ) { net.minecraft.client.option.GameOptions.method_42530(value); }
// public java.lang.Double method_42532(java.lang.Integer value) { return wrapperContained.method_42532(value); }
// public static java.lang.Double method_42532(java.lang.Integer value, ) { return net.minecraft.client.option.GameOptions.method_42532(value); }
public yarnwrap.client.option.SimpleOption getGraphicsMode() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getGraphicsMode()); }
// public static yarnwrap.client.option.SimpleOption getGraphicsMode() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getGraphicsMode()); }
// public void method_42535(java.lang.Boolean value) { wrapperContained.method_42535(value); }
// public static void method_42535(java.lang.Boolean value, ) { net.minecraft.client.option.GameOptions.method_42535(value); }
// public java.lang.Integer method_42536(java.lang.Double value) { return wrapperContained.method_42536(value); }
// public static java.lang.Integer method_42536(java.lang.Double value, ) { return net.minecraft.client.option.GameOptions.method_42536(value); }
// public void method_42537(java.lang.Boolean value) { wrapperContained.method_42537(value); }
// public static void method_42537(java.lang.Boolean value, ) { net.minecraft.client.option.GameOptions.method_42537(value); }
// public void method_42538(java.lang.Boolean value) { wrapperContained.method_42538(value); }
// public static void method_42538(java.lang.Boolean value, ) { net.minecraft.client.option.GameOptions.method_42538(value); }
public yarnwrap.client.option.SimpleOption getChatVisibility() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatVisibility()); }
// public static yarnwrap.client.option.SimpleOption getChatVisibility() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getChatVisibility()); }
// public void method_42540(java.lang.Double value) { wrapperContained.method_42540(value); }
// public static void method_42540(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_42540(value); }
// public void method_42541(java.lang.Integer value) { wrapperContained.method_42541(value); }
// public static void method_42541(java.lang.Integer value, ) { net.minecraft.client.option.GameOptions.method_42541(value); }
public yarnwrap.client.option.SimpleOption getChatOpacity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatOpacity()); }
// public static yarnwrap.client.option.SimpleOption getChatOpacity() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getChatOpacity()); }
// public int method_42544(java.lang.Double value) { return wrapperContained.method_42544(value); }
// public static int method_42544(java.lang.Double value, ) { return net.minecraft.client.option.GameOptions.method_42544(value); }
// public yarnwrap.text.Text method_42545(yarnwrap.text.Text optionText,java.lang.Integer value) { return new yarnwrap.text.Text(wrapperContained.method_42545(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42545(yarnwrap.text.Text optionText,java.lang.Integer value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42545(optionText.wrapperContained,value)); }
public yarnwrap.client.option.SimpleOption getChatLineSpacing() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatLineSpacing()); }
// public static yarnwrap.client.option.SimpleOption getChatLineSpacing() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getChatLineSpacing()); }
// public yarnwrap.text.Text method_42548(yarnwrap.text.Text optionText,java.lang.Double value) { return new yarnwrap.text.Text(wrapperContained.method_42548(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42548(yarnwrap.text.Text optionText,java.lang.Double value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42548(optionText.wrapperContained,value)); }
public yarnwrap.client.option.SimpleOption getTextBackgroundOpacity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getTextBackgroundOpacity()); }
// public static yarnwrap.client.option.SimpleOption getTextBackgroundOpacity() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getTextBackgroundOpacity()); }
public yarnwrap.client.option.SimpleOption getMainArm() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMainArm()); }
// public static yarnwrap.client.option.SimpleOption getMainArm() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getMainArm()); }
public yarnwrap.client.option.SimpleOption getChatScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatScale()); }
// public static yarnwrap.client.option.SimpleOption getChatScale() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getChatScale()); }
// public void method_42555(java.lang.Integer value) { wrapperContained.method_42555(value); }
// public static void method_42555(java.lang.Integer value, ) { net.minecraft.client.option.GameOptions.method_42555(value); }
public yarnwrap.client.option.SimpleOption getChatWidth() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatWidth()); }
// public static yarnwrap.client.option.SimpleOption getChatWidth() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getChatWidth()); }
// public int method_42557(java.lang.Integer value) { return wrapperContained.method_42557(value); }
// public static int method_42557(java.lang.Integer value, ) { return net.minecraft.client.option.GameOptions.method_42557(value); }
// public void method_42558(java.lang.Double value) { wrapperContained.method_42558(value); }
// public static void method_42558(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_42558(value); }
// public yarnwrap.text.Text method_42559(yarnwrap.text.Text optionText,java.lang.Integer value) { return new yarnwrap.text.Text(wrapperContained.method_42559(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42559(yarnwrap.text.Text optionText,java.lang.Integer value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42559(optionText.wrapperContained,value)); }
// public yarnwrap.text.Text method_42560(yarnwrap.text.Text optionText,java.lang.Double value) { return new yarnwrap.text.Text(wrapperContained.method_42560(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42560(yarnwrap.text.Text optionText,java.lang.Double value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42560(optionText.wrapperContained,value)); }
public yarnwrap.client.option.SimpleOption getChatDelay() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatDelay()); }
// public static yarnwrap.client.option.SimpleOption getChatDelay() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getChatDelay()); }
// public void method_42562(java.lang.Double value) { wrapperContained.method_42562(value); }
// public static void method_42562(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_42562(value); }
public yarnwrap.client.option.SimpleOption getMipmapLevels() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMipmapLevels()); }
// public static yarnwrap.client.option.SimpleOption getMipmapLevels() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getMipmapLevels()); }
// public yarnwrap.text.Text method_42564(yarnwrap.text.Text optionText,java.lang.Double value) { return new yarnwrap.text.Text(wrapperContained.method_42564(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_42564(yarnwrap.text.Text optionText,java.lang.Double value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_42564(optionText.wrapperContained,value)); }
public yarnwrap.client.option.SimpleOption getAttackIndicator() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getAttackIndicator()); }
// public static yarnwrap.client.option.SimpleOption getAttackIndicator() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getAttackIndicator()); }
// public void method_42566(java.lang.Double value) { wrapperContained.method_42566(value); }
// public static void method_42566(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_42566(value); }
// public void method_42568(java.lang.Double value) { wrapperContained.method_42568(value); }
// public static void method_42568(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_42568(value); }
public yarnwrap.client.option.SimpleOption getOnlyShowSecureChat() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getOnlyShowSecureChat()); }
// public static yarnwrap.client.option.SimpleOption getOnlyShowSecureChat() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getOnlyShowSecureChat()); }
// public void method_45575(yarnwrap.sound.SoundCategory value) { wrapperContained.method_45575(value.wrapperContained); }
// public static void method_45575(yarnwrap.sound.SoundCategory value, ) { net.minecraft.client.option.GameOptions.method_45575(value.wrapperContained); }
// public yarnwrap.client.option.SimpleOption createSoundVolumeOption(java.lang.String key,yarnwrap.sound.SoundCategory category) { return new yarnwrap.client.option.SimpleOption(wrapperContained.createSoundVolumeOption(key,category.wrapperContained)); }
// public static yarnwrap.client.option.SimpleOption createSoundVolumeOption(java.lang.String key,yarnwrap.sound.SoundCategory category, ) { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.createSoundVolumeOption(key,category.wrapperContained)); }
public yarnwrap.client.option.SimpleOption getSoundVolumeOption(yarnwrap.sound.SoundCategory category) { return new yarnwrap.client.option.SimpleOption(wrapperContained.getSoundVolumeOption(category.wrapperContained)); }
// public static yarnwrap.client.option.SimpleOption getSoundVolumeOption(yarnwrap.sound.SoundCategory category, ) { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getSoundVolumeOption(category.wrapperContained)); }
// public void method_45580(java.lang.Double value) { wrapperContained.method_45580(value); }
// public static void method_45580(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_45580(value); }
public yarnwrap.client.option.SimpleOption getPanoramaSpeed() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getPanoramaSpeed()); }
// public static yarnwrap.client.option.SimpleOption getPanoramaSpeed() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getPanoramaSpeed()); }
public yarnwrap.client.option.SimpleOption getOperatorItemsTab() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getOperatorItemsTab()); }
// public static yarnwrap.client.option.SimpleOption getOperatorItemsTab() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getOperatorItemsTab()); }
// public yarnwrap.client.gui.tooltip.Tooltip method_47396(yarnwrap.client.render.ChunkBuilderMode value) { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.method_47396(value.wrapperContained)); }
// public static yarnwrap.client.gui.tooltip.Tooltip method_47396(yarnwrap.client.render.ChunkBuilderMode value, ) { return new yarnwrap.client.gui.tooltip.Tooltip(net.minecraft.client.option.GameOptions.method_47396(value.wrapperContained)); }
// public yarnwrap.client.gui.tooltip.Tooltip method_47397(yarnwrap.client.option.GraphicsMode value) { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.method_47397(value.wrapperContained)); }
// public static yarnwrap.client.gui.tooltip.Tooltip method_47397(yarnwrap.client.option.GraphicsMode value, ) { return new yarnwrap.client.gui.tooltip.Tooltip(net.minecraft.client.option.GameOptions.method_47397(value.wrapperContained)); }
// public yarnwrap.client.gui.tooltip.Tooltip method_47398(java.lang.Boolean value) { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.method_47398(value)); }
// public static yarnwrap.client.gui.tooltip.Tooltip method_47398(java.lang.Boolean value, ) { return new yarnwrap.client.gui.tooltip.Tooltip(net.minecraft.client.option.GameOptions.method_47398(value)); }
// public void method_47607(java.lang.Boolean value) { wrapperContained.method_47607(value); }
// public static void method_47607(java.lang.Boolean value, ) { net.minecraft.client.option.GameOptions.method_47607(value); }
// public yarnwrap.text.Text method_47608(yarnwrap.text.Text optionText,java.lang.Boolean value) { return new yarnwrap.text.Text(wrapperContained.method_47608(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_47608(yarnwrap.text.Text optionText,java.lang.Boolean value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_47608(optionText.wrapperContained,value)); }
public yarnwrap.client.option.SimpleOption getTelemetryOptInExtra() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getTelemetryOptInExtra()); }
// public static yarnwrap.client.option.SimpleOption getTelemetryOptInExtra() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getTelemetryOptInExtra()); }
// public void method_47999(java.lang.Boolean value) { wrapperContained.method_47999(value); }
// public static void method_47999(java.lang.Boolean value, ) { net.minecraft.client.option.GameOptions.method_47999(value); }
// public java.lang.Double method_48187(int sliderProgressValue) { return wrapperContained.method_48187(sliderProgressValue); }
// public static java.lang.Double method_48187(int sliderProgressValue, ) { return net.minecraft.client.option.GameOptions.method_48187(sliderProgressValue); }
// public void method_48188(java.lang.Double value) { wrapperContained.method_48188(value); }
// public static void method_48188(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_48188(value); }
// public yarnwrap.text.Text method_48189(yarnwrap.text.Text optionText,java.lang.Double value) { return new yarnwrap.text.Text(wrapperContained.method_48189(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_48189(yarnwrap.text.Text optionText,java.lang.Double value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_48189(optionText.wrapperContained,value)); }
// public int method_48190(java.lang.Double value) { return wrapperContained.method_48190(value); }
// public static int method_48190(java.lang.Double value, ) { return net.minecraft.client.option.GameOptions.method_48190(value); }
public yarnwrap.client.option.SimpleOption getNotificationDisplayTime() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getNotificationDisplayTime()); }
// public static yarnwrap.client.option.SimpleOption getNotificationDisplayTime() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getNotificationDisplayTime()); }
public yarnwrap.client.option.SimpleOption getGlintSpeed() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getGlintSpeed()); }
// public static yarnwrap.client.option.SimpleOption getGlintSpeed() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getGlintSpeed()); }
public yarnwrap.client.option.SimpleOption getGlintStrength() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getGlintStrength()); }
// public static yarnwrap.client.option.SimpleOption getGlintStrength() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getGlintStrength()); }
// public void method_48582(java.lang.Double value) { wrapperContained.method_48582(value); }
// public static void method_48582(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_48582(value); }
public yarnwrap.client.option.SimpleOption getDamageTiltStrength() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getDamageTiltStrength()); }
// public static yarnwrap.client.option.SimpleOption getDamageTiltStrength() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getDamageTiltStrength()); }
public void refreshResourcePacks(yarnwrap.resource.ResourcePackManager resourcePackManager) { wrapperContained.refreshResourcePacks(resourcePackManager.wrapperContained); }
// public static void refreshResourcePacks(yarnwrap.resource.ResourcePackManager resourcePackManager, ) { net.minecraft.client.option.GameOptions.refreshResourcePacks(resourcePackManager.wrapperContained); }
// public void method_49599(java.lang.Boolean value) { wrapperContained.method_49599(value); }
// public static void method_49599(java.lang.Boolean value, ) { net.minecraft.client.option.GameOptions.method_49599(value); }
public yarnwrap.client.option.SimpleOption getHighContrast() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getHighContrast()); }
// public static yarnwrap.client.option.SimpleOption getHighContrast() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getHighContrast()); }
// public yarnwrap.client.option.CloudRenderMode method_52704(java.lang.Boolean value) { return new yarnwrap.client.option.CloudRenderMode(wrapperContained.method_52704(value)); }
// public static yarnwrap.client.option.CloudRenderMode method_52704(java.lang.Boolean value, ) { return new yarnwrap.client.option.CloudRenderMode(net.minecraft.client.option.GameOptions.method_52704(value)); }
public yarnwrap.client.option.SimpleOption getNarratorHotkey() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getNarratorHotkey()); }
// public static yarnwrap.client.option.SimpleOption getNarratorHotkey() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getNarratorHotkey()); }
public yarnwrap.network.packet.c2s.common.SyncedClientOptions getSyncedOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.getSyncedOptions()); }
// public static yarnwrap.network.packet.c2s.common.SyncedClientOptions getSyncedOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(net.minecraft.client.option.GameOptions.getSyncedOptions()); }
public yarnwrap.client.option.SimpleOption getHideSplashTexts() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getHideSplashTexts()); }
// public static yarnwrap.client.option.SimpleOption getHideSplashTexts() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getHideSplashTexts()); }
public yarnwrap.client.option.SimpleOption getJapaneseGlyphVariants() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getJapaneseGlyphVariants()); }
// public static yarnwrap.client.option.SimpleOption getJapaneseGlyphVariants() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getJapaneseGlyphVariants()); }
// public void acceptProfiledOptions(Object visitor) { wrapperContained.acceptProfiledOptions(visitor); }
// public static void acceptProfiledOptions(Object visitor, ) { net.minecraft.client.option.GameOptions.acceptProfiledOptions(visitor); }
// public void onFontOptionsChanged() { wrapperContained.onFontOptionsChanged(); }
// public static void onFontOptionsChanged() { net.minecraft.client.option.GameOptions.onFontOptionsChanged(); }
// public boolean shouldUseJapaneseGlyphsByDefault() { return wrapperContained.shouldUseJapaneseGlyphsByDefault(); }
// public static boolean shouldUseJapaneseGlyphsByDefault() { return net.minecraft.client.option.GameOptions.shouldUseJapaneseGlyphsByDefault(); }
// public void method_57022(java.lang.Boolean value) { wrapperContained.method_57022(value); }
// public static void method_57022(java.lang.Boolean value, ) { net.minecraft.client.option.GameOptions.method_57022(value); }
public yarnwrap.client.option.SimpleOption getMenuBackgroundBlurriness() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMenuBackgroundBlurriness()); }
// public static yarnwrap.client.option.SimpleOption getMenuBackgroundBlurriness() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getMenuBackgroundBlurriness()); }
public int getMenuBackgroundBlurrinessValue() { return wrapperContained.getMenuBackgroundBlurrinessValue(); }
// public static int getMenuBackgroundBlurrinessValue() { return net.minecraft.client.option.GameOptions.getMenuBackgroundBlurrinessValue(); }
// public void method_57704(java.lang.Integer value) { wrapperContained.method_57704(value); }
// public static void method_57704(java.lang.Integer value, ) { net.minecraft.client.option.GameOptions.method_57704(value); }
// public yarnwrap.text.Text getPercentValueOrOffText(yarnwrap.text.Text prefix,double value) { return new yarnwrap.text.Text(wrapperContained.getPercentValueOrOffText(prefix.wrapperContained,value)); }
// public static yarnwrap.text.Text getPercentValueOrOffText(yarnwrap.text.Text prefix,double value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.getPercentValueOrOffText(prefix.wrapperContained,value)); }
// public yarnwrap.text.Text getGenericValueOrOffText(yarnwrap.text.Text prefix,int value) { return new yarnwrap.text.Text(wrapperContained.getGenericValueOrOffText(prefix.wrapperContained,value)); }
// public static yarnwrap.text.Text getGenericValueOrOffText(yarnwrap.text.Text prefix,int value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.getGenericValueOrOffText(prefix.wrapperContained,value)); }
public void setAccessibilityOnboarded() { wrapperContained.setAccessibilityOnboarded(); }
// public static void setAccessibilityOnboarded() { net.minecraft.client.option.GameOptions.setAccessibilityOnboarded(); }
public yarnwrap.client.option.SimpleOption getRotateWithMinecart() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getRotateWithMinecart()); }
// public static yarnwrap.client.option.SimpleOption getRotateWithMinecart() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getRotateWithMinecart()); }
// public yarnwrap.client.gui.tooltip.Tooltip method_61969(yarnwrap.client.option.InactivityFpsLimit option) { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.method_61969(option.wrapperContained)); }
// public static yarnwrap.client.gui.tooltip.Tooltip method_61969(yarnwrap.client.option.InactivityFpsLimit option, ) { return new yarnwrap.client.gui.tooltip.Tooltip(net.minecraft.client.option.GameOptions.method_61969(option.wrapperContained)); }
public yarnwrap.client.option.SimpleOption getInactivityFpsLimit() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getInactivityFpsLimit()); }
// public static yarnwrap.client.option.SimpleOption getInactivityFpsLimit() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getInactivityFpsLimit()); }
public yarnwrap.client.option.SimpleOption getHighContrastBlockOutline() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getHighContrastBlockOutline()); }
// public static yarnwrap.client.option.SimpleOption getHighContrastBlockOutline() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getHighContrastBlockOutline()); }
// public java.lang.String getFullscreenResolution() { return wrapperContained.getFullscreenResolution(); }
// public static java.lang.String getFullscreenResolution() { return net.minecraft.client.option.GameOptions.getFullscreenResolution(); }
// public yarnwrap.client.option.SimpleOption method_66524(yarnwrap.sound.SoundCategory category) { return new yarnwrap.client.option.SimpleOption(wrapperContained.method_66524(category.wrapperContained)); }
// public static yarnwrap.client.option.SimpleOption method_66524(yarnwrap.sound.SoundCategory category, ) { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.method_66524(category.wrapperContained)); }
// public void method_71042(java.lang.Double value) { wrapperContained.method_71042(value); }
// public static void method_71042(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_71042(value); }
// public void method_71043(java.lang.Double value) { wrapperContained.method_71043(value); }
// public static void method_71043(java.lang.Double value, ) { net.minecraft.client.option.GameOptions.method_71043(value); }
// public yarnwrap.text.Text method_71268(yarnwrap.text.Text optionText,java.lang.Integer value) { return new yarnwrap.text.Text(wrapperContained.method_71268(optionText.wrapperContained,value)); }
// public static yarnwrap.text.Text method_71268(yarnwrap.text.Text optionText,java.lang.Integer value, ) { return new yarnwrap.text.Text(net.minecraft.client.option.GameOptions.method_71268(optionText.wrapperContained,value)); }
// public void method_71269(java.lang.Integer value) { wrapperContained.method_71269(value); }
// public static void method_71269(java.lang.Integer value, ) { net.minecraft.client.option.GameOptions.method_71269(value); }
// public yarnwrap.client.option.SimpleOption getCloudRenderDistance() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getCloudRenderDistance()); }
// public static yarnwrap.client.option.SimpleOption getCloudRenderDistance() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getCloudRenderDistance()); }
// public void method_71785(Object value) { wrapperContained.method_71785(value); }
// public static void method_71785(Object value, ) { net.minecraft.client.option.GameOptions.method_71785(value); }
// public void method_71786(java.lang.Boolean value) { wrapperContained.method_71786(value); }
// public static void method_71786(java.lang.Boolean value, ) { net.minecraft.client.option.GameOptions.method_71786(value); }
// public yarnwrap.client.option.SimpleOption getShowNowPlayingToast() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getShowNowPlayingToast()); }
// public static yarnwrap.client.option.SimpleOption getShowNowPlayingToast() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getShowNowPlayingToast()); }
// public yarnwrap.client.option.SimpleOption getMusicFrequency() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMusicFrequency()); }
// public static yarnwrap.client.option.SimpleOption getMusicFrequency() { return new yarnwrap.client.option.SimpleOption(net.minecraft.client.option.GameOptions.getMusicFrequency()); }

}