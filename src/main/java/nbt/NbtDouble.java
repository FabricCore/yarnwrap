package yarnwrap.nbt;
public class NbtDouble { public net.minecraft.nbt.NbtDouble wrapperContained; public NbtDouble(net.minecraft.nbt.NbtDouble wrapperContained) { this.wrapperContained = wrapperContained; }

// public double value() { return wrapperContained.value; }
public yarnwrap.nbt.NbtDouble ZERO() { return new yarnwrap.nbt.NbtDouble(wrapperContained.ZERO); }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public int SIZE() { return wrapperContained.SIZE; }
public yarnwrap.nbt.NbtDouble of(double value) { return new yarnwrap.nbt.NbtDouble(wrapperContained.of(value)); }

}