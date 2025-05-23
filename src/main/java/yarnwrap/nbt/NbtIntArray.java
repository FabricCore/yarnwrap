package yarnwrap.nbt;
public class NbtIntArray { public net.minecraft.nbt.NbtIntArray wrapperContained; public NbtIntArray(net.minecraft.nbt.NbtIntArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] value() { return wrapperContained.value; }
// public void value(int[] value) { wrapperContained.value = value; }
// public static int[] value() { return net.minecraft.nbt.NbtIntArray.value; }
// public static void value(int[] value, ) { net.minecraft.nbt.NbtIntArray.value = value; }

// public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(net.minecraft.nbt.NbtIntArray.TYPE); }
// public static void TYPE(yarnwrap.nbt.NbtType value, ) { net.minecraft.nbt.NbtIntArray.TYPE = value.wrapperContained; }

// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public static int SIZE() { return net.minecraft.nbt.NbtIntArray.SIZE; }
// public static void SIZE(int value, ) { net.minecraft.nbt.NbtIntArray.SIZE = value; }

// public NbtIntArray(int value) { this.wrapperContained = new net.minecraft.nbt.NbtIntArray(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.nbt.NbtIntArray.equals(o); }
public int[] getIntArray() { return wrapperContained.getIntArray(); }
// public static int[] getIntArray() { return net.minecraft.nbt.NbtIntArray.getIntArray(); }

}