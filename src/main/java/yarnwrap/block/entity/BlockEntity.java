package yarnwrap.block.entity;
public class BlockEntity { public net.minecraft.block.entity.BlockEntity wrapperContained; public BlockEntity(net.minecraft.block.entity.BlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.block.entity.BlockEntity.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.block.entity.BlockEntity.world = value.wrapperContained; }

// public yarnwrap.block.entity.BlockEntityType type() { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.type); }
// public void type(yarnwrap.block.entity.BlockEntityType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.block.entity.BlockEntityType type() { return new yarnwrap.block.entity.BlockEntityType(net.minecraft.block.entity.BlockEntity.type); }
// public static void type(yarnwrap.block.entity.BlockEntityType value, ) { net.minecraft.block.entity.BlockEntity.type = value.wrapperContained; }

// public boolean removed() { return wrapperContained.removed; }
// public void removed(boolean value) { wrapperContained.removed = value; }
// public static boolean removed() { return net.minecraft.block.entity.BlockEntity.removed; }
// public static void removed(boolean value, ) { net.minecraft.block.entity.BlockEntity.removed = value; }

// public yarnwrap.block.BlockState cachedState() { return new yarnwrap.block.BlockState(wrapperContained.cachedState); }
// public void cachedState(yarnwrap.block.BlockState value) { wrapperContained.cachedState = value.wrapperContained; }
// public static yarnwrap.block.BlockState cachedState() { return new yarnwrap.block.BlockState(net.minecraft.block.entity.BlockEntity.cachedState); }
// public static void cachedState(yarnwrap.block.BlockState value, ) { net.minecraft.block.entity.BlockEntity.cachedState = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.block.entity.BlockEntity.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.block.entity.BlockEntity.pos = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.entity.BlockEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.entity.BlockEntity.LOGGER = value; }

// public yarnwrap.component.ComponentMap components() { return new yarnwrap.component.ComponentMap(wrapperContained.components); }
// public void components(yarnwrap.component.ComponentMap value) { wrapperContained.components = value.wrapperContained; }
// public static yarnwrap.component.ComponentMap components() { return new yarnwrap.component.ComponentMap(net.minecraft.block.entity.BlockEntity.components); }
// public static void components(yarnwrap.component.ComponentMap value, ) { net.minecraft.block.entity.BlockEntity.components = value.wrapperContained; }

// public BlockEntity(yarnwrap.block.entity.BlockEntityType type,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.BlockEntity(type.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void cancelRemoval() { wrapperContained.cancelRemoval(); }
// public static void cancelRemoval() { net.minecraft.block.entity.BlockEntity.cancelRemoval(); }
public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
// public static yarnwrap.world.World getWorld() { return new yarnwrap.world.World(net.minecraft.block.entity.BlockEntity.getWorld()); }
// public void writeIdentifyingData(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeIdentifyingData(nbt.wrapperContained); }
// public static void writeIdentifyingData(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.block.entity.BlockEntity.writeIdentifyingData(nbt.wrapperContained); }
public boolean hasWorld() { return wrapperContained.hasWorld(); }
// public static boolean hasWorld() { return net.minecraft.block.entity.BlockEntity.hasWorld(); }
public void populateCrashReport(yarnwrap.util.crash.CrashReportSection crashReportSection) { wrapperContained.populateCrashReport(crashReportSection.wrapperContained); }
// public static void populateCrashReport(yarnwrap.util.crash.CrashReportSection crashReportSection, ) { net.minecraft.block.entity.BlockEntity.populateCrashReport(crashReportSection.wrapperContained); }
public boolean onSyncedBlockEvent(int type,int data) { return wrapperContained.onSyncedBlockEvent(type,data); }
// public static boolean onSyncedBlockEvent(int type,int data, ) { return net.minecraft.block.entity.BlockEntity.onSyncedBlockEvent(type,data); }
// public yarnwrap.block.entity.BlockEntity createFromNbt(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.createFromNbt(pos.wrapperContained,state.wrapperContained,nbt.wrapperContained,registryLookup)); }
// public static yarnwrap.block.entity.BlockEntity createFromNbt(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.nbt.NbtCompound nbt,Object registryLookup, ) { return new yarnwrap.block.entity.BlockEntity(net.minecraft.block.entity.BlockEntity.createFromNbt(pos.wrapperContained,state.wrapperContained,nbt.wrapperContained,registryLookup)); }
// public void writeNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { wrapperContained.writeNbt(nbt.wrapperContained,registryLookup); }
// public static void writeNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup, ) { net.minecraft.block.entity.BlockEntity.writeNbt(nbt.wrapperContained,registryLookup); }
public yarnwrap.block.BlockState getCachedState() { return new yarnwrap.block.BlockState(wrapperContained.getCachedState()); }
// public static yarnwrap.block.BlockState getCachedState() { return new yarnwrap.block.BlockState(net.minecraft.block.entity.BlockEntity.getCachedState()); }
public boolean copyItemDataRequiresOperator() { return wrapperContained.copyItemDataRequiresOperator(); }
// public static boolean copyItemDataRequiresOperator() { return net.minecraft.block.entity.BlockEntity.copyItemDataRequiresOperator(); }
public void markRemoved() { wrapperContained.markRemoved(); }
// public static void markRemoved() { net.minecraft.block.entity.BlockEntity.markRemoved(); }
// public void readNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { wrapperContained.readNbt(nbt.wrapperContained,registryLookup); }
// public static void readNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup, ) { net.minecraft.block.entity.BlockEntity.readNbt(nbt.wrapperContained,registryLookup); }
public boolean isRemoved() { return wrapperContained.isRemoved(); }
// public static boolean isRemoved() { return net.minecraft.block.entity.BlockEntity.isRemoved(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.block.entity.BlockEntity.getPos()); }
public yarnwrap.block.entity.BlockEntityType getType() { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.getType()); }
// public static yarnwrap.block.entity.BlockEntityType getType() { return new yarnwrap.block.entity.BlockEntityType(net.minecraft.block.entity.BlockEntity.getType()); }
// public yarnwrap.nbt.NbtCompound toInitialChunkDataNbt(Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toInitialChunkDataNbt(registryLookup)); }
// public static yarnwrap.nbt.NbtCompound toInitialChunkDataNbt(Object registryLookup, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.block.entity.BlockEntity.toInitialChunkDataNbt(registryLookup)); }
// public yarnwrap.block.entity.BlockEntity method_17897(yarnwrap.nbt.NbtCompound blockEntity) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.method_17897(blockEntity.wrapperContained)); }
// public static yarnwrap.block.entity.BlockEntity method_17897(yarnwrap.nbt.NbtCompound blockEntity, ) { return new yarnwrap.block.entity.BlockEntity(net.minecraft.block.entity.BlockEntity.method_17897(blockEntity.wrapperContained)); }
// public yarnwrap.block.entity.BlockEntity method_17899(yarnwrap.util.math.BlockPos type) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.method_17899(type.wrapperContained)); }
// public static yarnwrap.block.entity.BlockEntity method_17899(yarnwrap.util.math.BlockPos type, ) { return new yarnwrap.block.entity.BlockEntity(net.minecraft.block.entity.BlockEntity.method_17899(type.wrapperContained)); }
public void setWorld(yarnwrap.world.World world) { wrapperContained.setWorld(world.wrapperContained); }
// public static void setWorld(yarnwrap.world.World world, ) { net.minecraft.block.entity.BlockEntity.setWorld(world.wrapperContained); }
// public void markDirty(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.markDirty(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void markDirty(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.BlockEntity.markDirty(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void setCachedState(yarnwrap.block.BlockState state) { wrapperContained.setCachedState(state.wrapperContained); }
// public static void setCachedState(yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.BlockEntity.setCachedState(state.wrapperContained); }
public yarnwrap.network.packet.Packet toUpdatePacket() { return new yarnwrap.network.packet.Packet(wrapperContained.toUpdatePacket()); }
// public static yarnwrap.network.packet.Packet toUpdatePacket() { return new yarnwrap.network.packet.Packet(net.minecraft.block.entity.BlockEntity.toUpdatePacket()); }
// public void writeIdToNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.block.entity.BlockEntityType type) { wrapperContained.writeIdToNbt(nbt.wrapperContained,type.wrapperContained); }
// public static void writeIdToNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.block.entity.BlockEntityType type, ) { net.minecraft.block.entity.BlockEntity.writeIdToNbt(nbt.wrapperContained,type.wrapperContained); }
// public yarnwrap.util.math.BlockPos posFromNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.util.math.BlockPos(wrapperContained.posFromNbt(nbt.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos posFromNbt(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.block.entity.BlockEntity.posFromNbt(nbt.wrapperContained)); }
// public void setStackNbt(yarnwrap.item.ItemStack stack,Object registries) { wrapperContained.setStackNbt(stack.wrapperContained,registries); }
// public static void setStackNbt(yarnwrap.item.ItemStack stack,Object registries, ) { net.minecraft.block.entity.BlockEntity.setStackNbt(stack.wrapperContained,registries); }
// public void writeIdToNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeIdToNbt(nbt.wrapperContained); }
// public static void writeIdToNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.block.entity.BlockEntity.writeIdToNbt(nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound createNbtWithIdentifyingData(Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.createNbtWithIdentifyingData(registryLookup)); }
// public static yarnwrap.nbt.NbtCompound createNbtWithIdentifyingData(Object registryLookup, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.block.entity.BlockEntity.createNbtWithIdentifyingData(registryLookup)); }
// public yarnwrap.nbt.NbtCompound createNbtWithId(Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.createNbtWithId(registryLookup)); }
// public static yarnwrap.nbt.NbtCompound createNbtWithId(Object registryLookup, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.block.entity.BlockEntity.createNbtWithId(registryLookup)); }
// public yarnwrap.nbt.NbtCompound createNbt(Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.createNbt(registryLookup)); }
// public static yarnwrap.nbt.NbtCompound createNbt(Object registryLookup, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.block.entity.BlockEntity.createNbt(registryLookup)); }
public void markDirty() { wrapperContained.markDirty(); }
// public static void markDirty() { net.minecraft.block.entity.BlockEntity.markDirty(); }
// public void addComponents(Object componentMapBuilder) { wrapperContained.addComponents(componentMapBuilder); }
// public static void addComponents(Object componentMapBuilder, ) { net.minecraft.block.entity.BlockEntity.addComponents(componentMapBuilder); }
// public void readComponents(Object components) { wrapperContained.readComponents(components); }
// public static void readComponents(Object components, ) { net.minecraft.block.entity.BlockEntity.readComponents(components); }
public void removeFromCopiedStackNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.removeFromCopiedStackNbt(nbt.wrapperContained); }
// public static void removeFromCopiedStackNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.block.entity.BlockEntity.removeFromCopiedStackNbt(nbt.wrapperContained); }
public yarnwrap.component.ComponentMap createComponentMap() { return new yarnwrap.component.ComponentMap(wrapperContained.createComponentMap()); }
// public static yarnwrap.component.ComponentMap createComponentMap() { return new yarnwrap.component.ComponentMap(net.minecraft.block.entity.BlockEntity.createComponentMap()); }
public void readComponents(yarnwrap.item.ItemStack stack) { wrapperContained.readComponents(stack.wrapperContained); }
// public static void readComponents(yarnwrap.item.ItemStack stack, ) { net.minecraft.block.entity.BlockEntity.readComponents(stack.wrapperContained); }
public void setComponents(yarnwrap.component.ComponentMap components) { wrapperContained.setComponents(components.wrapperContained); }
// public static void setComponents(yarnwrap.component.ComponentMap components, ) { net.minecraft.block.entity.BlockEntity.setComponents(components.wrapperContained); }
public void readComponents(yarnwrap.component.ComponentMap defaultComponents,yarnwrap.component.ComponentChanges components) { wrapperContained.readComponents(defaultComponents.wrapperContained,components.wrapperContained); }
// public static void readComponents(yarnwrap.component.ComponentMap defaultComponents,yarnwrap.component.ComponentChanges components, ) { net.minecraft.block.entity.BlockEntity.readComponents(defaultComponents.wrapperContained,components.wrapperContained); }
// public void method_58686(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.method_58686(nbt.wrapperContained); }
// public static void method_58686(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.block.entity.BlockEntity.method_58686(nbt.wrapperContained); }
// public void method_58687(java.lang.String snbt) { wrapperContained.method_58687(snbt); }
// public static void method_58687(java.lang.String snbt, ) { net.minecraft.block.entity.BlockEntity.method_58687(snbt); }
// public void method_58688(yarnwrap.component.ComponentMap components) { wrapperContained.method_58688(components.wrapperContained); }
// public static void method_58688(yarnwrap.component.ComponentMap components, ) { net.minecraft.block.entity.BlockEntity.method_58688(components.wrapperContained); }
// public void method_58689(java.lang.String error) { wrapperContained.method_58689(error); }
// public static void method_58689(java.lang.String error, ) { net.minecraft.block.entity.BlockEntity.method_58689(error); }
// public void read(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { wrapperContained.read(nbt.wrapperContained,registryLookup); }
// public static void read(yarnwrap.nbt.NbtCompound nbt,Object registryLookup, ) { net.minecraft.block.entity.BlockEntity.read(nbt.wrapperContained,registryLookup); }
// public void readComponentlessNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { wrapperContained.readComponentlessNbt(nbt.wrapperContained,registryLookup); }
// public static void readComponentlessNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup, ) { net.minecraft.block.entity.BlockEntity.readComponentlessNbt(nbt.wrapperContained,registryLookup); }
// public yarnwrap.nbt.NbtCompound createComponentlessNbt(Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.createComponentlessNbt(registryLookup)); }
// public static yarnwrap.nbt.NbtCompound createComponentlessNbt(Object registryLookup, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.block.entity.BlockEntity.createComponentlessNbt(registryLookup)); }
public yarnwrap.component.ComponentMap getComponents() { return new yarnwrap.component.ComponentMap(wrapperContained.getComponents()); }
// public static yarnwrap.component.ComponentMap getComponents() { return new yarnwrap.component.ComponentMap(net.minecraft.block.entity.BlockEntity.getComponents()); }
// public yarnwrap.nbt.NbtCompound createComponentlessNbtWithIdentifyingData(Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.createComponentlessNbtWithIdentifyingData(registryLookup)); }
// public static yarnwrap.nbt.NbtCompound createComponentlessNbtWithIdentifyingData(Object registryLookup, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.block.entity.BlockEntity.createComponentlessNbtWithIdentifyingData(registryLookup)); }
// public yarnwrap.text.Text tryParseCustomName(java.lang.String json,Object registryLookup) { return new yarnwrap.text.Text(wrapperContained.tryParseCustomName(json,registryLookup)); }
// public static yarnwrap.text.Text tryParseCustomName(java.lang.String json,Object registryLookup, ) { return new yarnwrap.text.Text(net.minecraft.block.entity.BlockEntity.tryParseCustomName(json,registryLookup)); }
// public void validateSupports(yarnwrap.block.BlockState state) { wrapperContained.validateSupports(state.wrapperContained); }
// public static void validateSupports(yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.BlockEntity.validateSupports(state.wrapperContained); }
public boolean supports(yarnwrap.block.BlockState state) { return wrapperContained.supports(state.wrapperContained); }
// public static boolean supports(yarnwrap.block.BlockState state, ) { return net.minecraft.block.entity.BlockEntity.supports(state.wrapperContained); }
// public java.lang.String getNameForReport() { return wrapperContained.getNameForReport(); }
// public static java.lang.String getNameForReport() { return net.minecraft.block.entity.BlockEntity.getNameForReport(); }

}