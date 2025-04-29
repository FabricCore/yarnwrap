package yarnwrap.world;
public class PersistentState { public net.minecraft.world.PersistentState wrapperContained; public PersistentState(net.minecraft.world.PersistentState wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.PersistentState.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.PersistentState.LOGGER = value; }

// public boolean dirty() { return wrapperContained.dirty; }
// public void dirty(boolean value) { wrapperContained.dirty = value; }
// public static boolean dirty() { return net.minecraft.world.PersistentState.dirty; }
// public static void dirty(boolean value, ) { net.minecraft.world.PersistentState.dirty = value; }

// public void save(java.io.File file,Object registryLookup) { wrapperContained.save(file,registryLookup); }
// public static void save(java.io.File file,Object registryLookup, ) { net.minecraft.world.PersistentState.save(file,registryLookup); }
// public yarnwrap.nbt.NbtCompound writeNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.writeNbt(nbt.wrapperContained,registryLookup)); }
// public static yarnwrap.nbt.NbtCompound writeNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.PersistentState.writeNbt(nbt.wrapperContained,registryLookup)); }
public void setDirty(boolean dirty) { wrapperContained.setDirty(dirty); }
// public static void setDirty(boolean dirty, ) { net.minecraft.world.PersistentState.setDirty(dirty); }
public boolean isDirty() { return wrapperContained.isDirty(); }
// public static boolean isDirty() { return net.minecraft.world.PersistentState.isDirty(); }
public void markDirty() { wrapperContained.markDirty(); }
// public static void markDirty() { net.minecraft.world.PersistentState.markDirty(); }

}