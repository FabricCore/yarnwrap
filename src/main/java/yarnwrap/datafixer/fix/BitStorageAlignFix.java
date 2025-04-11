package yarnwrap.datafixer.fix;
public class BitStorageAlignFix { public net.minecraft.datafixer.fix.BitStorageAlignFix wrapperContained; public BitStorageAlignFix(net.minecraft.datafixer.fix.BitStorageAlignFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ELEMENT_BIT_SHIFT() { return wrapperContained.ELEMENT_BIT_SHIFT; }
// public void ELEMENT_BIT_SHIFT(int value) { wrapperContained.ELEMENT_BIT_SHIFT = value; }
// public int CHUNK_WIDTH() { return wrapperContained.CHUNK_WIDTH; }
// public void CHUNK_WIDTH(int value) { wrapperContained.CHUNK_WIDTH = value; }
// public int CHUNK_LENGTH() { return wrapperContained.CHUNK_LENGTH; }
// public void CHUNK_LENGTH(int value) { wrapperContained.CHUNK_LENGTH = value; }
// public int MAX_BLOCK_STATE_ID() { return wrapperContained.MAX_BLOCK_STATE_ID; }
// public void MAX_BLOCK_STATE_ID(int value) { wrapperContained.MAX_BLOCK_STATE_ID = value; }
// public int HEIGHT_VALUE_BITS() { return wrapperContained.HEIGHT_VALUE_BITS; }
// public void HEIGHT_VALUE_BITS(int value) { wrapperContained.HEIGHT_VALUE_BITS = value; }
// public int MAX_HEIGHT_VALUE() { return wrapperContained.MAX_HEIGHT_VALUE; }
// public void MAX_HEIGHT_VALUE(int value) { wrapperContained.MAX_HEIGHT_VALUE = value; }
public BitStorageAlignFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.BitStorageAlignFix(outputSchema); }
// public long[] resizePackedIntArray(int maxValue,int elementBits,long elements) { return wrapperContained.resizePackedIntArray(maxValue,elementBits,elements); }
// public com.mojang.datafixers.Typed method_27292(com.mojang.datafixers.OpticFinder chunk) { return wrapperContained.method_27292(chunk); }
// public com.mojang.datafixers.Typed method_27293(com.mojang.datafixers.OpticFinder level) { return wrapperContained.method_27293(level); }
// public com.mojang.datafixers.Typed method_27294(com.mojang.datafixers.OpticFinder levelSection) { return wrapperContained.method_27294(levelSection); }
// public com.mojang.datafixers.Typed method_27295(com.mojang.datafixers.OpticFinder section) { return wrapperContained.method_27295(section); }
// public java.lang.Integer method_27296(java.util.List palette) { return wrapperContained.method_27296(palette); }
// public com.mojang.serialization.Dynamic method_27769(com.mojang.serialization.Dynamic levelDynamic) { return wrapperContained.method_27769(levelDynamic); }
// public com.mojang.serialization.Dynamic fixBitStorageArray(com.mojang.serialization.Dynamic sectionDynamic,com.mojang.serialization.Dynamic statesDynamic,int maxValue,int elementBits) { return wrapperContained.fixBitStorageArray(sectionDynamic,statesDynamic,maxValue,elementBits); }
// public com.mojang.datafixers.util.Pair method_27773(com.mojang.serialization.Dynamic heightmap) { return wrapperContained.method_27773(heightmap); }
// public com.mojang.datafixers.Typed fixLevel(com.mojang.datafixers.OpticFinder levelSectionsFinder,com.mojang.datafixers.OpticFinder sectionFinder,com.mojang.datafixers.OpticFinder paletteFinder,com.mojang.datafixers.Typed level) { return wrapperContained.fixLevel(levelSectionsFinder,sectionFinder,paletteFinder,level); }
// public com.mojang.datafixers.Typed fixHeightmaps(com.mojang.datafixers.Typed fixedLevel) { return wrapperContained.fixHeightmaps(fixedLevel); }
// public com.mojang.serialization.Dynamic method_28172(int sectionDynamic) { return wrapperContained.method_28172(sectionDynamic); }
// public com.mojang.serialization.Dynamic method_28173(com.mojang.serialization.Dynamic statesDynamic) { return wrapperContained.method_28173(statesDynamic); }
// public com.mojang.serialization.Dynamic method_28174(com.mojang.serialization.Dynamic heightmapsDynamic) { return wrapperContained.method_28174(heightmapsDynamic); }
// public com.mojang.serialization.Dynamic method_28175(com.mojang.serialization.Dynamic heightmapDynamic) { return wrapperContained.method_28175(heightmapDynamic); }

}