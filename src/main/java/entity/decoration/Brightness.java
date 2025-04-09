package yarnwrap.entity.decoration;
public class Brightness { public net.minecraft.entity.decoration.Brightness wrapperContained; public Brightness(net.minecraft.entity.decoration.Brightness wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec LIGHT_LEVEL_CODEC() { return wrapperContained.LIGHT_LEVEL_CODEC; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.entity.decoration.Brightness FULL() { return new yarnwrap.entity.decoration.Brightness(wrapperContained.FULL); }
public int pack() { return wrapperContained.pack(); }
public yarnwrap.entity.decoration.Brightness unpack(int packed) { return new yarnwrap.entity.decoration.Brightness(wrapperContained.unpack(packed)); }

}