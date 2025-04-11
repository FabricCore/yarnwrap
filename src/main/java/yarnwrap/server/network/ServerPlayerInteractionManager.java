package yarnwrap.server.network;
public class ServerPlayerInteractionManager { public net.minecraft.server.network.ServerPlayerInteractionManager wrapperContained; public ServerPlayerInteractionManager(net.minecraft.server.network.ServerPlayerInteractionManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int tickCounter() { return wrapperContained.tickCounter; }
// public void tickCounter(int value) { wrapperContained.tickCounter = value; }
// public boolean mining() { return wrapperContained.mining; }
// public void mining(boolean value) { wrapperContained.mining = value; }
// public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode); }
// public void gameMode(yarnwrap.world.GameMode value) { wrapperContained.gameMode = value.wrapperContained; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.server.network.ServerPlayerEntity player() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.server.network.ServerPlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int startMiningTime() { return wrapperContained.startMiningTime; }
// public void startMiningTime(int value) { wrapperContained.startMiningTime = value; }
// public yarnwrap.util.math.BlockPos miningPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.miningPos); }
// public void miningPos(yarnwrap.util.math.BlockPos value) { wrapperContained.miningPos = value.wrapperContained; }
// public boolean failedToMine() { return wrapperContained.failedToMine; }
// public void failedToMine(boolean value) { wrapperContained.failedToMine = value; }
// public yarnwrap.util.math.BlockPos failedMiningPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.failedMiningPos); }
// public void failedMiningPos(yarnwrap.util.math.BlockPos value) { wrapperContained.failedMiningPos = value.wrapperContained; }
// public int failedStartMiningTime() { return wrapperContained.failedStartMiningTime; }
// public void failedStartMiningTime(int value) { wrapperContained.failedStartMiningTime = value; }
// public int blockBreakingProgress() { return wrapperContained.blockBreakingProgress; }
// public void blockBreakingProgress(int value) { wrapperContained.blockBreakingProgress = value; }
// public yarnwrap.world.GameMode previousGameMode() { return new yarnwrap.world.GameMode(wrapperContained.previousGameMode); }
// public void previousGameMode(yarnwrap.world.GameMode value) { wrapperContained.previousGameMode = value.wrapperContained; }
public yarnwrap.util.ActionResult interactItem(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interactItem(player.wrapperContained,world.wrapperContained,stack.wrapperContained,hand.wrapperContained)); }
public yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getGameMode()); }
public void setWorld(yarnwrap.server.world.ServerWorld world) { wrapperContained.setWorld(world.wrapperContained); }
// public void setGameMode(yarnwrap.world.GameMode gameMode,yarnwrap.world.GameMode previousGameMode) { wrapperContained.setGameMode(gameMode.wrapperContained,previousGameMode.wrapperContained); }
public yarnwrap.util.ActionResult interactBlock(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.util.Hand hand,yarnwrap.util.hit.BlockHitResult hitResult) { return new yarnwrap.util.ActionResult(wrapperContained.interactBlock(player.wrapperContained,world.wrapperContained,stack.wrapperContained,hand.wrapperContained,hitResult.wrapperContained)); }
// public void processBlockBreakingAction(yarnwrap.util.math.BlockPos pos,Object action,yarnwrap.util.math.Direction direction,int worldHeight,int sequence) { wrapperContained.processBlockBreakingAction(pos.wrapperContained,action,direction.wrapperContained,worldHeight,sequence); }
public void update() { wrapperContained.update(); }
public boolean tryBreakBlock(yarnwrap.util.math.BlockPos pos) { return wrapperContained.tryBreakBlock(pos.wrapperContained); }
public boolean isSurvivalLike() { return wrapperContained.isSurvivalLike(); }
public boolean isCreative() { return wrapperContained.isCreative(); }
// public float continueMining(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,int failedStartMiningTime) { return wrapperContained.continueMining(state.wrapperContained,pos.wrapperContained,failedStartMiningTime); }
public void finishMining(yarnwrap.util.math.BlockPos pos,int sequence,java.lang.String reason) { wrapperContained.finishMining(pos.wrapperContained,sequence,reason); }
public boolean changeGameMode(yarnwrap.world.GameMode gameMode) { return wrapperContained.changeGameMode(gameMode.wrapperContained); }
public yarnwrap.world.GameMode getPreviousGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getPreviousGameMode()); }
// public void onBlockBreakingAction(yarnwrap.util.math.BlockPos pos,boolean success,int sequence,java.lang.String reason) { wrapperContained.onBlockBreakingAction(pos.wrapperContained,success,sequence,reason); }

}