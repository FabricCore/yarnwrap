package yarnwrap.client.gui.hud;
public class InGameHud { public net.minecraft.client.gui.hud.InGameHud wrapperContained; public InGameHud(net.minecraft.client.gui.hud.InGameHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public long lastHealthCheckTime() { return wrapperContained.lastHealthCheckTime; }
// public void lastHealthCheckTime(long value) { wrapperContained.lastHealthCheckTime = value; }
public float vignetteDarkness() { return wrapperContained.vignetteDarkness; }
public void vignetteDarkness(float value) { wrapperContained.vignetteDarkness = value; }
// public int lastHealthValue() { return wrapperContained.lastHealthValue; }
// public void lastHealthValue(int value) { wrapperContained.lastHealthValue = value; }
// public yarnwrap.client.gui.hud.PlayerListHud playerListHud() { return new yarnwrap.client.gui.hud.PlayerListHud(wrapperContained.playerListHud); }
// public void playerListHud(yarnwrap.client.gui.hud.PlayerListHud value) { wrapperContained.playerListHud = value.wrapperContained; }
// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public void title(yarnwrap.text.Text value) { wrapperContained.title = value.wrapperContained; }
// public int titleStayTicks() { return wrapperContained.titleStayTicks; }
// public void titleStayTicks(int value) { wrapperContained.titleStayTicks = value; }
// public yarnwrap.text.Text overlayMessage() { return new yarnwrap.text.Text(wrapperContained.overlayMessage); }
// public void overlayMessage(yarnwrap.text.Text value) { wrapperContained.overlayMessage = value.wrapperContained; }
// public yarnwrap.util.Identifier PUMPKIN_BLUR() { return new yarnwrap.util.Identifier(wrapperContained.PUMPKIN_BLUR); }
// public void PUMPKIN_BLUR(yarnwrap.util.Identifier value) { wrapperContained.PUMPKIN_BLUR = value.wrapperContained; }
// public yarnwrap.util.Identifier VIGNETTE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.VIGNETTE_TEXTURE); }
// public void VIGNETTE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.VIGNETTE_TEXTURE = value.wrapperContained; }
// public yarnwrap.client.gui.hud.ChatHud chatHud() { return new yarnwrap.client.gui.hud.ChatHud(wrapperContained.chatHud); }
// public void chatHud(yarnwrap.client.gui.hud.ChatHud value) { wrapperContained.chatHud = value.wrapperContained; }
// public int titleRemainTicks() { return wrapperContained.titleRemainTicks; }
// public void titleRemainTicks(int value) { wrapperContained.titleRemainTicks = value; }
// public yarnwrap.client.gui.hud.SpectatorHud spectatorHud() { return new yarnwrap.client.gui.hud.SpectatorHud(wrapperContained.spectatorHud); }
// public void spectatorHud(yarnwrap.client.gui.hud.SpectatorHud value) { wrapperContained.spectatorHud = value.wrapperContained; }
// public yarnwrap.client.gui.hud.DebugHud debugHud() { return new yarnwrap.client.gui.hud.DebugHud(wrapperContained.debugHud); }
// public void debugHud(yarnwrap.client.gui.hud.DebugHud value) { wrapperContained.debugHud = value.wrapperContained; }
// public yarnwrap.client.gui.hud.SubtitlesHud subtitlesHud() { return new yarnwrap.client.gui.hud.SubtitlesHud(wrapperContained.subtitlesHud); }
// public void subtitlesHud(yarnwrap.client.gui.hud.SubtitlesHud value) { wrapperContained.subtitlesHud = value.wrapperContained; }
// public yarnwrap.client.gui.hud.BossBarHud bossBarHud() { return new yarnwrap.client.gui.hud.BossBarHud(wrapperContained.bossBarHud); }
// public void bossBarHud(yarnwrap.client.gui.hud.BossBarHud value) { wrapperContained.bossBarHud = value.wrapperContained; }
// public yarnwrap.item.ItemStack currentStack() { return new yarnwrap.item.ItemStack(wrapperContained.currentStack); }
// public void currentStack(yarnwrap.item.ItemStack value) { wrapperContained.currentStack = value.wrapperContained; }
// public long heartJumpEndTick() { return wrapperContained.heartJumpEndTick; }
// public void heartJumpEndTick(long value) { wrapperContained.heartJumpEndTick = value; }
// public int renderHealthValue() { return wrapperContained.renderHealthValue; }
// public void renderHealthValue(int value) { wrapperContained.renderHealthValue = value; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public int titleFadeOutTicks() { return wrapperContained.titleFadeOutTicks; }
// public void titleFadeOutTicks(int value) { wrapperContained.titleFadeOutTicks = value; }
// public int titleFadeInTicks() { return wrapperContained.titleFadeInTicks; }
// public void titleFadeInTicks(int value) { wrapperContained.titleFadeInTicks = value; }
// public boolean overlayTinted() { return wrapperContained.overlayTinted; }
// public void overlayTinted(boolean value) { wrapperContained.overlayTinted = value; }
// public yarnwrap.text.Text subtitle() { return new yarnwrap.text.Text(wrapperContained.subtitle); }
// public void subtitle(yarnwrap.text.Text value) { wrapperContained.subtitle = value.wrapperContained; }
// public int heldItemTooltipFade() { return wrapperContained.heldItemTooltipFade; }
// public void heldItemTooltipFade(int value) { wrapperContained.heldItemTooltipFade = value; }
// public int overlayRemaining() { return wrapperContained.overlayRemaining; }
// public void overlayRemaining(int value) { wrapperContained.overlayRemaining = value; }
// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public yarnwrap.text.Text DEMO_EXPIRED_MESSAGE() { return new yarnwrap.text.Text(wrapperContained.DEMO_EXPIRED_MESSAGE); }
// public void DEMO_EXPIRED_MESSAGE(yarnwrap.text.Text value) { wrapperContained.DEMO_EXPIRED_MESSAGE = value.wrapperContained; }
// public yarnwrap.util.Identifier SPYGLASS_SCOPE() { return new yarnwrap.util.Identifier(wrapperContained.SPYGLASS_SCOPE); }
// public void SPYGLASS_SCOPE(yarnwrap.util.Identifier value) { wrapperContained.SPYGLASS_SCOPE = value.wrapperContained; }
// public float spyglassScale() { return wrapperContained.spyglassScale; }
// public void spyglassScale(float value) { wrapperContained.spyglassScale = value; }
// public yarnwrap.util.Identifier POWDER_SNOW_OUTLINE() { return new yarnwrap.util.Identifier(wrapperContained.POWDER_SNOW_OUTLINE); }
// public void POWDER_SNOW_OUTLINE(yarnwrap.util.Identifier value) { wrapperContained.POWDER_SNOW_OUTLINE = value.wrapperContained; }
// public java.lang.String SCOREBOARD_JOINER() { return wrapperContained.SCOREBOARD_JOINER; }
// public void SCOREBOARD_JOINER(java.lang.String value) { wrapperContained.SCOREBOARD_JOINER = value; }
// public float autosaveIndicatorAlpha() { return wrapperContained.autosaveIndicatorAlpha; }
// public void autosaveIndicatorAlpha(float value) { wrapperContained.autosaveIndicatorAlpha = value; }
// public float lastAutosaveIndicatorAlpha() { return wrapperContained.lastAutosaveIndicatorAlpha; }
// public void lastAutosaveIndicatorAlpha(float value) { wrapperContained.lastAutosaveIndicatorAlpha = value; }
// public yarnwrap.text.Text SAVING_LEVEL_TEXT() { return new yarnwrap.text.Text(wrapperContained.SAVING_LEVEL_TEXT); }
// public void SAVING_LEVEL_TEXT(yarnwrap.text.Text value) { wrapperContained.SAVING_LEVEL_TEXT = value.wrapperContained; }
// public boolean canShowChatDisabledScreen() { return wrapperContained.canShowChatDisabledScreen; }
// public void canShowChatDisabledScreen(boolean value) { wrapperContained.canShowChatDisabledScreen = value; }
// public yarnwrap.util.Identifier FOOD_FULL_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_FULL_TEXTURE); }
// public void FOOD_FULL_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FOOD_FULL_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier AIR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.AIR_TEXTURE); }
// public void AIR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.AIR_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier AIR_BURSTING_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.AIR_BURSTING_TEXTURE); }
// public void AIR_BURSTING_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.AIR_BURSTING_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier VEHICLE_CONTAINER_HEART_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.VEHICLE_CONTAINER_HEART_TEXTURE); }
// public void VEHICLE_CONTAINER_HEART_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.VEHICLE_CONTAINER_HEART_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier VEHICLE_FULL_HEART_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.VEHICLE_FULL_HEART_TEXTURE); }
// public void VEHICLE_FULL_HEART_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.VEHICLE_FULL_HEART_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier VEHICLE_HALF_HEART_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.VEHICLE_HALF_HEART_TEXTURE); }
// public void VEHICLE_HALF_HEART_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.VEHICLE_HALF_HEART_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier CROSSHAIR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CROSSHAIR_TEXTURE); }
// public void CROSSHAIR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CROSSHAIR_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE); }
// public void CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE); }
// public void CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE); }
// public void CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier EFFECT_BACKGROUND_AMBIENT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EFFECT_BACKGROUND_AMBIENT_TEXTURE); }
// public void EFFECT_BACKGROUND_AMBIENT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EFFECT_BACKGROUND_AMBIENT_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier EFFECT_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EFFECT_BACKGROUND_TEXTURE); }
// public void EFFECT_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EFFECT_BACKGROUND_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier HOTBAR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_TEXTURE); }
// public void HOTBAR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HOTBAR_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier HOTBAR_SELECTION_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_SELECTION_TEXTURE); }
// public void HOTBAR_SELECTION_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HOTBAR_SELECTION_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier HOTBAR_OFFHAND_LEFT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_OFFHAND_LEFT_TEXTURE); }
// public void HOTBAR_OFFHAND_LEFT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HOTBAR_OFFHAND_LEFT_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier HOTBAR_OFFHAND_RIGHT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_OFFHAND_RIGHT_TEXTURE); }
// public void HOTBAR_OFFHAND_RIGHT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HOTBAR_OFFHAND_RIGHT_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE); }
// public void HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier HOTBAR_ATTACK_INDICATOR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_ATTACK_INDICATOR_PROGRESS_TEXTURE); }
// public void HOTBAR_ATTACK_INDICATOR_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HOTBAR_ATTACK_INDICATOR_PROGRESS_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier JUMP_BAR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JUMP_BAR_BACKGROUND_TEXTURE); }
// public void JUMP_BAR_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.JUMP_BAR_BACKGROUND_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier JUMP_BAR_COOLDOWN_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JUMP_BAR_COOLDOWN_TEXTURE); }
// public void JUMP_BAR_COOLDOWN_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.JUMP_BAR_COOLDOWN_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier JUMP_BAR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JUMP_BAR_PROGRESS_TEXTURE); }
// public void JUMP_BAR_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.JUMP_BAR_PROGRESS_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier EXPERIENCE_BAR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EXPERIENCE_BAR_BACKGROUND_TEXTURE); }
// public void EXPERIENCE_BAR_BACKGROUND_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EXPERIENCE_BAR_BACKGROUND_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier EXPERIENCE_BAR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EXPERIENCE_BAR_PROGRESS_TEXTURE); }
// public void EXPERIENCE_BAR_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EXPERIENCE_BAR_PROGRESS_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier ARMOR_EMPTY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ARMOR_EMPTY_TEXTURE); }
// public void ARMOR_EMPTY_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ARMOR_EMPTY_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier ARMOR_HALF_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ARMOR_HALF_TEXTURE); }
// public void ARMOR_HALF_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ARMOR_HALF_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier ARMOR_FULL_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ARMOR_FULL_TEXTURE); }
// public void ARMOR_FULL_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ARMOR_FULL_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier FOOD_EMPTY_HUNGER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_EMPTY_HUNGER_TEXTURE); }
// public void FOOD_EMPTY_HUNGER_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FOOD_EMPTY_HUNGER_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier FOOD_HALF_HUNGER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_HALF_HUNGER_TEXTURE); }
// public void FOOD_HALF_HUNGER_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FOOD_HALF_HUNGER_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier FOOD_FULL_HUNGER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_FULL_HUNGER_TEXTURE); }
// public void FOOD_FULL_HUNGER_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FOOD_FULL_HUNGER_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier FOOD_EMPTY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_EMPTY_TEXTURE); }
// public void FOOD_EMPTY_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FOOD_EMPTY_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier FOOD_HALF_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_HALF_TEXTURE); }
// public void FOOD_HALF_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FOOD_HALF_TEXTURE = value.wrapperContained; }
// public java.util.Comparator SCOREBOARD_ENTRY_COMPARATOR() { return wrapperContained.SCOREBOARD_ENTRY_COMPARATOR; }
// public void SCOREBOARD_ENTRY_COMPARATOR(java.util.Comparator value) { wrapperContained.SCOREBOARD_ENTRY_COMPARATOR = value; }
// public yarnwrap.client.gui.LayeredDrawer layeredDrawer() { return new yarnwrap.client.gui.LayeredDrawer(wrapperContained.layeredDrawer); }
// public void layeredDrawer(yarnwrap.client.gui.LayeredDrawer value) { wrapperContained.layeredDrawer = value.wrapperContained; }
// public void updateVignetteDarkness(yarnwrap.entity.Entity entity) { wrapperContained.updateVignetteDarkness(entity.wrapperContained); }
public void setRecordPlayingOverlay(yarnwrap.text.Text description) { wrapperContained.setRecordPlayingOverlay(description.wrapperContained); }
// public int getHeartRows(int heartCount) { return wrapperContained.getHeartRows(heartCount); }
// public yarnwrap.entity.LivingEntity getRiddenEntity() { return new yarnwrap.entity.LivingEntity(wrapperContained.getRiddenEntity()); }
// public void renderVignetteOverlay(yarnwrap.client.gui.DrawContext context,yarnwrap.entity.Entity entity) { wrapperContained.renderVignetteOverlay(context.wrapperContained,entity.wrapperContained); }
// public void renderCrosshair(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderCrosshair(context.wrapperContained,tickCounter.wrapperContained); }
// public yarnwrap.entity.player.PlayerEntity getCameraPlayer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.getCameraPlayer()); }
public int getTicks() { return wrapperContained.getTicks(); }
public yarnwrap.client.gui.hud.SpectatorHud getSpectatorHud() { return new yarnwrap.client.gui.hud.SpectatorHud(wrapperContained.getSpectatorHud()); }
public yarnwrap.client.gui.hud.BossBarHud getBossBarHud() { return new yarnwrap.client.gui.hud.BossBarHud(wrapperContained.getBossBarHud()); }
// public void renderMountHealth(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderMountHealth(context.wrapperContained); }
public void setDefaultTitleFade() { wrapperContained.setDefaultTitleFade(); }
public yarnwrap.client.gui.hud.ChatHud getChatHud() { return new yarnwrap.client.gui.hud.ChatHud(wrapperContained.getChatHud()); }
// public int getHeartCount(yarnwrap.entity.LivingEntity entity) { return wrapperContained.getHeartCount(entity.wrapperContained); }
public void resetDebugHudChunk() { wrapperContained.resetDebugHudChunk(); }
// public void renderPortalOverlay(yarnwrap.client.gui.DrawContext context,float nauseaStrength) { wrapperContained.renderPortalOverlay(context.wrapperContained,nauseaStrength); }
public void clear() { wrapperContained.clear(); }
// public void tick() { wrapperContained.tick(); }
// public void renderHeldItemTooltip(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderHeldItemTooltip(context.wrapperContained); }
public yarnwrap.client.gui.hud.PlayerListHud getPlayerListHud() { return new yarnwrap.client.gui.hud.PlayerListHud(wrapperContained.getPlayerListHud()); }
// public void renderMountJumpBar(yarnwrap.entity.JumpingMount mount,yarnwrap.client.gui.DrawContext context,int x) { wrapperContained.renderMountJumpBar(mount.wrapperContained,context.wrapperContained,x); }
public void render(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.render(context.wrapperContained,tickCounter.wrapperContained); }
// public boolean shouldRenderSpectatorCrosshair(yarnwrap.util.hit.HitResult hitResult) { return wrapperContained.shouldRenderSpectatorCrosshair(hitResult.wrapperContained); }
// public void renderExperienceBar(yarnwrap.client.gui.DrawContext context,int x) { wrapperContained.renderExperienceBar(context.wrapperContained,x); }
public yarnwrap.client.font.TextRenderer getTextRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.getTextRenderer()); }
// public void renderScoreboardSidebar(yarnwrap.client.gui.DrawContext context,yarnwrap.scoreboard.ScoreboardObjective objective) { wrapperContained.renderScoreboardSidebar(context.wrapperContained,objective.wrapperContained); }
public void setOverlayMessage(yarnwrap.text.Text message,boolean tinted) { wrapperContained.setOverlayMessage(message.wrapperContained,tinted); }
// public void renderHotbar(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderHotbar(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderStatusBars(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderStatusBars(context.wrapperContained); }
// public void renderHotbarItem(yarnwrap.client.gui.DrawContext context,int x,int y,yarnwrap.client.render.RenderTickCounter tickCounter,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack,int seed) { wrapperContained.renderHotbarItem(context.wrapperContained,x,y,tickCounter.wrapperContained,player.wrapperContained,stack.wrapperContained,seed); }
// public void renderStatusEffectOverlay(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderStatusEffectOverlay(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderDemoTimer(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderDemoTimer(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderOverlay(yarnwrap.client.gui.DrawContext context,yarnwrap.util.Identifier texture,float opacity) { wrapperContained.renderOverlay(context.wrapperContained,texture.wrapperContained,opacity); }
// public void renderSpyglassOverlay(yarnwrap.client.gui.DrawContext context,float scale) { wrapperContained.renderSpyglassOverlay(context.wrapperContained,scale); }
public void setTitleTicks(int fadeInTicks,int stayTicks,int fadeOutTicks) { wrapperContained.setTitleTicks(fadeInTicks,stayTicks,fadeOutTicks); }
public void setSubtitle(yarnwrap.text.Text subtitle) { wrapperContained.setSubtitle(subtitle.wrapperContained); }
public void clearTitle() { wrapperContained.clearTitle(); }
public void setTitle(yarnwrap.text.Text title) { wrapperContained.setTitle(title.wrapperContained); }
// public void renderHealthBar(yarnwrap.client.gui.DrawContext context,yarnwrap.entity.player.PlayerEntity player,int x,int y,int lines,int regeneratingHeartIndex,float maxHealth,int lastHealth,int health,int absorption,boolean blinking) { wrapperContained.renderHealthBar(context.wrapperContained,player.wrapperContained,x,y,lines,regeneratingHeartIndex,maxHealth,lastHealth,health,absorption,blinking); }
// public void drawHeart(yarnwrap.client.gui.DrawContext context,Object type,int x,int y,boolean hardcore,boolean blinking,boolean half) { wrapperContained.drawHeart(context.wrapperContained,type,x,y,hardcore,blinking,half); }
public void tick(boolean paused) { wrapperContained.tick(paused); }
public void renderAutosaveIndicator(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderAutosaveIndicator(context.wrapperContained,tickCounter.wrapperContained); }
// public void tickAutosaveIndicator() { wrapperContained.tickAutosaveIndicator(); }
public boolean shouldShowChatDisabledScreen() { return wrapperContained.shouldShowChatDisabledScreen(); }
public void setCanShowChatDisabledScreen(boolean canShowChatDisabledScreen) { wrapperContained.setCanShowChatDisabledScreen(canShowChatDisabledScreen); }
public yarnwrap.client.gui.hud.DebugHud getDebugHud() { return new yarnwrap.client.gui.hud.DebugHud(wrapperContained.getDebugHud()); }
// public void renderMiscOverlays(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderMiscOverlays(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderSleepOverlay(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderSleepOverlay(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderOverlayMessage(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderOverlayMessage(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderTitleAndSubtitle(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderTitleAndSubtitle(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderChat(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderChat(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderScoreboardSidebar(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderScoreboardSidebar(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderPlayerList(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderPlayerList(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderMainHud(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderMainHud(context.wrapperContained,tickCounter.wrapperContained); }
// public boolean shouldRenderExperience() { return wrapperContained.shouldRenderExperience(); }
// public void renderExperienceLevel(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderExperienceLevel(context.wrapperContained,tickCounter.wrapperContained); }
// public void renderFood(yarnwrap.client.gui.DrawContext context,yarnwrap.entity.player.PlayerEntity player,int top,int right) { wrapperContained.renderFood(context.wrapperContained,player.wrapperContained,top,right); }
// public void renderArmor(yarnwrap.client.gui.DrawContext context,yarnwrap.entity.player.PlayerEntity player,int x) { wrapperContained.renderArmor(context.wrapperContained,player.wrapperContained,x); }

}