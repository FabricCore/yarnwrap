package yarnwrap.world.gen.structure;
public class JungleTempleStructure { public net.minecraft.world.gen.structure.JungleTempleStructure wrapperContained; public JungleTempleStructure(net.minecraft.world.gen.structure.JungleTempleStructure wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}