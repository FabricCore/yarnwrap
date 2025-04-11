package yarnwrap.client.option;
public class GameOptions { public net.minecraft.client.option.GameOptions wrapperContained; public GameOptions(net.minecraft.client.option.GameOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.option.SimpleOption cloudRenderMode() { return new yarnwrap.client.option.SimpleOption(wrapperContained.cloudRenderMode); }
// public void cloudRenderMode(yarnwrap.client.option.SimpleOption value) { wrapperContained.cloudRenderMode = value.wrapperContained; }
public boolean hideServerAddress() { return wrapperContained.hideServerAddress; }
public void hideServerAddress(boolean value) { wrapperContained.hideServerAddress = value; }
public yarnwrap.client.option.KeyBinding smoothCameraKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.smoothCameraKey); }
// public void smoothCameraKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.smoothCameraKey = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption chatLinksPrompt() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatLinksPrompt); }
// public void chatLinksPrompt(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatLinksPrompt = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption showSubtitles() { return new yarnwrap.client.option.SimpleOption(wrapperContained.showSubtitles); }
// public void showSubtitles(yarnwrap.client.option.SimpleOption value) { wrapperContained.showSubtitles = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption forceUnicodeFont() { return new yarnwrap.client.option.SimpleOption(wrapperContained.forceUnicodeFont); }
// public void forceUnicodeFont(yarnwrap.client.option.SimpleOption value) { wrapperContained.forceUnicodeFont = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption chatOpacity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatOpacity); }
// public void chatOpacity(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatOpacity = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding inventoryKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.inventoryKey); }
// public void inventoryKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.inventoryKey = value.wrapperContained; }
// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
public yarnwrap.client.option.KeyBinding togglePerspectiveKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.togglePerspectiveKey); }
// public void togglePerspectiveKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.togglePerspectiveKey = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption chatHeightUnfocused() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatHeightUnfocused); }
// public void chatHeightUnfocused(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatHeightUnfocused = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption fov() { return new yarnwrap.client.option.SimpleOption(wrapperContained.fov); }
// public void fov(yarnwrap.client.option.SimpleOption value) { wrapperContained.fov = value.wrapperContained; }
public boolean advancedItemTooltips() { return wrapperContained.advancedItemTooltips; }
public void advancedItemTooltips(boolean value) { wrapperContained.advancedItemTooltips = value; }
public java.lang.String fullscreenResolution() { return wrapperContained.fullscreenResolution; }
public void fullscreenResolution(java.lang.String value) { wrapperContained.fullscreenResolution = value; }
// public yarnwrap.client.option.SimpleOption mainArm() { return new yarnwrap.client.option.SimpleOption(wrapperContained.mainArm); }
// public void mainArm(yarnwrap.client.option.SimpleOption value) { wrapperContained.mainArm = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption realmsNotifications() { return new yarnwrap.client.option.SimpleOption(wrapperContained.realmsNotifications); }
// public void realmsNotifications(yarnwrap.client.option.SimpleOption value) { wrapperContained.realmsNotifications = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding swapHandsKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.swapHandsKey); }
// public void swapHandsKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.swapHandsKey = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding sneakKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.sneakKey); }
// public void sneakKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.sneakKey = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.client.option.KeyBinding screenshotKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.screenshotKey); }
// public void screenshotKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.screenshotKey = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding fullscreenKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.fullscreenKey); }
// public void fullscreenKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.fullscreenKey = value.wrapperContained; }
public boolean pauseOnLostFocus() { return wrapperContained.pauseOnLostFocus; }
public void pauseOnLostFocus(boolean value) { wrapperContained.pauseOnLostFocus = value; }
// public yarnwrap.client.option.SimpleOption chatHeightFocused() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatHeightFocused); }
// public void chatHeightFocused(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatHeightFocused = value.wrapperContained; }
public net.minecraft.client.option.KeyBinding[] allKeys() { return wrapperContained.allKeys; }
// public void allKeys(net.minecraft.client.option.KeyBinding[] value) { wrapperContained.allKeys = value; }
// public yarnwrap.client.option.SimpleOption gamma() { return new yarnwrap.client.option.SimpleOption(wrapperContained.gamma); }
// public void gamma(yarnwrap.client.option.SimpleOption value) { wrapperContained.gamma = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption ao() { return new yarnwrap.client.option.SimpleOption(wrapperContained.ao); }
// public void ao(yarnwrap.client.option.SimpleOption value) { wrapperContained.ao = value.wrapperContained; }
public boolean hudHidden() { return wrapperContained.hudHidden; }
public void hudHidden(boolean value) { wrapperContained.hudHidden = value; }
// public yarnwrap.client.option.SimpleOption mouseSensitivity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.mouseSensitivity); }
// public void mouseSensitivity(yarnwrap.client.option.SimpleOption value) { wrapperContained.mouseSensitivity = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding advancementsKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.advancementsKey); }
// public void advancementsKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.advancementsKey = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding commandKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.commandKey); }
// public void commandKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.commandKey = value.wrapperContained; }
public java.util.List incompatibleResourcePacks() { return wrapperContained.incompatibleResourcePacks; }
public void incompatibleResourcePacks(java.util.List value) { wrapperContained.incompatibleResourcePacks = value; }
// public yarnwrap.client.option.SimpleOption autoJump() { return new yarnwrap.client.option.SimpleOption(wrapperContained.autoJump); }
// public void autoJump(yarnwrap.client.option.SimpleOption value) { wrapperContained.autoJump = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding rightKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.rightKey); }
// public void rightKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.rightKey = value.wrapperContained; }
public net.minecraft.client.option.KeyBinding[] hotbarKeys() { return wrapperContained.hotbarKeys; }
// public void hotbarKeys(net.minecraft.client.option.KeyBinding[] value) { wrapperContained.hotbarKeys = value; }
// public com.google.common.base.Splitter COLON_SPLITTER() { return wrapperContained.COLON_SPLITTER; }
// public void COLON_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.COLON_SPLITTER = value; }
// public yarnwrap.client.option.SimpleOption touchscreen() { return new yarnwrap.client.option.SimpleOption(wrapperContained.touchscreen); }
// public void touchscreen(yarnwrap.client.option.SimpleOption value) { wrapperContained.touchscreen = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption mipmapLevels() { return new yarnwrap.client.option.SimpleOption(wrapperContained.mipmapLevels); }
// public void mipmapLevels(yarnwrap.client.option.SimpleOption value) { wrapperContained.mipmapLevels = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption fullscreen() { return new yarnwrap.client.option.SimpleOption(wrapperContained.fullscreen); }
// public void fullscreen(yarnwrap.client.option.SimpleOption value) { wrapperContained.fullscreen = value.wrapperContained; }
// public com.google.gson.reflect.TypeToken STRING_LIST_TYPE() { return wrapperContained.STRING_LIST_TYPE; }
// public void STRING_LIST_TYPE(com.google.gson.reflect.TypeToken value) { wrapperContained.STRING_LIST_TYPE = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
public java.lang.String lastServer() { return wrapperContained.lastServer; }
public void lastServer(java.lang.String value) { wrapperContained.lastServer = value; }
// public yarnwrap.client.option.SimpleOption invertYMouse() { return new yarnwrap.client.option.SimpleOption(wrapperContained.invertYMouse); }
// public void invertYMouse(yarnwrap.client.option.SimpleOption value) { wrapperContained.invertYMouse = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding sprintKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.sprintKey); }
// public void sprintKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.sprintKey = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption guiScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.guiScale); }
// public void guiScale(yarnwrap.client.option.SimpleOption value) { wrapperContained.guiScale = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding dropKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.dropKey); }
// public void dropKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.dropKey = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption viewDistance() { return new yarnwrap.client.option.SimpleOption(wrapperContained.viewDistance); }
// public void viewDistance(yarnwrap.client.option.SimpleOption value) { wrapperContained.viewDistance = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding pickItemKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.pickItemKey); }
// public void pickItemKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.pickItemKey = value.wrapperContained; }
public int overrideWidth() { return wrapperContained.overrideWidth; }
public void overrideWidth(int value) { wrapperContained.overrideWidth = value; }
// public yarnwrap.client.option.SimpleOption backgroundForChatOnly() { return new yarnwrap.client.option.SimpleOption(wrapperContained.backgroundForChatOnly); }
// public void backgroundForChatOnly(yarnwrap.client.option.SimpleOption value) { wrapperContained.backgroundForChatOnly = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption textBackgroundOpacity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.textBackgroundOpacity); }
// public void textBackgroundOpacity(yarnwrap.client.option.SimpleOption value) { wrapperContained.textBackgroundOpacity = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption autoSuggestions() { return new yarnwrap.client.option.SimpleOption(wrapperContained.autoSuggestions); }
// public void autoSuggestions(yarnwrap.client.option.SimpleOption value) { wrapperContained.autoSuggestions = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding loadToolbarActivatorKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.loadToolbarActivatorKey); }
// public void loadToolbarActivatorKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.loadToolbarActivatorKey = value.wrapperContained; }
public yarnwrap.client.tutorial.TutorialStep tutorialStep() { return new yarnwrap.client.tutorial.TutorialStep(wrapperContained.tutorialStep); }
public void tutorialStep(yarnwrap.client.tutorial.TutorialStep value) { wrapperContained.tutorialStep = value.wrapperContained; }
public boolean useNativeTransport() { return wrapperContained.useNativeTransport; }
public void useNativeTransport(boolean value) { wrapperContained.useNativeTransport = value; }
// public yarnwrap.client.option.SimpleOption chatVisibility() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatVisibility); }
// public void chatVisibility(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatVisibility = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption biomeBlendRadius() { return new yarnwrap.client.option.SimpleOption(wrapperContained.biomeBlendRadius); }
// public void biomeBlendRadius(yarnwrap.client.option.SimpleOption value) { wrapperContained.biomeBlendRadius = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding saveToolbarActivatorKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.saveToolbarActivatorKey); }
// public void saveToolbarActivatorKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.saveToolbarActivatorKey = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding backKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.backKey); }
// public void backKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.backKey = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption particles() { return new yarnwrap.client.option.SimpleOption(wrapperContained.particles); }
// public void particles(yarnwrap.client.option.SimpleOption value) { wrapperContained.particles = value.wrapperContained; }
public java.lang.String language() { return wrapperContained.language; }
public void language(java.lang.String value) { wrapperContained.language = value; }
// public yarnwrap.client.option.SimpleOption enableVsync() { return new yarnwrap.client.option.SimpleOption(wrapperContained.enableVsync); }
// public void enableVsync(yarnwrap.client.option.SimpleOption value) { wrapperContained.enableVsync = value.wrapperContained; }
public int overrideHeight() { return wrapperContained.overrideHeight; }
public void overrideHeight(int value) { wrapperContained.overrideHeight = value; }
public yarnwrap.client.option.KeyBinding attackKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.attackKey); }
// public void attackKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.attackKey = value.wrapperContained; }
public java.util.List resourcePacks() { return wrapperContained.resourcePacks; }
public void resourcePacks(java.util.List value) { wrapperContained.resourcePacks = value; }
// public yarnwrap.client.option.SimpleOption entityShadows() { return new yarnwrap.client.option.SimpleOption(wrapperContained.entityShadows); }
// public void entityShadows(yarnwrap.client.option.SimpleOption value) { wrapperContained.entityShadows = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption mouseWheelSensitivity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.mouseWheelSensitivity); }
// public void mouseWheelSensitivity(yarnwrap.client.option.SimpleOption value) { wrapperContained.mouseWheelSensitivity = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding chatKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.chatKey); }
// public void chatKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.chatKey = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption bobView() { return new yarnwrap.client.option.SimpleOption(wrapperContained.bobView); }
// public void bobView(yarnwrap.client.option.SimpleOption value) { wrapperContained.bobView = value.wrapperContained; }
// public java.util.Set enabledPlayerModelParts() { return wrapperContained.enabledPlayerModelParts; }
// public void enabledPlayerModelParts(java.util.Set value) { wrapperContained.enabledPlayerModelParts = value; }
public yarnwrap.client.option.KeyBinding forwardKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.forwardKey); }
// public void forwardKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.forwardKey = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption attackIndicator() { return new yarnwrap.client.option.SimpleOption(wrapperContained.attackIndicator); }
// public void attackIndicator(yarnwrap.client.option.SimpleOption value) { wrapperContained.attackIndicator = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption narrator() { return new yarnwrap.client.option.SimpleOption(wrapperContained.narrator); }
// public void narrator(yarnwrap.client.option.SimpleOption value) { wrapperContained.narrator = value.wrapperContained; }
// public java.io.File optionsFile() { return wrapperContained.optionsFile; }
// public void optionsFile(java.io.File value) { wrapperContained.optionsFile = value; }
// public yarnwrap.client.option.SimpleOption chatColors() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatColors); }
// public void chatColors(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatColors = value.wrapperContained; }
public int glDebugVerbosity() { return wrapperContained.glDebugVerbosity; }
public void glDebugVerbosity(int value) { wrapperContained.glDebugVerbosity = value; }
public yarnwrap.client.option.KeyBinding jumpKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.jumpKey); }
// public void jumpKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.jumpKey = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding useKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.useKey); }
// public void useKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.useKey = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding spectatorOutlinesKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.spectatorOutlinesKey); }
// public void spectatorOutlinesKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.spectatorOutlinesKey = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding playerListKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.playerListKey); }
// public void playerListKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.playerListKey = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption chatScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatScale); }
// public void chatScale(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatScale = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption maxFps() { return new yarnwrap.client.option.SimpleOption(wrapperContained.maxFps); }
// public void maxFps(yarnwrap.client.option.SimpleOption value) { wrapperContained.maxFps = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption reducedDebugInfo() { return new yarnwrap.client.option.SimpleOption(wrapperContained.reducedDebugInfo); }
// public void reducedDebugInfo(yarnwrap.client.option.SimpleOption value) { wrapperContained.reducedDebugInfo = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption chatLinks() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatLinks); }
// public void chatLinks(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatLinks = value.wrapperContained; }
public yarnwrap.client.option.KeyBinding leftKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.leftKey); }
// public void leftKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.leftKey = value.wrapperContained; }
public boolean smoothCameraEnabled() { return wrapperContained.smoothCameraEnabled; }
public void smoothCameraEnabled(boolean value) { wrapperContained.smoothCameraEnabled = value; }
// public yarnwrap.client.option.SimpleOption chatWidth() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatWidth); }
// public void chatWidth(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatWidth = value.wrapperContained; }
// public java.util.Map soundVolumeLevels() { return wrapperContained.soundVolumeLevels; }
// public void soundVolumeLevels(java.util.Map value) { wrapperContained.soundVolumeLevels = value; }
// public yarnwrap.client.option.SimpleOption discreteMouseScroll() { return new yarnwrap.client.option.SimpleOption(wrapperContained.discreteMouseScroll); }
// public void discreteMouseScroll(yarnwrap.client.option.SimpleOption value) { wrapperContained.discreteMouseScroll = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption rawMouseInput() { return new yarnwrap.client.option.SimpleOption(wrapperContained.rawMouseInput); }
// public void rawMouseInput(yarnwrap.client.option.SimpleOption value) { wrapperContained.rawMouseInput = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption sneakToggled() { return new yarnwrap.client.option.SimpleOption(wrapperContained.sneakToggled); }
// public void sneakToggled(yarnwrap.client.option.SimpleOption value) { wrapperContained.sneakToggled = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption sprintToggled() { return new yarnwrap.client.option.SimpleOption(wrapperContained.sprintToggled); }
// public void sprintToggled(yarnwrap.client.option.SimpleOption value) { wrapperContained.sprintToggled = value.wrapperContained; }
public boolean skipMultiplayerWarning() { return wrapperContained.skipMultiplayerWarning; }
public void skipMultiplayerWarning(boolean value) { wrapperContained.skipMultiplayerWarning = value; }
// public yarnwrap.client.option.SimpleOption chatLineSpacing() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatLineSpacing); }
// public void chatLineSpacing(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatLineSpacing = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption chatDelay() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chatDelay); }
// public void chatDelay(yarnwrap.client.option.SimpleOption value) { wrapperContained.chatDelay = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption entityDistanceScaling() { return new yarnwrap.client.option.SimpleOption(wrapperContained.entityDistanceScaling); }
// public void entityDistanceScaling(yarnwrap.client.option.SimpleOption value) { wrapperContained.entityDistanceScaling = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption graphicsMode() { return new yarnwrap.client.option.SimpleOption(wrapperContained.graphicsMode); }
// public void graphicsMode(yarnwrap.client.option.SimpleOption value) { wrapperContained.graphicsMode = value.wrapperContained; }
public boolean syncChunkWrites() { return wrapperContained.syncChunkWrites; }
public void syncChunkWrites(boolean value) { wrapperContained.syncChunkWrites = value; }
// public yarnwrap.client.option.SimpleOption distortionEffectScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.distortionEffectScale); }
// public void distortionEffectScale(yarnwrap.client.option.SimpleOption value) { wrapperContained.distortionEffectScale = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption fovEffectScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.fovEffectScale); }
// public void fovEffectScale(yarnwrap.client.option.SimpleOption value) { wrapperContained.fovEffectScale = value.wrapperContained; }
// public yarnwrap.client.option.Perspective perspective() { return new yarnwrap.client.option.Perspective(wrapperContained.perspective); }
// public void perspective(yarnwrap.client.option.Perspective value) { wrapperContained.perspective = value.wrapperContained; }
public boolean joinedFirstServer() { return wrapperContained.joinedFirstServer; }
public void joinedFirstServer(boolean value) { wrapperContained.joinedFirstServer = value; }
public yarnwrap.client.option.KeyBinding socialInteractionsKey() { return new yarnwrap.client.option.KeyBinding(wrapperContained.socialInteractionsKey); }
// public void socialInteractionsKey(yarnwrap.client.option.KeyBinding value) { wrapperContained.socialInteractionsKey = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption hideMatchedNames() { return new yarnwrap.client.option.SimpleOption(wrapperContained.hideMatchedNames); }
// public void hideMatchedNames(yarnwrap.client.option.SimpleOption value) { wrapperContained.hideMatchedNames = value.wrapperContained; }
public boolean hideBundleTutorial() { return wrapperContained.hideBundleTutorial; }
public void hideBundleTutorial(boolean value) { wrapperContained.hideBundleTutorial = value; }
// public yarnwrap.client.option.SimpleOption monochromeLogo() { return new yarnwrap.client.option.SimpleOption(wrapperContained.monochromeLogo); }
// public void monochromeLogo(yarnwrap.client.option.SimpleOption value) { wrapperContained.monochromeLogo = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption soundDevice() { return new yarnwrap.client.option.SimpleOption(wrapperContained.soundDevice); }
// public void soundDevice(yarnwrap.client.option.SimpleOption value) { wrapperContained.soundDevice = value.wrapperContained; }
// public int serverViewDistance() { return wrapperContained.serverViewDistance; }
// public void serverViewDistance(int value) { wrapperContained.serverViewDistance = value; }
public java.lang.String EMPTY_STRING() { return wrapperContained.EMPTY_STRING; }
// public void EMPTY_STRING(java.lang.String value) { wrapperContained.EMPTY_STRING = value; }
// public yarnwrap.client.option.SimpleOption hideLightningFlashes() { return new yarnwrap.client.option.SimpleOption(wrapperContained.hideLightningFlashes); }
// public void hideLightningFlashes(yarnwrap.client.option.SimpleOption value) { wrapperContained.hideLightningFlashes = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption chunkBuilderMode() { return new yarnwrap.client.option.SimpleOption(wrapperContained.chunkBuilderMode); }
// public void chunkBuilderMode(yarnwrap.client.option.SimpleOption value) { wrapperContained.chunkBuilderMode = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption simulationDistance() { return new yarnwrap.client.option.SimpleOption(wrapperContained.simulationDistance); }
// public void simulationDistance(yarnwrap.client.option.SimpleOption value) { wrapperContained.simulationDistance = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption showAutosaveIndicator() { return new yarnwrap.client.option.SimpleOption(wrapperContained.showAutosaveIndicator); }
// public void showAutosaveIndicator(yarnwrap.client.option.SimpleOption value) { wrapperContained.showAutosaveIndicator = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption allowServerListing() { return new yarnwrap.client.option.SimpleOption(wrapperContained.allowServerListing); }
// public void allowServerListing(yarnwrap.client.option.SimpleOption value) { wrapperContained.allowServerListing = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption directionalAudio() { return new yarnwrap.client.option.SimpleOption(wrapperContained.directionalAudio); }
// public void directionalAudio(yarnwrap.client.option.SimpleOption value) { wrapperContained.directionalAudio = value.wrapperContained; }
// public yarnwrap.text.Text DARK_MOJANG_STUDIOS_BACKGROUND_COLOR_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.DARK_MOJANG_STUDIOS_BACKGROUND_COLOR_TOOLTIP); }
// public void DARK_MOJANG_STUDIOS_BACKGROUND_COLOR_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.DARK_MOJANG_STUDIOS_BACKGROUND_COLOR_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text HIDE_LIGHTNING_FLASHES_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.HIDE_LIGHTNING_FLASHES_TOOLTIP); }
// public void HIDE_LIGHTNING_FLASHES_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.HIDE_LIGHTNING_FLASHES_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text NONE_CHUNK_BUILDER_MODE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.NONE_CHUNK_BUILDER_MODE_TOOLTIP); }
// public void NONE_CHUNK_BUILDER_MODE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.NONE_CHUNK_BUILDER_MODE_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text BY_PLAYER_CHUNK_BUILDER_MODE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.BY_PLAYER_CHUNK_BUILDER_MODE_TOOLTIP); }
// public void BY_PLAYER_CHUNK_BUILDER_MODE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.BY_PLAYER_CHUNK_BUILDER_MODE_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text NEARBY_CHUNK_BUILDER_MODE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.NEARBY_CHUNK_BUILDER_MODE_TOOLTIP); }
// public void NEARBY_CHUNK_BUILDER_MODE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.NEARBY_CHUNK_BUILDER_MODE_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text FABULOUS_GRAPHICS_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.FABULOUS_GRAPHICS_TOOLTIP); }
// public void FABULOUS_GRAPHICS_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.FABULOUS_GRAPHICS_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text FANCY_GRAPHICS_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.FANCY_GRAPHICS_TOOLTIP); }
// public void FANCY_GRAPHICS_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.FANCY_GRAPHICS_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text FAST_GRAPHICS_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.FAST_GRAPHICS_TOOLTIP); }
// public void FAST_GRAPHICS_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.FAST_GRAPHICS_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text SCREEN_EFFECT_SCALE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.SCREEN_EFFECT_SCALE_TOOLTIP); }
// public void SCREEN_EFFECT_SCALE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.SCREEN_EFFECT_SCALE_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text FOV_EFFECT_SCALE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.FOV_EFFECT_SCALE_TOOLTIP); }
// public void FOV_EFFECT_SCALE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.FOV_EFFECT_SCALE_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text DARKNESS_EFFECT_SCALE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.DARKNESS_EFFECT_SCALE_TOOLTIP); }
// public void DARKNESS_EFFECT_SCALE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.DARKNESS_EFFECT_SCALE_TOOLTIP = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption darknessEffectScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.darknessEffectScale); }
// public void darknessEffectScale(yarnwrap.client.option.SimpleOption value) { wrapperContained.darknessEffectScale = value.wrapperContained; }
// public yarnwrap.text.Text ALLOW_SERVER_LISTING_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.ALLOW_SERVER_LISTING_TOOLTIP); }
// public void ALLOW_SERVER_LISTING_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.ALLOW_SERVER_LISTING_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text DIRECTIONAL_AUDIO_ON_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.DIRECTIONAL_AUDIO_ON_TOOLTIP); }
// public void DIRECTIONAL_AUDIO_ON_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.DIRECTIONAL_AUDIO_ON_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text DIRECTIONAL_AUDIO_OFF_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.DIRECTIONAL_AUDIO_OFF_TOOLTIP); }
// public void DIRECTIONAL_AUDIO_OFF_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.DIRECTIONAL_AUDIO_OFF_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text TOGGLE_KEY_TEXT() { return new yarnwrap.text.Text(wrapperContained.TOGGLE_KEY_TEXT); }
// public void TOGGLE_KEY_TEXT(yarnwrap.text.Text value) { wrapperContained.TOGGLE_KEY_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text HOLD_KEY_TEXT() { return new yarnwrap.text.Text(wrapperContained.HOLD_KEY_TEXT); }
// public void HOLD_KEY_TEXT(yarnwrap.text.Text value) { wrapperContained.HOLD_KEY_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text HIDE_MATCHED_NAMES_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.HIDE_MATCHED_NAMES_TOOLTIP); }
// public void HIDE_MATCHED_NAMES_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.HIDE_MATCHED_NAMES_TOOLTIP = value.wrapperContained; }
public int MAX_FRAMERATE() { return wrapperContained.MAX_FRAMERATE; }
// public void MAX_FRAMERATE(int value) { wrapperContained.MAX_FRAMERATE = value; }
// public yarnwrap.text.Text ONLY_SHOW_SECURE_CHAT_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.ONLY_SHOW_SECURE_CHAT_TOOLTIP); }
// public void ONLY_SHOW_SECURE_CHAT_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.ONLY_SHOW_SECURE_CHAT_TOOLTIP = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption onlyShowSecureChat() { return new yarnwrap.client.option.SimpleOption(wrapperContained.onlyShowSecureChat); }
// public void onlyShowSecureChat(yarnwrap.client.option.SimpleOption value) { wrapperContained.onlyShowSecureChat = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption panoramaSpeed() { return new yarnwrap.client.option.SimpleOption(wrapperContained.panoramaSpeed); }
// public void panoramaSpeed(yarnwrap.client.option.SimpleOption value) { wrapperContained.panoramaSpeed = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption operatorItemsTab() { return new yarnwrap.client.option.SimpleOption(wrapperContained.operatorItemsTab); }
// public void operatorItemsTab(yarnwrap.client.option.SimpleOption value) { wrapperContained.operatorItemsTab = value.wrapperContained; }
// public yarnwrap.text.Text TELEMETRY_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.TELEMETRY_TOOLTIP); }
// public void TELEMETRY_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.TELEMETRY_TOOLTIP = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption telemetryOptInExtra() { return new yarnwrap.client.option.SimpleOption(wrapperContained.telemetryOptInExtra); }
// public void telemetryOptInExtra(yarnwrap.client.option.SimpleOption value) { wrapperContained.telemetryOptInExtra = value.wrapperContained; }
// public yarnwrap.text.Text NOTIFICATION_DISPLAY_TIME_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.NOTIFICATION_DISPLAY_TIME_TOOLTIP); }
// public void NOTIFICATION_DISPLAY_TIME_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.NOTIFICATION_DISPLAY_TIME_TOOLTIP = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption notificationDisplayTime() { return new yarnwrap.client.option.SimpleOption(wrapperContained.notificationDisplayTime); }
// public void notificationDisplayTime(yarnwrap.client.option.SimpleOption value) { wrapperContained.notificationDisplayTime = value.wrapperContained; }
public boolean onboardAccessibility() { return wrapperContained.onboardAccessibility; }
public void onboardAccessibility(boolean value) { wrapperContained.onboardAccessibility = value; }
// public yarnwrap.text.Text GLINT_SPEED_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.GLINT_SPEED_TOOLTIP); }
// public void GLINT_SPEED_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.GLINT_SPEED_TOOLTIP = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption glintSpeed() { return new yarnwrap.client.option.SimpleOption(wrapperContained.glintSpeed); }
// public void glintSpeed(yarnwrap.client.option.SimpleOption value) { wrapperContained.glintSpeed = value.wrapperContained; }
// public yarnwrap.text.Text GLINT_STRENGTH_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.GLINT_STRENGTH_TOOLTIP); }
// public void GLINT_STRENGTH_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.GLINT_STRENGTH_TOOLTIP = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption glintStrength() { return new yarnwrap.client.option.SimpleOption(wrapperContained.glintStrength); }
// public void glintStrength(yarnwrap.client.option.SimpleOption value) { wrapperContained.glintStrength = value.wrapperContained; }
// public yarnwrap.text.Text DAMAGE_TILT_STRENGTH_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.DAMAGE_TILT_STRENGTH_TOOLTIP); }
// public void DAMAGE_TILT_STRENGTH_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.DAMAGE_TILT_STRENGTH_TOOLTIP = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption damageTiltStrength() { return new yarnwrap.client.option.SimpleOption(wrapperContained.damageTiltStrength); }
// public void damageTiltStrength(yarnwrap.client.option.SimpleOption value) { wrapperContained.damageTiltStrength = value.wrapperContained; }
// public yarnwrap.text.Text HIGH_CONTRAST_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.HIGH_CONTRAST_TOOLTIP); }
// public void HIGH_CONTRAST_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.HIGH_CONTRAST_TOOLTIP = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption highContrast() { return new yarnwrap.client.option.SimpleOption(wrapperContained.highContrast); }
// public void highContrast(yarnwrap.client.option.SimpleOption value) { wrapperContained.highContrast = value.wrapperContained; }
// public int MAX_SERIALIZABLE_GUI_SCALE() { return wrapperContained.MAX_SERIALIZABLE_GUI_SCALE; }
// public void MAX_SERIALIZABLE_GUI_SCALE(int value) { wrapperContained.MAX_SERIALIZABLE_GUI_SCALE = value; }
// public yarnwrap.client.option.SimpleOption narratorHotkey() { return new yarnwrap.client.option.SimpleOption(wrapperContained.narratorHotkey); }
// public void narratorHotkey(yarnwrap.client.option.SimpleOption value) { wrapperContained.narratorHotkey = value.wrapperContained; }
// public yarnwrap.text.Text HIDE_SPLASH_TEXTS_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.HIDE_SPLASH_TEXTS_TOOLTIP); }
// public void HIDE_SPLASH_TEXTS_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.HIDE_SPLASH_TEXTS_TOOLTIP = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption hideSplashTexts() { return new yarnwrap.client.option.SimpleOption(wrapperContained.hideSplashTexts); }
// public void hideSplashTexts(yarnwrap.client.option.SimpleOption value) { wrapperContained.hideSplashTexts = value.wrapperContained; }
// public yarnwrap.client.option.SimpleOption japaneseGlyphVariants() { return new yarnwrap.client.option.SimpleOption(wrapperContained.japaneseGlyphVariants); }
// public void japaneseGlyphVariants(yarnwrap.client.option.SimpleOption value) { wrapperContained.japaneseGlyphVariants = value.wrapperContained; }
// public yarnwrap.text.Text MENU_BACKGROUND_BLURRINESS_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.MENU_BACKGROUND_BLURRINESS_TOOLTIP); }
// public void MENU_BACKGROUND_BLURRINESS_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.MENU_BACKGROUND_BLURRINESS_TOOLTIP = value.wrapperContained; }
// public int DEFAULT_MENU_BACKGROUND_BLURRINESS() { return wrapperContained.DEFAULT_MENU_BACKGROUND_BLURRINESS; }
// public void DEFAULT_MENU_BACKGROUND_BLURRINESS(int value) { wrapperContained.DEFAULT_MENU_BACKGROUND_BLURRINESS = value; }
// public yarnwrap.client.option.SimpleOption menuBackgroundBlurriness() { return new yarnwrap.client.option.SimpleOption(wrapperContained.menuBackgroundBlurriness); }
// public void menuBackgroundBlurriness(yarnwrap.client.option.SimpleOption value) { wrapperContained.menuBackgroundBlurriness = value.wrapperContained; }
// public yarnwrap.text.Text REALMS_NOTIFICATIONS_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.REALMS_NOTIFICATIONS_TOOLTIP); }
// public void REALMS_NOTIFICATIONS_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.REALMS_NOTIFICATIONS_TOOLTIP = value.wrapperContained; }
// public yarnwrap.nbt.NbtCompound update(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.update(nbt.wrapperContained)); }
public void addResourcePackProfilesToManager(yarnwrap.resource.ResourcePackManager manager) { wrapperContained.addResourcePackProfilesToManager(manager.wrapperContained); }
public float getSoundVolume(yarnwrap.sound.SoundCategory category) { return wrapperContained.getSoundVolume(category.wrapperContained); }
public void togglePlayerModelPart(yarnwrap.entity.player.PlayerModelPart part,boolean enabled) { wrapperContained.togglePlayerModelPart(part.wrapperContained,enabled); }
public yarnwrap.client.option.CloudRenderMode getCloudRenderModeValue() { return new yarnwrap.client.option.CloudRenderMode(wrapperContained.getCloudRenderModeValue()); }
// public void setPlayerModelPart(yarnwrap.entity.player.PlayerModelPart part,boolean enabled) { wrapperContained.setPlayerModelPart(part.wrapperContained,enabled); }
public void load() { wrapperContained.load(); }
public boolean shouldUseNativeTransport() { return wrapperContained.shouldUseNativeTransport(); }
public void write() { wrapperContained.write(); }
// public void setKeyCode(yarnwrap.client.option.KeyBinding key,Object code) { wrapperContained.setKeyCode(key.wrapperContained,code); }
public void sendClientSettings() { wrapperContained.sendClientSettings(); }
public float getTextBackgroundOpacity(float fallback) { return wrapperContained.getTextBackgroundOpacity(fallback); }
public int getTextBackgroundColor(int fallbackColor) { return wrapperContained.getTextBackgroundColor(fallbackColor); }
public int getTextBackgroundColor(float fallbackOpacity) { return wrapperContained.getTextBackgroundColor(fallbackOpacity); }
public void setPerspective(yarnwrap.client.option.Perspective perspective) { wrapperContained.setPerspective(perspective.wrapperContained); }
public yarnwrap.client.option.Perspective getPerspective() { return new yarnwrap.client.option.Perspective(wrapperContained.getPerspective()); }
public boolean isPlayerModelPartEnabled(yarnwrap.entity.player.PlayerModelPart part) { return wrapperContained.isPlayerModelPartEnabled(part.wrapperContained); }
// public boolean isTrue(java.lang.String value) { return wrapperContained.isTrue(value); }
// public boolean isFalse(java.lang.String value) { return wrapperContained.isFalse(value); }
// public void accept(Object visitor) { wrapperContained.accept(visitor); }
// public java.util.List parseList(java.lang.String content) { return wrapperContained.parseList(content); }
public java.io.File getOptionsFile() { return wrapperContained.getOptionsFile(); }
public java.lang.String collectProfiledOptions() { return wrapperContained.collectProfiledOptions(); }
public void setServerViewDistance(int serverViewDistance) { wrapperContained.setServerViewDistance(serverViewDistance); }
public int getClampedViewDistance() { return wrapperContained.getClampedViewDistance(); }
public yarnwrap.client.option.SimpleOption getMonochromeLogo() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMonochromeLogo()); }
// public int toMouseWheelSensitivitySliderProgressValue(double value) { return wrapperContained.toMouseWheelSensitivitySliderProgressValue(value); }
// public yarnwrap.text.Text getPercentValueText(yarnwrap.text.Text prefix,double value) { return new yarnwrap.text.Text(wrapperContained.getPercentValueText(prefix.wrapperContained,value)); }
public yarnwrap.text.Text getGenericValueText(yarnwrap.text.Text prefix,int value) { return new yarnwrap.text.Text(wrapperContained.getGenericValueText(prefix.wrapperContained,value)); }
public yarnwrap.text.Text getGenericValueText(yarnwrap.text.Text prefix,yarnwrap.text.Text value) { return new yarnwrap.text.Text(wrapperContained.getGenericValueText(prefix.wrapperContained,value.wrapperContained)); }
public yarnwrap.client.option.SimpleOption getHideLightningFlashes() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getHideLightningFlashes()); }
// public yarnwrap.text.Text getPixelValueText(yarnwrap.text.Text prefix,int value) { return new yarnwrap.text.Text(wrapperContained.getPixelValueText(prefix.wrapperContained,value)); }
public yarnwrap.client.option.SimpleOption getAo() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getAo()); }
// public double toMouseWheelSensitivityValue(int value) { return wrapperContained.toMouseWheelSensitivityValue(value); }
public yarnwrap.client.option.SimpleOption getChunkBuilderMode() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChunkBuilderMode()); }
public yarnwrap.client.option.SimpleOption getChatHeightUnfocused() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatHeightUnfocused()); }
public yarnwrap.client.option.SimpleOption getChatHeightFocused() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatHeightFocused()); }
public yarnwrap.client.option.SimpleOption getBiomeBlendRadius() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getBiomeBlendRadius()); }
public yarnwrap.client.option.SimpleOption getMouseWheelSensitivity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMouseWheelSensitivity()); }
public yarnwrap.client.option.SimpleOption getRawMouseInput() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getRawMouseInput()); }
public yarnwrap.client.option.SimpleOption getFov() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getFov()); }
public yarnwrap.client.option.SimpleOption getAutoJump() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getAutoJump()); }
public yarnwrap.client.option.SimpleOption getAutoSuggestions() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getAutoSuggestions()); }
public yarnwrap.client.option.SimpleOption getChatColors() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatColors()); }
public yarnwrap.client.option.SimpleOption getChatLinks() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatLinks()); }
public yarnwrap.client.option.SimpleOption getChatLinksPrompt() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatLinksPrompt()); }
public yarnwrap.client.option.SimpleOption getEnableVsync() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getEnableVsync()); }
public yarnwrap.client.option.SimpleOption getEntityShadows() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getEntityShadows()); }
public yarnwrap.client.option.SimpleOption getForceUnicodeFont() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getForceUnicodeFont()); }
public yarnwrap.client.option.SimpleOption getInvertYMouse() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getInvertYMouse()); }
public yarnwrap.client.option.SimpleOption getDiscreteMouseScroll() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getDiscreteMouseScroll()); }
public yarnwrap.client.option.SimpleOption getRealmsNotifications() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getRealmsNotifications()); }
public yarnwrap.client.option.SimpleOption getAllowServerListing() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getAllowServerListing()); }
public yarnwrap.client.option.SimpleOption getReducedDebugInfo() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getReducedDebugInfo()); }
public yarnwrap.client.option.SimpleOption getShowSubtitles() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getShowSubtitles()); }
public yarnwrap.client.option.SimpleOption getDirectionalAudio() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getDirectionalAudio()); }
public yarnwrap.client.option.SimpleOption getBackgroundForChatOnly() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getBackgroundForChatOnly()); }
public yarnwrap.client.option.SimpleOption getTouchscreen() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getTouchscreen()); }
public yarnwrap.client.option.SimpleOption getFullscreen() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getFullscreen()); }
public yarnwrap.client.option.SimpleOption getBobView() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getBobView()); }
public yarnwrap.client.option.SimpleOption getSneakToggled() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getSneakToggled()); }
public yarnwrap.client.option.SimpleOption getSprintToggled() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getSprintToggled()); }
public yarnwrap.client.option.SimpleOption getHideMatchedNames() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getHideMatchedNames()); }
public yarnwrap.client.option.SimpleOption getShowAutosaveIndicator() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getShowAutosaveIndicator()); }
public yarnwrap.client.option.SimpleOption getDistortionEffectScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getDistortionEffectScale()); }
public yarnwrap.client.option.SimpleOption getFovEffectScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getFovEffectScale()); }
public yarnwrap.client.option.SimpleOption getDarknessEffectScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getDarknessEffectScale()); }
public yarnwrap.client.option.SimpleOption getGamma() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getGamma()); }
public yarnwrap.client.option.SimpleOption getGuiScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getGuiScale()); }
public yarnwrap.client.option.SimpleOption getParticles() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getParticles()); }
public yarnwrap.client.option.SimpleOption getNarrator() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getNarrator()); }
public yarnwrap.client.option.SimpleOption getSoundDevice() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getSoundDevice()); }
public yarnwrap.client.option.SimpleOption getMouseSensitivity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMouseSensitivity()); }
public yarnwrap.client.option.SimpleOption getViewDistance() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getViewDistance()); }
public yarnwrap.client.option.SimpleOption getSimulationDistance() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getSimulationDistance()); }
public yarnwrap.client.option.SimpleOption getEntityDistanceScaling() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getEntityDistanceScaling()); }
public yarnwrap.client.option.SimpleOption getMaxFps() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMaxFps()); }
public yarnwrap.client.option.SimpleOption getCloudRenderMode() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getCloudRenderMode()); }
public yarnwrap.client.option.SimpleOption getGraphicsMode() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getGraphicsMode()); }
public yarnwrap.client.option.SimpleOption getChatVisibility() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatVisibility()); }
public yarnwrap.client.option.SimpleOption getChatOpacity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatOpacity()); }
public yarnwrap.client.option.SimpleOption getChatLineSpacing() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatLineSpacing()); }
public yarnwrap.client.option.SimpleOption getTextBackgroundOpacity() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getTextBackgroundOpacity()); }
public yarnwrap.client.option.SimpleOption getMainArm() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMainArm()); }
public yarnwrap.client.option.SimpleOption getChatScale() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatScale()); }
public yarnwrap.client.option.SimpleOption getChatWidth() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatWidth()); }
public yarnwrap.client.option.SimpleOption getChatDelay() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getChatDelay()); }
public yarnwrap.client.option.SimpleOption getMipmapLevels() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMipmapLevels()); }
public yarnwrap.client.option.SimpleOption getAttackIndicator() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getAttackIndicator()); }
public yarnwrap.client.option.SimpleOption getOnlyShowSecureChat() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getOnlyShowSecureChat()); }
// public yarnwrap.client.option.SimpleOption createSoundVolumeOption(java.lang.String key,yarnwrap.sound.SoundCategory category) { return new yarnwrap.client.option.SimpleOption(wrapperContained.createSoundVolumeOption(key,category.wrapperContained)); }
public yarnwrap.client.option.SimpleOption getSoundVolumeOption(yarnwrap.sound.SoundCategory category) { return new yarnwrap.client.option.SimpleOption(wrapperContained.getSoundVolumeOption(category.wrapperContained)); }
public yarnwrap.client.option.SimpleOption getPanoramaSpeed() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getPanoramaSpeed()); }
public yarnwrap.client.option.SimpleOption getOperatorItemsTab() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getOperatorItemsTab()); }
public yarnwrap.client.option.SimpleOption getTelemetryOptInExtra() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getTelemetryOptInExtra()); }
public yarnwrap.client.option.SimpleOption getNotificationDisplayTime() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getNotificationDisplayTime()); }
public yarnwrap.client.option.SimpleOption getGlintSpeed() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getGlintSpeed()); }
public yarnwrap.client.option.SimpleOption getGlintStrength() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getGlintStrength()); }
public yarnwrap.client.option.SimpleOption getDamageTiltStrength() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getDamageTiltStrength()); }
public void refreshResourcePacks(yarnwrap.resource.ResourcePackManager resourcePackManager) { wrapperContained.refreshResourcePacks(resourcePackManager.wrapperContained); }
public yarnwrap.client.option.SimpleOption getHighContrast() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getHighContrast()); }
public yarnwrap.client.option.SimpleOption getNarratorHotkey() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getNarratorHotkey()); }
public yarnwrap.network.packet.c2s.common.SyncedClientOptions getSyncedOptions() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.getSyncedOptions()); }
public yarnwrap.client.option.SimpleOption getHideSplashTexts() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getHideSplashTexts()); }
public yarnwrap.client.option.SimpleOption getJapaneseGlyphVariants() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getJapaneseGlyphVariants()); }
// public void acceptProfiledOptions(Object visitor) { wrapperContained.acceptProfiledOptions(visitor); }
// public void onFontOptionsChanged() { wrapperContained.onFontOptionsChanged(); }
// public boolean shouldUseJapaneseGlyphsByDefault() { return wrapperContained.shouldUseJapaneseGlyphsByDefault(); }
public yarnwrap.client.option.SimpleOption getMenuBackgroundBlurriness() { return new yarnwrap.client.option.SimpleOption(wrapperContained.getMenuBackgroundBlurriness()); }
public int getMenuBackgroundBlurrinessValue() { return wrapperContained.getMenuBackgroundBlurrinessValue(); }
// public yarnwrap.text.Text getPercentValueOrOffText(yarnwrap.text.Text prefix,double value) { return new yarnwrap.text.Text(wrapperContained.getPercentValueOrOffText(prefix.wrapperContained,value)); }
public yarnwrap.text.Text getGenericValueOrOffText(yarnwrap.text.Text prefix,int value) { return new yarnwrap.text.Text(wrapperContained.getGenericValueOrOffText(prefix.wrapperContained,value)); }
public void setAccessibilityOnboarded() { wrapperContained.setAccessibilityOnboarded(); }

}