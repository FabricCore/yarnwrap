package yarnwrap.entity.decoration;
public class Brightness { public net.minecraft.entity.decoration.Brightness wrapperContained; public Brightness(net.minecraft.entity.decoration.Brightness wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec LIGHT_LEVEL_CODEC() { return wrapperContained.LIGHT_LEVEL_CODEC; }
// public void LIGHT_LEVEL_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LIGHT_LEVEL_CODEC = value; }
public static com.mojang.serialization.Codec LIGHT_LEVEL_CODEC() { return net.minecraft.entity.decoration.Brightness.LIGHT_LEVEL_CODEC; }
// public static void LIGHT_LEVEL_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.decoration.Brightness.LIGHT_LEVEL_CODEC = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.decoration.Brightness.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.decoration.Brightness.CODEC = value; }

// public yarnwrap.entity.decoration.Brightness FULL() { return new yarnwrap.entity.decoration.Brightness(wrapperContained.FULL); }
// public void FULL(yarnwrap.entity.decoration.Brightness value) { wrapperContained.FULL = value.wrapperContained; }
public static yarnwrap.entity.decoration.Brightness FULL() { return new yarnwrap.entity.decoration.Brightness(net.minecraft.entity.decoration.Brightness.FULL); }
// public static void FULL(yarnwrap.entity.decoration.Brightness value, ) { net.minecraft.entity.decoration.Brightness.FULL = value.wrapperContained; }

public int pack() { return wrapperContained.pack(); }
// public static int pack() { return net.minecraft.entity.decoration.Brightness.pack(); }
// public yarnwrap.entity.decoration.Brightness unpack(int packed) { return new yarnwrap.entity.decoration.Brightness(wrapperContained.unpack(packed)); }
// public static yarnwrap.entity.decoration.Brightness unpack(int packed, ) { return new yarnwrap.entity.decoration.Brightness(net.minecraft.entity.decoration.Brightness.unpack(packed)); }
// public com.mojang.datafixers.kinds.App method_48765(Object instance) { return wrapperContained.method_48765(instance); }
// public static com.mojang.datafixers.kinds.App method_48765(Object instance, ) { return net.minecraft.entity.decoration.Brightness.method_48765(instance); }
// public int unpackBlock(int packed) { return wrapperContained.unpackBlock(packed); }
// public static int unpackBlock(int packed, ) { return net.minecraft.entity.decoration.Brightness.unpackBlock(packed); }
// public int pack(int block,int sky) { return wrapperContained.pack(block,sky); }
// public static int pack(int block,int sky, ) { return net.minecraft.entity.decoration.Brightness.pack(block,sky); }
// public int unpackSky(int packed) { return wrapperContained.unpackSky(packed); }
// public static int unpackSky(int packed, ) { return net.minecraft.entity.decoration.Brightness.unpackSky(packed); }

}