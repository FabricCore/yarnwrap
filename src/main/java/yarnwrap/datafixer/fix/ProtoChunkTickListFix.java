package yarnwrap.datafixer.fix;
public class ProtoChunkTickListFix { public net.minecraft.datafixer.fix.ProtoChunkTickListFix wrapperContained; public ProtoChunkTickListFix(net.minecraft.datafixer.fix.ProtoChunkTickListFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public int CHUNK_EDGE_LENGTH() { return wrapperContained.CHUNK_EDGE_LENGTH; }
// public void CHUNK_EDGE_LENGTH(int value) { wrapperContained.CHUNK_EDGE_LENGTH = value; }
// public static int CHUNK_EDGE_LENGTH() { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.CHUNK_EDGE_LENGTH; }
// public static void CHUNK_EDGE_LENGTH(int value, ) { net.minecraft.datafixer.fix.ProtoChunkTickListFix.CHUNK_EDGE_LENGTH = value; }

// public com.google.common.collect.ImmutableSet ALWAYS_WATERLOGGED_BLOCK_IDS() { return wrapperContained.ALWAYS_WATERLOGGED_BLOCK_IDS; }
// public void ALWAYS_WATERLOGGED_BLOCK_IDS(com.google.common.collect.ImmutableSet value) { wrapperContained.ALWAYS_WATERLOGGED_BLOCK_IDS = value; }
// public static com.google.common.collect.ImmutableSet ALWAYS_WATERLOGGED_BLOCK_IDS() { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.ALWAYS_WATERLOGGED_BLOCK_IDS; }
// public static void ALWAYS_WATERLOGGED_BLOCK_IDS(com.google.common.collect.ImmutableSet value, ) { net.minecraft.datafixer.fix.ProtoChunkTickListFix.ALWAYS_WATERLOGGED_BLOCK_IDS = value; }

public ProtoChunkTickListFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.ProtoChunkTickListFix(outputSchema); }
// public com.mojang.serialization.Dynamic method_39244(byte levelDynamic) { return wrapperContained.method_39244(levelDynamic); }
// public static com.mojang.serialization.Dynamic method_39244(byte levelDynamic, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39244(levelDynamic); }
// public boolean method_39245(int packedLocalPos) { return wrapperContained.method_39245(packedLocalPos); }
// public static boolean method_39245(int packedLocalPos, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39245(packedLocalPos); }
// public com.mojang.datafixers.Typed method_39246(com.mojang.datafixers.OpticFinder chunkTyped) { return wrapperContained.method_39246(chunkTyped); }
// public static com.mojang.datafixers.Typed method_39246(com.mojang.datafixers.OpticFinder chunkTyped, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39246(chunkTyped); }
// public com.mojang.datafixers.Typed method_39247(com.mojang.datafixers.OpticFinder levelTyped) { return wrapperContained.method_39247(levelTyped); }
// public static com.mojang.datafixers.Typed method_39247(com.mojang.datafixers.OpticFinder levelTyped, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39247(levelTyped); }
// public void method_39248(com.mojang.datafixers.OpticFinder sectionsTyped) { wrapperContained.method_39248(sectionsTyped); }
// public static void method_39248(com.mojang.datafixers.OpticFinder sectionsTyped, ) { net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39248(sectionsTyped); }
// public void method_39249(com.mojang.datafixers.OpticFinder sectionTyped) { wrapperContained.method_39249(sectionTyped); }
// public static void method_39249(com.mojang.datafixers.OpticFinder sectionTyped, ) { net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39249(sectionTyped); }
// public java.util.List method_39250(com.mojang.datafixers.Typed paletteTyped) { return wrapperContained.method_39250(paletteTyped); }
// public static java.util.List method_39250(com.mojang.datafixers.Typed paletteTyped, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39250(paletteTyped); }
// public java.lang.String getBlockIdToBeTicked(com.mojang.serialization.Dynamic blockStateDynamic) { return wrapperContained.getBlockIdToBeTicked(blockStateDynamic); }
// public static java.lang.String getBlockIdToBeTicked(com.mojang.serialization.Dynamic blockStateDynamic, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.getBlockIdToBeTicked(blockStateDynamic); }
// public com.mojang.serialization.Dynamic method_39253(com.mojang.serialization.Dynamic levelDynamic) { return wrapperContained.method_39253(levelDynamic); }
// public static com.mojang.serialization.Dynamic method_39253(com.mojang.serialization.Dynamic levelDynamic, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39253(levelDynamic); }
// public com.mojang.serialization.Dynamic fixToBeTicked(com.mojang.serialization.Dynamic levelDynamic,it.unimi.dsi.fastutil.ints.Int2ObjectMap palettedSectionsByY,byte sectionY,int localX,int localZ,java.lang.String key,java.util.function.Function blockIdGetter) { return wrapperContained.fixToBeTicked(levelDynamic,palettedSectionsByY,sectionY,localX,localZ,key,blockIdGetter); }
// public static com.mojang.serialization.Dynamic fixToBeTicked(com.mojang.serialization.Dynamic levelDynamic,it.unimi.dsi.fastutil.ints.Int2ObjectMap palettedSectionsByY,byte sectionY,int localX,int localZ,java.lang.String key,java.util.function.Function blockIdGetter, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.fixToBeTicked(levelDynamic,palettedSectionsByY,sectionY,localX,localZ,key,blockIdGetter); }
// public com.mojang.serialization.Dynamic createTileTickObject(com.mojang.serialization.Dynamic levelDynamic,java.util.function.Supplier sectionSupplier,int sectionX,int sectionY,int sectionZ,int packedLocalPos,java.util.function.Function blockIdGetter) { return wrapperContained.createTileTickObject(levelDynamic,sectionSupplier,sectionX,sectionY,sectionZ,packedLocalPos,blockIdGetter); }
// public static com.mojang.serialization.Dynamic createTileTickObject(com.mojang.serialization.Dynamic levelDynamic,java.util.function.Supplier sectionSupplier,int sectionX,int sectionY,int sectionZ,int packedLocalPos,java.util.function.Function blockIdGetter, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.createTileTickObject(levelDynamic,sectionSupplier,sectionX,sectionY,sectionZ,packedLocalPos,blockIdGetter); }
// public com.mojang.serialization.Dynamic method_39256(com.mojang.serialization.Dynamic packedLocalPos) { return wrapperContained.method_39256(packedLocalPos); }
// public static com.mojang.serialization.Dynamic method_39256(com.mojang.serialization.Dynamic packedLocalPos, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39256(packedLocalPos); }
// public void method_39257(it.unimi.dsi.fastutil.ints.Int2ObjectMap blockStatesTyped) { wrapperContained.method_39257(blockStatesTyped); }
// public static void method_39257(it.unimi.dsi.fastutil.ints.Int2ObjectMap blockStatesTyped, ) { net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39257(blockStatesTyped); }
// public com.mojang.serialization.Dynamic method_39258(byte yDynamic) { return wrapperContained.method_39258(yDynamic); }
// public static com.mojang.serialization.Dynamic method_39258(byte yDynamic, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39258(yDynamic); }
// public java.lang.String getFluidBlockIdToBeTicked(com.mojang.serialization.Dynamic blockStateDynamic) { return wrapperContained.getFluidBlockIdToBeTicked(blockStateDynamic); }
// public static java.lang.String getFluidBlockIdToBeTicked(com.mojang.serialization.Dynamic blockStateDynamic, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.getFluidBlockIdToBeTicked(blockStateDynamic); }
// public com.mojang.serialization.Dynamic method_39260(com.mojang.serialization.Dynamic liquidTicksDynamic) { return wrapperContained.method_39260(liquidTicksDynamic); }
// public static com.mojang.serialization.Dynamic method_39260(com.mojang.serialization.Dynamic liquidTicksDynamic, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39260(liquidTicksDynamic); }
// public int method_39261(com.mojang.serialization.Dynamic posDynamic) { return wrapperContained.method_39261(posDynamic); }
// public static int method_39261(com.mojang.serialization.Dynamic posDynamic, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39261(posDynamic); }
// public java.util.List method_39262(com.mojang.serialization.Dynamic paletteDynamic) { return wrapperContained.method_39262(paletteDynamic); }
// public static java.util.List method_39262(com.mojang.serialization.Dynamic paletteDynamic, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39262(paletteDynamic); }
// public com.mojang.serialization.Dynamic method_39263(com.mojang.serialization.Dynamic levelDynamic) { return wrapperContained.method_39263(levelDynamic); }
// public static com.mojang.serialization.Dynamic method_39263(com.mojang.serialization.Dynamic levelDynamic, ) { return net.minecraft.datafixer.fix.ProtoChunkTickListFix.method_39263(levelDynamic); }

}