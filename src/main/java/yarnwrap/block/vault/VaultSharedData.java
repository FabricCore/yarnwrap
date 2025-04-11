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
public yarnwrap.item.ItemStack getDisplayItem() { return new yarnwrap.item.ItemStack(wrapperContained.getDisplayItem()); }
// public void updateConnectedPlayers(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.vault.VaultServerData serverData,yarnwrap.block.vault.VaultConfig config,double radius) { wrapperContained.updateConnectedPlayers(world.wrapperContained,pos.wrapperContained,serverData.wrapperContained,config.wrapperContained,radius); }
public void setDisplayItem(yarnwrap.item.ItemStack stack) { wrapperContained.setDisplayItem(stack.wrapperContained); }
// public void copyFrom(yarnwrap.block.vault.VaultSharedData data) { wrapperContained.copyFrom(data.wrapperContained); }
public boolean hasDisplayItem() { return wrapperContained.hasDisplayItem(); }
// public boolean hasConnectedPlayers() { return wrapperContained.hasConnectedPlayers(); }
// public java.util.Set getConnectedPlayers() { return wrapperContained.getConnectedPlayers(); }
// public double getConnectedParticlesRange() { return wrapperContained.getConnectedParticlesRange(); }
// public void markDirty() { wrapperContained.markDirty(); }

}