package yarnwrap.nbt;
public class NbtShort { public net.minecraft.nbt.NbtShort wrapperContained; public NbtShort(net.minecraft.nbt.NbtShort wrapperContained) { this.wrapperContained = wrapperContained; }

// public short value() { return wrapperContained.value; }
// public void value(short value) { wrapperContained.value = value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
public yarnwrap.nbt.NbtShort of(short value) { return new yarnwrap.nbt.NbtShort(wrapperContained.of(value)); }

}