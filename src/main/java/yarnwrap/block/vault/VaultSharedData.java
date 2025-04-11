package yarnwrap.block.vault;
public class VaultSharedData { public net.minecraft.block.vault.VaultSharedData wrapperContained; public VaultSharedData(net.minecraft.block.vault.VaultSharedData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String SHARED_DATA_KEY() { return wrapperContained.SHARED_DATA_KEY; }
// public void SHARED_DATA_KEY(java.lang.String value) { wrapperContained.SHARED_DATA_KEY = value; }
// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.Codec value) { wrapperContained.codec = value; }
// public boolean dirty() { return wrapperContained.dirty; }
// public void dirty(boolean value) { wrapperContained.dirty = value; }
// public yarnwrap.item.ItemStack displayItem() { return new yarnwrap.item.ItemStack(wrapperContained.displayItem); }
// public void displayItem(yarnwrap.item.ItemStack value) { wrapperContained.displayItem = value.wrapperContained; }
// public java.util.Set connectedPlayers() { return wrapperContained.connectedPlayers; }
// public void connectedPlayers(java.util.Set value) { wrapperContained.connectedPlayers = value; }
// public double connectedParticlesRange() { return wrapperContained.connectedParticlesRange; }
// public void connectedParticlesRange(double value) { wrapperContained.connectedParticlesRange = value; }
// public VaultSharedData(yarnwrap.item.ItemStack displayItem,java.util.Set connectedPlayers,double connectedParticlesRange) { this.wrapperContained = new net.minecraft.block.vault.VaultSharedData(displayItem.wrapperContained,connectedPlayers,connectedParticlesRange); }
public yarnwrap.item.ItemStack getDisplayItem() { return new yarnwrap.item.ItemStack(wrapperContained.getDisplayItem()); }
// public void updateConnectedPlayers(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.vault.VaultServerData serverData,yarnwrap.block.vault.VaultConfig config,double radius) { wrapperContained.updateConnectedPlayers(world.wrapperContained,pos.wrapperContained,serverData.wrapperContained,config.wrapperContained,radius); }
// public com.mojang.datafixers.kinds.App method_56789(Object instance) { return wrapperContained.method_56789(instance); }
public void setDisplayItem(yarnwrap.item.ItemStack stack) { wrapperContained.setDisplayItem(stack.wrapperContained); }
// public boolean method_56791(yarnwrap.block.vault.VaultServerData uuid) { return wrapperContained.method_56791(uuid.wrapperContained); }
// public void copyFrom(yarnwrap.block.vault.VaultSharedData data) { wrapperContained.copyFrom(data.wrapperContained); }
public boolean hasDisplayItem() { return wrapperContained.hasDisplayItem(); }
// public java.lang.Double method_56794(yarnwrap.block.vault.VaultSharedData data) { return wrapperContained.method_56794(data.wrapperContained); }
// public boolean hasConnectedPlayers() { return wrapperContained.hasConnectedPlayers(); }
// public java.util.Set method_56796(yarnwrap.block.vault.VaultSharedData data) { return wrapperContained.method_56796(data.wrapperContained); }
// public java.util.Set getConnectedPlayers() { return wrapperContained.getConnectedPlayers(); }
// public yarnwrap.item.ItemStack method_56798(yarnwrap.block.vault.VaultSharedData data) { return new yarnwrap.item.ItemStack(wrapperContained.method_56798(data.wrapperContained)); }
// public double getConnectedParticlesRange() { return wrapperContained.getConnectedParticlesRange(); }
// public void markDirty() { wrapperContained.markDirty(); }

}