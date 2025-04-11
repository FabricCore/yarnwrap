package yarnwrap.block.entity;
public class ChestBlockEntity { public net.minecraft.block.entity.ChestBlockEntity wrapperContained; public ChestBlockEntity(net.minecraft.block.entity.ChestBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
// public yarnwrap.block.entity.ViewerCountManager stateManager() { return new yarnwrap.block.entity.ViewerCountManager(wrapperContained.stateManager); }
// public void stateManager(yarnwrap.block.entity.ViewerCountManager value) { wrapperContained.stateManager = value.wrapperContained; }
// public yarnwrap.block.entity.ChestLidAnimator lidAnimator() { return new yarnwrap.block.entity.ChestLidAnimator(wrapperContained.lidAnimator); }
// public void lidAnimator(yarnwrap.block.entity.ChestLidAnimator value) { wrapperContained.lidAnimator = value.wrapperContained; }
// public int VIEWER_COUNT_UPDATE_EVENT_TYPE() { return wrapperContained.VIEWER_COUNT_UPDATE_EVENT_TYPE; }
// public void VIEWER_COUNT_UPDATE_EVENT_TYPE(int value) { wrapperContained.VIEWER_COUNT_UPDATE_EVENT_TYPE = value; }
public ChestBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.ChestBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void copyInventory(yarnwrap.block.entity.ChestBlockEntity from,yarnwrap.block.entity.ChestBlockEntity to) { wrapperContained.copyInventory(from.wrapperContained,to.wrapperContained); }
public int getPlayersLookingInChestCount(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPlayersLookingInChestCount(world.wrapperContained,pos.wrapperContained); }
// public void onViewerCountUpdate(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int oldViewerCount,int newViewerCount) { wrapperContained.onViewerCountUpdate(world.wrapperContained,pos.wrapperContained,state.wrapperContained,oldViewerCount,newViewerCount); }
// public void playSound(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.sound.SoundEvent soundEvent) { wrapperContained.playSound(world.wrapperContained,pos.wrapperContained,state.wrapperContained,soundEvent.wrapperContained); }
public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.ChestBlockEntity blockEntity) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public void onScheduledTick() { wrapperContained.onScheduledTick(); }

}