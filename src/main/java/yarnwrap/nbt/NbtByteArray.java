package yarnwrap.nbt;
public class NbtByteArray { public net.minecraft.nbt.NbtByteArray wrapperContained; public NbtByteArray(net.minecraft.nbt.NbtByteArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte[] value() { return wrapperContained.value; }
// public void value(byte[] value) { wrapperContained.value = value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
public byte[] getByteArray() { return wrapperContained.getByteArray(); }
// public byte[] toArray(java.util.List list) { return wrapperContained.toArray(list); }

}