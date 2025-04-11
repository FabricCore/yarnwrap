package yarnwrap.command;
public class DataCommandStorage { public net.minecraft.command.DataCommandStorage wrapperContained; public DataCommandStorage(net.minecraft.command.DataCommandStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map storages() { return wrapperContained.storages; }
// public void storages(java.util.Map value) { wrapperContained.storages = value; }
// public yarnwrap.world.PersistentStateManager stateManager() { return new yarnwrap.world.PersistentStateManager(wrapperContained.stateManager); }
// public void stateManager(yarnwrap.world.PersistentStateManager value) { wrapperContained.stateManager = value.wrapperContained; }
// public java.lang.String COMMAND_STORAGE_PREFIX() { return wrapperContained.COMMAND_STORAGE_PREFIX; }
// public void COMMAND_STORAGE_PREFIX(java.lang.String value) { wrapperContained.COMMAND_STORAGE_PREFIX = value; }
public java.util.stream.Stream getIds() { return wrapperContained.getIds(); }
// public java.lang.String getSaveKey(java.lang.String namespace) { return wrapperContained.getSaveKey(namespace); }
// public Object createStorage(java.lang.String namespace) { return wrapperContained.createStorage(namespace); }
public yarnwrap.nbt.NbtCompound get(yarnwrap.util.Identifier id) { return new yarnwrap.nbt.NbtCompound(wrapperContained.get(id.wrapperContained)); }
public void set(yarnwrap.util.Identifier id,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.set(id.wrapperContained,nbt.wrapperContained); }
// public Object getPersistentStateType(java.lang.String namespace) { return wrapperContained.getPersistentStateType(namespace); }

}