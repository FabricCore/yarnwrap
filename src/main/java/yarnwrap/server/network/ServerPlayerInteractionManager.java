package yarnwrap.server.network;
public class ServerPlayerInteractionManager { public net.minecraft.server.network.ServerPlayerInteractionManager wrapperContained; public ServerPlayerInteractionManager(net.minecraft.server.network.ServerPlayerInteractionManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int tickCounter() { return wrapperContained.tickCounter; }
// public void tickCounter(int value) { wrapperContained.tickCounter = value; }
// public static int tickCounter() { return net.minecraft.server.network.ServerPlayerInteractionManager.tickCounter; }
// public static void tickCounter(int value, ) { net.minecraft.server.network.ServerPlayerInteractionManager.tickCounter = value; }

// public boolean mining() { return wrapperContained.mining; }
// public void mining(boolean value) { wrapperContained.mining = value; }
// public static boolean mining() { return net.minecraft.server.network.ServerPlayerInteractionManager.mining; }
// public static void mining(boolean value, ) { net.minecraft.server.network.ServerPlayerInteractionManager.mining = value; }

// public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode); }
// public void gameMode(yarnwrap.world.GameMode value) { wrapperContained.gameMode = value.wrapperContained; }
// public static yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(net.minecraft.server.network.ServerPlayerInteractionManager.gameMode); }
// public static void gameMode(yarnwrap.world.GameMode value, ) { net.minecraft.server.network.ServerPlayerInteractionManager.gameMode = value.wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.server.network.ServerPlayerInteractionManager.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.server.network.ServerPlayerInteractionManager.world = value.wrapperContained; }

// public yarnwrap.server.network.ServerPlayerEntity player() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.server.network.ServerPlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.server.network.ServerPlayerEntity player() { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.server.network.ServerPlayerInteractionManager.player); }
// public static void player(yarnwrap.server.network.ServerPlayerEntity value, ) { net.minecraft.server.network.ServerPlayerInteractionManager.player = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.network.ServerPlayerInteractionManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.network.ServerPlayerInteractionManager.LOGGER = value; }

// public int startMiningTime() { return wrapperContained.startMiningTime; }
// public void startMiningTime(int value) { wrapperContained.startMiningTime = value; }
// public static int startMiningTime() { return net.minecraft.server.network.ServerPlayerInteractionManager.startMiningTime; }
// public static void startMiningTime(int value, ) { net.minecraft.server.network.ServerPlayerInteractionManager.startMiningTime = value; }

// public yarnwrap.util.math.BlockPos miningPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.miningPos); }
// public void miningPos(yarnwrap.util.math.BlockPos value) { wrapperContained.miningPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos miningPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.server.network.ServerPlayerInteractionManager.miningPos); }
// public static void miningPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.server.network.ServerPlayerInteractionManager.miningPos = value.wrapperContained; }

// public boolean failedToMine() { return wrapperContained.failedToMine; }
// public void failedToMine(boolean value) { wrapperContained.failedToMine = value; }
// public static boolean failedToMine() { return net.minecraft.server.network.ServerPlayerInteractionManager.failedToMine; }
// public static void failedToMine(boolean value, ) { net.minecraft.server.network.ServerPlayerInteractionManager.failedToMine = value; }

// public yarnwrap.util.math.BlockPos failedMiningPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.failedMiningPos); }
// public void failedMiningPos(yarnwrap.util.math.BlockPos value) { wrapperContained.failedMiningPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos failedMiningPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.server.network.ServerPlayerInteractionManager.failedMiningPos); }
// public static void failedMiningPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.server.network.ServerPlayerInteractionManager.failedMiningPos = value.wrapperContained; }

// public int failedStartMiningTime() { return wrapperContained.failedStartMiningTime; }
// public void failedStartMiningTime(int value) { wrapperContained.failedStartMiningTime = value; }
// public static int failedStartMiningTime() { return net.minecraft.server.network.ServerPlayerInteractionManager.failedStartMiningTime; }
// public static void failedStartMiningTime(int value, ) { net.minecraft.server.network.ServerPlayerInteractionManager.failedStartMiningTime = value; }

// public int blockBreakingProgress() { return wrapperContained.blockBreakingProgress; }
// public void blockBreakingProgress(int value) { wrapperContained.blockBreakingProgress = value; }
// public static int blockBreakingProgress() { return net.minecraft.server.network.ServerPlayerInteractionManager.blockBreakingProgress; }
// public static void blockBreakingProgress(int value, ) { net.minecraft.server.network.ServerPlayerInteractionManager.blockBreakingProgress = value; }

// public yarnwrap.world.GameMode previousGameMode() { return new yarnwrap.world.GameMode(wrapperContained.previousGameMode); }
// public void previousGameMode(yarnwrap.world.GameMode value) { wrapperContained.previousGameMode = value.wrapperContained; }
// public static yarnwrap.world.GameMode previousGameMode() { return new yarnwrap.world.GameMode(net.minecraft.server.network.ServerPlayerInteractionManager.previousGameMode); }
// public static void previousGameMode(yarnwrap.world.GameMode value, ) { net.minecraft.server.network.ServerPlayerInteractionManager.previousGameMode = value.wrapperContained; }

public ServerPlayerInteractionManager(yarnwrap.server.network.ServerPlayerEntity player) { this.wrapperContained = new net.minecraft.server.network.ServerPlayerInteractionManager(player.wrapperContained); }
public yarnwrap.util.ActionResult interactItem(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interactItem(player.wrapperContained,world.wrapperContained,stack.wrapperContained,hand.wrapperContained)); }
// public static yarnwrap.util.ActionResult interactItem(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.util.Hand hand, ) { return new yarnwrap.util.ActionResult(net.minecraft.server.network.ServerPlayerInteractionManager.interactItem(player.wrapperContained,world.wrapperContained,stack.wrapperContained,hand.wrapperContained)); }
public yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getGameMode()); }
// public static yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(net.minecraft.server.network.ServerPlayerInteractionManager.getGameMode()); }
public void setWorld(yarnwrap.server.world.ServerWorld world) { wrapperContained.setWorld(world.wrapperContained); }
// public static void setWorld(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.server.network.ServerPlayerInteractionManager.setWorld(world.wrapperContained); }
// public void setGameMode(yarnwrap.world.GameMode gameMode,yarnwrap.world.GameMode previousGameMode) { wrapperContained.setGameMode(gameMode.wrapperContained,previousGameMode.wrapperContained); }
// public static void setGameMode(yarnwrap.world.GameMode gameMode,yarnwrap.world.GameMode previousGameMode, ) { net.minecraft.server.network.ServerPlayerInteractionManager.setGameMode(gameMode.wrapperContained,previousGameMode.wrapperContained); }
public yarnwrap.util.ActionResult interactBlock(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.util.Hand hand,yarnwrap.util.hit.BlockHitResult hitResult) { return new yarnwrap.util.ActionResult(wrapperContained.interactBlock(player.wrapperContained,world.wrapperContained,stack.wrapperContained,hand.wrapperContained,hitResult.wrapperContained)); }
// public static yarnwrap.util.ActionResult interactBlock(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.util.Hand hand,yarnwrap.util.hit.BlockHitResult hitResult, ) { return new yarnwrap.util.ActionResult(net.minecraft.server.network.ServerPlayerInteractionManager.interactBlock(player.wrapperContained,world.wrapperContained,stack.wrapperContained,hand.wrapperContained,hitResult.wrapperContained)); }
// public void processBlockBreakingAction(yarnwrap.util.math.BlockPos pos,Object action,yarnwrap.util.math.Direction direction,int worldHeight,int sequence) { wrapperContained.processBlockBreakingAction(pos.wrapperContained,action,direction.wrapperContained,worldHeight,sequence); }
// public static void processBlockBreakingAction(yarnwrap.util.math.BlockPos pos,Object action,yarnwrap.util.math.Direction direction,int worldHeight,int sequence, ) { net.minecraft.server.network.ServerPlayerInteractionManager.processBlockBreakingAction(pos.wrapperContained,action,direction.wrapperContained,worldHeight,sequence); }
public void update() { wrapperContained.update(); }
// public static void update() { net.minecraft.server.network.ServerPlayerInteractionManager.update(); }
public boolean tryBreakBlock(yarnwrap.util.math.BlockPos pos) { return wrapperContained.tryBreakBlock(pos.wrapperContained); }
// public static boolean tryBreakBlock(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.server.network.ServerPlayerInteractionManager.tryBreakBlock(pos.wrapperContained); }
public boolean isSurvivalLike() { return wrapperContained.isSurvivalLike(); }
// public static boolean isSurvivalLike() { return net.minecraft.server.network.ServerPlayerInteractionManager.isSurvivalLike(); }
public boolean isCreative() { return wrapperContained.isCreative(); }
// public static boolean isCreative() { return net.minecraft.server.network.ServerPlayerInteractionManager.isCreative(); }
// public float continueMining(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,int failedStartMiningTime) { return wrapperContained.continueMining(state.wrapperContained,pos.wrapperContained,failedStartMiningTime); }
// public static float continueMining(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,int failedStartMiningTime, ) { return net.minecraft.server.network.ServerPlayerInteractionManager.continueMining(state.wrapperContained,pos.wrapperContained,failedStartMiningTime); }
public void finishMining(yarnwrap.util.math.BlockPos pos,int sequence,java.lang.String reason) { wrapperContained.finishMining(pos.wrapperContained,sequence,reason); }
// public static void finishMining(yarnwrap.util.math.BlockPos pos,int sequence,java.lang.String reason, ) { net.minecraft.server.network.ServerPlayerInteractionManager.finishMining(pos.wrapperContained,sequence,reason); }
public boolean changeGameMode(yarnwrap.world.GameMode gameMode) { return wrapperContained.changeGameMode(gameMode.wrapperContained); }
// public static boolean changeGameMode(yarnwrap.world.GameMode gameMode, ) { return net.minecraft.server.network.ServerPlayerInteractionManager.changeGameMode(gameMode.wrapperContained); }
public yarnwrap.world.GameMode getPreviousGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getPreviousGameMode()); }
// public static yarnwrap.world.GameMode getPreviousGameMode() { return new yarnwrap.world.GameMode(net.minecraft.server.network.ServerPlayerInteractionManager.getPreviousGameMode()); }
// public void onBlockBreakingAction(yarnwrap.util.math.BlockPos pos,boolean success,int sequence,java.lang.String reason) { wrapperContained.onBlockBreakingAction(pos.wrapperContained,success,sequence,reason); }
// public static void onBlockBreakingAction(yarnwrap.util.math.BlockPos pos,boolean success,int sequence,java.lang.String reason, ) { net.minecraft.server.network.ServerPlayerInteractionManager.onBlockBreakingAction(pos.wrapperContained,success,sequence,reason); }

}