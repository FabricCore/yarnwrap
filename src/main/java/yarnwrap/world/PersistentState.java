package yarnwrap.world;
public class PersistentState { public net.minecraft.world.PersistentState wrapperContained; public PersistentState(net.minecraft.world.PersistentState wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public boolean dirty() { return wrapperContained.dirty; }
// public void dirty(boolean value) { wrapperContained.dirty = value; }
// public void save(java.io.File file,Object registryLookup) { wrapperContained.save(file,registryLookup); }
// public yarnwrap.nbt.NbtCompound writeNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { return new yarnwrap.nbt.NbtCompound(wrapperContained.writeNbt(nbt.wrapperContained,registryLookup)); }
public void setDirty(boolean dirty) { wrapperContained.setDirty(dirty); }
public boolean isDirty() { return wrapperContained.isDirty(); }
public void markDirty() { wrapperContained.markDirty(); }

}