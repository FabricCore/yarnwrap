package yarnwrap.nbt;
public class NbtByte { public net.minecraft.nbt.NbtByte wrapperContained; public NbtByte(net.minecraft.nbt.NbtByte wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte value() { return wrapperContained.value; }
// public void value(byte value) { wrapperContained.value = value; }
// public static byte value() { return net.minecraft.nbt.NbtByte.value; }
// public static void value(byte value, ) { net.minecraft.nbt.NbtByte.value = value; }

// public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(net.minecraft.nbt.NbtByte.TYPE); }
// public static void TYPE(yarnwrap.nbt.NbtType value, ) { net.minecraft.nbt.NbtByte.TYPE = value.wrapperContained; }

// public yarnwrap.nbt.NbtByte ZERO() { return new yarnwrap.nbt.NbtByte(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.nbt.NbtByte value) { wrapperContained.ZERO = value.wrapperContained; }
public static yarnwrap.nbt.NbtByte ZERO() { return new yarnwrap.nbt.NbtByte(net.minecraft.nbt.NbtByte.ZERO); }
// public static void ZERO(yarnwrap.nbt.NbtByte value, ) { net.minecraft.nbt.NbtByte.ZERO = value.wrapperContained; }

// public yarnwrap.nbt.NbtByte ONE() { return new yarnwrap.nbt.NbtByte(wrapperContained.ONE); }
// public void ONE(yarnwrap.nbt.NbtByte value) { wrapperContained.ONE = value.wrapperContained; }
public static yarnwrap.nbt.NbtByte ONE() { return new yarnwrap.nbt.NbtByte(net.minecraft.nbt.NbtByte.ONE); }
// public static void ONE(yarnwrap.nbt.NbtByte value, ) { net.minecraft.nbt.NbtByte.ONE = value.wrapperContained; }

// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public static int SIZE() { return net.minecraft.nbt.NbtByte.SIZE; }
// public static void SIZE(int value, ) { net.minecraft.nbt.NbtByte.SIZE = value; }

// public NbtByte(byte value) { this.wrapperContained = new net.minecraft.nbt.NbtByte(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.nbt.NbtByte.equals(o); }
// public yarnwrap.nbt.NbtByte of(byte value) { return new yarnwrap.nbt.NbtByte(wrapperContained.of(value)); }
// public static yarnwrap.nbt.NbtByte of(byte value, ) { return new yarnwrap.nbt.NbtByte(net.minecraft.nbt.NbtByte.of(value)); }
// public yarnwrap.nbt.NbtByte of(boolean value) { return new yarnwrap.nbt.NbtByte(wrapperContained.of(value)); }
// public static yarnwrap.nbt.NbtByte of(boolean value, ) { return new yarnwrap.nbt.NbtByte(net.minecraft.nbt.NbtByte.of(value)); }

}