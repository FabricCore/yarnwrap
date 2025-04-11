package yarnwrap.nbt;
public class NbtString { public net.minecraft.nbt.NbtString wrapperContained; public NbtString(net.minecraft.nbt.NbtString wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String value() { return wrapperContained.value; }
// public void value(java.lang.String value) { wrapperContained.value = value; }
public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
// public yarnwrap.nbt.NbtString EMPTY() { return new yarnwrap.nbt.NbtString(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.nbt.NbtString value) { wrapperContained.EMPTY = value.wrapperContained; }
// public char DOUBLE_QUOTE() { return wrapperContained.DOUBLE_QUOTE; }
// public void DOUBLE_QUOTE(char value) { wrapperContained.DOUBLE_QUOTE = value; }
// public char SINGLE_QUOTE() { return wrapperContained.SINGLE_QUOTE; }
// public void SINGLE_QUOTE(char value) { wrapperContained.SINGLE_QUOTE = value; }
// public char BACKSLASH() { return wrapperContained.BACKSLASH; }
// public void BACKSLASH(char value) { wrapperContained.BACKSLASH = value; }
// public char NULL() { return wrapperContained.NULL; }
// public void NULL(char value) { wrapperContained.NULL = value; }
// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public NbtString(java.lang.String value) { this.wrapperContained = new net.minecraft.nbt.NbtString(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public java.lang.String escape(java.lang.String value) { return wrapperContained.escape(value); }
public yarnwrap.nbt.NbtString of(java.lang.String value) { return new yarnwrap.nbt.NbtString(wrapperContained.of(value)); }
// public void skip(java.io.DataInput input) { wrapperContained.skip(input); }

}