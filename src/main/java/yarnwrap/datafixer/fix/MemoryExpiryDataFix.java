package yarnwrap.datafixer.fix;
public class MemoryExpiryDataFix { public net.minecraft.datafixer.fix.MemoryExpiryDataFix wrapperContained; public MemoryExpiryDataFix(net.minecraft.datafixer.fix.MemoryExpiryDataFix wrapperContained) { this.wrapperContained = wrapperContained; }

public MemoryExpiryDataFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String choiceName) { this.wrapperContained = new net.minecraft.datafixer.fix.MemoryExpiryDataFix(outputSchema,choiceName); }
public com.mojang.serialization.Dynamic updateBrain(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.updateBrain(entityDynamic); }
// public static com.mojang.serialization.Dynamic updateBrain(com.mojang.serialization.Dynamic entityDynamic, ) { return net.minecraft.datafixer.fix.MemoryExpiryDataFix.updateBrain(entityDynamic); }
// public com.mojang.datafixers.util.Pair updateMemoryMapValues(com.mojang.datafixers.util.Pair memoryKv) { return wrapperContained.updateMemoryMapValues(memoryKv); }
// public static com.mojang.datafixers.util.Pair updateMemoryMapValues(com.mojang.datafixers.util.Pair memoryKv, ) { return net.minecraft.datafixer.fix.MemoryExpiryDataFix.updateMemoryMapValues(memoryKv); }
// public com.mojang.serialization.Dynamic updateMemories(com.mojang.serialization.Dynamic brainDynamic) { return wrapperContained.updateMemories(brainDynamic); }
// public static com.mojang.serialization.Dynamic updateMemories(com.mojang.serialization.Dynamic brainDynamic, ) { return net.minecraft.datafixer.fix.MemoryExpiryDataFix.updateMemories(brainDynamic); }
// public com.mojang.serialization.Dynamic updateMemoryMap(com.mojang.serialization.Dynamic memoriesDynamic) { return wrapperContained.updateMemoryMap(memoriesDynamic); }
// public static com.mojang.serialization.Dynamic updateMemoryMap(com.mojang.serialization.Dynamic memoriesDynamic, ) { return net.minecraft.datafixer.fix.MemoryExpiryDataFix.updateMemoryMap(memoriesDynamic); }
// public com.mojang.serialization.Dynamic updateMemoryMapValueEntry(com.mojang.serialization.Dynamic memoryValue) { return wrapperContained.updateMemoryMapValueEntry(memoryValue); }
// public static com.mojang.serialization.Dynamic updateMemoryMapValueEntry(com.mojang.serialization.Dynamic memoryValue, ) { return net.minecraft.datafixer.fix.MemoryExpiryDataFix.updateMemoryMapValueEntry(memoryValue); }

}