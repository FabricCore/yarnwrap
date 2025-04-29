package yarnwrap.block.entity;
public class EnderChestBlockEntity { public net.minecraft.block.entity.EnderChestBlockEntity wrapperContained; public EnderChestBlockEntity(net.minecraft.block.entity.EnderChestBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.entity.ChestLidAnimator lidAnimator() { return new yarnwrap.block.entity.ChestLidAnimator(wrapperContained.lidAnimator); }
// public void lidAnimator(yarnwrap.block.entity.ChestLidAnimator value) { wrapperContained.lidAnimator = value.wrapperContained; }
// public static yarnwrap.block.entity.ChestLidAnimator lidAnimator() { return new yarnwrap.block.entity.ChestLidAnimator(net.minecraft.block.entity.EnderChestBlockEntity.lidAnimator); }
// public static void lidAnimator(yarnwrap.block.entity.ChestLidAnimator value, ) { net.minecraft.block.entity.EnderChestBlockEntity.lidAnimator = value.wrapperContained; }

// public yarnwrap.block.entity.ViewerCountManager stateManager() { return new yarnwrap.block.entity.ViewerCountManager(wrapperContained.stateManager); }
// public void stateManager(yarnwrap.block.entity.ViewerCountManager value) { wrapperContained.stateManager = value.wrapperContained; }
// public static yarnwrap.block.entity.ViewerCountManager stateManager() { return new yarnwrap.block.entity.ViewerCountManager(net.minecraft.block.entity.EnderChestBlockEntity.stateManager); }
// public static void stateManager(yarnwrap.block.entity.ViewerCountManager value, ) { net.minecraft.block.entity.EnderChestBlockEntity.stateManager = value.wrapperContained; }

public EnderChestBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.EnderChestBlockEntity(pos.wrapperContained,state.wrapperContained); }
public boolean canPlayerUse(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canPlayerUse(player.wrapperContained); }
// public static boolean canPlayerUse(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.block.entity.EnderChestBlockEntity.canPlayerUse(player.wrapperContained); }
public void onOpen(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onOpen(player.wrapperContained); }
// public static void onOpen(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.block.entity.EnderChestBlockEntity.onOpen(player.wrapperContained); }
public void onClose(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onClose(player.wrapperContained); }
// public static void onClose(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.block.entity.EnderChestBlockEntity.onClose(player.wrapperContained); }
// public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EnderChestBlockEntity blockEntity) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EnderChestBlockEntity blockEntity, ) { net.minecraft.block.entity.EnderChestBlockEntity.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public void onScheduledTick() { wrapperContained.onScheduledTick(); }
// public static void onScheduledTick() { net.minecraft.block.entity.EnderChestBlockEntity.onScheduledTick(); }

}