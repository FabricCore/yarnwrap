package yarnwrap.world.gen;
public class StructureTerrainAdaptation { public net.minecraft.world.gen.StructureTerrainAdaptation wrapperContained; public StructureTerrainAdaptation(net.minecraft.world.gen.StructureTerrainAdaptation wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.lang.String name() { return wrapperContained.name; }

}