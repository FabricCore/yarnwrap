package yarnwrap.block.vault;
public class VaultSharedData { public net.minecraft.block.vault.VaultSharedData wrapperContained; public VaultSharedData(net.minecraft.block.vault.VaultSharedData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String SHARED_DATA_KEY() { return wrapperContained.SHARED_DATA_KEY; }
// public void SHARED_DATA_KEY(java.lang.String value) { wrapperContained.SHARED_DATA_KEY = value; }
// public static java.lang.String SHARED_DATA_KEY() { return net.minecraft.block.vault.VaultSharedData.SHARED_DATA_KEY; }
// public static void SHARED_DATA_KEY(java.lang.String value, ) { net.minecraft.block.vault.VaultSharedData.SHARED_DATA_KEY = value; }

// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.Codec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.Codec codec() { return net.minecraft.block.vault.VaultSharedData.codec; }
// public static void codec(com.mojang.serialization.Codec value, ) { net.minecraft.block.vault.VaultSharedData.codec = value; }

// public boolean dirty() { return wrapperContained.dirty; }
// public void dirty(boolean value) { wrapperContained.dirty = value; }
// public static boolean dirty() { return net.minecraft.block.vault.VaultSharedData.dirty; }
// public static void dirty(boolean value, ) { net.minecraft.block.vault.VaultSharedData.dirty = value; }

// public yarnwrap.item.ItemStack displayItem() { return new yarnwrap.item.ItemStack(wrapperContained.displayItem); }
// public void displayItem(yarnwrap.item.ItemStack value) { wrapperContained.displayItem = value.wrapperContained; }
// public static yarnwrap.item.ItemStack displayItem() { return new yarnwrap.item.ItemStack(net.minecraft.block.vault.VaultSharedData.displayItem); }
// public static void displayItem(yarnwrap.item.ItemStack value, ) { net.minecraft.block.vault.VaultSharedData.displayItem = value.wrapperContained; }

// public java.util.Set connectedPlayers() { return wrapperContained.connectedPlayers; }
// public void connectedPlayers(java.util.Set value) { wrapperContained.connectedPlayers = value; }
// public static java.util.Set connectedPlayers() { return net.minecraft.block.vault.VaultSharedData.connectedPlayers; }
// public static void connectedPlayers(java.util.Set value, ) { net.minecraft.block.vault.VaultSharedData.connectedPlayers = value; }

// public double connectedParticlesRange() { return wrapperContained.connectedParticlesRange; }
// public void connectedParticlesRange(double value) { wrapperContained.connectedParticlesRange = value; }
// public static double connectedParticlesRange() { return net.minecraft.block.vault.VaultSharedData.connectedParticlesRange; }
// public static void connectedParticlesRange(double value, ) { net.minecraft.block.vault.VaultSharedData.connectedParticlesRange = value; }

// public VaultSharedData(yarnwrap.item.ItemStack displayItem,java.util.Set connectedPlayers,double connectedParticlesRange) { this.wrapperContained = new net.minecraft.block.vault.VaultSharedData(displayItem.wrapperContained,connectedPlayers,connectedParticlesRange); }
public yarnwrap.item.ItemStack getDisplayItem() { return new yarnwrap.item.ItemStack(wrapperContained.getDisplayItem()); }
// public static yarnwrap.item.ItemStack getDisplayItem() { return new yarnwrap.item.ItemStack(net.minecraft.block.vault.VaultSharedData.getDisplayItem()); }
// public void updateConnectedPlayers(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.vault.VaultServerData serverData,yarnwrap.block.vault.VaultConfig config,double radius) { wrapperContained.updateConnectedPlayers(world.wrapperContained,pos.wrapperContained,serverData.wrapperContained,config.wrapperContained,radius); }
// public static void updateConnectedPlayers(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.vault.VaultServerData serverData,yarnwrap.block.vault.VaultConfig config,double radius, ) { net.minecraft.block.vault.VaultSharedData.updateConnectedPlayers(world.wrapperContained,pos.wrapperContained,serverData.wrapperContained,config.wrapperContained,radius); }
// public com.mojang.datafixers.kinds.App method_56789(Object instance) { return wrapperContained.method_56789(instance); }
// public static com.mojang.datafixers.kinds.App method_56789(Object instance, ) { return net.minecraft.block.vault.VaultSharedData.method_56789(instance); }
public void setDisplayItem(yarnwrap.item.ItemStack stack) { wrapperContained.setDisplayItem(stack.wrapperContained); }
// public static void setDisplayItem(yarnwrap.item.ItemStack stack, ) { net.minecraft.block.vault.VaultSharedData.setDisplayItem(stack.wrapperContained); }
// public boolean method_56791(yarnwrap.block.vault.VaultServerData uuid) { return wrapperContained.method_56791(uuid.wrapperContained); }
// public static boolean method_56791(yarnwrap.block.vault.VaultServerData uuid, ) { return net.minecraft.block.vault.VaultSharedData.method_56791(uuid.wrapperContained); }
// public void copyFrom(yarnwrap.block.vault.VaultSharedData data) { wrapperContained.copyFrom(data.wrapperContained); }
// public static void copyFrom(yarnwrap.block.vault.VaultSharedData data, ) { net.minecraft.block.vault.VaultSharedData.copyFrom(data.wrapperContained); }
public boolean hasDisplayItem() { return wrapperContained.hasDisplayItem(); }
// public static boolean hasDisplayItem() { return net.minecraft.block.vault.VaultSharedData.hasDisplayItem(); }
// public java.lang.Double method_56794(yarnwrap.block.vault.VaultSharedData data) { return wrapperContained.method_56794(data.wrapperContained); }
// public static java.lang.Double method_56794(yarnwrap.block.vault.VaultSharedData data, ) { return net.minecraft.block.vault.VaultSharedData.method_56794(data.wrapperContained); }
// public boolean hasConnectedPlayers() { return wrapperContained.hasConnectedPlayers(); }
// public static boolean hasConnectedPlayers() { return net.minecraft.block.vault.VaultSharedData.hasConnectedPlayers(); }
// public java.util.Set method_56796(yarnwrap.block.vault.VaultSharedData data) { return wrapperContained.method_56796(data.wrapperContained); }
// public static java.util.Set method_56796(yarnwrap.block.vault.VaultSharedData data, ) { return net.minecraft.block.vault.VaultSharedData.method_56796(data.wrapperContained); }
// public java.util.Set getConnectedPlayers() { return wrapperContained.getConnectedPlayers(); }
// public static java.util.Set getConnectedPlayers() { return net.minecraft.block.vault.VaultSharedData.getConnectedPlayers(); }
// public yarnwrap.item.ItemStack method_56798(yarnwrap.block.vault.VaultSharedData data) { return new yarnwrap.item.ItemStack(wrapperContained.method_56798(data.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_56798(yarnwrap.block.vault.VaultSharedData data, ) { return new yarnwrap.item.ItemStack(net.minecraft.block.vault.VaultSharedData.method_56798(data.wrapperContained)); }
// public double getConnectedParticlesRange() { return wrapperContained.getConnectedParticlesRange(); }
// public static double getConnectedParticlesRange() { return net.minecraft.block.vault.VaultSharedData.getConnectedParticlesRange(); }
// public void markDirty() { wrapperContained.markDirty(); }
// public static void markDirty() { net.minecraft.block.vault.VaultSharedData.markDirty(); }

}