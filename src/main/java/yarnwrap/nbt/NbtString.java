package yarnwrap.nbt;
public class NbtString { public net.minecraft.nbt.NbtString wrapperContained; public NbtString(net.minecraft.nbt.NbtString wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(net.minecraft.nbt.NbtString.TYPE); }
// public static void TYPE(yarnwrap.nbt.NbtType value, ) { net.minecraft.nbt.NbtString.TYPE = value.wrapperContained; }

// public yarnwrap.nbt.NbtString EMPTY() { return new yarnwrap.nbt.NbtString(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.nbt.NbtString value) { wrapperContained.EMPTY = value.wrapperContained; }
// public static yarnwrap.nbt.NbtString EMPTY() { return new yarnwrap.nbt.NbtString(net.minecraft.nbt.NbtString.EMPTY); }
// public static void EMPTY(yarnwrap.nbt.NbtString value, ) { net.minecraft.nbt.NbtString.EMPTY = value.wrapperContained; }

// public char DOUBLE_QUOTE() { return wrapperContained.DOUBLE_QUOTE; }
// public void DOUBLE_QUOTE(char value) { wrapperContained.DOUBLE_QUOTE = value; }
// public static char DOUBLE_QUOTE() { return net.minecraft.nbt.NbtString.DOUBLE_QUOTE; }
// public static void DOUBLE_QUOTE(char value, ) { net.minecraft.nbt.NbtString.DOUBLE_QUOTE = value; }

// public char SINGLE_QUOTE() { return wrapperContained.SINGLE_QUOTE; }
// public void SINGLE_QUOTE(char value) { wrapperContained.SINGLE_QUOTE = value; }
// public static char SINGLE_QUOTE() { return net.minecraft.nbt.NbtString.SINGLE_QUOTE; }
// public static void SINGLE_QUOTE(char value, ) { net.minecraft.nbt.NbtString.SINGLE_QUOTE = value; }

// public char BACKSLASH() { return wrapperContained.BACKSLASH; }
// public void BACKSLASH(char value) { wrapperContained.BACKSLASH = value; }
// public static char BACKSLASH() { return net.minecraft.nbt.NbtString.BACKSLASH; }
// public static void BACKSLASH(char value, ) { net.minecraft.nbt.NbtString.BACKSLASH = value; }

// public char NULL() { return wrapperContained.NULL; }
// public void NULL(char value) { wrapperContained.NULL = value; }
// public static char NULL() { return net.minecraft.nbt.NbtString.NULL; }
// public static void NULL(char value, ) { net.minecraft.nbt.NbtString.NULL = value; }

// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public static int SIZE() { return net.minecraft.nbt.NbtString.SIZE; }
// public static void SIZE(int value, ) { net.minecraft.nbt.NbtString.SIZE = value; }

public NbtString(java.lang.String value) { this.wrapperContained = new net.minecraft.nbt.NbtString(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.nbt.NbtString.equals(o); }
// public java.lang.String escape(java.lang.String value) { return wrapperContained.escape(value); }
// public static java.lang.String escape(java.lang.String value, ) { return net.minecraft.nbt.NbtString.escape(value); }
// public yarnwrap.nbt.NbtString of(java.lang.String value) { return new yarnwrap.nbt.NbtString(wrapperContained.of(value)); }
// public static yarnwrap.nbt.NbtString of(java.lang.String value, ) { return new yarnwrap.nbt.NbtString(net.minecraft.nbt.NbtString.of(value)); }
// public void skip(java.io.DataInput input) { wrapperContained.skip(input); }
// public static void skip(java.io.DataInput input, ) { net.minecraft.nbt.NbtString.skip(input); }
// public void appendEscaped(java.lang.String value,java.lang.StringBuilder builder) { wrapperContained.appendEscaped(value,builder); }
// public static void appendEscaped(java.lang.String value,java.lang.StringBuilder builder, ) { net.minecraft.nbt.NbtString.appendEscaped(value,builder); }

}