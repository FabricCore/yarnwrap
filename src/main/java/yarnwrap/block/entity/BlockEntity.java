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

// public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
// public static com.mojang.serialization.Codec TYPE_CODEC() { return net.minecraft.block.entity.BlockEntity.TYPE_CODEC; }
// public static void TYPE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.entity.BlockEntity.TYPE_CODEC = value; }

// public BlockEntity(yarnwrap.block.entity.BlockEntityType type,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.BlockEntity(type.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void markDirty() { wrapperContained.markDirty(); }
// public static void markDirty() { net.minecraft.block.entity.BlockEntity.markDirty(); }
public void cancelRemoval() { wrapperContained.cancelRemoval(); }
// public static void cancelRemoval() { net.minecraft.block.entity.BlockEntity.cancelRemoval(); }
public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
// public static yarnwrap.world.World getWorld() { return new yarnwrap.world.World(net.minecraft.block.entity.BlockEntity.getWorld()); }
// public void writeIdentifyingData(yarnwrap.storage.WriteView view) { wrapperContained.writeIdentifyingData(view.wrapperContained); }
// public static void writeIdentifyingData(yarnwrap.storage.WriteView view, ) { net.minecraft.block.entity.BlockEntity.writeIdentifyingData(view.wrapperContained); }
public boolean hasWorld() { return wrapperContained.hasWorld(); }
// public static boolean hasWorld() { return net.minecraft.block.entity.BlockEntity.hasWorld(); }
public void populateCrashReport(yarnwrap.util.crash.CrashReportSection crashReportSection) { wrapperContained.populateCrashReport(crashReportSection.wrapperContained); }
// public static void populateCrashReport(yarnwrap.util.crash.CrashReportSection crashReportSection, ) { net.minecraft.block.entity.BlockEntity.populateCrashReport(crashReportSection.wrapperContained); }
public boolean onSyncedBlockEvent(int type,int data) { return wrapperContained.onSyncedBlockEvent(type,data); }
// public static boolean onSyncedBlockEvent(int type,int data, ) { return net.minecraft.block.entity.BlockEntity.onSyncedBlockEvent(type,data); }
// public yarnwrap.block.entity.BlockEntity createFromNbt(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.nbt.NbtCompound nbt,Object registries) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.createFromNbt(pos.wrapperContained,state.wrapperContained,nbt.wrapperContained,registries)); }
// public static yarnwrap.block.entity.BlockEntity createFromNbt(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.nbt.NbtCompound nbt,Object registries, ) { return new yarnwrap.block.entity.BlockEntity(net.minecraft.block.entity.BlockEntity.createFromNbt(pos.wrapperContained,state.wrapperContained,nbt.wrapperContained,registries)); }
// public void writeData(yarnwrap.storage.WriteView view) { wrapperContained.writeData(view.wrapperContained); }
// public static void writeData(yarnwrap.storage.WriteView view, ) { net.minecraft.block.entity.BlockEntity.writeData(view.wrapperContained); }
public yarnwrap.block.BlockState getCachedState() { return new yarnwrap.block.BlockState(wrapperContained.getCachedState()); }
// public static yarnwrap.block.BlockState getCachedState() { return new yarnwrap.block.BlockState(net.minecraft.block.entity.BlockEntity.getCachedState()); }
public void markRemoved() { wrapperContained.markRemoved(); }
// public static void markRemoved() { net.minecraft.block.entity.BlockEntity.markRemoved(); }
// public void readData(yarnwrap.storage.ReadView view) { wrapperContained.readData(view.wrapperContained); }
// public static void readData(yarnwrap.storage.ReadView view, ) { net.minecraft.block.entity.BlockEntity.readData(view.wrapperContained); }
public boolean isRemoved() { return wrapperContained.isRemoved(); }
// public static boolean isRemoved() { return net.minecraft.block.entity.BlockEntity.isRemoved(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.block.entity.BlockEntity.getPos()); }
public yarnwrap.block.entity.BlockEntityType getType() { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.getType()); }
// public static yarnwrap.block.entity.BlockEntityType getType() { return new yarnwrap.block.entity.BlockEntityType(net.minecraft.block.entity.BlockEntity.getType()); }
// public yarnwrap.nbt.NbtCompound toInitialChunkDataNbt(Object registries) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toInitialChunkDataNbt(registries)); }
// public static yarnwrap.nbt.NbtCompound toInitialChunkDataNbt(Object registries, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.block.entity.BlockEntity.toInitialChunkDataNbt(registries)); }
public void setWorld(yarnwrap.world.World world) { wrapperContained.setWorld(world.wrapperContained); }
// public static void setWorld(yarnwrap.world.World world, ) { net.minecraft.block.entity.BlockEntity.setWorld(world.wrapperContained); }
// public void markDirty(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.markDirty(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void markDirty(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.BlockEntity.markDirty(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void setCachedState(yarnwrap.block.BlockState state) { wrapperContained.setCachedState(state.wrapperContained); }
// public static void setCachedState(yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.BlockEntity.setCachedState(state.wrapperContained); }
public yarnwrap.network.packet.Packet toUpdatePacket() { return new yarnwrap.network.packet.Packet(wrapperContained.toUpdatePacket()); }
// public static yarnwrap.network.packet.Packet toUpdatePacket() { return new yarnwrap.network.packet.Packet(net.minecraft.block.entity.BlockEntity.toUpdatePacket()); }
// public void writeId(yarnwrap.storage.WriteView view,yarnwrap.block.entity.BlockEntityType type) { wrapperContained.writeId(view.wrapperContained,type.wrapperContained); }
// public static void writeId(yarnwrap.storage.WriteView view,yarnwrap.block.entity.BlockEntityType type, ) { net.minecraft.block.entity.BlockEntity.writeId(view.wrapperContained,type.wrapperContained); }
// public yarnwrap.util.math.BlockPos posFromNbt(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.util.math.BlockPos(wrapperContained.posFromNbt(chunkPos.wrapperContained,nbt.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos posFromNbt(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.block.entity.BlockEntity.posFromNbt(chunkPos.wrapperContained,nbt.wrapperContained)); }
// public void writeId(yarnwrap.storage.WriteView view) { wrapperContained.writeId(view.wrapperContained); }
// public static void writeId(yarnwrap.storage.WriteView view, ) { net.minecraft.block.entity.BlockEntity.writeId(view.wrapperContained); }
// public yarnwrap.nbt.NbtCompound createNbtWithIdentifyingData(Object registries) { return new yarnwrap.nbt.NbtCompound(wrapperContained.createNbtWithIdentifyingData(registries)); }
// public static yarnwrap.nbt.NbtCompound createNbtWithIdentifyingData(Object registries, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.block.entity.BlockEntity.createNbtWithIdentifyingData(registries)); }
// public void writeDataWithId(yarnwrap.storage.WriteView view) { wrapperContained.writeDataWithId(view.wrapperContained); }
// public static void writeDataWithId(yarnwrap.storage.WriteView view, ) { net.minecraft.block.entity.BlockEntity.writeDataWithId(view.wrapperContained); }
// public yarnwrap.nbt.NbtCompound createNbt(Object registries) { return new yarnwrap.nbt.NbtCompound(wrapperContained.createNbt(registries)); }
// public static yarnwrap.nbt.NbtCompound createNbt(Object registries, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.block.entity.BlockEntity.createNbt(registries)); }
// public void addComponents(Object builder) { wrapperContained.addComponents(builder); }
// public static void addComponents(Object builder, ) { net.minecraft.block.entity.BlockEntity.addComponents(builder); }
// public void readComponents(yarnwrap.component.ComponentsAccess components) { wrapperContained.readComponents(components.wrapperContained); }
// public static void readComponents(yarnwrap.component.ComponentsAccess components, ) { net.minecraft.block.entity.BlockEntity.readComponents(components.wrapperContained); }
// public void removeFromCopiedStackData(yarnwrap.storage.WriteView view) { wrapperContained.removeFromCopiedStackData(view.wrapperContained); }
// public static void removeFromCopiedStackData(yarnwrap.storage.WriteView view, ) { net.minecraft.block.entity.BlockEntity.removeFromCopiedStackData(view.wrapperContained); }
public yarnwrap.component.ComponentMap createComponentMap() { return new yarnwrap.component.ComponentMap(wrapperContained.createComponentMap()); }
// public static yarnwrap.component.ComponentMap createComponentMap() { return new yarnwrap.component.ComponentMap(net.minecraft.block.entity.BlockEntity.createComponentMap()); }
public void readComponents(yarnwrap.item.ItemStack stack) { wrapperContained.readComponents(stack.wrapperContained); }
// public static void readComponents(yarnwrap.item.ItemStack stack, ) { net.minecraft.block.entity.BlockEntity.readComponents(stack.wrapperContained); }
public void setComponents(yarnwrap.component.ComponentMap components) { wrapperContained.setComponents(components.wrapperContained); }
// public static void setComponents(yarnwrap.component.ComponentMap components, ) { net.minecraft.block.entity.BlockEntity.setComponents(components.wrapperContained); }
public void readComponents(yarnwrap.component.ComponentMap defaultComponents,yarnwrap.component.ComponentChanges components) { wrapperContained.readComponents(defaultComponents.wrapperContained,components.wrapperContained); }
// public static void readComponents(yarnwrap.component.ComponentMap defaultComponents,yarnwrap.component.ComponentChanges components, ) { net.minecraft.block.entity.BlockEntity.readComponents(defaultComponents.wrapperContained,components.wrapperContained); }
// public void read(yarnwrap.storage.ReadView view) { wrapperContained.read(view.wrapperContained); }
// public static void read(yarnwrap.storage.ReadView view, ) { net.minecraft.block.entity.BlockEntity.read(view.wrapperContained); }
// public void readComponentlessData(yarnwrap.storage.ReadView view) { wrapperContained.readComponentlessData(view.wrapperContained); }
// public static void readComponentlessData(yarnwrap.storage.ReadView view, ) { net.minecraft.block.entity.BlockEntity.readComponentlessData(view.wrapperContained); }
// public yarnwrap.nbt.NbtCompound createComponentlessNbt(Object registries) { return new yarnwrap.nbt.NbtCompound(wrapperContained.createComponentlessNbt(registries)); }
// public static yarnwrap.nbt.NbtCompound createComponentlessNbt(Object registries, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.block.entity.BlockEntity.createComponentlessNbt(registries)); }
public yarnwrap.component.ComponentMap getComponents() { return new yarnwrap.component.ComponentMap(wrapperContained.getComponents()); }
// public static yarnwrap.component.ComponentMap getComponents() { return new yarnwrap.component.ComponentMap(net.minecraft.block.entity.BlockEntity.getComponents()); }
// public yarnwrap.text.Text tryParseCustomName(yarnwrap.storage.ReadView view,java.lang.String key) { return new yarnwrap.text.Text(wrapperContained.tryParseCustomName(view.wrapperContained,key)); }
// public static yarnwrap.text.Text tryParseCustomName(yarnwrap.storage.ReadView view,java.lang.String key, ) { return new yarnwrap.text.Text(net.minecraft.block.entity.BlockEntity.tryParseCustomName(view.wrapperContained,key)); }
// public void validateSupports(yarnwrap.block.BlockState state) { wrapperContained.validateSupports(state.wrapperContained); }
// public static void validateSupports(yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.BlockEntity.validateSupports(state.wrapperContained); }
public boolean supports(yarnwrap.block.BlockState state) { return wrapperContained.supports(state.wrapperContained); }
// public static boolean supports(yarnwrap.block.BlockState state, ) { return net.minecraft.block.entity.BlockEntity.supports(state.wrapperContained); }
// public java.lang.String getNameForReport() { return wrapperContained.getNameForReport(); }
// public static java.lang.String getNameForReport() { return net.minecraft.block.entity.BlockEntity.getNameForReport(); }
public void onBlockReplaced(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState) { wrapperContained.onBlockReplaced(pos.wrapperContained,oldState.wrapperContained); }
// public static void onBlockReplaced(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState, ) { net.minecraft.block.entity.BlockEntity.onBlockReplaced(pos.wrapperContained,oldState.wrapperContained); }
// public void writeFullData(yarnwrap.storage.WriteView view) { wrapperContained.writeFullData(view.wrapperContained); }
// public static void writeFullData(yarnwrap.storage.WriteView view, ) { net.minecraft.block.entity.BlockEntity.writeFullData(view.wrapperContained); }
// public void writeDataWithoutId(yarnwrap.storage.WriteView data) { wrapperContained.writeDataWithoutId(data.wrapperContained); }
// public static void writeDataWithoutId(yarnwrap.storage.WriteView data, ) { net.minecraft.block.entity.BlockEntity.writeDataWithoutId(data.wrapperContained); }
// public void writeComponentlessData(yarnwrap.storage.WriteView view) { wrapperContained.writeComponentlessData(view.wrapperContained); }
// public static void writeComponentlessData(yarnwrap.storage.WriteView view, ) { net.minecraft.block.entity.BlockEntity.writeComponentlessData(view.wrapperContained); }
// public Object getReporterContext() { return wrapperContained.getReporterContext(); }
// public static Object getReporterContext() { return net.minecraft.block.entity.BlockEntity.getReporterContext(); }

}