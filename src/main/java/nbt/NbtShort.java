package yarnwrap.nbt;
public class NbtShort { public net.minecraft.nbt.NbtShort wrapperContained; public NbtShort(net.minecraft.nbt.NbtShort wrapperContained) { this.wrapperContained = wrapperContained; }

// public short value() { return wrapperContained.value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public int SIZE() { return wrapperContained.SIZE; }
public yarnwrap.nbt.NbtShort of(short value) { return new yarnwrap.nbt.NbtShort(wrapperContained.of(value)); }

}