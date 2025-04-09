package yarnwrap.nbt;
public class NbtLong { public net.minecraft.nbt.NbtLong wrapperContained; public NbtLong(net.minecraft.nbt.NbtLong wrapperContained) { this.wrapperContained = wrapperContained; }

// public long value() { return wrapperContained.value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public int SIZE() { return wrapperContained.SIZE; }
public yarnwrap.nbt.NbtLong of(long value) { return new yarnwrap.nbt.NbtLong(wrapperContained.of(value)); }

}