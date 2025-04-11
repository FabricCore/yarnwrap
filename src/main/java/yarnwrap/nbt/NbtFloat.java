package yarnwrap.nbt;
public class NbtFloat { public net.minecraft.nbt.NbtFloat wrapperContained; public NbtFloat(net.minecraft.nbt.NbtFloat wrapperContained) { this.wrapperContained = wrapperContained; }

// public float value() { return wrapperContained.value; }
// public void value(float value) { wrapperContained.value = value; }
public yarnwrap.nbt.NbtFloat ZERO() { return new yarnwrap.nbt.NbtFloat(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.nbt.NbtFloat value) { wrapperContained.ZERO = value.wrapperContained; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
public yarnwrap.nbt.NbtFloat of(float value) { return new yarnwrap.nbt.NbtFloat(wrapperContained.of(value)); }

}