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

// public java.nio.file.Path directory() { return wrapperContained.directory; }
// public void directory(java.nio.file.Path value) { wrapperContained.directory = value; }
// public static java.nio.file.Path directory() { return net.minecraft.world.PersistentStateManager.directory; }
// public static void directory(java.nio.file.Path value, ) { net.minecraft.world.PersistentStateManager.directory = value; }

// public Object registries() { return wrapperContained.registries; }
// // public void registries(Object value) { wrapperContained.registries = value; }
// // public static Object registries() { return net.minecraft.world.PersistentStateManager.registries; }
// // public static void registries(Object value, ) { net.minecraft.world.PersistentStateManager.registries = value; }

// public java.util.concurrent.CompletableFuture savingFuture() { return wrapperContained.savingFuture; }
// public void savingFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.savingFuture = value; }
// public static java.util.concurrent.CompletableFuture savingFuture() { return net.minecraft.world.PersistentStateManager.savingFuture; }
// public static void savingFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.world.PersistentStateManager.savingFuture = value; }

// public Object context() { return wrapperContained.context; }
// // public void context(Object value) { wrapperContained.context = value; }
// // public static Object context() { return net.minecraft.world.PersistentStateManager.context; }
// // public static void context(Object value, ) { net.minecraft.world.PersistentStateManager.context = value; }

// public PersistentStateManager(Object context,java.nio.file.Path directory,com.mojang.datafixers.DataFixer dataFixer,Object registries) { this.wrapperContained = new net.minecraft.world.PersistentStateManager(context,directory,dataFixer,registries); }
// public yarnwrap.world.PersistentState readFromFile(yarnwrap.world.PersistentStateType type) { return new yarnwrap.world.PersistentState(wrapperContained.readFromFile(type.wrapperContained)); }
// public static yarnwrap.world.PersistentState readFromFile(yarnwrap.world.PersistentStateType type, ) { return new yarnwrap.world.PersistentState(net.minecraft.world.PersistentStateManager.readFromFile(type.wrapperContained)); }
public void set(yarnwrap.world.PersistentStateType type,yarnwrap.world.PersistentState state) { wrapperContained.set(type.wrapperContained,state.wrapperContained); }
// public static void set(yarnwrap.world.PersistentStateType type,yarnwrap.world.PersistentState state, ) { net.minecraft.world.PersistentStateManager.set(type.wrapperContained,state.wrapperContained); }
public void save() { wrapperContained.save(); }
// public static void save() { net.minecraft.world.PersistentStateManager.save(); }
// public boolean isCompressed(java.io.PushbackInputStream stream) { return wrapperContained.isCompressed(stream); }
// public static boolean isCompressed(java.io.PushbackInputStream stream, ) { return net.minecraft.world.PersistentStateManager.isCompressed(stream); }
// public java.nio.file.Path getFile(java.lang.String id) { return wrapperContained.getFile(id); }
// public static java.nio.file.Path getFile(java.lang.String id, ) { return net.minecraft.world.PersistentStateManager.getFile(id); }
// public yarnwrap.nbt.NbtCompound readNbt(java.lang.String id,yarnwrap.datafixer.DataFixTypes dataFixTypes,int currentSaveVersion) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readNbt(id,dataFixTypes.wrapperContained,currentSaveVersion)); }
// public static yarnwrap.nbt.NbtCompound readNbt(java.lang.String id,yarnwrap.datafixer.DataFixTypes dataFixTypes,int currentSaveVersion, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.PersistentStateManager.readNbt(id,dataFixTypes.wrapperContained,currentSaveVersion)); }
public yarnwrap.world.PersistentState getOrCreate(yarnwrap.world.PersistentStateType type) { return new yarnwrap.world.PersistentState(wrapperContained.getOrCreate(type.wrapperContained)); }
// public static yarnwrap.world.PersistentState getOrCreate(yarnwrap.world.PersistentStateType type, ) { return new yarnwrap.world.PersistentState(net.minecraft.world.PersistentStateManager.getOrCreate(type.wrapperContained)); }
public yarnwrap.world.PersistentState get(yarnwrap.world.PersistentStateType type) { return new yarnwrap.world.PersistentState(wrapperContained.get(type.wrapperContained)); }
// public static yarnwrap.world.PersistentState get(yarnwrap.world.PersistentStateType type, ) { return new yarnwrap.world.PersistentState(net.minecraft.world.PersistentStateManager.get(type.wrapperContained)); }
public java.util.concurrent.CompletableFuture startSaving() { return wrapperContained.startSaving(); }
// public static java.util.concurrent.CompletableFuture startSaving() { return net.minecraft.world.PersistentStateManager.startSaving(); }
// public java.util.Map collectStatesToSave() { return wrapperContained.collectStatesToSave(); }
// public static java.util.Map collectStatesToSave() { return net.minecraft.world.PersistentStateManager.collectStatesToSave(); }
// public void save(yarnwrap.world.PersistentStateType type,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.save(type.wrapperContained,nbt.wrapperContained); }
// public static void save(yarnwrap.world.PersistentStateType type,yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.world.PersistentStateManager.save(type.wrapperContained,nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound encode(yarnwrap.world.PersistentStateType type,yarnwrap.world.PersistentState state,yarnwrap.registry.RegistryOps ops) { return new yarnwrap.nbt.NbtCompound(wrapperContained.encode(type.wrapperContained,state.wrapperContained,ops.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound encode(yarnwrap.world.PersistentStateType type,yarnwrap.world.PersistentState state,yarnwrap.registry.RegistryOps ops, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.PersistentStateManager.encode(type.wrapperContained,state.wrapperContained,ops.wrapperContained)); }
// public void method_67444(java.util.Map type,yarnwrap.registry.RegistryOps optionalState) { wrapperContained.method_67444(type,optionalState.wrapperContained); }
// public static void method_67444(java.util.Map type,yarnwrap.registry.RegistryOps optionalState, ) { net.minecraft.world.PersistentStateManager.method_67444(type,optionalState.wrapperContained); }
// public void method_67445(java.util.Map state) { wrapperContained.method_67445(state); }
// public static void method_67445(java.util.Map state, ) { net.minecraft.world.PersistentStateManager.method_67445(state); }

}