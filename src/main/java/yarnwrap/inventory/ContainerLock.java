package yarnwrap.inventory;
public class ContainerLock { public net.minecraft.inventory.ContainerLock wrapperContained; public ContainerLock(net.minecraft.inventory.ContainerLock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.ContainerLock EMPTY() { return new yarnwrap.inventory.ContainerLock(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.inventory.ContainerLock value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.inventory.ContainerLock EMPTY() { return new yarnwrap.inventory.ContainerLock(net.minecraft.inventory.ContainerLock.EMPTY); }
// public static void EMPTY(yarnwrap.inventory.ContainerLock value, ) { net.minecraft.inventory.ContainerLock.EMPTY = value.wrapperContained; }

// public java.lang.String LOCK_KEY() { return wrapperContained.LOCK_KEY; }
// public void LOCK_KEY(java.lang.String value) { wrapperContained.LOCK_KEY = value; }
public static java.lang.String LOCK_KEY() { return net.minecraft.inventory.ContainerLock.LOCK_KEY; }
// public static void LOCK_KEY(java.lang.String value, ) { net.minecraft.inventory.ContainerLock.LOCK_KEY = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.inventory.ContainerLock.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.inventory.ContainerLock.CODEC = value; }

public boolean canOpen(yarnwrap.item.ItemStack stack) { return wrapperContained.canOpen(stack.wrapperContained); }
// public static boolean canOpen(yarnwrap.item.ItemStack stack, ) { return net.minecraft.inventory.ContainerLock.canOpen(stack.wrapperContained); }
// public yarnwrap.inventory.ContainerLock read(yarnwrap.storage.ReadView view) { return new yarnwrap.inventory.ContainerLock(wrapperContained.read(view.wrapperContained)); }
// public static yarnwrap.inventory.ContainerLock read(yarnwrap.storage.ReadView view, ) { return new yarnwrap.inventory.ContainerLock(net.minecraft.inventory.ContainerLock.read(view.wrapperContained)); }
// public void write(yarnwrap.storage.WriteView view) { wrapperContained.write(view.wrapperContained); }
// public static void write(yarnwrap.storage.WriteView view, ) { net.minecraft.inventory.ContainerLock.write(view.wrapperContained); }

}