package yarnwrap.nbt;
public class NbtString { public net.minecraft.nbt.NbtString wrapperContained; public NbtString(net.minecraft.nbt.NbtString wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String value() { return wrapperContained.value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public yarnwrap.nbt.NbtString EMPTY() { return new yarnwrap.nbt.NbtString(wrapperContained.EMPTY); }
// public char DOUBLE_QUOTE() { return wrapperContained.DOUBLE_QUOTE; }
// public char SINGLE_QUOTE() { return wrapperContained.SINGLE_QUOTE; }
// public char BACKSLASH() { return wrapperContained.BACKSLASH; }
// public char NULL() { return wrapperContained.NULL; }
// public int SIZE() { return wrapperContained.SIZE; }
public java.lang.String escape(java.lang.String value) { return wrapperContained.escape(value); }
public yarnwrap.nbt.NbtString of(java.lang.String value) { return new yarnwrap.nbt.NbtString(wrapperContained.of(value)); }
// public void skip(java.io.DataInput input) { wrapperContained.skip(input); }

}