package yarnwrap.entity.ai.brain;
public class MemoryQueryResult { public net.minecraft.entity.ai.brain.MemoryQueryResult wrapperContained; public MemoryQueryResult(net.minecraft.entity.ai.brain.MemoryQueryResult wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.Brain brain() { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.brain); }
// public void brain(yarnwrap.entity.ai.brain.Brain value) { wrapperContained.brain = value.wrapperContained; }
// public static yarnwrap.entity.ai.brain.Brain brain() { return new yarnwrap.entity.ai.brain.Brain(net.minecraft.entity.ai.brain.MemoryQueryResult.brain); }
// public static void brain(yarnwrap.entity.ai.brain.Brain value, ) { net.minecraft.entity.ai.brain.MemoryQueryResult.brain = value.wrapperContained; }

// public yarnwrap.entity.ai.brain.MemoryModuleType memory() { return new yarnwrap.entity.ai.brain.MemoryModuleType(wrapperContained.memory); }
// public void memory(yarnwrap.entity.ai.brain.MemoryModuleType value) { wrapperContained.memory = value.wrapperContained; }
// public static yarnwrap.entity.ai.brain.MemoryModuleType memory() { return new yarnwrap.entity.ai.brain.MemoryModuleType(net.minecraft.entity.ai.brain.MemoryQueryResult.memory); }
// public static void memory(yarnwrap.entity.ai.brain.MemoryModuleType value, ) { net.minecraft.entity.ai.brain.MemoryQueryResult.memory = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App value() { return wrapperContained.value; }
// public void value(com.mojang.datafixers.kinds.App value) { wrapperContained.value = value; }
// public static com.mojang.datafixers.kinds.App value() { return net.minecraft.entity.ai.brain.MemoryQueryResult.value; }
// public static void value(com.mojang.datafixers.kinds.App value, ) { net.minecraft.entity.ai.brain.MemoryQueryResult.value = value; }

public MemoryQueryResult(yarnwrap.entity.ai.brain.Brain brain,yarnwrap.entity.ai.brain.MemoryModuleType memory,com.mojang.datafixers.kinds.App value) { this.wrapperContained = new net.minecraft.entity.ai.brain.MemoryQueryResult(brain.wrapperContained,memory.wrapperContained,value); }
public com.mojang.datafixers.kinds.App getValue() { return wrapperContained.getValue(); }
// public static com.mojang.datafixers.kinds.App getValue() { return net.minecraft.entity.ai.brain.MemoryQueryResult.getValue(); }
public void remember(java.lang.Object value) { wrapperContained.remember(value); }
// public static void remember(java.lang.Object value, ) { net.minecraft.entity.ai.brain.MemoryQueryResult.remember(value); }
public void remember(java.lang.Object value,long expiry) { wrapperContained.remember(value,expiry); }
// public static void remember(java.lang.Object value,long expiry, ) { net.minecraft.entity.ai.brain.MemoryQueryResult.remember(value,expiry); }
public void remember(java.util.Optional value) { wrapperContained.remember(value); }
// public static void remember(java.util.Optional value, ) { net.minecraft.entity.ai.brain.MemoryQueryResult.remember(value); }
public void forget() { wrapperContained.forget(); }
// public static void forget() { net.minecraft.entity.ai.brain.MemoryQueryResult.forget(); }

}