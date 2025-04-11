package yarnwrap.nbt;
public class NbtLongArray { public net.minecraft.nbt.NbtLongArray wrapperContained; public NbtLongArray(net.minecraft.nbt.NbtLongArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public long[] value() { return wrapperContained.value; }
// public void value(long[] value) { wrapperContained.value = value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
public NbtLongArray(it.unimi.dsi.fastutil.longs.LongSet value) { this.wrapperContained = new net.minecraft.nbt.NbtLongArray(value); }
public NbtLongArray(java.util.List value) { this.wrapperContained = new net.minecraft.nbt.NbtLongArray(value); }
// public NbtLongArray(long value) { this.wrapperContained = new net.minecraft.nbt.NbtLongArray(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public java.lang.Object get(int index) { return wrapperContained.get(index); }
public long[] getLongArray() { return wrapperContained.getLongArray(); }
// public long[] toArray(java.util.List list) { return wrapperContained.toArray(list); }

}