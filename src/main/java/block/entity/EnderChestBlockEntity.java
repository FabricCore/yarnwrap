package yarnwrap.block.entity;
public class EnderChestBlockEntity { public net.minecraft.block.entity.EnderChestBlockEntity wrapperContained; public EnderChestBlockEntity(net.minecraft.block.entity.EnderChestBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.entity.ChestLidAnimator lidAnimator() { return new yarnwrap.block.entity.ChestLidAnimator(wrapperContained.lidAnimator); }
// public yarnwrap.block.entity.ViewerCountManager stateManager() { return new yarnwrap.block.entity.ViewerCountManager(wrapperContained.stateManager); }
public boolean canPlayerUse(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canPlayerUse(player.wrapperContained); }
public void onOpen(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onOpen(player.wrapperContained); }
public void onClose(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onClose(player.wrapperContained); }
public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EnderChestBlockEntity blockEntity) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public void onScheduledTick() { wrapperContained.onScheduledTick(); }

}