package yarnwrap.nbt;
public class NbtIntArray { public net.minecraft.nbt.NbtIntArray wrapperContained; public NbtIntArray(net.minecraft.nbt.NbtIntArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] value() { return wrapperContained.value; }
// public void value(int[] value) { wrapperContained.value = value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
public NbtIntArray(java.util.List value) { this.wrapperContained = new net.minecraft.nbt.NbtIntArray(value); }
// public NbtIntArray(int value) { this.wrapperContained = new net.minecraft.nbt.NbtIntArray(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public java.lang.Object get(int index) { return wrapperContained.get(index); }
public int[] getIntArray() { return wrapperContained.getIntArray(); }
// public int[] toArray(java.util.List list) { return wrapperContained.toArray(list); }

}