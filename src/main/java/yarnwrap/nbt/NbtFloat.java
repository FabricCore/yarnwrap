package yarnwrap.nbt;
public class NbtFloat { public net.minecraft.nbt.NbtFloat wrapperContained; public NbtFloat(net.minecraft.nbt.NbtFloat wrapperContained) { this.wrapperContained = wrapperContained; }

// public float value() { return wrapperContained.value; }
// public void value(float value) { wrapperContained.value = value; }
// public static float value() { return net.minecraft.nbt.NbtFloat.value; }
// public static void value(float value, ) { net.minecraft.nbt.NbtFloat.value = value; }

// public yarnwrap.nbt.NbtFloat ZERO() { return new yarnwrap.nbt.NbtFloat(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.nbt.NbtFloat value) { wrapperContained.ZERO = value.wrapperContained; }
public static yarnwrap.nbt.NbtFloat ZERO() { return new yarnwrap.nbt.NbtFloat(net.minecraft.nbt.NbtFloat.ZERO); }
// public static void ZERO(yarnwrap.nbt.NbtFloat value, ) { net.minecraft.nbt.NbtFloat.ZERO = value.wrapperContained; }

// public yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.nbt.NbtType value) { wrapperContained.TYPE = value.wrapperContained; }
public static yarnwrap.nbt.NbtType TYPE() { return new yarnwrap.nbt.NbtType(net.minecraft.nbt.NbtFloat.TYPE); }
// public static void TYPE(yarnwrap.nbt.NbtType value, ) { net.minecraft.nbt.NbtFloat.TYPE = value.wrapperContained; }

// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
// public static int SIZE() { return net.minecraft.nbt.NbtFloat.SIZE; }
// public static void SIZE(int value, ) { net.minecraft.nbt.NbtFloat.SIZE = value; }

// public NbtFloat(float value) { this.wrapperContained = new net.minecraft.nbt.NbtFloat(value); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.nbt.NbtFloat.equals(o); }
// public yarnwrap.nbt.NbtFloat of(float value) { return new yarnwrap.nbt.NbtFloat(wrapperContained.of(value)); }
// public static yarnwrap.nbt.NbtFloat of(float value, ) { return new yarnwrap.nbt.NbtFloat(net.minecraft.nbt.NbtFloat.of(value)); }

}