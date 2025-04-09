package yarnwrap.nbt;
public class NbtIntArray { public net.minecraft.nbt.NbtIntArray wrapperContained; public NbtIntArray(net.minecraft.nbt.NbtIntArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] value() { return wrapperContained.value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public int SIZE() { return wrapperContained.SIZE; }
public int[] getIntArray() { return wrapperContained.getIntArray(); }
// public int[] toArray(java.util.List list) { return wrapperContained.toArray(list); }

}