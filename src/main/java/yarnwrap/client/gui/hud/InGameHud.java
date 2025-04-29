package yarnwrap.client.gui.hud;
public class InGameHud { public net.minecraft.client.gui.hud.InGameHud wrapperContained; public InGameHud(net.minecraft.client.gui.hud.InGameHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public long lastHealthCheckTime() { return wrapperContained.lastHealthCheckTime; }
// public void lastHealthCheckTime(long value) { wrapperContained.lastHealthCheckTime = value; }
// public static long lastHealthCheckTime() { return net.minecraft.client.gui.hud.InGameHud.lastHealthCheckTime; }
// public static void lastHealthCheckTime(long value, ) { net.minecraft.client.gui.hud.InGameHud.lastHealthCheckTime = value; }

public float vignetteDarkness() { return wrapperContained.vignetteDarkness; }
public void vignetteDarkness(float value) { wrapperContained.vignetteDarkness = value; }
// public static float vignetteDarkness() { return net.minecraft.client.gui.hud.InGameHud.vignetteDarkness; }
// public static void vignetteDarkness(float value, ) { net.minecraft.client.gui.hud.InGameHud.vignetteDarkness = value; }

// public int lastHealthValue() { return wrapperContained.lastHealthValue; }
// public void lastHealthValue(int value) { wrapperContained.lastHealthValue = value; }
// public static int lastHealthValue() { return net.minecraft.client.gui.hud.InGameHud.lastHealthValue; }
// public static void lastHealthValue(int value, ) { net.minecraft.client.gui.hud.InGameHud.lastHealthValue = value; }

// public yarnwrap.client.gui.hud.PlayerListHud playerListHud() { return new yarnwrap.client.gui.hud.PlayerListHud(wrapperContained.playerListHud); }
// public void playerListHud(yarnwrap.client.gui.hud.PlayerListHud value) { wrapperContained.playerListHud = value.wrapperContained; }
// public static yarnwrap.client.gui.hud.PlayerListHud playerListHud() { return new yarnwrap.client.gui.hud.PlayerListHud(net.minecraft.client.gui.hud.InGameHud.playerListHud); }
// public static void playerListHud(yarnwrap.client.gui.hud.PlayerListHud value, ) { net.minecraft.client.gui.hud.InGameHud.playerListHud = value.wrapperContained; }

// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public void title(yarnwrap.text.Text value) { wrapperContained.title = value.wrapperContained; }
// public static yarnwrap.text.Text title() { return new yarnwrap.text.Text(net.minecraft.client.gui.hud.InGameHud.title); }
// public static void title(yarnwrap.text.Text value, ) { net.minecraft.client.gui.hud.InGameHud.title = value.wrapperContained; }

// public int titleStayTicks() { return wrapperContained.titleStayTicks; }
// public void titleStayTicks(int value) { wrapperContained.titleStayTicks = value; }
// public static int titleStayTicks() { return net.minecraft.client.gui.hud.InGameHud.titleStayTicks; }
// public static void titleStayTicks(int value, ) { net.minecraft.client.gui.hud.InGameHud.titleStayTicks = value; }

// public yarnwrap.text.Text overlayMessage() { return new yarnwrap.text.Text(wrapperContained.overlayMessage); }
// public void overlayMessage(yarnwrap.text.Text value) { wrapperContained.overlayMessage = value.wrapperContained; }
// public static yarnwrap.text.Text overlayMessage() { return new yarnwrap.text.Text(net.minecraft.client.gui.hud.InGameHud.overlayMessage); }
// public static void overlayMessage(yarnwrap.text.Text value, ) { net.minecraft.client.gui.hud.InGameHud.overlayMessage = value.wrapperContained; }

// public yarnwrap.util.Identifier PUMPKIN_BLUR() { return new yarnwrap.util.Identifier(wrapperContained.PUMPKIN_BLUR); }
// public void PUMPKIN_BLUR(yarnwrap.util.Identifier value) { wrapperContained.PUMPKIN_BLUR = value.wrapperContained; }
// public static yarnwrap.util.Identifier PUMPKIN_BLUR() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.PUMPKIN_BLUR); }
// public static void PUMPKIN_BLUR(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.PUMPKIN_BLUR = value.wrapperContained; }

// public yarnwrap.util.Identifier VIGNETTE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.VIGNETTE_TEXTURE); }
// public void VIGNETTE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.VIGNETTE_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier VIGNETTE_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.VIGNETTE_TEXTURE); }
// public static void VIGNETTE_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.VIGNETTE_TEXTURE = value.wrapperContained; }

// public yarnwrap.client.gui.hud.ChatHud chatHud() { return new yarnwrap.client.gui.hud.ChatHud(wrapperContained.chatHud); }
// public void chatHud(yarnwrap.client.gui.hud.ChatHud value) { wrapperContained.chatHud = value.wrapperContained; }
// public static yarnwrap.client.gui.hud.ChatHud chatHud() { return new yarnwrap.client.gui.hud.ChatHud(net.minecraft.client.gui.hud.InGameHud.chatHud); }
// public static void chatHud(yarnwrap.client.gui.hud.ChatHud value, ) { net.minecraft.client.gui.hud.InGameHud.chatHud = value.wrapperContained; }

// public int titleRemainTicks() { return wrapperContained.titleRemainTicks; }
// public void titleRemainTicks(int value) { wrapperContained.titleRemainTicks = value; }
// public static int titleRemainTicks() { return net.minecraft.client.gui.hud.InGameHud.titleRemainTicks; }
// public static void titleRemainTicks(int value, ) { net.minecraft.client.gui.hud.InGameHud.titleRemainTicks = value; }

// public yarnwrap.client.gui.hud.SpectatorHud spectatorHud() { return new yarnwrap.client.gui.hud.SpectatorHud(wrapperContained.spectatorHud); }
// public void spectatorHud(yarnwrap.client.gui.hud.SpectatorHud value) { wrapperContained.spectatorHud = value.wrapperContained; }
// public static yarnwrap.client.gui.hud.SpectatorHud spectatorHud() { return new yarnwrap.client.gui.hud.SpectatorHud(net.minecraft.client.gui.hud.InGameHud.spectatorHud); }
// public static void spectatorHud(yarnwrap.client.gui.hud.SpectatorHud value, ) { net.minecraft.client.gui.hud.InGameHud.spectatorHud = value.wrapperContained; }

// public yarnwrap.client.gui.hud.DebugHud debugHud() { return new yarnwrap.client.gui.hud.DebugHud(wrapperContained.debugHud); }
// public void debugHud(yarnwrap.client.gui.hud.DebugHud value) { wrapperContained.debugHud = value.wrapperContained; }
// public static yarnwrap.client.gui.hud.DebugHud debugHud() { return new yarnwrap.client.gui.hud.DebugHud(net.minecraft.client.gui.hud.InGameHud.debugHud); }
// public static void debugHud(yarnwrap.client.gui.hud.DebugHud value, ) { net.minecraft.client.gui.hud.InGameHud.debugHud = value.wrapperContained; }

// public yarnwrap.client.gui.hud.SubtitlesHud subtitlesHud() { return new yarnwrap.client.gui.hud.SubtitlesHud(wrapperContained.subtitlesHud); }
// public void subtitlesHud(yarnwrap.client.gui.hud.SubtitlesHud value) { wrapperContained.subtitlesHud = value.wrapperContained; }
// public static yarnwrap.client.gui.hud.SubtitlesHud subtitlesHud() { return new yarnwrap.client.gui.hud.SubtitlesHud(net.minecraft.client.gui.hud.InGameHud.subtitlesHud); }
// public static void subtitlesHud(yarnwrap.client.gui.hud.SubtitlesHud value, ) { net.minecraft.client.gui.hud.InGameHud.subtitlesHud = value.wrapperContained; }

// public yarnwrap.client.gui.hud.BossBarHud bossBarHud() { return new yarnwrap.client.gui.hud.BossBarHud(wrapperContained.bossBarHud); }
// public void bossBarHud(yarnwrap.client.gui.hud.BossBarHud value) { wrapperContained.bossBarHud = value.wrapperContained; }
// public static yarnwrap.client.gui.hud.BossBarHud bossBarHud() { return new yarnwrap.client.gui.hud.BossBarHud(net.minecraft.client.gui.hud.InGameHud.bossBarHud); }
// public static void bossBarHud(yarnwrap.client.gui.hud.BossBarHud value, ) { net.minecraft.client.gui.hud.InGameHud.bossBarHud = value.wrapperContained; }

// public yarnwrap.item.ItemStack currentStack() { return new yarnwrap.item.ItemStack(wrapperContained.currentStack); }
// public void currentStack(yarnwrap.item.ItemStack value) { wrapperContained.currentStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack currentStack() { return new yarnwrap.item.ItemStack(net.minecraft.client.gui.hud.InGameHud.currentStack); }
// public static void currentStack(yarnwrap.item.ItemStack value, ) { net.minecraft.client.gui.hud.InGameHud.currentStack = value.wrapperContained; }

// public long heartJumpEndTick() { return wrapperContained.heartJumpEndTick; }
// public void heartJumpEndTick(long value) { wrapperContained.heartJumpEndTick = value; }
// public static long heartJumpEndTick() { return net.minecraft.client.gui.hud.InGameHud.heartJumpEndTick; }
// public static void heartJumpEndTick(long value, ) { net.minecraft.client.gui.hud.InGameHud.heartJumpEndTick = value; }

// public int renderHealthValue() { return wrapperContained.renderHealthValue; }
// public void renderHealthValue(int value) { wrapperContained.renderHealthValue = value; }
// public static int renderHealthValue() { return net.minecraft.client.gui.hud.InGameHud.renderHealthValue; }
// public static void renderHealthValue(int value, ) { net.minecraft.client.gui.hud.InGameHud.renderHealthValue = value; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.client.gui.hud.InGameHud.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.client.gui.hud.InGameHud.random = value.wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.gui.hud.InGameHud.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.gui.hud.InGameHud.client = value.wrapperContained; }

// public int titleFadeOutTicks() { return wrapperContained.titleFadeOutTicks; }
// public void titleFadeOutTicks(int value) { wrapperContained.titleFadeOutTicks = value; }
// public static int titleFadeOutTicks() { return net.minecraft.client.gui.hud.InGameHud.titleFadeOutTicks; }
// public static void titleFadeOutTicks(int value, ) { net.minecraft.client.gui.hud.InGameHud.titleFadeOutTicks = value; }

// public int titleFadeInTicks() { return wrapperContained.titleFadeInTicks; }
// public void titleFadeInTicks(int value) { wrapperContained.titleFadeInTicks = value; }
// public static int titleFadeInTicks() { return net.minecraft.client.gui.hud.InGameHud.titleFadeInTicks; }
// public static void titleFadeInTicks(int value, ) { net.minecraft.client.gui.hud.InGameHud.titleFadeInTicks = value; }

// public boolean overlayTinted() { return wrapperContained.overlayTinted; }
// public void overlayTinted(boolean value) { wrapperContained.overlayTinted = value; }
// public static boolean overlayTinted() { return net.minecraft.client.gui.hud.InGameHud.overlayTinted; }
// public static void overlayTinted(boolean value, ) { net.minecraft.client.gui.hud.InGameHud.overlayTinted = value; }

// public yarnwrap.text.Text subtitle() { return new yarnwrap.text.Text(wrapperContained.subtitle); }
// public void subtitle(yarnwrap.text.Text value) { wrapperContained.subtitle = value.wrapperContained; }
// public static yarnwrap.text.Text subtitle() { return new yarnwrap.text.Text(net.minecraft.client.gui.hud.InGameHud.subtitle); }
// public static void subtitle(yarnwrap.text.Text value, ) { net.minecraft.client.gui.hud.InGameHud.subtitle = value.wrapperContained; }

// public int heldItemTooltipFade() { return wrapperContained.heldItemTooltipFade; }
// public void heldItemTooltipFade(int value) { wrapperContained.heldItemTooltipFade = value; }
// public static int heldItemTooltipFade() { return net.minecraft.client.gui.hud.InGameHud.heldItemTooltipFade; }
// public static void heldItemTooltipFade(int value, ) { net.minecraft.client.gui.hud.InGameHud.heldItemTooltipFade = value; }

// public int overlayRemaining() { return wrapperContained.overlayRemaining; }
// public void overlayRemaining(int value) { wrapperContained.overlayRemaining = value; }
// public static int overlayRemaining() { return net.minecraft.client.gui.hud.InGameHud.overlayRemaining; }
// public static void overlayRemaining(int value, ) { net.minecraft.client.gui.hud.InGameHud.overlayRemaining = value; }

// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public static int ticks() { return net.minecraft.client.gui.hud.InGameHud.ticks; }
// public static void ticks(int value, ) { net.minecraft.client.gui.hud.InGameHud.ticks = value; }

// public yarnwrap.text.Text DEMO_EXPIRED_MESSAGE() { return new yarnwrap.text.Text(wrapperContained.DEMO_EXPIRED_MESSAGE); }
// public void DEMO_EXPIRED_MESSAGE(yarnwrap.text.Text value) { wrapperContained.DEMO_EXPIRED_MESSAGE = value.wrapperContained; }
// public static yarnwrap.text.Text DEMO_EXPIRED_MESSAGE() { return new yarnwrap.text.Text(net.minecraft.client.gui.hud.InGameHud.DEMO_EXPIRED_MESSAGE); }
// public static void DEMO_EXPIRED_MESSAGE(yarnwrap.text.Text value, ) { net.minecraft.client.gui.hud.InGameHud.DEMO_EXPIRED_MESSAGE = value.wrapperContained; }

// public yarnwrap.util.Identifier SPYGLASS_SCOPE() { return new yarnwrap.util.Identifier(wrapperContained.SPYGLASS_SCOPE); }
// public void SPYGLASS_SCOPE(yarnwrap.util.Identifier value) { wrapperContained.SPYGLASS_SCOPE = value.wrapperContained; }
// public static yarnwrap.util.Identifier SPYGLASS_SCOPE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.SPYGLASS_SCOPE); }
// public static void SPYGLASS_SCOPE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.SPYGLASS_SCOPE = value.wrapperContained; }

// public float spyglassScale() { return wrapperContained.spyglassScale; }
// public void spyglassScale(float value) { wrapperContained.spyglassScale = value; }
// public static float spyglassScale() { return net.minecraft.client.gui.hud.InGameHud.spyglassScale; }
// public static void spyglassScale(float value, ) { net.minecraft.client.gui.hud.InGameHud.spyglassScale = value; }

// public yarnwrap.util.Identifier POWDER_SNOW_OUTLINE() { return new yarnwrap.util.Identifier(wrapperContained.POWDER_SNOW_OUTLINE); }
// public void POWDER_SNOW_OUTLINE(yarnwrap.util.Identifier value) { wrapperContained.POWDER_SNOW_OUTLINE = value.wrapperContained; }
// public static yarnwrap.util.Identifier POWDER_SNOW_OUTLINE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.POWDER_SNOW_OUTLINE); }
// public static void POWDER_SNOW_OUTLINE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.POWDER_SNOW_OUTLINE = value.wrapperContained; }

// public java.lang.String SCOREBOARD_JOINER() { return wrapperContained.SCOREBOARD_JOINER; }
// public void SCOREBOARD_JOINER(java.lang.String value) { wrapperContained.SCOREBOARD_JOINER = value; }
// public static java.lang.String SCOREBOARD_JOINER() { return net.minecraft.client.gui.hud.InGameHud.SCOREBOARD_JOINER; }
// public static void SCOREBOARD_JOINER(java.lang.String value, ) { net.minecraft.client.gui.hud.InGameHud.SCOREBOARD_JOINER = value; }

// public float autosaveIndicatorAlpha() { return wrapperContained.autosaveIndicatorAlpha; }
// public void autosaveIndicatorAlpha(float value) { wrapperContained.autosaveIndicatorAlpha = value; }
// public static float autosaveIndicatorAlpha() { return net.minecraft.client.gui.hud.InGameHud.autosaveIndicatorAlpha; }
// public static void autosaveIndicatorAlpha(float value, ) { net.minecraft.client.gui.hud.InGameHud.autosaveIndicatorAlpha = value; }

// public float lastAutosaveIndicatorAlpha() { return wrapperContained.lastAutosaveIndicatorAlpha; }
// public void lastAutosaveIndicatorAlpha(float value) { wrapperContained.lastAutosaveIndicatorAlpha = value; }
// public static float lastAutosaveIndicatorAlpha() { return net.minecraft.client.gui.hud.InGameHud.lastAutosaveIndicatorAlpha; }
// public static void lastAutosaveIndicatorAlpha(float value, ) { net.minecraft.client.gui.hud.InGameHud.lastAutosaveIndicatorAlpha = value; }

// public yarnwrap.text.Text SAVING_LEVEL_TEXT() { return new yarnwrap.text.Text(wrapperContained.SAVING_LEVEL_TEXT); }
// public void SAVING_LEVEL_TEXT(yarnwrap.text.Text value) { wrapperContained.SAVING_LEVEL_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text SAVING_LEVEL_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.hud.InGameHud.SAVING_LEVEL_TEXT); }
// public static void SAVING_LEVEL_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.hud.InGameHud.SAVING_LEVEL_TEXT = value.wrapperContained; }

// public boolean canShowChatDisabledScreen() { return wrapperContained.canShowChatDisabledScreen; }
// public void canShowChatDisabledScreen(boolean value) { wrapperContained.canShowChatDisabledScreen = value; }
// public static boolean canShowChatDisabledScreen() { return net.minecraft.client.gui.hud.InGameHud.canShowChatDisabledScreen; }
// public static void canShowChatDisabledScreen(boolean value, ) { net.minecraft.client.gui.hud.InGameHud.canShowChatDisabledScreen = value; }

// public yarnwrap.util.Identifier FOOD_FULL_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_FULL_TEXTURE); }
// public void FOOD_FULL_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FOOD_FULL_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier FOOD_FULL_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.FOOD_FULL_TEXTURE); }
// public static void FOOD_FULL_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.FOOD_FULL_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier AIR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.AIR_TEXTURE); }
// public void AIR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.AIR_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier AIR_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.AIR_TEXTURE); }
// public static void AIR_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.AIR_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier AIR_BURSTING_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.AIR_BURSTING_TEXTURE); }
// public void AIR_BURSTING_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.AIR_BURSTING_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier AIR_BURSTING_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.AIR_BURSTING_TEXTURE); }
// public static void AIR_BURSTING_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.AIR_BURSTING_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier VEHICLE_CONTAINER_HEART_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.VEHICLE_CONTAINER_HEART_TEXTURE); }
// public void VEHICLE_CONTAINER_HEART_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.VEHICLE_CONTAINER_HEART_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier VEHICLE_CONTAINER_HEART_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.VEHICLE_CONTAINER_HEART_TEXTURE); }
// public static void VEHICLE_CONTAINER_HEART_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.VEHICLE_CONTAINER_HEART_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier VEHICLE_FULL_HEART_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.VEHICLE_FULL_HEART_TEXTURE); }
// public void VEHICLE_FULL_HEART_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.VEHICLE_FULL_HEART_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier VEHICLE_FULL_HEART_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.VEHICLE_FULL_HEART_TEXTURE); }
// public static void VEHICLE_FULL_HEART_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.VEHICLE_FULL_HEART_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier VEHICLE_HALF_HEART_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.VEHICLE_HALF_HEART_TEXTURE); }
// public void VEHICLE_HALF_HEART_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.VEHICLE_HALF_HEART_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier VEHICLE_HALF_HEART_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.VEHICLE_HALF_HEART_TEXTURE); }
// public static void VEHICLE_HALF_HEART_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.VEHICLE_HALF_HEART_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier CROSSHAIR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CROSSHAIR_TEXTURE); }
// public void CROSSHAIR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CROSSHAIR_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier CROSSHAIR_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.CROSSHAIR_TEXTURE); }
// public static void CROSSHAIR_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.CROSSHAIR_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE); }
// public void CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE); }
// public static void CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE); }
// public void CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE); }
// public static void CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE); }
// public void CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE); }
// public static void CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier EFFECT_BACKGROUND_AMBIENT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EFFECT_BACKGROUND_AMBIENT_TEXTURE); }
// public void EFFECT_BACKGROUND_AMBIENT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EFFECT_BACKGROUND_AMBIENT_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier EFFECT_BACKGROUND_AMBIENT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.EFFECT_BACKGROUND_AMBIENT_TEXTURE); }
// public static void EFFECT_BACKGROUND_AMBIENT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.EFFECT_BACKGROUND_AMBIENT_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier EFFECT_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EFFECT_BACKGROUND_TEXTURE); }
// public void EFFECT_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EFFECT_BACKGROUND_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier EFFECT_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.EFFECT_BACKGROUND_TEXTURE); }
// public static void EFFECT_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.EFFECT_BACKGROUND_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier HOTBAR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_TEXTURE); }
// public void HOTBAR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HOTBAR_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier HOTBAR_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.HOTBAR_TEXTURE); }
// public static void HOTBAR_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.HOTBAR_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier HOTBAR_SELECTION_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_SELECTION_TEXTURE); }
// public void HOTBAR_SELECTION_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HOTBAR_SELECTION_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier HOTBAR_SELECTION_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.HOTBAR_SELECTION_TEXTURE); }
// public static void HOTBAR_SELECTION_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.HOTBAR_SELECTION_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier HOTBAR_OFFHAND_LEFT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_OFFHAND_LEFT_TEXTURE); }
// public void HOTBAR_OFFHAND_LEFT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HOTBAR_OFFHAND_LEFT_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier HOTBAR_OFFHAND_LEFT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.HOTBAR_OFFHAND_LEFT_TEXTURE); }
// public static void HOTBAR_OFFHAND_LEFT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.HOTBAR_OFFHAND_LEFT_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier HOTBAR_OFFHAND_RIGHT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_OFFHAND_RIGHT_TEXTURE); }
// public void HOTBAR_OFFHAND_RIGHT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HOTBAR_OFFHAND_RIGHT_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier HOTBAR_OFFHAND_RIGHT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.HOTBAR_OFFHAND_RIGHT_TEXTURE); }
// public static void HOTBAR_OFFHAND_RIGHT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.HOTBAR_OFFHAND_RIGHT_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE); }
// public void HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE); }
// public static void HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier HOTBAR_ATTACK_INDICATOR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_ATTACK_INDICATOR_PROGRESS_TEXTURE); }
// public void HOTBAR_ATTACK_INDICATOR_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HOTBAR_ATTACK_INDICATOR_PROGRESS_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier HOTBAR_ATTACK_INDICATOR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.HOTBAR_ATTACK_INDICATOR_PROGRESS_TEXTURE); }
// public static void HOTBAR_ATTACK_INDICATOR_PROGRESS_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.HOTBAR_ATTACK_INDICATOR_PROGRESS_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier JUMP_BAR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JUMP_BAR_BACKGROUND_TEXTURE); }
// public void JUMP_BAR_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.JUMP_BAR_BACKGROUND_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier JUMP_BAR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.JUMP_BAR_BACKGROUND_TEXTURE); }
// public static void JUMP_BAR_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.JUMP_BAR_BACKGROUND_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier JUMP_BAR_COOLDOWN_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JUMP_BAR_COOLDOWN_TEXTURE); }
// public void JUMP_BAR_COOLDOWN_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.JUMP_BAR_COOLDOWN_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier JUMP_BAR_COOLDOWN_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.JUMP_BAR_COOLDOWN_TEXTURE); }
// public static void JUMP_BAR_COOLDOWN_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.JUMP_BAR_COOLDOWN_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier JUMP_BAR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JUMP_BAR_PROGRESS_TEXTURE); }
// public void JUMP_BAR_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.JUMP_BAR_PROGRESS_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier JUMP_BAR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.JUMP_BAR_PROGRESS_TEXTURE); }
// public static void JUMP_BAR_PROGRESS_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.JUMP_BAR_PROGRESS_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier EXPERIENCE_BAR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EXPERIENCE_BAR_BACKGROUND_TEXTURE); }
// public void EXPERIENCE_BAR_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EXPERIENCE_BAR_BACKGROUND_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier EXPERIENCE_BAR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.EXPERIENCE_BAR_BACKGROUND_TEXTURE); }
// public static void EXPERIENCE_BAR_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.EXPERIENCE_BAR_BACKGROUND_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier EXPERIENCE_BAR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EXPERIENCE_BAR_PROGRESS_TEXTURE); }
// public void EXPERIENCE_BAR_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EXPERIENCE_BAR_PROGRESS_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier EXPERIENCE_BAR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.EXPERIENCE_BAR_PROGRESS_TEXTURE); }
// public static void EXPERIENCE_BAR_PROGRESS_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.EXPERIENCE_BAR_PROGRESS_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier ARMOR_EMPTY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ARMOR_EMPTY_TEXTURE); }
// public void ARMOR_EMPTY_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ARMOR_EMPTY_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier ARMOR_EMPTY_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.ARMOR_EMPTY_TEXTURE); }
// public static void ARMOR_EMPTY_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.ARMOR_EMPTY_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier ARMOR_HALF_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ARMOR_HALF_TEXTURE); }
// public void ARMOR_HALF_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ARMOR_HALF_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier ARMOR_HALF_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.ARMOR_HALF_TEXTURE); }
// public static void ARMOR_HALF_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.ARMOR_HALF_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier ARMOR_FULL_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ARMOR_FULL_TEXTURE); }
// public void ARMOR_FULL_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ARMOR_FULL_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier ARMOR_FULL_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.ARMOR_FULL_TEXTURE); }
// public static void ARMOR_FULL_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.ARMOR_FULL_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier FOOD_EMPTY_HUNGER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_EMPTY_HUNGER_TEXTURE); }
// public void FOOD_EMPTY_HUNGER_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FOOD_EMPTY_HUNGER_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier FOOD_EMPTY_HUNGER_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.FOOD_EMPTY_HUNGER_TEXTURE); }
// public static void FOOD_EMPTY_HUNGER_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.FOOD_EMPTY_HUNGER_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier FOOD_HALF_HUNGER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_HALF_HUNGER_TEXTURE); }
// public void FOOD_HALF_HUNGER_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FOOD_HALF_HUNGER_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier FOOD_HALF_HUNGER_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.FOOD_HALF_HUNGER_TEXTURE); }
// public static void FOOD_HALF_HUNGER_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.FOOD_HALF_HUNGER_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier FOOD_FULL_HUNGER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_FULL_HUNGER_TEXTURE); }
// public void FOOD_FULL_HUNGER_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FOOD_FULL_HUNGER_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier FOOD_FULL_HUNGER_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.FOOD_FULL_HUNGER_TEXTURE); }
// public static void FOOD_FULL_HUNGER_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.FOOD_FULL_HUNGER_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier FOOD_EMPTY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_EMPTY_TEXTURE); }
// public void FOOD_EMPTY_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FOOD_EMPTY_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier FOOD_EMPTY_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.FOOD_EMPTY_TEXTURE); }
// public static void FOOD_EMPTY_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.FOOD_EMPTY_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier FOOD_HALF_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_HALF_TEXTURE); }
// public void FOOD_HALF_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FOOD_HALF_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier FOOD_HALF_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.InGameHud.FOOD_HALF_TEXTURE); }
// public static void FOOD_HALF_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.InGameHud.FOOD_HALF_TEXTURE = value.wrapperContained; }

// public java.util.Comparator SCOREBOARD_ENTRY_COMPARATOR() { return wrapperContained.SCOREBOARD_ENTRY_COMPARATOR; }
// public void SCOREBOARD_ENTRY_COMPARATOR(java.util.Comparator value) { wrapperContained.SCOREBOARD_ENTRY_COMPARATOR = value; }
// public static java.util.Comparator SCOREBOARD_ENTRY_COMPARATOR() { return net.minecraft.client.gui.hud.InGameHud.SCOREBOARD_ENTRY_COMPARATOR; }
// public static void SCOREBOARD_ENTRY_COMPARATOR(java.util.Comparator value, ) { net.minecraft.client.gui.hud.InGameHud.SCOREBOARD_ENTRY_COMPARATOR = value; }

// public yarnwrap.client.gui.LayeredDrawer layeredDrawer() { return new yarnwrap.client.gui.LayeredDrawer(wrapperContained.layeredDrawer); }
// public void layeredDrawer(yarnwrap.client.gui.LayeredDrawer value) { wrapperContained.layeredDrawer = value.wrapperContained; }
// public static yarnwrap.client.gui.LayeredDrawer layeredDrawer() { return new yarnwrap.client.gui.LayeredDrawer(net.minecraft.client.gui.hud.InGameHud.layeredDrawer); }
// public static void layeredDrawer(yarnwrap.client.gui.LayeredDrawer value, ) { net.minecraft.client.gui.hud.InGameHud.layeredDrawer = value.wrapperContained; }

public InGameHud(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.gui.hud.InGameHud(client.wrapperContained); }
// public void updateVignetteDarkness(yarnwrap.entity.Entity entity) { wrapperContained.updateVignetteDarkness(entity.wrapperContained); }
// public static void updateVignetteDarkness(yarnwrap.entity.Entity entity, ) { net.minecraft.client.gui.hud.InGameHud.updateVignetteDarkness(entity.wrapperContained); }
public void setRecordPlayingOverlay(yarnwrap.text.Text description) { wrapperContained.setRecordPlayingOverlay(description.wrapperContained); }
// public static void setRecordPlayingOverlay(yarnwrap.text.Text description, ) { net.minecraft.client.gui.hud.InGameHud.setRecordPlayingOverlay(description.wrapperContained); }
// public int getHeartRows(int heartCount) { return wrapperContained.getHeartRows(heartCount); }
// public static int getHeartRows(int heartCount, ) { return net.minecraft.client.gui.hud.InGameHud.getHeartRows(heartCount); }
// public yarnwrap.entity.LivingEntity getRiddenEntity() { return new yarnwrap.entity.LivingEntity(wrapperContained.getRiddenEntity()); }
// public static yarnwrap.entity.LivingEntity getRiddenEntity() { return new yarnwrap.entity.LivingEntity(net.minecraft.client.gui.hud.InGameHud.getRiddenEntity()); }
// public void renderVignetteOverlay(yarnwrap.client.gui.DrawContext context,yarnwrap.entity.Entity entity) { wrapperContained.renderVignetteOverlay(context.wrapperContained,entity.wrapperContained); }
// public static void renderVignetteOverlay(yarnwrap.client.gui.DrawContext context,yarnwrap.entity.Entity entity, ) { net.minecraft.client.gui.hud.InGameHud.renderVignetteOverlay(context.wrapperContained,entity.wrapperContained); }
// public void renderCrosshair(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderCrosshair(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderCrosshair(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.renderCrosshair(context.wrapperContained,tickCounter.wrapperContained); }
// public yarnwrap.entity.player.PlayerEntity getCameraPlayer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.getCameraPlayer()); }
// public static yarnwrap.entity.player.PlayerEntity getCameraPlayer() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.client.gui.hud.InGameHud.getCameraPlayer()); }
public int getTicks() { return wrapperContained.getTicks(); }
// public static int getTicks() { return net.minecraft.client.gui.hud.InGameHud.getTicks(); }
public yarnwrap.client.gui.hud.SpectatorHud getSpectatorHud() { return new yarnwrap.client.gui.hud.SpectatorHud(wrapperContained.getSpectatorHud()); }
// public static yarnwrap.client.gui.hud.SpectatorHud getSpectatorHud() { return new yarnwrap.client.gui.hud.SpectatorHud(net.minecraft.client.gui.hud.InGameHud.getSpectatorHud()); }
public yarnwrap.client.gui.hud.BossBarHud getBossBarHud() { return new yarnwrap.client.gui.hud.BossBarHud(wrapperContained.getBossBarHud()); }
// public static yarnwrap.client.gui.hud.BossBarHud getBossBarHud() { return new yarnwrap.client.gui.hud.BossBarHud(net.minecraft.client.gui.hud.InGameHud.getBossBarHud()); }
// public void renderMountHealth(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderMountHealth(context.wrapperContained); }
// public static void renderMountHealth(yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.hud.InGameHud.renderMountHealth(context.wrapperContained); }
public void setDefaultTitleFade() { wrapperContained.setDefaultTitleFade(); }
// public static void setDefaultTitleFade() { net.minecraft.client.gui.hud.InGameHud.setDefaultTitleFade(); }
public yarnwrap.client.gui.hud.ChatHud getChatHud() { return new yarnwrap.client.gui.hud.ChatHud(wrapperContained.getChatHud()); }
// public static yarnwrap.client.gui.hud.ChatHud getChatHud() { return new yarnwrap.client.gui.hud.ChatHud(net.minecraft.client.gui.hud.InGameHud.getChatHud()); }
// public int getHeartCount(yarnwrap.entity.LivingEntity entity) { return wrapperContained.getHeartCount(entity.wrapperContained); }
// public static int getHeartCount(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.client.gui.hud.InGameHud.getHeartCount(entity.wrapperContained); }
public void resetDebugHudChunk() { wrapperContained.resetDebugHudChunk(); }
// public static void resetDebugHudChunk() { net.minecraft.client.gui.hud.InGameHud.resetDebugHudChunk(); }
// public void renderPortalOverlay(yarnwrap.client.gui.DrawContext context,float nauseaStrength) { wrapperContained.renderPortalOverlay(context.wrapperContained,nauseaStrength); }
// public static void renderPortalOverlay(yarnwrap.client.gui.DrawContext context,float nauseaStrength, ) { net.minecraft.client.gui.hud.InGameHud.renderPortalOverlay(context.wrapperContained,nauseaStrength); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.gui.hud.InGameHud.clear(); }
// public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.gui.hud.InGameHud.tick(); }
// public void renderHeldItemTooltip(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderHeldItemTooltip(context.wrapperContained); }
// public static void renderHeldItemTooltip(yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.hud.InGameHud.renderHeldItemTooltip(context.wrapperContained); }
public yarnwrap.client.gui.hud.PlayerListHud getPlayerListHud() { return new yarnwrap.client.gui.hud.PlayerListHud(wrapperContained.getPlayerListHud()); }
// public static yarnwrap.client.gui.hud.PlayerListHud getPlayerListHud() { return new yarnwrap.client.gui.hud.PlayerListHud(net.minecraft.client.gui.hud.InGameHud.getPlayerListHud()); }
// public boolean method_1751(yarnwrap.scoreboard.ScoreboardEntry score) { return wrapperContained.method_1751(score.wrapperContained); }
// public static boolean method_1751(yarnwrap.scoreboard.ScoreboardEntry score, ) { return net.minecraft.client.gui.hud.InGameHud.method_1751(score.wrapperContained); }
// public void renderMountJumpBar(yarnwrap.entity.JumpingMount mount,yarnwrap.client.gui.DrawContext context,int x) { wrapperContained.renderMountJumpBar(mount.wrapperContained,context.wrapperContained,x); }
// public static void renderMountJumpBar(yarnwrap.entity.JumpingMount mount,yarnwrap.client.gui.DrawContext context,int x, ) { net.minecraft.client.gui.hud.InGameHud.renderMountJumpBar(mount.wrapperContained,context.wrapperContained,x); }
public void render(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.render(context.wrapperContained,tickCounter.wrapperContained); }
// public static void render(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.render(context.wrapperContained,tickCounter.wrapperContained); }
// public boolean shouldRenderSpectatorCrosshair(yarnwrap.util.hit.HitResult hitResult) { return wrapperContained.shouldRenderSpectatorCrosshair(hitResult.wrapperContained); }
// public static boolean shouldRenderSpectatorCrosshair(yarnwrap.util.hit.HitResult hitResult, ) { return net.minecraft.client.gui.hud.InGameHud.shouldRenderSpectatorCrosshair(hitResult.wrapperContained); }
// public void renderExperienceBar(yarnwrap.client.gui.DrawContext context,int x) { wrapperContained.renderExperienceBar(context.wrapperContained,x); }
// public static void renderExperienceBar(yarnwrap.client.gui.DrawContext context,int x, ) { net.minecraft.client.gui.hud.InGameHud.renderExperienceBar(context.wrapperContained,x); }
public yarnwrap.client.font.TextRenderer getTextRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.getTextRenderer()); }
// public static yarnwrap.client.font.TextRenderer getTextRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.gui.hud.InGameHud.getTextRenderer()); }
// public void renderScoreboardSidebar(yarnwrap.client.gui.DrawContext context,yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.renderScoreboardSidebar(context.wrapperContained,objective.wrapperContained); }
// public static void renderScoreboardSidebar(yarnwrap.client.gui.DrawContext context,yarnwrap.scoreboard.ScoreboardObjective objective, ) { net.minecraft.client.gui.hud.InGameHud.renderScoreboardSidebar(context.wrapperContained,objective.wrapperContained); }
public void setOverlayMessage(yarnwrap.text.Text message,boolean tinted) { wrapperContained.setOverlayMessage(message.wrapperContained,tinted); }
// public static void setOverlayMessage(yarnwrap.text.Text message,boolean tinted, ) { net.minecraft.client.gui.hud.InGameHud.setOverlayMessage(message.wrapperContained,tinted); }
// public void renderHotbar(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderHotbar(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderHotbar(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.renderHotbar(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderStatusBars(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderStatusBars(context.wrapperContained); }
// public static void renderStatusBars(yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.hud.InGameHud.renderStatusBars(context.wrapperContained); }
// public void renderHotbarItem(yarnwrap.client.gui.DrawContext context,int x,int y,yarnwrap.client.render.RenderTickCounter tickCounter,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack,int seed) { wrapperContained.renderHotbarItem(context.wrapperContained,x,y,tickCounter.wrapperContained,player.wrapperContained,stack.wrapperContained,seed); }
// public static void renderHotbarItem(yarnwrap.client.gui.DrawContext context,int x,int y,yarnwrap.client.render.RenderTickCounter tickCounter,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack,int seed, ) { net.minecraft.client.gui.hud.InGameHud.renderHotbarItem(context.wrapperContained,x,y,tickCounter.wrapperContained,player.wrapperContained,stack.wrapperContained,seed); }
// public void renderStatusEffectOverlay(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderStatusEffectOverlay(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderStatusEffectOverlay(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.renderStatusEffectOverlay(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderDemoTimer(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderDemoTimer(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderDemoTimer(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.renderDemoTimer(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderOverlay(yarnwrap.client.gui.DrawContext context,yarnwrap.util.Identifier texture,float opacity) { wrapperContained.renderOverlay(context.wrapperContained,texture.wrapperContained,opacity); }
// public static void renderOverlay(yarnwrap.client.gui.DrawContext context,yarnwrap.util.Identifier texture,float opacity, ) { net.minecraft.client.gui.hud.InGameHud.renderOverlay(context.wrapperContained,texture.wrapperContained,opacity); }
// public void renderSpyglassOverlay(yarnwrap.client.gui.DrawContext context,float scale) { wrapperContained.renderSpyglassOverlay(context.wrapperContained,scale); }
// public static void renderSpyglassOverlay(yarnwrap.client.gui.DrawContext context,float scale, ) { net.minecraft.client.gui.hud.InGameHud.renderSpyglassOverlay(context.wrapperContained,scale); }
public void setTitleTicks(int fadeInTicks,int stayTicks,int fadeOutTicks) { wrapperContained.setTitleTicks(fadeInTicks,stayTicks,fadeOutTicks); }
// public static void setTitleTicks(int fadeInTicks,int stayTicks,int fadeOutTicks, ) { net.minecraft.client.gui.hud.InGameHud.setTitleTicks(fadeInTicks,stayTicks,fadeOutTicks); }
public void setSubtitle(yarnwrap.text.Text subtitle) { wrapperContained.setSubtitle(subtitle.wrapperContained); }
// public static void setSubtitle(yarnwrap.text.Text subtitle, ) { net.minecraft.client.gui.hud.InGameHud.setSubtitle(subtitle.wrapperContained); }
public void clearTitle() { wrapperContained.clearTitle(); }
// public static void clearTitle() { net.minecraft.client.gui.hud.InGameHud.clearTitle(); }
public void setTitle(yarnwrap.text.Text title) { wrapperContained.setTitle(title.wrapperContained); }
// public static void setTitle(yarnwrap.text.Text title, ) { net.minecraft.client.gui.hud.InGameHud.setTitle(title.wrapperContained); }
// public void renderHealthBar(yarnwrap.client.gui.DrawContext context,yarnwrap.entity.player.PlayerEntity player,int x,int y,int lines,int regeneratingHeartIndex,float maxHealth,int lastHealth,int health,int absorption,boolean blinking) { wrapperContained.renderHealthBar(context.wrapperContained,player.wrapperContained,x,y,lines,regeneratingHeartIndex,maxHealth,lastHealth,health,absorption,blinking); }
// public static void renderHealthBar(yarnwrap.client.gui.DrawContext context,yarnwrap.entity.player.PlayerEntity player,int x,int y,int lines,int regeneratingHeartIndex,float maxHealth,int lastHealth,int health,int absorption,boolean blinking, ) { net.minecraft.client.gui.hud.InGameHud.renderHealthBar(context.wrapperContained,player.wrapperContained,x,y,lines,regeneratingHeartIndex,maxHealth,lastHealth,health,absorption,blinking); }
// public void drawHeart(yarnwrap.client.gui.DrawContext context,Object type,int x,int y,boolean hardcore,boolean blinking,boolean half) { wrapperContained.drawHeart(context.wrapperContained,type,x,y,hardcore,blinking,half); }
// public static void drawHeart(yarnwrap.client.gui.DrawContext context,Object type,int x,int y,boolean hardcore,boolean blinking,boolean half, ) { net.minecraft.client.gui.hud.InGameHud.drawHeart(context.wrapperContained,type,x,y,hardcore,blinking,half); }
public void tick(boolean paused) { wrapperContained.tick(paused); }
// public static void tick(boolean paused, ) { net.minecraft.client.gui.hud.InGameHud.tick(paused); }
public void renderAutosaveIndicator(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderAutosaveIndicator(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderAutosaveIndicator(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.renderAutosaveIndicator(context.wrapperContained,tickCounter.wrapperContained); }
// public void tickAutosaveIndicator() { wrapperContained.tickAutosaveIndicator(); }
// public static void tickAutosaveIndicator() { net.minecraft.client.gui.hud.InGameHud.tickAutosaveIndicator(); }
public boolean shouldShowChatDisabledScreen() { return wrapperContained.shouldShowChatDisabledScreen(); }
// public static boolean shouldShowChatDisabledScreen() { return net.minecraft.client.gui.hud.InGameHud.shouldShowChatDisabledScreen(); }
public void setCanShowChatDisabledScreen(boolean canShowChatDisabledScreen) { wrapperContained.setCanShowChatDisabledScreen(canShowChatDisabledScreen); }
// public static void setCanShowChatDisabledScreen(boolean canShowChatDisabledScreen, ) { net.minecraft.client.gui.hud.InGameHud.setCanShowChatDisabledScreen(canShowChatDisabledScreen); }
public yarnwrap.client.gui.hud.DebugHud getDebugHud() { return new yarnwrap.client.gui.hud.DebugHud(wrapperContained.getDebugHud()); }
// public static yarnwrap.client.gui.hud.DebugHud getDebugHud() { return new yarnwrap.client.gui.hud.DebugHud(net.minecraft.client.gui.hud.InGameHud.getDebugHud()); }
// public Object method_55439(yarnwrap.scoreboard.Scoreboard scoreboardEntry) { return wrapperContained.method_55439(scoreboardEntry.wrapperContained); }
// public static Object method_55439(yarnwrap.scoreboard.Scoreboard scoreboardEntry, ) { return net.minecraft.client.gui.hud.InGameHud.method_55439(scoreboardEntry.wrapperContained); }
// public Object method_55441(int size) { return wrapperContained.method_55441(size); }
// public static Object method_55441(int size, ) { return net.minecraft.client.gui.hud.InGameHud.method_55441(size); }
// public void renderMiscOverlays(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderMiscOverlays(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderMiscOverlays(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.renderMiscOverlays(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderSleepOverlay(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderSleepOverlay(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderSleepOverlay(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.renderSleepOverlay(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderOverlayMessage(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderOverlayMessage(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderOverlayMessage(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.renderOverlayMessage(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderTitleAndSubtitle(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderTitleAndSubtitle(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderTitleAndSubtitle(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.renderTitleAndSubtitle(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderChat(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderChat(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderChat(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.renderChat(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderScoreboardSidebar(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderScoreboardSidebar(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderScoreboardSidebar(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.renderScoreboardSidebar(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderPlayerList(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderPlayerList(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderPlayerList(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.renderPlayerList(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderMainHud(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderMainHud(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderMainHud(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.renderMainHud(context.wrapperContained,tickCounter.wrapperContained); }
// public void method_55806(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.method_55806(context.wrapperContained,tickCounter.wrapperContained); }
// public static void method_55806(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.method_55806(context.wrapperContained,tickCounter.wrapperContained); }
// public void method_55807(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.method_55807(context.wrapperContained,tickCounter.wrapperContained); }
// public static void method_55807(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.method_55807(context.wrapperContained,tickCounter.wrapperContained); }
// public void method_55808(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.method_55808(context.wrapperContained,tickCounter.wrapperContained); }
// public static void method_55808(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.method_55808(context.wrapperContained,tickCounter.wrapperContained); }
// public boolean shouldRenderExperience() { return wrapperContained.shouldRenderExperience(); }
// public static boolean shouldRenderExperience() { return net.minecraft.client.gui.hud.InGameHud.shouldRenderExperience(); }
// public void renderExperienceLevel(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderExperienceLevel(context.wrapperContained,tickCounter.wrapperContained); }
// public static void renderExperienceLevel(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.gui.hud.InGameHud.renderExperienceLevel(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderFood(yarnwrap.client.gui.DrawContext context,yarnwrap.entity.player.PlayerEntity player,int top,int right) { wrapperContained.renderFood(context.wrapperContained,player.wrapperContained,top,right); }
// public static void renderFood(yarnwrap.client.gui.DrawContext context,yarnwrap.entity.player.PlayerEntity player,int top,int right, ) { net.minecraft.client.gui.hud.InGameHud.renderFood(context.wrapperContained,player.wrapperContained,top,right); }
// public void renderArmor(yarnwrap.client.gui.DrawContext context,yarnwrap.entity.player.PlayerEntity player,int x) { wrapperContained.renderArmor(context.wrapperContained,player.wrapperContained,x); }
// public static void renderArmor(yarnwrap.client.gui.DrawContext context,yarnwrap.entity.player.PlayerEntity player,int x, ) { net.minecraft.client.gui.hud.InGameHud.renderArmor(context.wrapperContained,player.wrapperContained,x); }

}