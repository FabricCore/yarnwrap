package yarnwrap.client.network;
public class ClientPlayerEntity { public net.minecraft.client.network.ClientPlayerEntity wrapperContained; public ClientPlayerEntity(net.minecraft.client.network.ClientPlayerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean showsDeathScreen() { return wrapperContained.showsDeathScreen; }
// public boolean inSneakingPose() { return wrapperContained.inSneakingPose; }
// public double MAX_SOFT_COLLISION_RADIANS() { return wrapperContained.MAX_SOFT_COLLISION_RADIANS; }
public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int clientPermissionLevel() { return wrapperContained.clientPermissionLevel; }
public yarnwrap.client.input.Input input() { return new yarnwrap.client.input.Input(wrapperContained.input); }
public float lastRenderPitch() { return wrapperContained.lastRenderPitch; }
// public boolean usingItem() { return wrapperContained.usingItem; }
public float renderPitch() { return wrapperContained.renderPitch; }
// public int underwaterVisibilityTicks() { return wrapperContained.underwaterVisibilityTicks; }
// public boolean healthInitialized() { return wrapperContained.healthInitialized; }
// public boolean lastSprinting() { return wrapperContained.lastSprinting; }
// public boolean lastOnGround() { return wrapperContained.lastOnGround; }
// public float mountJumpStrength() { return wrapperContained.mountJumpStrength; }
// public int ticksSinceLastPositionPacketSent() { return wrapperContained.ticksSinceLastPositionPacketSent; }
// public double lastZ() { return wrapperContained.lastZ; }
// public float lastPitch() { return wrapperContained.lastPitch; }
// public double lastX() { return wrapperContained.lastX; }
// public boolean autoJumpEnabled() { return wrapperContained.autoJumpEnabled; }
// public yarnwrap.stat.StatHandler statHandler() { return new yarnwrap.stat.StatHandler(wrapperContained.statHandler); }
// public yarnwrap.client.recipebook.ClientRecipeBook recipeBook() { return new yarnwrap.client.recipebook.ClientRecipeBook(wrapperContained.recipeBook); }
public float lastRenderYaw() { return wrapperContained.lastRenderYaw; }
public float renderYaw() { return wrapperContained.renderYaw; }
// public java.util.List tickables() { return wrapperContained.tickables; }
// public int ticksToNextAutojump() { return wrapperContained.ticksToNextAutojump; }
// public int ticksLeftToDoubleTapSprint() { return wrapperContained.ticksLeftToDoubleTapSprint; }
// public boolean lastSneaking() { return wrapperContained.lastSneaking; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public boolean falling() { return wrapperContained.falling; }
// public double lastBaseY() { return wrapperContained.lastBaseY; }
// public float lastYaw() { return wrapperContained.lastYaw; }
// public boolean riding() { return wrapperContained.riding; }
public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public yarnwrap.util.Hand activeHand() { return new yarnwrap.util.Hand(wrapperContained.activeHand); }
public float nauseaIntensity() { return wrapperContained.nauseaIntensity; }
public float prevNauseaIntensity() { return wrapperContained.prevNauseaIntensity; }
// public boolean limitedCraftingEnabled() { return wrapperContained.limitedCraftingEnabled; }
public boolean shouldSlowDown() { return wrapperContained.shouldSlowDown(); }
// public boolean isWalking() { return wrapperContained.isWalking(); }
// public boolean shouldAutoJump() { return wrapperContained.shouldAutoJump(); }
// public boolean hasMovementInput() { return wrapperContained.hasMovementInput(); }
// public boolean showsDeathScreen() { return wrapperContained.showsDeathScreen(); }
public void setShowsDeathScreen(boolean showsDeathScreen) { wrapperContained.setShowsDeathScreen(showsDeathScreen); }
public float getMoodPercentage() { return wrapperContained.getMoodPercentage(); }
// public void pushOutOfBlocks(double x,double z) { wrapperContained.pushOutOfBlocks(x,z); }
// public boolean wouldCollideAt(yarnwrap.util.math.BlockPos pos) { return wrapperContained.wouldCollideAt(pos.wrapperContained); }
public yarnwrap.client.recipebook.ClientRecipeBook getRecipeBook() { return new yarnwrap.client.recipebook.ClientRecipeBook(wrapperContained.getRecipeBook()); }
public void openRidingInventory() { wrapperContained.openRidingInventory(); }
// public void startRidingJump() { wrapperContained.startRidingJump(); }
// public boolean isCamera() { return wrapperContained.isCamera(); }
// public void sendMovementPackets() { wrapperContained.sendMovementPackets(); }
public void closeScreen() { wrapperContained.closeScreen(); }
public void updateHealth(float health) { wrapperContained.updateHealth(health); }
public float getUnderwaterVisibility() { return wrapperContained.getUnderwaterVisibility(); }
public void onRecipeDisplayed(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.onRecipeDisplayed(recipe.wrapperContained); }
public yarnwrap.stat.StatHandler getStatHandler() { return new yarnwrap.stat.StatHandler(wrapperContained.getStatHandler()); }
public boolean isRiding() { return wrapperContained.isRiding(); }
public void setExperience(float progress,int total,int level) { wrapperContained.setExperience(progress,total,level); }
public void setClientPermissionLevel(int clientPermissionLevel) { wrapperContained.setClientPermissionLevel(clientPermissionLevel); }
// public void autoJump(float dx,float dz) { wrapperContained.autoJump(dx,dz); }
public boolean isAutoJumpEnabled() { return wrapperContained.isAutoJumpEnabled(); }
public float getMountJumpStrength() { return wrapperContained.getMountJumpStrength(); }
public void init() { wrapperContained.init(); }
public yarnwrap.entity.JumpingMount getJumpingMount() { return new yarnwrap.entity.JumpingMount(wrapperContained.getJumpingMount()); }
// public void sendSprintingPacket() { wrapperContained.sendSprintingPacket(); }
// public boolean canSprint() { return wrapperContained.canSprint(); }
// public boolean canStartSprinting() { return wrapperContained.canStartSprinting(); }
// public boolean canVehicleSprint(yarnwrap.entity.Entity vehicle) { return wrapperContained.canVehicleSprint(vehicle.wrapperContained); }
public void onGameModeChanged(yarnwrap.world.GameMode gameMode) { wrapperContained.onGameModeChanged(gameMode.wrapperContained); }
public boolean isLimitedCraftingEnabled() { return wrapperContained.isLimitedCraftingEnabled(); }
public void setLimitedCraftingEnabled(boolean limitedCraftingEnabled) { wrapperContained.setLimitedCraftingEnabled(limitedCraftingEnabled); }
public Object getCurrentPortalEffect() { return wrapperContained.getCurrentPortalEffect(); }
// public void tickNausea(boolean fromPortalEffect) { wrapperContained.tickNausea(fromPortalEffect); }
public boolean dropSelectedItem(boolean entireStack) { return wrapperContained.dropSelectedItem(entireStack); }

}