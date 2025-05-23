package yarnwrap.world;
public class PersistentState { public net.minecraft.world.PersistentState wrapperContained; public PersistentState(net.minecraft.world.PersistentState wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean dirty() { return wrapperContained.dirty; }
// public void dirty(boolean value) { wrapperContained.dirty = value; }
// public static boolean dirty() { return net.minecraft.world.PersistentState.dirty; }
// public static void dirty(boolean value, ) { net.minecraft.world.PersistentState.dirty = value; }

public void setDirty(boolean dirty) { wrapperContained.setDirty(dirty); }
// public static void setDirty(boolean dirty, ) { net.minecraft.world.PersistentState.setDirty(dirty); }
public boolean isDirty() { return wrapperContained.isDirty(); }
// public static boolean isDirty() { return net.minecraft.world.PersistentState.isDirty(); }
public void markDirty() { wrapperContained.markDirty(); }
// public static void markDirty() { net.minecraft.world.PersistentState.markDirty(); }

}