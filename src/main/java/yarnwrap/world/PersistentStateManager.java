package yarnwrap.world;
public class PersistentStateManager { public net.minecraft.world.PersistentStateManager wrapperContained; public PersistentStateManager(net.minecraft.world.PersistentStateManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map loadedStates() { return wrapperContained.loadedStates; }
// public void loadedStates(java.util.Map value) { wrapperContained.loadedStates = value; }
// public static java.util.Map loadedStates() { return net.minecraft.world.PersistentStateManager.loadedStates; }
// public static void loadedStates(java.util.Map value, ) { net.minecraft.world.PersistentStateManager.loadedStates = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.PersistentStateManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.PersistentStateManager.LOGGER = value; }

// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public static com.mojang.datafixers.DataFixer dataFixer() { return net.minecraft.world.PersistentStateManager.dataFixer; }
// public static void dataFixer(com.mojang.datafixers.DataFixer value, ) { net.minecraft.world.PersistentStateManager.dataFixer = value; }

// public java.io.File directory() { return wrapperContained.directory; }
// public void directory(java.io.File value) { wrapperContained.directory = value; }
// public static java.io.File directory() { return net.minecraft.world.PersistentStateManager.directory; }
// public static void directory(java.io.File value, ) { net.minecraft.world.PersistentStateManager.directory = value; }

// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
// // public static Object registryLookup() { return net.minecraft.world.PersistentStateManager.registryLookup; }
// // public static void registryLookup(Object value, ) { net.minecraft.world.PersistentStateManager.registryLookup = value; }

// public PersistentStateManager(java.io.File directory,com.mojang.datafixers.DataFixer dataFixer,Object registryLookup) { this.wrapperContained = new net.minecraft.world.PersistentStateManager(directory,dataFixer,registryLookup); }
// public yarnwrap.world.PersistentState readFromFile(java.util.function.BiFunction readFunction,yarnwrap.datafixer.DataFixTypes dataFixTypes,java.lang.String id) { return new yarnwrap.world.PersistentState(wrapperContained.readFromFile(readFunction,dataFixTypes.wrapperContained,id)); }
// public static yarnwrap.world.PersistentState readFromFile(java.util.function.BiFunction readFunction,yarnwrap.datafixer.DataFixTypes dataFixTypes,java.lang.String id, ) { return new yarnwrap.world.PersistentState(net.minecraft.world.PersistentStateManager.readFromFile(readFunction,dataFixTypes.wrapperContained,id)); }
public void set(java.lang.String id,yarnwrap.world.PersistentState state) { wrapperContained.set(id,state.wrapperContained); }
// public static void set(java.lang.String id,yarnwrap.world.PersistentState state, ) { net.minecraft.world.PersistentStateManager.set(id,state.wrapperContained); }
public void save() { wrapperContained.save(); }
// public static void save() { net.minecraft.world.PersistentStateManager.save(); }
// public boolean isCompressed(java.io.PushbackInputStream stream) { return wrapperContained.isCompressed(stream); }
// public static boolean isCompressed(java.io.PushbackInputStream stream, ) { return net.minecraft.world.PersistentStateManager.isCompressed(stream); }
// public java.io.File getFile(java.lang.String id) { return wrapperContained.getFile(id); }
// public static java.io.File getFile(java.lang.String id, ) { return net.minecraft.world.PersistentStateManager.getFile(id); }
// public yarnwrap.nbt.NbtCompound readNbt(java.lang.String id,yarnwrap.datafixer.DataFixTypes dataFixTypes,int currentSaveVersion) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readNbt(id,dataFixTypes.wrapperContained,currentSaveVersion)); }
// public static yarnwrap.nbt.NbtCompound readNbt(java.lang.String id,yarnwrap.datafixer.DataFixTypes dataFixTypes,int currentSaveVersion, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.PersistentStateManager.readNbt(id,dataFixTypes.wrapperContained,currentSaveVersion)); }
// public yarnwrap.world.PersistentState getOrCreate(Object type,java.lang.String id) { return new yarnwrap.world.PersistentState(wrapperContained.getOrCreate(type,id)); }
// public static yarnwrap.world.PersistentState getOrCreate(Object type,java.lang.String id, ) { return new yarnwrap.world.PersistentState(net.minecraft.world.PersistentStateManager.getOrCreate(type,id)); }
// public yarnwrap.world.PersistentState get(Object type,java.lang.String id) { return new yarnwrap.world.PersistentState(wrapperContained.get(type,id)); }
// public static yarnwrap.world.PersistentState get(Object type,java.lang.String id, ) { return new yarnwrap.world.PersistentState(net.minecraft.world.PersistentStateManager.get(type,id)); }
// public void method_32384(java.lang.String id,yarnwrap.world.PersistentState state) { wrapperContained.method_32384(id,state.wrapperContained); }
// public static void method_32384(java.lang.String id,yarnwrap.world.PersistentState state, ) { net.minecraft.world.PersistentStateManager.method_32384(id,state.wrapperContained); }

}