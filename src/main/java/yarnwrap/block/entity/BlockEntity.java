package yarnwrap.block.entity;
public class BlockEntity { public net.minecraft.block.entity.BlockEntity wrapperContained; public BlockEntity(net.minecraft.block.entity.BlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.block.entity.BlockEntityType type() { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.type); }
// public void type(yarnwrap.block.entity.BlockEntityType value) { wrapperContained.type = value.wrapperContained; }
// public boolean removed() { return wrapperContained.removed; }
// public void removed(boolean value) { wrapperContained.removed = value; }
// public yarnwrap.block.BlockState cachedState() { return new yarnwrap.block.BlockState(wrapperContained.cachedState); }
// public void cachedState(yarnwrap.block.BlockState value) { wrapperContained.cachedState = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.component.ComponentMap components() { return new yarnwrap.component.ComponentMap(wrapperContained.components); }
// public void components(yarnwrap.component.ComponentMap value) { wrapperContained.components = value.wrapperContained; }
public void cancelRemoval() { wrapperContained.cancelRemoval(); }
public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
// public void writeIdentifyingData(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeIdentifyingData(nbt.wrapperContained); }
public boolean hasWorld() { return wrapperContained.hasWorld(); }
public void populateCrashReport(yarnwrap.util.crash.CrashReportSection crashReportSection) { wrapperContained.populateCrashReport(crashReportSection.wrapperContained); }
public boolean onSyncedBlockEvent(int type,int data) { return wrapperContained.onSyncedBlockEvent(type,data); }
// public yarnwrap.block.entity.BlockEntity createFromNbt(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.createFromNbt(pos.wrapperContained,state.wrapperContained,nbt.wrapperContained,registryLookup)); }
// public void writeNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { wrapperContained.writeNbt(nbt.wrapperContained,registryLookup); }
public yarnwrap.block.BlockState getCachedState() { return new yarnwrap.block.BlockState(wrapperContained.getCachedState()); }
public boolean copyItemDataRequiresOperator() { return wrapperContained.copyItemDataRequiresOperator(); }
public void markRemoved() { wrapperContained.markRemoved(); }
// public void readNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { wrapperContained.readNbt(nbt.wrapperContained,registryLookup); }
public boolean isRemoved() { return wrapperContained.isRemoved(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public yarnwrap.block.entity.BlockEntityType getType() { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.getType()); }
// public yarnwrap.nbt.NbtCompound toInitialChunkDataNbt(Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toInitialChunkDataNbt(registryLookup)); }
public void setWorld(yarnwrap.world.World world) { wrapperContained.setWorld(world.wrapperContained); }
// public void markDirty(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.markDirty(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void setCachedState(yarnwrap.block.BlockState state) { wrapperContained.setCachedState(state.wrapperContained); }
public yarnwrap.network.packet.Packet toUpdatePacket() { return new yarnwrap.network.packet.Packet(wrapperContained.toUpdatePacket()); }
public void writeIdToNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.block.entity.BlockEntityType type) { wrapperContained.writeIdToNbt(nbt.wrapperContained,type.wrapperContained); }
public yarnwrap.util.math.BlockPos posFromNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.util.math.BlockPos(wrapperContained.posFromNbt(nbt.wrapperContained)); }
// public void setStackNbt(yarnwrap.item.ItemStack stack,Object registries) { wrapperContained.setStackNbt(stack.wrapperContained,registries); }
// public void writeIdToNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeIdToNbt(nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound createNbtWithIdentifyingData(Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.createNbtWithIdentifyingData(registryLookup)); }
// public yarnwrap.nbt.NbtCompound createNbtWithId(Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.createNbtWithId(registryLookup)); }
// public yarnwrap.nbt.NbtCompound createNbt(Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.createNbt(registryLookup)); }
public void markDirty() { wrapperContained.markDirty(); }
// public void addComponents(Object componentMapBuilder) { wrapperContained.addComponents(componentMapBuilder); }
// public void readComponents(Object components) { wrapperContained.readComponents(components); }
public void removeFromCopiedStackNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.removeFromCopiedStackNbt(nbt.wrapperContained); }
public yarnwrap.component.ComponentMap createComponentMap() { return new yarnwrap.component.ComponentMap(wrapperContained.createComponentMap()); }
public void readComponents(yarnwrap.item.ItemStack stack) { wrapperContained.readComponents(stack.wrapperContained); }
public void setComponents(yarnwrap.component.ComponentMap components) { wrapperContained.setComponents(components.wrapperContained); }
public void readComponents(yarnwrap.component.ComponentMap defaultComponents,yarnwrap.component.ComponentChanges components) { wrapperContained.readComponents(defaultComponents.wrapperContained,components.wrapperContained); }
// public void read(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { wrapperContained.read(nbt.wrapperContained,registryLookup); }
// public void readComponentlessNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { wrapperContained.readComponentlessNbt(nbt.wrapperContained,registryLookup); }
// public yarnwrap.nbt.NbtCompound createComponentlessNbt(Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.createComponentlessNbt(registryLookup)); }
public yarnwrap.component.ComponentMap getComponents() { return new yarnwrap.component.ComponentMap(wrapperContained.getComponents()); }
// public yarnwrap.nbt.NbtCompound createComponentlessNbtWithIdentifyingData(Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.createComponentlessNbtWithIdentifyingData(registryLookup)); }
// public yarnwrap.text.Text tryParseCustomName(java.lang.String json,Object registryLookup) { return new yarnwrap.text.Text(wrapperContained.tryParseCustomName(json,registryLookup)); }
// public void validateSupports(yarnwrap.block.BlockState state) { wrapperContained.validateSupports(state.wrapperContained); }
public boolean supports(yarnwrap.block.BlockState state) { return wrapperContained.supports(state.wrapperContained); }
// public java.lang.String getNameForReport() { return wrapperContained.getNameForReport(); }

}