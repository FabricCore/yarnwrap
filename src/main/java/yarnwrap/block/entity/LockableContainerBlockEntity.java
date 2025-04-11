package yarnwrap.block.entity;
public class LockableContainerBlockEntity { public net.minecraft.block.entity.LockableContainerBlockEntity wrapperContained; public LockableContainerBlockEntity(net.minecraft.block.entity.LockableContainerBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.ContainerLock lock() { return new yarnwrap.inventory.ContainerLock(wrapperContained.lock); }
// public void lock(yarnwrap.inventory.ContainerLock value) { wrapperContained.lock = value.wrapperContained; }
// public yarnwrap.text.Text customName() { return new yarnwrap.text.Text(wrapperContained.customName); }
// public void customName(yarnwrap.text.Text value) { wrapperContained.customName = value.wrapperContained; }
// public void setHeldStacks(yarnwrap.util.collection.DefaultedList inventory) { wrapperContained.setHeldStacks(inventory.wrapperContained); }
// public yarnwrap.util.collection.DefaultedList getHeldStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getHeldStacks()); }
public boolean checkUnlocked(yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.ContainerLock lock,yarnwrap.text.Text containerName) { return wrapperContained.checkUnlocked(player.wrapperContained,lock.wrapperContained,containerName.wrapperContained); }
public boolean checkUnlocked(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.checkUnlocked(player.wrapperContained); }
// public yarnwrap.text.Text getContainerName() { return new yarnwrap.text.Text(wrapperContained.getContainerName()); }
// public yarnwrap.screen.ScreenHandler createScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { return new yarnwrap.screen.ScreenHandler(wrapperContained.createScreenHandler(syncId,playerInventory.wrapperContained)); }

}