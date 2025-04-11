package yarnwrap.block.enums;
public class VaultState { public net.minecraft.block.enums.VaultState wrapperContained; public VaultState(net.minecraft.block.enums.VaultState wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public Object light() { return wrapperContained.light; }
// // public void light(Object value) { wrapperContained.light = value; }
// // public VaultState(java.lang.String id,int light) { this.wrapperContained = new net.minecraft.block.enums.VaultState(id,light); }
public int getLuminance() { return wrapperContained.getLuminance(); }
// public void ejectItem(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack,float pitchModifier) { wrapperContained.ejectItem(world.wrapperContained,pos.wrapperContained,stack.wrapperContained,pitchModifier); }
public yarnwrap.block.enums.VaultState update(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.vault.VaultConfig config,yarnwrap.block.vault.VaultServerData serverData,yarnwrap.block.vault.VaultSharedData sharedData) { return new yarnwrap.block.enums.VaultState(wrapperContained.update(world.wrapperContained,pos.wrapperContained,config.wrapperContained,serverData.wrapperContained,sharedData.wrapperContained)); }
// public yarnwrap.block.enums.VaultState updateActiveState(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.vault.VaultConfig config,yarnwrap.block.vault.VaultServerData serverData,yarnwrap.block.vault.VaultSharedData sharedData,double radius) { return new yarnwrap.block.enums.VaultState(wrapperContained.updateActiveState(world.wrapperContained,pos.wrapperContained,config.wrapperContained,serverData.wrapperContained,sharedData.wrapperContained,radius)); }
// public void onChangedTo(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.vault.VaultConfig config,yarnwrap.block.vault.VaultSharedData sharedData,boolean ominous) { wrapperContained.onChangedTo(world.wrapperContained,pos.wrapperContained,config.wrapperContained,sharedData.wrapperContained,ominous); }
public void onStateChange(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.enums.VaultState newState,yarnwrap.block.vault.VaultConfig config,yarnwrap.block.vault.VaultSharedData sharedData,boolean ominous) { wrapperContained.onStateChange(world.wrapperContained,pos.wrapperContained,newState.wrapperContained,config.wrapperContained,sharedData.wrapperContained,ominous); }
// public void onChangedFrom(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.vault.VaultConfig config,yarnwrap.block.vault.VaultSharedData sharedData) { wrapperContained.onChangedFrom(world.wrapperContained,pos.wrapperContained,config.wrapperContained,sharedData.wrapperContained); }

}