package yarnwrap.world.gen.chunk.placement;
public class StructurePlacementType { public net.minecraft.world.gen.chunk.placement.StructurePlacementType wrapperContained; public StructurePlacementType(net.minecraft.world.gen.chunk.placement.StructurePlacementType wrapperContained) { this.wrapperContained = wrapperContained; }

// // public yarnwrap.world.gen.chunk.placement.StructurePlacementType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.world.gen.chunk.placement.StructurePlacementType(wrapperContained.register(id,codec)); }
// public static yarnwrap.world.gen.chunk.placement.StructurePlacementType register(java.lang.String id,com.mojang.serialization.MapCodec codec, ) { return new yarnwrap.world.gen.chunk.placement.StructurePlacementType(net.minecraft.world.gen.chunk.placement.StructurePlacementType.register(id,codec)); }

}