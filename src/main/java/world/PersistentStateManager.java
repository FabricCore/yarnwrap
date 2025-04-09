package yarnwrap.world;
public class PersistentStateManager { public net.minecraft.world.PersistentStateManager wrapperContained; public PersistentStateManager(net.minecraft.world.PersistentStateManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map loadedStates() { return wrapperContained.loadedStates; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public java.io.File directory() { return wrapperContained.directory; }
// public Object registryLookup() { return wrapperContained.registryLookup; }
// public yarnwrap.world.PersistentState readFromFile(java.util.function.BiFunction readFunction,yarnwrap.datafixer.DataFixTypes dataFixTypes,java.lang.String id) { return new yarnwrap.world.PersistentState(wrapperContained.readFromFile(readFunction,dataFixTypes.wrapperContained,id)); }
public void set(java.lang.String id,yarnwrap.world.PersistentState state) { wrapperContained.set(id,state.wrapperContained); }
public void save() { wrapperContained.save(); }
// public boolean isCompressed(java.io.PushbackInputStream stream) { return wrapperContained.isCompressed(stream); }
// public java.io.File getFile(java.lang.String id) { return wrapperContained.getFile(id); }
// public yarnwrap.nbt.NbtCompound readNbt(java.lang.String id,yarnwrap.datafixer.DataFixTypes dataFixTypes,int currentSaveVersion) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readNbt(id,dataFixTypes.wrapperContained,currentSaveVersion)); }
// public yarnwrap.world.PersistentState getOrCreate(Object type,java.lang.String id) { return new yarnwrap.world.PersistentState(wrapperContained.getOrCreate(type,id)); }
// public yarnwrap.world.PersistentState get(Object type,java.lang.String id) { return new yarnwrap.world.PersistentState(wrapperContained.get(type,id)); }

}