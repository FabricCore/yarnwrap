package yarnwrap.client.network;
public class ClientPlayerEntity { public net.minecraft.client.network.ClientPlayerEntity wrapperContained; public ClientPlayerEntity(net.minecraft.client.network.ClientPlayerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean showsDeathScreen() { return wrapperContained.showsDeathScreen; }
// public void showsDeathScreen(boolean value) { wrapperContained.showsDeathScreen = value; }
// public static boolean showsDeathScreen() { return net.minecraft.client.network.ClientPlayerEntity.showsDeathScreen; }
// public static void showsDeathScreen(boolean value, ) { net.minecraft.client.network.ClientPlayerEntity.showsDeathScreen = value; }

// public boolean inSneakingPose() { return wrapperContained.inSneakingPose; }
// public void inSneakingPose(boolean value) { wrapperContained.inSneakingPose = value; }
// public static boolean inSneakingPose() { return net.minecraft.client.network.ClientPlayerEntity.inSneakingPose; }
// public static void inSneakingPose(boolean value, ) { net.minecraft.client.network.ClientPlayerEntity.inSneakingPose = value; }

// public double MAX_SOFT_COLLISION_RADIANS() { return wrapperContained.MAX_SOFT_COLLISION_RADIANS; }
// public void MAX_SOFT_COLLISION_RADIANS(double value) { wrapperContained.MAX_SOFT_COLLISION_RADIANS = value; }
// public static double MAX_SOFT_COLLISION_RADIANS() { return net.minecraft.client.network.ClientPlayerEntity.MAX_SOFT_COLLISION_RADIANS; }
// public static void MAX_SOFT_COLLISION_RADIANS(double value, ) { net.minecraft.client.network.ClientPlayerEntity.MAX_SOFT_COLLISION_RADIANS = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public static org.slf4j.Logger LOGGER() { return net.minecraft.client.network.ClientPlayerEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.network.ClientPlayerEntity.LOGGER = value; }

// public int clientPermissionLevel() { return wrapperContained.clientPermissionLevel; }
// public void clientPermissionLevel(int value) { wrapperContained.clientPermissionLevel = value; }
// public static int clientPermissionLevel() { return net.minecraft.client.network.ClientPlayerEntity.clientPermissionLevel; }
// public static void clientPermissionLevel(int value, ) { net.minecraft.client.network.ClientPlayerEntity.clientPermissionLevel = value; }

public yarnwrap.client.input.Input input() { return new yarnwrap.client.input.Input(wrapperContained.input); }
public void input(yarnwrap.client.input.Input value) { wrapperContained.input = value.wrapperContained; }
// public static yarnwrap.client.input.Input input() { return new yarnwrap.client.input.Input(net.minecraft.client.network.ClientPlayerEntity.input); }
// public static void input(yarnwrap.client.input.Input value, ) { net.minecraft.client.network.ClientPlayerEntity.input = value.wrapperContained; }

public float lastRenderPitch() { return wrapperContained.lastRenderPitch; }
public void lastRenderPitch(float value) { wrapperContained.lastRenderPitch = value; }
// public static float lastRenderPitch() { return net.minecraft.client.network.ClientPlayerEntity.lastRenderPitch; }
// public static void lastRenderPitch(float value, ) { net.minecraft.client.network.ClientPlayerEntity.lastRenderPitch = value; }

// public boolean usingItem() { return wrapperContained.usingItem; }
// public void usingItem(boolean value) { wrapperContained.usingItem = value; }
// public static boolean usingItem() { return net.minecraft.client.network.ClientPlayerEntity.usingItem; }
// public static void usingItem(boolean value, ) { net.minecraft.client.network.ClientPlayerEntity.usingItem = value; }

public float renderPitch() { return wrapperContained.renderPitch; }
public void renderPitch(float value) { wrapperContained.renderPitch = value; }
// public static float renderPitch() { return net.minecraft.client.network.ClientPlayerEntity.renderPitch; }
// public static void renderPitch(float value, ) { net.minecraft.client.network.ClientPlayerEntity.renderPitch = value; }

// public int underwaterVisibilityTicks() { return wrapperContained.underwaterVisibilityTicks; }
// public void underwaterVisibilityTicks(int value) { wrapperContained.underwaterVisibilityTicks = value; }
// public static int underwaterVisibilityTicks() { return net.minecraft.client.network.ClientPlayerEntity.underwaterVisibilityTicks; }
// public static void underwaterVisibilityTicks(int value, ) { net.minecraft.client.network.ClientPlayerEntity.underwaterVisibilityTicks = value; }

// public boolean healthInitialized() { return wrapperContained.healthInitialized; }
// public void healthInitialized(boolean value) { wrapperContained.healthInitialized = value; }
// public static boolean healthInitialized() { return net.minecraft.client.network.ClientPlayerEntity.healthInitialized; }
// public static void healthInitialized(boolean value, ) { net.minecraft.client.network.ClientPlayerEntity.healthInitialized = value; }

// public boolean lastSprinting() { return wrapperContained.lastSprinting; }
// public void lastSprinting(boolean value) { wrapperContained.lastSprinting = value; }
// public static boolean lastSprinting() { return net.minecraft.client.network.ClientPlayerEntity.lastSprinting; }
// public static void lastSprinting(boolean value, ) { net.minecraft.client.network.ClientPlayerEntity.lastSprinting = value; }

// public boolean lastOnGround() { return wrapperContained.lastOnGround; }
// public void lastOnGround(boolean value) { wrapperContained.lastOnGround = value; }
// public static boolean lastOnGround() { return net.minecraft.client.network.ClientPlayerEntity.lastOnGround; }
// public static void lastOnGround(boolean value, ) { net.minecraft.client.network.ClientPlayerEntity.lastOnGround = value; }

// public float mountJumpStrength() { return wrapperContained.mountJumpStrength; }
// public void mountJumpStrength(float value) { wrapperContained.mountJumpStrength = value; }
// public static float mountJumpStrength() { return net.minecraft.client.network.ClientPlayerEntity.mountJumpStrength; }
// public static void mountJumpStrength(float value, ) { net.minecraft.client.network.ClientPlayerEntity.mountJumpStrength = value; }

// public int ticksSinceLastPositionPacketSent() { return wrapperContained.ticksSinceLastPositionPacketSent; }
// public void ticksSinceLastPositionPacketSent(int value) { wrapperContained.ticksSinceLastPositionPacketSent = value; }
// public static int ticksSinceLastPositionPacketSent() { return net.minecraft.client.network.ClientPlayerEntity.ticksSinceLastPositionPacketSent; }
// public static void ticksSinceLastPositionPacketSent(int value, ) { net.minecraft.client.network.ClientPlayerEntity.ticksSinceLastPositionPacketSent = value; }

// public double lastZ() { return wrapperContained.lastZ; }
// public void lastZ(double value) { wrapperContained.lastZ = value; }
// public static double lastZ() { return net.minecraft.client.network.ClientPlayerEntity.lastZ; }
// public static void lastZ(double value, ) { net.minecraft.client.network.ClientPlayerEntity.lastZ = value; }

// public float lastPitch() { return wrapperContained.lastPitch; }
// public void lastPitch(float value) { wrapperContained.lastPitch = value; }
// public static float lastPitch() { return net.minecraft.client.network.ClientPlayerEntity.lastPitch; }
// public static void lastPitch(float value, ) { net.minecraft.client.network.ClientPlayerEntity.lastPitch = value; }

// public double lastX() { return wrapperContained.lastX; }
// public void lastX(double value) { wrapperContained.lastX = value; }
// public static double lastX() { return net.minecraft.client.network.ClientPlayerEntity.lastX; }
// public static void lastX(double value, ) { net.minecraft.client.network.ClientPlayerEntity.lastX = value; }

// public boolean autoJumpEnabled() { return wrapperContained.autoJumpEnabled; }
// public void autoJumpEnabled(boolean value) { wrapperContained.autoJumpEnabled = value; }
// public static boolean autoJumpEnabled() { return net.minecraft.client.network.ClientPlayerEntity.autoJumpEnabled; }
// public static void autoJumpEnabled(boolean value, ) { net.minecraft.client.network.ClientPlayerEntity.autoJumpEnabled = value; }

// public yarnwrap.stat.StatHandler statHandler() { return new yarnwrap.stat.StatHandler(wrapperContained.statHandler); }
// public void statHandler(yarnwrap.stat.StatHandler value) { wrapperContained.statHandler = value.wrapperContained; }
// public static yarnwrap.stat.StatHandler statHandler() { return new yarnwrap.stat.StatHandler(net.minecraft.client.network.ClientPlayerEntity.statHandler); }
// public static void statHandler(yarnwrap.stat.StatHandler value, ) { net.minecraft.client.network.ClientPlayerEntity.statHandler = value.wrapperContained; }

// public yarnwrap.client.recipebook.ClientRecipeBook recipeBook() { return new yarnwrap.client.recipebook.ClientRecipeBook(wrapperContained.recipeBook); }
// public void recipeBook(yarnwrap.client.recipebook.ClientRecipeBook value) { wrapperContained.recipeBook = value.wrapperContained; }
// public static yarnwrap.client.recipebook.ClientRecipeBook recipeBook() { return new yarnwrap.client.recipebook.ClientRecipeBook(net.minecraft.client.network.ClientPlayerEntity.recipeBook); }
// public static void recipeBook(yarnwrap.client.recipebook.ClientRecipeBook value, ) { net.minecraft.client.network.ClientPlayerEntity.recipeBook = value.wrapperContained; }

public float lastRenderYaw() { return wrapperContained.lastRenderYaw; }
public void lastRenderYaw(float value) { wrapperContained.lastRenderYaw = value; }
// public static float lastRenderYaw() { return net.minecraft.client.network.ClientPlayerEntity.lastRenderYaw; }
// public static void lastRenderYaw(float value, ) { net.minecraft.client.network.ClientPlayerEntity.lastRenderYaw = value; }

public float renderYaw() { return wrapperContained.renderYaw; }
public void renderYaw(float value) { wrapperContained.renderYaw = value; }
// public static float renderYaw() { return net.minecraft.client.network.ClientPlayerEntity.renderYaw; }
// public static void renderYaw(float value, ) { net.minecraft.client.network.ClientPlayerEntity.renderYaw = value; }

// public java.util.List tickables() { return wrapperContained.tickables; }
// public void tickables(java.util.List value) { wrapperContained.tickables = value; }
// public static java.util.List tickables() { return net.minecraft.client.network.ClientPlayerEntity.tickables; }
// public static void tickables(java.util.List value, ) { net.minecraft.client.network.ClientPlayerEntity.tickables = value; }

// public int ticksToNextAutojump() { return wrapperContained.ticksToNextAutojump; }
// public void ticksToNextAutojump(int value) { wrapperContained.ticksToNextAutojump = value; }
// public static int ticksToNextAutojump() { return net.minecraft.client.network.ClientPlayerEntity.ticksToNextAutojump; }
// public static void ticksToNextAutojump(int value, ) { net.minecraft.client.network.ClientPlayerEntity.ticksToNextAutojump = value; }

// public int ticksLeftToDoubleTapSprint() { return wrapperContained.ticksLeftToDoubleTapSprint; }
// public void ticksLeftToDoubleTapSprint(int value) { wrapperContained.ticksLeftToDoubleTapSprint = value; }
// public static int ticksLeftToDoubleTapSprint() { return net.minecraft.client.network.ClientPlayerEntity.ticksLeftToDoubleTapSprint; }
// public static void ticksLeftToDoubleTapSprint(int value, ) { net.minecraft.client.network.ClientPlayerEntity.ticksLeftToDoubleTapSprint = value; }

// public boolean lastSneaking() { return wrapperContained.lastSneaking; }
// public void lastSneaking(boolean value) { wrapperContained.lastSneaking = value; }
// public static boolean lastSneaking() { return net.minecraft.client.network.ClientPlayerEntity.lastSneaking; }
// public static void lastSneaking(boolean value, ) { net.minecraft.client.network.ClientPlayerEntity.lastSneaking = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.network.ClientPlayerEntity.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.network.ClientPlayerEntity.client = value.wrapperContained; }

// public boolean falling() { return wrapperContained.falling; }
// public void falling(boolean value) { wrapperContained.falling = value; }
// public static boolean falling() { return net.minecraft.client.network.ClientPlayerEntity.falling; }
// public static void falling(boolean value, ) { net.minecraft.client.network.ClientPlayerEntity.falling = value; }

// public double lastBaseY() { return wrapperContained.lastBaseY; }
// public void lastBaseY(double value) { wrapperContained.lastBaseY = value; }
// public static double lastBaseY() { return net.minecraft.client.network.ClientPlayerEntity.lastBaseY; }
// public static void lastBaseY(double value, ) { net.minecraft.client.network.ClientPlayerEntity.lastBaseY = value; }

// public float lastYaw() { return wrapperContained.lastYaw; }
// public void lastYaw(float value) { wrapperContained.lastYaw = value; }
// public static float lastYaw() { return net.minecraft.client.network.ClientPlayerEntity.lastYaw; }
// public static void lastYaw(float value, ) { net.minecraft.client.network.ClientPlayerEntity.lastYaw = value; }

// public boolean riding() { return wrapperContained.riding; }
// public void riding(boolean value) { wrapperContained.riding = value; }
// public static boolean riding() { return net.minecraft.client.network.ClientPlayerEntity.riding; }
// public static void riding(boolean value, ) { net.minecraft.client.network.ClientPlayerEntity.riding = value; }

public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value) { wrapperContained.networkHandler = value.wrapperContained; }
// public static yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(net.minecraft.client.network.ClientPlayerEntity.networkHandler); }
// public static void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value, ) { net.minecraft.client.network.ClientPlayerEntity.networkHandler = value.wrapperContained; }

// public yarnwrap.util.Hand activeHand() { return new yarnwrap.util.Hand(wrapperContained.activeHand); }
// public void activeHand(yarnwrap.util.Hand value) { wrapperContained.activeHand = value.wrapperContained; }
// public static yarnwrap.util.Hand activeHand() { return new yarnwrap.util.Hand(net.minecraft.client.network.ClientPlayerEntity.activeHand); }
// public static void activeHand(yarnwrap.util.Hand value, ) { net.minecraft.client.network.ClientPlayerEntity.activeHand = value.wrapperContained; }

public float nauseaIntensity() { return wrapperContained.nauseaIntensity; }
public void nauseaIntensity(float value) { wrapperContained.nauseaIntensity = value; }
// public static float nauseaIntensity() { return net.minecraft.client.network.ClientPlayerEntity.nauseaIntensity; }
// public static void nauseaIntensity(float value, ) { net.minecraft.client.network.ClientPlayerEntity.nauseaIntensity = value; }

public float prevNauseaIntensity() { return wrapperContained.prevNauseaIntensity; }
public void prevNauseaIntensity(float value) { wrapperContained.prevNauseaIntensity = value; }
// public static float prevNauseaIntensity() { return net.minecraft.client.network.ClientPlayerEntity.prevNauseaIntensity; }
// public static void prevNauseaIntensity(float value, ) { net.minecraft.client.network.ClientPlayerEntity.prevNauseaIntensity = value; }

// public boolean limitedCraftingEnabled() { return wrapperContained.limitedCraftingEnabled; }
// public void limitedCraftingEnabled(boolean value) { wrapperContained.limitedCraftingEnabled = value; }
// public static boolean limitedCraftingEnabled() { return net.minecraft.client.network.ClientPlayerEntity.limitedCraftingEnabled; }
// public static void limitedCraftingEnabled(boolean value, ) { net.minecraft.client.network.ClientPlayerEntity.limitedCraftingEnabled = value; }

public ClientPlayerEntity(yarnwrap.client.MinecraftClient client,yarnwrap.client.world.ClientWorld world,yarnwrap.client.network.ClientPlayNetworkHandler networkHandler,yarnwrap.stat.StatHandler stats,yarnwrap.client.recipebook.ClientRecipeBook recipeBook,boolean lastSneaking,boolean lastSprinting) { this.wrapperContained = new net.minecraft.client.network.ClientPlayerEntity(client.wrapperContained,world.wrapperContained,networkHandler.wrapperContained,stats.wrapperContained,recipeBook.wrapperContained,lastSneaking,lastSprinting); }
public boolean shouldSlowDown() { return wrapperContained.shouldSlowDown(); }
// public static boolean shouldSlowDown() { return net.minecraft.client.network.ClientPlayerEntity.shouldSlowDown(); }
// public boolean isWalking() { return wrapperContained.isWalking(); }
// public static boolean isWalking() { return net.minecraft.client.network.ClientPlayerEntity.isWalking(); }
// public boolean shouldAutoJump() { return wrapperContained.shouldAutoJump(); }
// public static boolean shouldAutoJump() { return net.minecraft.client.network.ClientPlayerEntity.shouldAutoJump(); }
// public boolean hasMovementInput() { return wrapperContained.hasMovementInput(); }
// public static boolean hasMovementInput() { return net.minecraft.client.network.ClientPlayerEntity.hasMovementInput(); }
// public boolean showsDeathScreen() { return wrapperContained.showsDeathScreen(); }
// // public static boolean showsDeathScreen() { return net.minecraft.client.network.ClientPlayerEntity.showsDeathScreen(); }
public void setShowsDeathScreen(boolean showsDeathScreen) { wrapperContained.setShowsDeathScreen(showsDeathScreen); }
// public static void setShowsDeathScreen(boolean showsDeathScreen, ) { net.minecraft.client.network.ClientPlayerEntity.setShowsDeathScreen(showsDeathScreen); }
public float getMoodPercentage() { return wrapperContained.getMoodPercentage(); }
// public static float getMoodPercentage() { return net.minecraft.client.network.ClientPlayerEntity.getMoodPercentage(); }
// public void pushOutOfBlocks(double x,double z) { wrapperContained.pushOutOfBlocks(x,z); }
// public static void pushOutOfBlocks(double x,double z, ) { net.minecraft.client.network.ClientPlayerEntity.pushOutOfBlocks(x,z); }
// public boolean wouldCollideAt(yarnwrap.util.math.BlockPos pos) { return wrapperContained.wouldCollideAt(pos.wrapperContained); }
// public static boolean wouldCollideAt(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.network.ClientPlayerEntity.wouldCollideAt(pos.wrapperContained); }
public yarnwrap.client.recipebook.ClientRecipeBook getRecipeBook() { return new yarnwrap.client.recipebook.ClientRecipeBook(wrapperContained.getRecipeBook()); }
// public static yarnwrap.client.recipebook.ClientRecipeBook getRecipeBook() { return new yarnwrap.client.recipebook.ClientRecipeBook(net.minecraft.client.network.ClientPlayerEntity.getRecipeBook()); }
public void openRidingInventory() { wrapperContained.openRidingInventory(); }
// public static void openRidingInventory() { net.minecraft.client.network.ClientPlayerEntity.openRidingInventory(); }
// public void startRidingJump() { wrapperContained.startRidingJump(); }
// public static void startRidingJump() { net.minecraft.client.network.ClientPlayerEntity.startRidingJump(); }
// public boolean isCamera() { return wrapperContained.isCamera(); }
// public static boolean isCamera() { return net.minecraft.client.network.ClientPlayerEntity.isCamera(); }
// public void sendMovementPackets() { wrapperContained.sendMovementPackets(); }
// public static void sendMovementPackets() { net.minecraft.client.network.ClientPlayerEntity.sendMovementPackets(); }
public void closeScreen() { wrapperContained.closeScreen(); }
// public static void closeScreen() { net.minecraft.client.network.ClientPlayerEntity.closeScreen(); }
public void updateHealth(float health) { wrapperContained.updateHealth(health); }
// public static void updateHealth(float health, ) { net.minecraft.client.network.ClientPlayerEntity.updateHealth(health); }
// public java.util.stream.Stream method_3139(yarnwrap.util.shape.VoxelShape shape) { return wrapperContained.method_3139(shape.wrapperContained); }
// public static java.util.stream.Stream method_3139(yarnwrap.util.shape.VoxelShape shape, ) { return net.minecraft.client.network.ClientPlayerEntity.method_3139(shape.wrapperContained); }
public float getUnderwaterVisibility() { return wrapperContained.getUnderwaterVisibility(); }
// public static float getUnderwaterVisibility() { return net.minecraft.client.network.ClientPlayerEntity.getUnderwaterVisibility(); }
public void onRecipeDisplayed(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.onRecipeDisplayed(recipe.wrapperContained); }
// public static void onRecipeDisplayed(yarnwrap.recipe.RecipeEntry recipe, ) { net.minecraft.client.network.ClientPlayerEntity.onRecipeDisplayed(recipe.wrapperContained); }
public yarnwrap.stat.StatHandler getStatHandler() { return new yarnwrap.stat.StatHandler(wrapperContained.getStatHandler()); }
// public static yarnwrap.stat.StatHandler getStatHandler() { return new yarnwrap.stat.StatHandler(net.minecraft.client.network.ClientPlayerEntity.getStatHandler()); }
public boolean isRiding() { return wrapperContained.isRiding(); }
// public static boolean isRiding() { return net.minecraft.client.network.ClientPlayerEntity.isRiding(); }
public void setExperience(float progress,int total,int level) { wrapperContained.setExperience(progress,total,level); }
// public static void setExperience(float progress,int total,int level, ) { net.minecraft.client.network.ClientPlayerEntity.setExperience(progress,total,level); }
public void setClientPermissionLevel(int clientPermissionLevel) { wrapperContained.setClientPermissionLevel(clientPermissionLevel); }
// public static void setClientPermissionLevel(int clientPermissionLevel, ) { net.minecraft.client.network.ClientPlayerEntity.setClientPermissionLevel(clientPermissionLevel); }
// public void autoJump(float dx,float dz) { wrapperContained.autoJump(dx,dz); }
// public static void autoJump(float dx,float dz, ) { net.minecraft.client.network.ClientPlayerEntity.autoJump(dx,dz); }
public boolean isAutoJumpEnabled() { return wrapperContained.isAutoJumpEnabled(); }
// public static boolean isAutoJumpEnabled() { return net.minecraft.client.network.ClientPlayerEntity.isAutoJumpEnabled(); }
public float getMountJumpStrength() { return wrapperContained.getMountJumpStrength(); }
// public static float getMountJumpStrength() { return net.minecraft.client.network.ClientPlayerEntity.getMountJumpStrength(); }
public void init() { wrapperContained.init(); }
// public static void init() { net.minecraft.client.network.ClientPlayerEntity.init(); }
public yarnwrap.entity.JumpingMount getJumpingMount() { return new yarnwrap.entity.JumpingMount(wrapperContained.getJumpingMount()); }
// public static yarnwrap.entity.JumpingMount getJumpingMount() { return new yarnwrap.entity.JumpingMount(net.minecraft.client.network.ClientPlayerEntity.getJumpingMount()); }
// public void sendSprintingPacket() { wrapperContained.sendSprintingPacket(); }
// public static void sendSprintingPacket() { net.minecraft.client.network.ClientPlayerEntity.sendSprintingPacket(); }
// public boolean canSprint() { return wrapperContained.canSprint(); }
// public static boolean canSprint() { return net.minecraft.client.network.ClientPlayerEntity.canSprint(); }
// public boolean canStartSprinting() { return wrapperContained.canStartSprinting(); }
// public static boolean canStartSprinting() { return net.minecraft.client.network.ClientPlayerEntity.canStartSprinting(); }
// public boolean canVehicleSprint(yarnwrap.entity.Entity vehicle) { return wrapperContained.canVehicleSprint(vehicle.wrapperContained); }
// public static boolean canVehicleSprint(yarnwrap.entity.Entity vehicle, ) { return net.minecraft.client.network.ClientPlayerEntity.canVehicleSprint(vehicle.wrapperContained); }
public void onGameModeChanged(yarnwrap.world.GameMode gameMode) { wrapperContained.onGameModeChanged(gameMode.wrapperContained); }
// public static void onGameModeChanged(yarnwrap.world.GameMode gameMode, ) { net.minecraft.client.network.ClientPlayerEntity.onGameModeChanged(gameMode.wrapperContained); }
public boolean isLimitedCraftingEnabled() { return wrapperContained.isLimitedCraftingEnabled(); }
// public static boolean isLimitedCraftingEnabled() { return net.minecraft.client.network.ClientPlayerEntity.isLimitedCraftingEnabled(); }
public void setLimitedCraftingEnabled(boolean limitedCraftingEnabled) { wrapperContained.setLimitedCraftingEnabled(limitedCraftingEnabled); }
// public static void setLimitedCraftingEnabled(boolean limitedCraftingEnabled, ) { net.minecraft.client.network.ClientPlayerEntity.setLimitedCraftingEnabled(limitedCraftingEnabled); }
public Object getCurrentPortalEffect() { return wrapperContained.getCurrentPortalEffect(); }
// public static Object getCurrentPortalEffect() { return net.minecraft.client.network.ClientPlayerEntity.getCurrentPortalEffect(); }
// public void tickNausea(boolean fromPortalEffect) { wrapperContained.tickNausea(fromPortalEffect); }
// public static void tickNausea(boolean fromPortalEffect, ) { net.minecraft.client.network.ClientPlayerEntity.tickNausea(fromPortalEffect); }
public boolean dropSelectedItem(boolean entireStack) { return wrapperContained.dropSelectedItem(entireStack); }
// public static boolean dropSelectedItem(boolean entireStack, ) { return net.minecraft.client.network.ClientPlayerEntity.dropSelectedItem(entireStack); }

}