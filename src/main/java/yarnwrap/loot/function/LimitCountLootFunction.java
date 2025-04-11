package yarnwrap.loot.function;
public class LimitCountLootFunction { public net.minecraft.loot.function.LimitCountLootFunction wrapperContained; public LimitCountLootFunction(net.minecraft.loot.function.LimitCountLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.operator.BoundedIntUnaryOperator limit() { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.limit); }
// public void limit(yarnwrap.loot.operator.BoundedIntUnaryOperator value) { wrapperContained.limit = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public LimitCountLootFunction(java.util.List conditions,yarnwrap.loot.operator.BoundedIntUnaryOperator limit) { this.wrapperContained = new net.minecraft.loot.function.LimitCountLootFunction(conditions,limit.wrapperContained); }
public Object builder(yarnwrap.loot.operator.BoundedIntUnaryOperator limit) { return wrapperContained.builder(limit.wrapperContained); }
// public yarnwrap.loot.function.LootFunction method_508(yarnwrap.loot.operator.BoundedIntUnaryOperator conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_508(conditions.wrapperContained)); }
// public yarnwrap.loot.operator.BoundedIntUnaryOperator method_53342(yarnwrap.loot.function.LimitCountLootFunction function) { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.method_53342(function.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_53343(Object instance) { return wrapperContained.method_53343(instance); }

}