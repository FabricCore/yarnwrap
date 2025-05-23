package yarnwrap.nbt;
public class NbtDouble { public net.minecraft.nbt.NbtDouble wrapperContained; public NbtDouble(net.minecraft.nbt.NbtDouble wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtDouble ZERO() { return new yarnwrap.nbt.NbtDouble(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.nbt.NbtDouble value) { wrapperContained.ZERO = value.wrapperContained; }
public static yarnwrap.nbt.NbtDouble ZERO() { return new yarnwrap.nbt.NbtDouble(net.minecraft.nbt.NbtDouble.ZERO); }
// public static void ZERO(yarnwrap.nbt.NbtDouble value, ) { net.minecraft.nbt.NbtDouble.ZERO = value.wrapperContained; }

// public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(net.minecraft.nbt.NbtDouble.TYPE); }
// public static void TYPE(yarnwrap.nbt.NbtType value, ) { net.minecraft.nbt.NbtDouble.TYPE = value.wrapperContained; }

// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public static int SIZE() { return net.minecraft.nbt.NbtDouble.SIZE; }
// public static void SIZE(int value, ) { net.minecraft.nbt.NbtDouble.SIZE = value; }

public NbtDouble(double value) { this.wrapperContained = new net.minecraft.nbt.NbtDouble(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.nbt.NbtDouble.equals(o); }
// public yarnwrap.nbt.NbtDouble of(double value) { return new yarnwrap.nbt.NbtDouble(wrapperContained.of(value)); }
// public static yarnwrap.nbt.NbtDouble of(double value, ) { return new yarnwrap.nbt.NbtDouble(net.minecraft.nbt.NbtDouble.of(value)); }

}