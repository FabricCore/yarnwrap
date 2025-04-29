package yarnwrap.world.gen.structure;
public class JungleTempleStructure { public net.minecraft.world.gen.structure.JungleTempleStructure wrapperContained; public JungleTempleStructure(net.minecraft.world.gen.structure.JungleTempleStructure wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.structure.JungleTempleStructure.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.structure.JungleTempleStructure.CODEC = value; }


}