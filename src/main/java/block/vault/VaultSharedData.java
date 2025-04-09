package yarnwrap.block.vault;
public class VaultSharedData { public net.minecraft.block.vault.VaultSharedData wrapperContained; public VaultSharedData(net.minecraft.block.vault.VaultSharedData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String SHARED_DATA_KEY() { return wrapperContained.SHARED_DATA_KEY; }
// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public boolean dirty() { return wrapperContained.dirty; }
// public yarnwrap.item.ItemStack displayItem() { return new yarnwrap.item.ItemStack(wrapperContained.displayItem); }
// public java.util.Set connectedPlayers() { return wrapperContained.connectedPlayers; }
// public double connectedParticlesRange() { return wrapperContained.connectedParticlesRange; }
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