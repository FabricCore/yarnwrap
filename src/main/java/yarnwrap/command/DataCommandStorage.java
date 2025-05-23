package yarnwrap.command;
public class DataCommandStorage { public net.minecraft.command.DataCommandStorage wrapperContained; public DataCommandStorage(net.minecraft.command.DataCommandStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map storages() { return wrapperContained.storages; }
// public void storages(java.util.Map value) { wrapperContained.storages = value; }
// public static java.util.Map storages() { return net.minecraft.command.DataCommandStorage.storages; }
// public static void storages(java.util.Map value, ) { net.minecraft.command.DataCommandStorage.storages = value; }

// public yarnwrap.world.PersistentStateManager stateManager() { return new yarnwrap.world.PersistentStateManager(wrapperContained.stateManager); }
// public void stateManager(yarnwrap.world.PersistentStateManager value) { wrapperContained.stateManager = value.wrapperContained; }
// public static yarnwrap.world.PersistentStateManager stateManager() { return new yarnwrap.world.PersistentStateManager(net.minecraft.command.DataCommandStorage.stateManager); }
// public static void stateManager(yarnwrap.world.PersistentStateManager value, ) { net.minecraft.command.DataCommandStorage.stateManager = value.wrapperContained; }

// public java.lang.String COMMAND_STORAGE_PREFIX() { return wrapperContained.COMMAND_STORAGE_PREFIX; }
// public void COMMAND_STORAGE_PREFIX(java.lang.String value) { wrapperContained.COMMAND_STORAGE_PREFIX = value; }
// public static java.lang.String COMMAND_STORAGE_PREFIX() { return net.minecraft.command.DataCommandStorage.COMMAND_STORAGE_PREFIX; }
// public static void COMMAND_STORAGE_PREFIX(java.lang.String value, ) { net.minecraft.command.DataCommandStorage.COMMAND_STORAGE_PREFIX = value; }

public DataCommandStorage(yarnwrap.world.PersistentStateManager stateManager) { this.wrapperContained = new net.minecraft.command.DataCommandStorage(stateManager.wrapperContained); }
public java.util.stream.Stream getIds() { return wrapperContained.getIds(); }
// public static java.util.stream.Stream getIds() { return net.minecraft.command.DataCommandStorage.getIds(); }
// public java.lang.String getSaveKey(java.lang.String namespace) { return wrapperContained.getSaveKey(namespace); }
// public static java.lang.String getSaveKey(java.lang.String namespace, ) { return net.minecraft.command.DataCommandStorage.getSaveKey(namespace); }
// public java.util.stream.Stream method_22545(Object entry) { return wrapperContained.method_22545(entry); }
// public static java.util.stream.Stream method_22545(Object entry, ) { return net.minecraft.command.DataCommandStorage.method_22545(entry); }
public yarnwrap.nbt.NbtCompound get(yarnwrap.util.Identifier id) { return new yarnwrap.nbt.NbtCompound(wrapperContained.get(id.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound get(yarnwrap.util.Identifier id, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.command.DataCommandStorage.get(id.wrapperContained)); }
public void set(yarnwrap.util.Identifier id,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.set(id.wrapperContained,nbt.wrapperContained); }
// public static void set(yarnwrap.util.Identifier id,yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.command.DataCommandStorage.set(id.wrapperContained,nbt.wrapperContained); }
// public Object getStorage(java.lang.String namespace) { return wrapperContained.getStorage(namespace); }
// public static Object getStorage(java.lang.String namespace, ) { return net.minecraft.command.DataCommandStorage.getStorage(namespace); }
// public Object getOrCreateStorage(java.lang.String namespace) { return wrapperContained.getOrCreateStorage(namespace); }
// public static Object getOrCreateStorage(java.lang.String namespace, ) { return net.minecraft.command.DataCommandStorage.getOrCreateStorage(namespace); }

}