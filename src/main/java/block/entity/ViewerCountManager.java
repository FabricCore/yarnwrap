package yarnwrap.block.entity;
public class ViewerCountManager { public net.minecraft.block.entity.ViewerCountManager wrapperContained; public ViewerCountManager(net.minecraft.block.entity.ViewerCountManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int viewerCount() { return wrapperContained.viewerCount; }
// public int SCHEDULE_TICK_DELAY() { return wrapperContained.SCHEDULE_TICK_DELAY; }
// public double maxBlockInteractionRange() { return wrapperContained.maxBlockInteractionRange; }
public int getViewerCount() { return wrapperContained.getViewerCount(); }
// public boolean isPlayerViewing(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.isPlayerViewing(player.wrapperContained); }
// public void onContainerOpen(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.onContainerOpen(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void onViewerCountUpdate(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int oldViewerCount,int newViewerCount) { wrapperContained.onViewerCountUpdate(world.wrapperContained,pos.wrapperContained,state.wrapperContained,oldViewerCount,newViewerCount); }
// public void onContainerClose(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.onContainerClose(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void openContainer(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.openContainer(player.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void closeContainer(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.closeContainer(player.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void updateViewerCount(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateViewerCount(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void scheduleBlockTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.scheduleBlockTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public java.util.List getViewingPlayers(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getViewingPlayers(world.wrapperContained,pos.wrapperContained); }

}