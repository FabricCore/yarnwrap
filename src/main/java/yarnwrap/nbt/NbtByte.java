package yarnwrap.nbt;
public class NbtByte { public net.minecraft.nbt.NbtByte wrapperContained; public NbtByte(net.minecraft.nbt.NbtByte wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte value() { return wrapperContained.value; }
// public void value(byte value) { wrapperContained.value = value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
public yarnwrap.nbt.NbtByte ZERO() { return new yarnwrap.nbt.NbtByte(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.nbt.NbtByte value) { wrapperContained.ZERO = value.wrapperContained; }
public yarnwrap.nbt.NbtByte ONE() { return new yarnwrap.nbt.NbtByte(wrapperContained.ONE); }
// public void ONE(yarnwrap.nbt.NbtByte value) { wrapperContained.ONE = value.wrapperContained; }
// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
public yarnwrap.nbt.NbtByte of(byte value) { return new yarnwrap.nbt.NbtByte(wrapperContained.of(value)); }
public yarnwrap.nbt.NbtByte of(boolean value) { return new yarnwrap.nbt.NbtByte(wrapperContained.of(value)); }

}