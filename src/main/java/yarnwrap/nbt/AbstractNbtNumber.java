package yarnwrap.nbt;
public class AbstractNbtNumber { public net.minecraft.nbt.AbstractNbtNumber wrapperContained; public AbstractNbtNumber(net.minecraft.nbt.AbstractNbtNumber wrapperContained) { this.wrapperContained = wrapperContained; }

public short shortValue() { return wrapperContained.shortValue(); }
// public static short shortValue() { return net.minecraft.nbt.AbstractNbtNumber.shortValue(); }
public double doubleValue() { return wrapperContained.doubleValue(); }
// public static double doubleValue() { return net.minecraft.nbt.AbstractNbtNumber.doubleValue(); }
public byte byteValue() { return wrapperContained.byteValue(); }
// public static byte byteValue() { return net.minecraft.nbt.AbstractNbtNumber.byteValue(); }
public long longValue() { return wrapperContained.longValue(); }
// public static long longValue() { return net.minecraft.nbt.AbstractNbtNumber.longValue(); }
public float floatValue() { return wrapperContained.floatValue(); }
// public static float floatValue() { return net.minecraft.nbt.AbstractNbtNumber.floatValue(); }
public int intValue() { return wrapperContained.intValue(); }
// public static int intValue() { return net.minecraft.nbt.AbstractNbtNumber.intValue(); }
public java.lang.Number numberValue() { return wrapperContained.numberValue(); }
// public static java.lang.Number numberValue() { return net.minecraft.nbt.AbstractNbtNumber.numberValue(); }

}