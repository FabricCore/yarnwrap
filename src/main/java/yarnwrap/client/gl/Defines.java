package yarnwrap.client.gl;
public class Defines { public net.minecraft.client.gl.Defines wrapperContained; public Defines(net.minecraft.client.gl.Defines wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gl.Defines EMPTY() { return new yarnwrap.client.gl.Defines(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.gl.Defines value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.client.gl.Defines EMPTY() { return new yarnwrap.client.gl.Defines(net.minecraft.client.gl.Defines.EMPTY); }
// public static void EMPTY(yarnwrap.client.gl.Defines value, ) { net.minecraft.client.gl.Defines.EMPTY = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.gl.Defines.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.gl.Defines.CODEC = value; }

// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.client.gl.Defines.builder(); }
// public com.mojang.datafixers.kinds.App method_62927(Object instance) { return wrapperContained.method_62927(instance); }
// public static com.mojang.datafixers.kinds.App method_62927(Object instance, ) { return net.minecraft.client.gl.Defines.method_62927(instance); }
public yarnwrap.client.gl.Defines withMerged(yarnwrap.client.gl.Defines other) { return new yarnwrap.client.gl.Defines(wrapperContained.withMerged(other.wrapperContained)); }
// public static yarnwrap.client.gl.Defines withMerged(yarnwrap.client.gl.Defines other, ) { return new yarnwrap.client.gl.Defines(net.minecraft.client.gl.Defines.withMerged(other.wrapperContained)); }
public java.lang.String toSource() { return wrapperContained.toSource(); }
// public static java.lang.String toSource() { return net.minecraft.client.gl.Defines.toSource(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.client.gl.Defines.isEmpty(); }

}