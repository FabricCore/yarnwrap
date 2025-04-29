package yarnwrap.nbt;
public class NbtShort { public net.minecraft.nbt.NbtShort wrapperContained; public NbtShort(net.minecraft.nbt.NbtShort wrapperContained) { this.wrapperContained = wrapperContained; }

// public short value() { return wrapperContained.value; }
// public void value(short value) { wrapperContained.value = value; }
// public static short value() { return net.minecraft.nbt.NbtShort.value; }
// public static void value(short value, ) { net.minecraft.nbt.NbtShort.value = value; }

// public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(net.minecraft.nbt.NbtShort.TYPE); }
// public static void TYPE(yarnwrap.nbt.NbtType value, ) { net.minecraft.nbt.NbtShort.TYPE = value.wrapperContained; }

// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public static int SIZE() { return net.minecraft.nbt.NbtShort.SIZE; }
// public static void SIZE(int value, ) { net.minecraft.nbt.NbtShort.SIZE = value; }

// public NbtShort(short value) { this.wrapperContained = new net.minecraft.nbt.NbtShort(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.nbt.NbtShort.equals(o); }
// public yarnwrap.nbt.NbtShort of(short value) { return new yarnwrap.nbt.NbtShort(wrapperContained.of(value)); }
// public static yarnwrap.nbt.NbtShort of(short value, ) { return new yarnwrap.nbt.NbtShort(net.minecraft.nbt.NbtShort.of(value)); }

}