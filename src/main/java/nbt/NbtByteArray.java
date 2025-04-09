package yarnwrap.nbt;
public class NbtByteArray { public net.minecraft.nbt.NbtByteArray wrapperContained; public NbtByteArray(net.minecraft.nbt.NbtByteArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte[] value() { return wrapperContained.value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public int SIZE() { return wrapperContained.SIZE; }
public byte[] getByteArray() { return wrapperContained.getByteArray(); }
// public byte[] toArray(java.util.List list) { return wrapperContained.toArray(list); }

}