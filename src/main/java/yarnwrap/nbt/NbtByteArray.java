package yarnwrap.nbt;
public class NbtByteArray { public net.minecraft.nbt.NbtByteArray wrapperContained; public NbtByteArray(net.minecraft.nbt.NbtByteArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte[] value() { return wrapperContained.value; }
// public void value(byte[] value) { wrapperContained.value = value; }
// public static byte[] value() { return net.minecraft.nbt.NbtByteArray.value; }
// public static void value(byte[] value, ) { net.minecraft.nbt.NbtByteArray.value = value; }

// public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(net.minecraft.nbt.NbtByteArray.TYPE); }
// public static void TYPE(yarnwrap.nbt.NbtType value, ) { net.minecraft.nbt.NbtByteArray.TYPE = value.wrapperContained; }

// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public static int SIZE() { return net.minecraft.nbt.NbtByteArray.SIZE; }
// public static void SIZE(int value, ) { net.minecraft.nbt.NbtByteArray.SIZE = value; }

// public NbtByteArray(byte value) { this.wrapperContained = new net.minecraft.nbt.NbtByteArray(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.nbt.NbtByteArray.equals(o); }
public byte[] getByteArray() { return wrapperContained.getByteArray(); }
// public static byte[] getByteArray() { return net.minecraft.nbt.NbtByteArray.getByteArray(); }

}