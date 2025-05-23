package yarnwrap.entity.spawn;
public class SpawnConditionSelectors { public net.minecraft.entity.spawn.SpawnConditionSelectors wrapperContained; public SpawnConditionSelectors(net.minecraft.entity.spawn.SpawnConditionSelectors wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.spawn.SpawnConditionSelectors EMPTY() { return new yarnwrap.entity.spawn.SpawnConditionSelectors(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.entity.spawn.SpawnConditionSelectors value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.entity.spawn.SpawnConditionSelectors EMPTY() { return new yarnwrap.entity.spawn.SpawnConditionSelectors(net.minecraft.entity.spawn.SpawnConditionSelectors.EMPTY); }
// public static void EMPTY(yarnwrap.entity.spawn.SpawnConditionSelectors value, ) { net.minecraft.entity.spawn.SpawnConditionSelectors.EMPTY = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.spawn.SpawnConditionSelectors.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.spawn.SpawnConditionSelectors.CODEC = value; }

// public yarnwrap.entity.spawn.SpawnConditionSelectors createFallback(int priority) { return new yarnwrap.entity.spawn.SpawnConditionSelectors(wrapperContained.createFallback(priority)); }
// public static yarnwrap.entity.spawn.SpawnConditionSelectors createFallback(int priority, ) { return new yarnwrap.entity.spawn.SpawnConditionSelectors(net.minecraft.entity.spawn.SpawnConditionSelectors.createFallback(priority)); }
// public yarnwrap.entity.spawn.SpawnConditionSelectors createSingle(yarnwrap.entity.spawn.SpawnCondition condition,int priority) { return new yarnwrap.entity.spawn.SpawnConditionSelectors(wrapperContained.createSingle(condition.wrapperContained,priority)); }
// public static yarnwrap.entity.spawn.SpawnConditionSelectors createSingle(yarnwrap.entity.spawn.SpawnCondition condition,int priority, ) { return new yarnwrap.entity.spawn.SpawnConditionSelectors(net.minecraft.entity.spawn.SpawnConditionSelectors.createSingle(condition.wrapperContained,priority)); }

}