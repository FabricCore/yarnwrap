package yarnwrap.structure.pool;
public class StructurePoolElementType { public net.minecraft.structure.pool.StructurePoolElementType wrapperContained; public StructurePoolElementType(net.minecraft.structure.pool.StructurePoolElementType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.structure.pool.StructurePoolElementType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.structure.pool.StructurePoolElementType(wrapperContained.register(id,codec)); }
// public static yarnwrap.structure.pool.StructurePoolElementType register(java.lang.String id,com.mojang.serialization.MapCodec codec, ) { return new yarnwrap.structure.pool.StructurePoolElementType(net.minecraft.structure.pool.StructurePoolElementType.register(id,codec)); }

}