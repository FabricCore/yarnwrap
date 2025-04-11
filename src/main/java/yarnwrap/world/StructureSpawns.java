package yarnwrap.world;
public class StructureSpawns { public net.minecraft.world.StructureSpawns wrapperContained; public StructureSpawns(net.minecraft.world.StructureSpawns wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}