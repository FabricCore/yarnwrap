package yarnwrap.nbt;
public class NbtDouble { public net.minecraft.nbt.NbtDouble wrapperContained; public NbtDouble(net.minecraft.nbt.NbtDouble wrapperContained) { this.wrapperContained = wrapperContained; }

// public double value() { return wrapperContained.value; }
// public void value(double value) { wrapperContained.value = value; }
public yarnwrap.nbt.NbtDouble ZERO() { return new yarnwrap.nbt.NbtDouble(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.nbt.NbtDouble value) { wrapperContained.ZERO = value.wrapperContained; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public NbtDouble(double value) { this.wrapperContained = new net.minecraft.nbt.NbtDouble(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.nbt.NbtDouble of(double value) { return new yarnwrap.nbt.NbtDouble(wrapperContained.of(value)); }

}