package yarnwrap.util;
public class ColorCode { public net.minecraft.util.ColorCode wrapperContained; public ColorCode(net.minecraft.util.ColorCode wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.lang.String HASH() { return wrapperContained.HASH; }
// public java.lang.String asString() { return wrapperContained.asString(); }

}