package yarnwrap.world.gen;
public class FlatLevelGeneratorPreset { public net.minecraft.world.gen.FlatLevelGeneratorPreset wrapperContained; public FlatLevelGeneratorPreset(net.minecraft.world.gen.FlatLevelGeneratorPreset wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }

}