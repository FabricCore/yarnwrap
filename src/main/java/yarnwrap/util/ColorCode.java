package yarnwrap.util;
public class ColorCode { public net.minecraft.util.ColorCode wrapperContained; public ColorCode(net.minecraft.util.ColorCode wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.ColorCode.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.ColorCode.CODEC = value; }

// public java.lang.String HASH() { return wrapperContained.HASH; }
// public void HASH(java.lang.String value) { wrapperContained.HASH = value; }
// public static java.lang.String HASH() { return net.minecraft.util.ColorCode.HASH; }
// public static void HASH(java.lang.String value, ) { net.minecraft.util.ColorCode.HASH = value; }

// public com.mojang.serialization.DataResult method_53914(java.lang.String code) { return wrapperContained.method_53914(code); }
// public static com.mojang.serialization.DataResult method_53914(java.lang.String code, ) { return net.minecraft.util.ColorCode.method_53914(code); }
// public java.lang.String asString() { return wrapperContained.asString(); }
// public static java.lang.String asString() { return net.minecraft.util.ColorCode.asString(); }

}