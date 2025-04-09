package yarnwrap.nbt;
public class NbtByte { public net.minecraft.nbt.NbtByte wrapperContained; public NbtByte(net.minecraft.nbt.NbtByte wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte value() { return wrapperContained.value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
public yarnwrap.nbt.NbtByte ZERO() { return new yarnwrap.nbt.NbtByte(wrapperContained.ZERO); }
public yarnwrap.nbt.NbtByte ONE() { return new yarnwrap.nbt.NbtByte(wrapperContained.ONE); }
// public int SIZE() { return wrapperContained.SIZE; }
public yarnwrap.nbt.NbtByte of(byte value) { return new yarnwrap.nbt.NbtByte(wrapperContained.of(value)); }
public yarnwrap.nbt.NbtByte of(boolean value) { return new yarnwrap.nbt.NbtByte(wrapperContained.of(value)); }

}