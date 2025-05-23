package yarnwrap.nbt;
public class NbtInt { public net.minecraft.nbt.NbtInt wrapperContained; public NbtInt(net.minecraft.nbt.NbtInt wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(net.minecraft.nbt.NbtInt.TYPE); }
// public static void TYPE(yarnwrap.nbt.NbtType value, ) { net.minecraft.nbt.NbtInt.TYPE = value.wrapperContained; }

// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public static int SIZE() { return net.minecraft.nbt.NbtInt.SIZE; }
// public static void SIZE(int value, ) { net.minecraft.nbt.NbtInt.SIZE = value; }

public NbtInt(int value) { this.wrapperContained = new net.minecraft.nbt.NbtInt(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.nbt.NbtInt.equals(o); }
// public yarnwrap.nbt.NbtInt of(int value) { return new yarnwrap.nbt.NbtInt(wrapperContained.of(value)); }
// public static yarnwrap.nbt.NbtInt of(int value, ) { return new yarnwrap.nbt.NbtInt(net.minecraft.nbt.NbtInt.of(value)); }

}