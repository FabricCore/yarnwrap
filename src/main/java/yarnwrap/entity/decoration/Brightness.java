package yarnwrap.entity.decoration;
public class Brightness { public net.minecraft.entity.decoration.Brightness wrapperContained; public Brightness(net.minecraft.entity.decoration.Brightness wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec LIGHT_LEVEL_CODEC() { return wrapperContained.LIGHT_LEVEL_CODEC; }
// public void LIGHT_LEVEL_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LIGHT_LEVEL_CODEC = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.entity.decoration.Brightness FULL() { return new yarnwrap.entity.decoration.Brightness(wrapperContained.FULL); }
public void FULL(yarnwrap.entity.decoration.Brightness value) { wrapperContained.FULL = value.wrapperContained; }
public int pack() { return wrapperContained.pack(); }
public yarnwrap.entity.decoration.Brightness unpack(int packed) { return new yarnwrap.entity.decoration.Brightness(wrapperContained.unpack(packed)); }
// public com.mojang.datafixers.kinds.App method_48765(Object instance) { return wrapperContained.method_48765(instance); }

}