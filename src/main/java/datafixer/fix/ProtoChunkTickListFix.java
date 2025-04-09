package yarnwrap.datafixer.fix;
public class ProtoChunkTickListFix { public net.minecraft.datafixer.fix.ProtoChunkTickListFix wrapperContained; public ProtoChunkTickListFix(net.minecraft.datafixer.fix.ProtoChunkTickListFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public int CHUNK_EDGE_LENGTH() { return wrapperContained.CHUNK_EDGE_LENGTH; }
// public com.google.common.collect.ImmutableSet ALWAYS_WATERLOGGED_BLOCK_IDS() { return wrapperContained.ALWAYS_WATERLOGGED_BLOCK_IDS; }
// public java.lang.String getBlockIdToBeTicked(com.mojang.serialization.Dynamic blockStateDynamic) { return wrapperContained.getBlockIdToBeTicked(blockStateDynamic); }
// public com.mojang.serialization.Dynamic fixToBeTicked(com.mojang.serialization.Dynamic levelDynamic,it.unimi.dsi.fastutil.ints.Int2ObjectMap palettedSectionsByY,byte sectionY,int localX,int localZ,java.lang.String key,java.util.function.Function blockIdGetter) { return wrapperContained.fixToBeTicked(levelDynamic,palettedSectionsByY,sectionY,localX,localZ,key,blockIdGetter); }
// public com.mojang.serialization.Dynamic createTileTickObject(com.mojang.serialization.Dynamic levelDynamic,java.util.function.Supplier sectionSupplier,int sectionX,int sectionY,int sectionZ,int packedLocalPos,java.util.function.Function blockIdGetter) { return wrapperContained.createTileTickObject(levelDynamic,sectionSupplier,sectionX,sectionY,sectionZ,packedLocalPos,blockIdGetter); }
// public java.lang.String getFluidBlockIdToBeTicked(com.mojang.serialization.Dynamic blockStateDynamic) { return wrapperContained.getFluidBlockIdToBeTicked(blockStateDynamic); }

}