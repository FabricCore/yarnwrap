package yarnwrap.nbt;
public class NbtLongArray { public net.minecraft.nbt.NbtLongArray wrapperContained; public NbtLongArray(net.minecraft.nbt.NbtLongArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public long[] value() { return wrapperContained.value; }
// public void value(long[] value) { wrapperContained.value = value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
public long[] getLongArray() { return wrapperContained.getLongArray(); }
// public long[] toArray(java.util.List list) { return wrapperContained.toArray(list); }

}