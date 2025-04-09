package yarnwrap.nbt;
public class AbstractNbtNumber { public net.minecraft.nbt.AbstractNbtNumber wrapperContained; public AbstractNbtNumber(net.minecraft.nbt.AbstractNbtNumber wrapperContained) { this.wrapperContained = wrapperContained; }

public short shortValue() { return wrapperContained.shortValue(); }
public double doubleValue() { return wrapperContained.doubleValue(); }
public byte byteValue() { return wrapperContained.byteValue(); }
public long longValue() { return wrapperContained.longValue(); }
public float floatValue() { return wrapperContained.floatValue(); }
public int intValue() { return wrapperContained.intValue(); }
public java.lang.Number numberValue() { return wrapperContained.numberValue(); }

}