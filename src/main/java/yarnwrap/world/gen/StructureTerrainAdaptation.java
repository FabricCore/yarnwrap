package yarnwrap.world.gen;
public class StructureTerrainAdaptation { public net.minecraft.world.gen.StructureTerrainAdaptation wrapperContained; public StructureTerrainAdaptation(net.minecraft.world.gen.StructureTerrainAdaptation wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }

}