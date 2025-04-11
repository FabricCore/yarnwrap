package yarnwrap.util;
public class ColorCode { public net.minecraft.util.ColorCode wrapperContained; public ColorCode(net.minecraft.util.ColorCode wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.lang.String HASH() { return wrapperContained.HASH; }
// public void HASH(java.lang.String value) { wrapperContained.HASH = value; }
// public com.mojang.serialization.DataResult method_53914(java.lang.String code) { return wrapperContained.method_53914(code); }
// public java.lang.String asString() { return wrapperContained.asString(); }

}