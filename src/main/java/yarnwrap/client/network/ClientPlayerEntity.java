package yarnwrap.client.network;
public class ClientPlayerEntity { public net.minecraft.client.network.ClientPlayerEntity wrapperContained; public ClientPlayerEntity(net.minecraft.client.network.ClientPlayerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean showsDeathScreen() { return wrapperContained.showsDeathScreen; }
// public void showsDeathScreen(boolean value) { wrapperContained.showsDeathScreen = value; }
// public boolean inSneakingPose() { return wrapperContained.inSneakingPose; }
// public void inSneakingPose(boolean value) { wrapperContained.inSneakingPose = value; }
// public double MAX_SOFT_COLLISION_RADIANS() { return wrapperContained.MAX_SOFT_COLLISION_RADIANS; }
// public void MAX_SOFT_COLLISION_RADIANS(double value) { wrapperContained.MAX_SOFT_COLLISION_RADIANS = value; }
public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int clientPermissionLevel() { return wrapperContained.clientPermissionLevel; }
// public void clientPermissionLevel(int value) { wrapperContained.clientPermissionLevel = value; }
public yarnwrap.client.input.Input input() { return new yarnwrap.client.input.Input(wrapperContained.input); }
public void input(yarnwrap.client.input.Input value) { wrapperContained.input = value.wrapperContained; }
public float lastRenderPitch() { return wrapperContained.lastRenderPitch; }
public void lastRenderPitch(float value) { wrapperContained.lastRenderPitch = value; }
// public boolean usingItem() { return wrapperContained.usingItem; }
// public void usingItem(boolean value) { wrapperContained.usingItem = value; }
public float renderPitch() { return wrapperContained.renderPitch; }
public void renderPitch(float value) { wrapperContained.renderPitch = value; }
// public int underwaterVisibilityTicks() { return wrapperContained.underwaterVisibilityTicks; }
// public void underwaterVisibilityTicks(int value) { wrapperContained.underwaterVisibilityTicks = value; }
// public boolean healthInitialized() { return wrapperContained.healthInitialized; }
// public void healthInitialized(boolean value) { wrapperContained.healthInitialized = value; }
// public boolean lastSprinting() { return wrapperContained.lastSprinting; }
// public void lastSprinting(boolean value) { wrapperContained.lastSprinting = value; }
// public boolean lastOnGround() { return wrapperContained.lastOnGround; }
// public void lastOnGround(boolean value) { wrapperContained.lastOnGround = value; }
// public float mountJumpStrength() { return wrapperContained.mountJumpStrength; }
// public void mountJumpStrength(float value) { wrapperContained.mountJumpStrength = value; }
// public int ticksSinceLastPositionPacketSent() { return wrapperContained.ticksSinceLastPositionPacketSent; }
// public void ticksSinceLastPositionPacketSent(int value) { wrapperContained.ticksSinceLastPositionPacketSent = value; }
// public double lastZ() { return wrapperContained.lastZ; }
// public void lastZ(double value) { wrapperContained.lastZ = value; }
// public float lastPitch() { return wrapperContained.lastPitch; }
// public void lastPitch(float value) { wrapperContained.lastPitch = value; }
// public double lastX() { return wrapperContained.lastX; }
// public void lastX(double value) { wrapperContained.lastX = value; }
// public boolean autoJumpEnabled() { return wrapperContained.autoJumpEnabled; }
// public void autoJumpEnabled(boolean value) { wrapperContained.autoJumpEnabled = value; }
// public yarnwrap.stat.StatHandler statHandler() { return new yarnwrap.stat.StatHandler(wrapperContained.statHandler); }
// public void statHandler(yarnwrap.stat.StatHandler value) { wrapperContained.statHandler = value.wrapperContained; }
// public yarnwrap.client.recipebook.ClientRecipeBook recipeBook() { return new yarnwrap.client.recipebook.ClientRecipeBook(wrapperContained.recipeBook); }
// public void recipeBook(yarnwrap.client.recipebook.ClientRecipeBook value) { wrapperContained.recipeBook = value.wrapperContained; }
public float lastRenderYaw() { return wrapperContained.lastRenderYaw; }
public void lastRenderYaw(float value) { wrapperContained.lastRenderYaw = value; }
public float renderYaw() { return wrapperContained.renderYaw; }
public void renderYaw(float value) { wrapperContained.renderYaw = value; }
// public java.util.List tickables() { return wrapperContained.tickables; }
// public void tickables(java.util.List value) { wrapperContained.tickables = value; }
// public int ticksToNextAutojump() { return wrapperContained.ticksToNextAutojump; }
// public void ticksToNextAutojump(int value) { wrapperContained.ticksToNextAutojump = value; }
// public int ticksLeftToDoubleTapSprint() { return wrapperContained.ticksLeftToDoubleTapSprint; }
// public void ticksLeftToDoubleTapSprint(int value) { wrapperContained.ticksLeftToDoubleTapSprint = value; }
// public boolean lastSneaking() { return wrapperContained.lastSneaking; }
// public void lastSneaking(boolean value) { wrapperContained.lastSneaking = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public boolean falling() { return wrapperContained.falling; }
// public void falling(boolean value) { wrapperContained.falling = value; }
// public double lastBaseY() { return wrapperContained.lastBaseY; }
// public void lastBaseY(double value) { wrapperContained.lastBaseY = value; }
// public float lastYaw() { return wrapperContained.lastYaw; }
// public void lastYaw(float value) { wrapperContained.lastYaw = value; }
// public boolean riding() { return wrapperContained.riding; }
// public void riding(boolean value) { wrapperContained.riding = value; }
public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value) { wrapperContained.networkHandler = value.wrapperContained; }
// public yarnwrap.util.Hand activeHand() { return new yarnwrap.util.Hand(wrapperContained.activeHand); }
// public void activeHand(yarnwrap.util.Hand value) { wrapperContained.activeHand = value.wrapperContained; }
public float nauseaIntensity() { return wrapperContained.nauseaIntensity; }
public void nauseaIntensity(float value) { wrapperContained.nauseaIntensity = value; }
public float prevNauseaIntensity() { return wrapperContained.prevNauseaIntensity; }
public void prevNauseaIntensity(float value) { wrapperContained.prevNauseaIntensity = value; }
// public boolean limitedCraftingEnabled() { return wrapperContained.limitedCraftingEnabled; }
// public void limitedCraftingEnabled(boolean value) { wrapperContained.limitedCraftingEnabled = value; }
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