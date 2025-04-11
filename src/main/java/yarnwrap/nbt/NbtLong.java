package yarnwrap.nbt;
public class NbtLong { public net.minecraft.nbt.NbtLong wrapperContained; public NbtLong(net.minecraft.nbt.NbtLong wrapperContained) { this.wrapperContained = wrapperContained; }

// public long value() { return wrapperContained.value; }
// public void value(long value) { wrapperContained.value = value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public NbtLong(long value) { this.wrapperContained = new net.minecraft.nbt.NbtLong(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.nbt.NbtLong of(long value) { return new yarnwrap.nbt.NbtLong(wrapperContained.of(value)); }

}