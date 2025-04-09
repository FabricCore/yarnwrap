package yarnwrap.datafixer.fix;
public class MemoryExpiryDataFix { public net.minecraft.datafixer.fix.MemoryExpiryDataFix wrapperContained; public MemoryExpiryDataFix(net.minecraft.datafixer.fix.MemoryExpiryDataFix wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Dynamic updateBrain(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.updateBrain(entityDynamic); }
// public com.mojang.datafixers.util.Pair updateMemoryMapValues(com.mojang.datafixers.util.Pair memoryKv) { return wrapperContained.updateMemoryMapValues(memoryKv); }
// public com.mojang.serialization.Dynamic updateMemories(com.mojang.serialization.Dynamic brainDynamic) { return wrapperContained.updateMemories(brainDynamic); }
// public com.mojang.serialization.Dynamic updateMemoryMap(com.mojang.serialization.Dynamic memoriesDynamic) { return wrapperContained.updateMemoryMap(memoriesDynamic); }
// public com.mojang.serialization.Dynamic updateMemoryMapValueEntry(com.mojang.serialization.Dynamic memoryValue) { return wrapperContained.updateMemoryMapValueEntry(memoryValue); }

}