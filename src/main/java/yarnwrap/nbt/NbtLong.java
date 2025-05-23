package yarnwrap.nbt;
public class NbtLong { public net.minecraft.nbt.NbtLong wrapperContained; public NbtLong(net.minecraft.nbt.NbtLong wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(net.minecraft.nbt.NbtLong.TYPE); }
// public static void TYPE(yarnwrap.nbt.NbtType value, ) { net.minecraft.nbt.NbtLong.TYPE = value.wrapperContained; }

// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public static int SIZE() { return net.minecraft.nbt.NbtLong.SIZE; }
// public static void SIZE(int value, ) { net.minecraft.nbt.NbtLong.SIZE = value; }

public NbtLong(long value) { this.wrapperContained = new net.minecraft.nbt.NbtLong(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.nbt.NbtLong.equals(o); }
// public yarnwrap.nbt.NbtLong of(long value) { return new yarnwrap.nbt.NbtLong(wrapperContained.of(value)); }
// public static yarnwrap.nbt.NbtLong of(long value, ) { return new yarnwrap.nbt.NbtLong(net.minecraft.nbt.NbtLong.of(value)); }

}