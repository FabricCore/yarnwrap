package yarnwrap.block.entity;
public class BarrelBlockEntity { public net.minecraft.block.entity.BarrelBlockEntity wrapperContained; public BarrelBlockEntity(net.minecraft.block.entity.BarrelBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.block.entity.BarrelBlockEntity.inventory); }
// public static void inventory(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.block.entity.BarrelBlockEntity.inventory = value.wrapperContained; }

// public yarnwrap.block.entity.ViewerCountManager stateManager() { return new yarnwrap.block.entity.ViewerCountManager(wrapperContained.stateManager); }
// public void stateManager(yarnwrap.block.entity.ViewerCountManager value) { wrapperContained.stateManager = value.wrapperContained; }
// public static yarnwrap.block.entity.ViewerCountManager stateManager() { return new yarnwrap.block.entity.ViewerCountManager(net.minecraft.block.entity.BarrelBlockEntity.stateManager); }
// public static void stateManager(yarnwrap.block.entity.ViewerCountManager value, ) { net.minecraft.block.entity.BarrelBlockEntity.stateManager = value.wrapperContained; }

public BarrelBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.BarrelBlockEntity(pos.wrapperContained,state.wrapperContained); }
// public void playSound(yarnwrap.block.BlockState state,yarnwrap.sound.SoundEvent soundEvent) { wrapperContained.playSound(state.wrapperContained,soundEvent.wrapperContained); }
// public static void playSound(yarnwrap.block.BlockState state,yarnwrap.sound.SoundEvent soundEvent, ) { net.minecraft.block.entity.BarrelBlockEntity.playSound(state.wrapperContained,soundEvent.wrapperContained); }
// public void setOpen(yarnwrap.block.BlockState state,boolean open) { wrapperContained.setOpen(state.wrapperContained,open); }
// public static void setOpen(yarnwrap.block.BlockState state,boolean open, ) { net.minecraft.block.entity.BarrelBlockEntity.setOpen(state.wrapperContained,open); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.block.entity.BarrelBlockEntity.tick(); }

}