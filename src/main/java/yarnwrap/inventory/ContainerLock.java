package yarnwrap.inventory;
public class ContainerLock { public net.minecraft.inventory.ContainerLock wrapperContained; public ContainerLock(net.minecraft.inventory.ContainerLock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String key() { return wrapperContained.key; }
// public void key(java.lang.String value) { wrapperContained.key = value; }
public java.lang.String LOCK_KEY() { return wrapperContained.LOCK_KEY; }
// public void LOCK_KEY(java.lang.String value) { wrapperContained.LOCK_KEY = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.inventory.ContainerLock EMPTY() { return new yarnwrap.inventory.ContainerLock(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.inventory.ContainerLock value) { wrapperContained.EMPTY = value.wrapperContained; }
// public java.lang.String key() { return wrapperContained.key(); }
public boolean canOpen(yarnwrap.item.ItemStack stack) { return wrapperContained.canOpen(stack.wrapperContained); }
public yarnwrap.inventory.ContainerLock fromNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.inventory.ContainerLock(wrapperContained.fromNbt(nbt.wrapperContained)); }
public void writeNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeNbt(nbt.wrapperContained); }

}