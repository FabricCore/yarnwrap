package yarnwrap.server.network;
public class ServerPlayerInteractionManager { public net.minecraft.server.network.ServerPlayerInteractionManager wrapperContained; public ServerPlayerInteractionManager(net.minecraft.server.network.ServerPlayerInteractionManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int tickCounter() { return wrapperContained.tickCounter; }
// public boolean mining() { return wrapperContained.mining; }
// public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode); }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public yarnwrap.server.network.ServerPlayerEntity player() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.player); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int startMiningTime() { return wrapperContained.startMiningTime; }
// public yarnwrap.util.math.BlockPos miningPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.miningPos); }
// public boolean failedToMine() { return wrapperContained.failedToMine; }
// public yarnwrap.util.math.BlockPos failedMiningPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.failedMiningPos); }
// public int failedStartMiningTime() { return wrapperContained.failedStartMiningTime; }
// public int blockBreakingProgress() { return wrapperContained.blockBreakingProgress; }
// public yarnwrap.world.GameMode previousGameMode() { return new yarnwrap.world.GameMode(wrapperContained.previousGameMode); }
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