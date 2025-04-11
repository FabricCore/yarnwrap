package yarnwrap.nbt;
public class NbtInt { public net.minecraft.nbt.NbtInt wrapperContained; public NbtInt(net.minecraft.nbt.NbtInt wrapperContained) { this.wrapperContained = wrapperContained; }

// public int value() { return wrapperContained.value; }
// public void value(int value) { wrapperContained.value = value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
public yarnwrap.nbt.NbtInt of(int value) { return new yarnwrap.nbt.NbtInt(wrapperContained.of(value)); }

}