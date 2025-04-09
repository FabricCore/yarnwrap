package yarnwrap.entity.ai.brain;
public class MemoryQueryResult { public net.minecraft.entity.ai.brain.MemoryQueryResult wrapperContained; public MemoryQueryResult(net.minecraft.entity.ai.brain.MemoryQueryResult wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.Brain brain() { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.brain); }
// public yarnwrap.entity.ai.brain.MemoryModuleType memory() { return new yarnwrap.entity.ai.brain.MemoryModuleType(wrapperContained.memory); }
// public com.mojang.datafixers.kinds.App value() { return wrapperContained.value; }
public com.mojang.datafixers.kinds.App getValue() { return wrapperContained.getValue(); }
public void remember(java.lang.Object value) { wrapperContained.remember(value); }
public void remember(java.lang.Object value,long expiry) { wrapperContained.remember(value,expiry); }
public void remember(java.util.Optional value) { wrapperContained.remember(value); }
public void forget() { wrapperContained.forget(); }

}