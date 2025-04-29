package yarnwrap.block.entity;
public class ViewerCountManager { public net.minecraft.block.entity.ViewerCountManager wrapperContained; public ViewerCountManager(net.minecraft.block.entity.ViewerCountManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int viewerCount() { return wrapperContained.viewerCount; }
// public void viewerCount(int value) { wrapperContained.viewerCount = value; }
// public static int viewerCount() { return net.minecraft.block.entity.ViewerCountManager.viewerCount; }
// public static void viewerCount(int value, ) { net.minecraft.block.entity.ViewerCountManager.viewerCount = value; }

// public int SCHEDULE_TICK_DELAY() { return wrapperContained.SCHEDULE_TICK_DELAY; }
// public void SCHEDULE_TICK_DELAY(int value) { wrapperContained.SCHEDULE_TICK_DELAY = value; }
// public static int SCHEDULE_TICK_DELAY() { return net.minecraft.block.entity.ViewerCountManager.SCHEDULE_TICK_DELAY; }
// public static void SCHEDULE_TICK_DELAY(int value, ) { net.minecraft.block.entity.ViewerCountManager.SCHEDULE_TICK_DELAY = value; }

// public double maxBlockInteractionRange() { return wrapperContained.maxBlockInteractionRange; }
// public void maxBlockInteractionRange(double value) { wrapperContained.maxBlockInteractionRange = value; }
// public static double maxBlockInteractionRange() { return net.minecraft.block.entity.ViewerCountManager.maxBlockInteractionRange; }
// public static void maxBlockInteractionRange(double value, ) { net.minecraft.block.entity.ViewerCountManager.maxBlockInteractionRange = value; }

public int getViewerCount() { return wrapperContained.getViewerCount(); }
// public static int getViewerCount() { return net.minecraft.block.entity.ViewerCountManager.getViewerCount(); }
// public boolean isPlayerViewing(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.isPlayerViewing(player.wrapperContained); }
// public static boolean isPlayerViewing(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.block.entity.ViewerCountManager.isPlayerViewing(player.wrapperContained); }
// public void onContainerOpen(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.onContainerOpen(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void onContainerOpen(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.ViewerCountManager.onContainerOpen(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void onViewerCountUpdate(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int oldViewerCount,int newViewerCount) { wrapperContained.onViewerCountUpdate(world.wrapperContained,pos.wrapperContained,state.wrapperContained,oldViewerCount,newViewerCount); }
// public static void onViewerCountUpdate(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int oldViewerCount,int newViewerCount, ) { net.minecraft.block.entity.ViewerCountManager.onViewerCountUpdate(world.wrapperContained,pos.wrapperContained,state.wrapperContained,oldViewerCount,newViewerCount); }
// public void onContainerClose(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.onContainerClose(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void onContainerClose(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.ViewerCountManager.onContainerClose(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void openContainer(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.openContainer(player.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void openContainer(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.ViewerCountManager.openContainer(player.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void closeContainer(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.closeContainer(player.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void closeContainer(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.ViewerCountManager.closeContainer(player.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void updateViewerCount(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateViewerCount(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void updateViewerCount(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.ViewerCountManager.updateViewerCount(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void scheduleBlockTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.scheduleBlockTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void scheduleBlockTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.ViewerCountManager.scheduleBlockTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public java.util.List getViewingPlayers(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getViewingPlayers(world.wrapperContained,pos.wrapperContained); }
// public static java.util.List getViewingPlayers(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.entity.ViewerCountManager.getViewingPlayers(world.wrapperContained,pos.wrapperContained); }

}