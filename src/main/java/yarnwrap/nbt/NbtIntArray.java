package yarnwrap.nbt;
public class NbtIntArray { public net.minecraft.nbt.NbtIntArray wrapperContained; public NbtIntArray(net.minecraft.nbt.NbtIntArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] value() { return wrapperContained.value; }
// public void value(int[] value) { wrapperContained.value = value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
public int[] getIntArray() { return wrapperContained.getIntArray(); }
// public int[] toArray(java.util.List list) { return wrapperContained.toArray(list); }

}