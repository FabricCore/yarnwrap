package yarnwrap.entity.ai.brain;
public class MemoryQuery { public net.minecraft.entity.ai.brain.MemoryQuery wrapperContained; public MemoryQuery(net.minecraft.entity.ai.brain.MemoryQuery wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.MemoryQueryResult toQueryResult(yarnwrap.entity.ai.brain.Brain brain,java.util.Optional value) { return new yarnwrap.entity.ai.brain.MemoryQueryResult(wrapperContained.toQueryResult(brain.wrapperContained,value)); }
// public static yarnwrap.entity.ai.brain.MemoryQueryResult toQueryResult(yarnwrap.entity.ai.brain.Brain brain,java.util.Optional value, ) { return new yarnwrap.entity.ai.brain.MemoryQueryResult(net.minecraft.entity.ai.brain.MemoryQuery.toQueryResult(brain.wrapperContained,value)); }
public yarnwrap.entity.ai.brain.MemoryModuleState getState() { return new yarnwrap.entity.ai.brain.MemoryModuleState(wrapperContained.getState()); }
// public static yarnwrap.entity.ai.brain.MemoryModuleState getState() { return new yarnwrap.entity.ai.brain.MemoryModuleState(net.minecraft.entity.ai.brain.MemoryQuery.getState()); }

}