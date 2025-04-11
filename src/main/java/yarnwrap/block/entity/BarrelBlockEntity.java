package yarnwrap.block.entity;
public class BarrelBlockEntity { public net.minecraft.block.entity.BarrelBlockEntity wrapperContained; public BarrelBlockEntity(net.minecraft.block.entity.BarrelBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
// public yarnwrap.block.entity.ViewerCountManager stateManager() { return new yarnwrap.block.entity.ViewerCountManager(wrapperContained.stateManager); }
// public void stateManager(yarnwrap.block.entity.ViewerCountManager value) { wrapperContained.stateManager = value.wrapperContained; }
// public void playSound(yarnwrap.block.BlockState state,yarnwrap.sound.SoundEvent soundEvent) { wrapperContained.playSound(state.wrapperContained,soundEvent.wrapperContained); }
// public void setOpen(yarnwrap.block.BlockState state,boolean open) { wrapperContained.setOpen(state.wrapperContained,open); }
public void tick() { wrapperContained.tick(); }

}