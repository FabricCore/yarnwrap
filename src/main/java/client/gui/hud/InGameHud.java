package yarnwrap.client.gui.hud;
public class InGameHud { public net.minecraft.client.gui.hud.InGameHud wrapperContained; public InGameHud(net.minecraft.client.gui.hud.InGameHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public long lastHealthCheckTime() { return wrapperContained.lastHealthCheckTime; }
public float vignetteDarkness() { return wrapperContained.vignetteDarkness; }
// public int lastHealthValue() { return wrapperContained.lastHealthValue; }
// public yarnwrap.client.gui.hud.PlayerListHud playerListHud() { return new yarnwrap.client.gui.hud.PlayerListHud(wrapperContained.playerListHud); }
// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public int titleStayTicks() { return wrapperContained.titleStayTicks; }
// public yarnwrap.text.Text overlayMessage() { return new yarnwrap.text.Text(wrapperContained.overlayMessage); }
// public yarnwrap.util.Identifier PUMPKIN_BLUR() { return new yarnwrap.util.Identifier(wrapperContained.PUMPKIN_BLUR); }
// public yarnwrap.util.Identifier VIGNETTE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.VIGNETTE_TEXTURE); }
// public yarnwrap.client.gui.hud.ChatHud chatHud() { return new yarnwrap.client.gui.hud.ChatHud(wrapperContained.chatHud); }
// public int titleRemainTicks() { return wrapperContained.titleRemainTicks; }
// public yarnwrap.client.gui.hud.SpectatorHud spectatorHud() { return new yarnwrap.client.gui.hud.SpectatorHud(wrapperContained.spectatorHud); }
// public yarnwrap.client.gui.hud.DebugHud debugHud() { return new yarnwrap.client.gui.hud.DebugHud(wrapperContained.debugHud); }
// public yarnwrap.client.gui.hud.SubtitlesHud subtitlesHud() { return new yarnwrap.client.gui.hud.SubtitlesHud(wrapperContained.subtitlesHud); }
// public yarnwrap.client.gui.hud.BossBarHud bossBarHud() { return new yarnwrap.client.gui.hud.BossBarHud(wrapperContained.bossBarHud); }
// public yarnwrap.item.ItemStack currentStack() { return new yarnwrap.item.ItemStack(wrapperContained.currentStack); }
// public long heartJumpEndTick() { return wrapperContained.heartJumpEndTick; }
// public int renderHealthValue() { return wrapperContained.renderHealthValue; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public int titleFadeOutTicks() { return wrapperContained.titleFadeOutTicks; }
// public int titleFadeInTicks() { return wrapperContained.titleFadeInTicks; }
// public boolean overlayTinted() { return wrapperContained.overlayTinted; }
// public yarnwrap.text.Text subtitle() { return new yarnwrap.text.Text(wrapperContained.subtitle); }
// public int heldItemTooltipFade() { return wrapperContained.heldItemTooltipFade; }
// public int overlayRemaining() { return wrapperContained.overlayRemaining; }
// public int ticks() { return wrapperContained.ticks; }
// public yarnwrap.text.Text DEMO_EXPIRED_MESSAGE() { return new yarnwrap.text.Text(wrapperContained.DEMO_EXPIRED_MESSAGE); }
// public yarnwrap.util.Identifier SPYGLASS_SCOPE() { return new yarnwrap.util.Identifier(wrapperContained.SPYGLASS_SCOPE); }
// public float spyglassScale() { return wrapperContained.spyglassScale; }
// public yarnwrap.util.Identifier POWDER_SNOW_OUTLINE() { return new yarnwrap.util.Identifier(wrapperContained.POWDER_SNOW_OUTLINE); }
// public java.lang.String SCOREBOARD_JOINER() { return wrapperContained.SCOREBOARD_JOINER; }
// public float autosaveIndicatorAlpha() { return wrapperContained.autosaveIndicatorAlpha; }
// public float lastAutosaveIndicatorAlpha() { return wrapperContained.lastAutosaveIndicatorAlpha; }
// public yarnwrap.text.Text SAVING_LEVEL_TEXT() { return new yarnwrap.text.Text(wrapperContained.SAVING_LEVEL_TEXT); }
// public boolean canShowChatDisabledScreen() { return wrapperContained.canShowChatDisabledScreen; }
// public yarnwrap.util.Identifier FOOD_FULL_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_FULL_TEXTURE); }
// public yarnwrap.util.Identifier AIR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.AIR_TEXTURE); }
// public yarnwrap.util.Identifier AIR_BURSTING_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.AIR_BURSTING_TEXTURE); }
// public yarnwrap.util.Identifier VEHICLE_CONTAINER_HEART_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.VEHICLE_CONTAINER_HEART_TEXTURE); }
// public yarnwrap.util.Identifier VEHICLE_FULL_HEART_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.VEHICLE_FULL_HEART_TEXTURE); }
// public yarnwrap.util.Identifier VEHICLE_HALF_HEART_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.VEHICLE_HALF_HEART_TEXTURE); }
// public yarnwrap.util.Identifier CROSSHAIR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CROSSHAIR_TEXTURE); }
// public yarnwrap.util.Identifier CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE); }
// public yarnwrap.util.Identifier CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE); }
// public yarnwrap.util.Identifier CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE); }
// public yarnwrap.util.Identifier EFFECT_BACKGROUND_AMBIENT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EFFECT_BACKGROUND_AMBIENT_TEXTURE); }
// public yarnwrap.util.Identifier EFFECT_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EFFECT_BACKGROUND_TEXTURE); }
// public yarnwrap.util.Identifier HOTBAR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_TEXTURE); }
// public yarnwrap.util.Identifier HOTBAR_SELECTION_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_SELECTION_TEXTURE); }
// public yarnwrap.util.Identifier HOTBAR_OFFHAND_LEFT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_OFFHAND_LEFT_TEXTURE); }
// public yarnwrap.util.Identifier HOTBAR_OFFHAND_RIGHT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_OFFHAND_RIGHT_TEXTURE); }
// public yarnwrap.util.Identifier HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_ATTACK_INDICATOR_BACKGROUND_TEXTURE); }
// public yarnwrap.util.Identifier HOTBAR_ATTACK_INDICATOR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_ATTACK_INDICATOR_PROGRESS_TEXTURE); }
// public yarnwrap.util.Identifier JUMP_BAR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JUMP_BAR_BACKGROUND_TEXTURE); }
// public yarnwrap.util.Identifier JUMP_BAR_COOLDOWN_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JUMP_BAR_COOLDOWN_TEXTURE); }
// public yarnwrap.util.Identifier JUMP_BAR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JUMP_BAR_PROGRESS_TEXTURE); }
// public yarnwrap.util.Identifier EXPERIENCE_BAR_BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EXPERIENCE_BAR_BACKGROUND_TEXTURE); }
// public yarnwrap.util.Identifier EXPERIENCE_BAR_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EXPERIENCE_BAR_PROGRESS_TEXTURE); }
// public yarnwrap.util.Identifier ARMOR_EMPTY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ARMOR_EMPTY_TEXTURE); }
// public yarnwrap.util.Identifier ARMOR_HALF_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ARMOR_HALF_TEXTURE); }
// public yarnwrap.util.Identifier ARMOR_FULL_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ARMOR_FULL_TEXTURE); }
// public yarnwrap.util.Identifier FOOD_EMPTY_HUNGER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_EMPTY_HUNGER_TEXTURE); }
// public yarnwrap.util.Identifier FOOD_HALF_HUNGER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_HALF_HUNGER_TEXTURE); }
// public yarnwrap.util.Identifier FOOD_FULL_HUNGER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_FULL_HUNGER_TEXTURE); }
// public yarnwrap.util.Identifier FOOD_EMPTY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_EMPTY_TEXTURE); }
// public yarnwrap.util.Identifier FOOD_HALF_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FOOD_HALF_TEXTURE); }
// public java.util.Comparator SCOREBOARD_ENTRY_COMPARATOR() { return wrapperContained.SCOREBOARD_ENTRY_COMPARATOR; }
// public yarnwrap.client.gui.LayeredDrawer layeredDrawer() { return new yarnwrap.client.gui.LayeredDrawer(wrapperContained.layeredDrawer); }
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