package yarnwrap.world.gen.structure;
public class StructureType { public net.minecraft.world.gen.structure.StructureType wrapperContained; public StructureType(net.minecraft.world.gen.structure.StructureType wrapperContained) { this.wrapperContained = wrapperContained; }

// // public yarnwrap.world.gen.structure.StructureType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.world.gen.structure.StructureType(wrapperContained.register(id,codec)); }

}