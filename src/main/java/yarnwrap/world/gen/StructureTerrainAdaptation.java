package yarnwrap.world.gen;
public class StructureTerrainAdaptation { public net.minecraft.world.gen.StructureTerrainAdaptation wrapperContained; public StructureTerrainAdaptation(net.minecraft.world.gen.StructureTerrainAdaptation wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.StructureTerrainAdaptation.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.StructureTerrainAdaptation.CODEC = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.world.gen.StructureTerrainAdaptation.name; }
// public static void name(java.lang.String value, ) { net.minecraft.world.gen.StructureTerrainAdaptation.name = value; }

// public StructureTerrainAdaptation(java.lang.String name) { this.wrapperContained = new net.minecraft.world.gen.StructureTerrainAdaptation(name); }

}