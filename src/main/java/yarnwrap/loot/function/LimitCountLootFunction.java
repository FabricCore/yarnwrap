package yarnwrap.loot.function;
public class LimitCountLootFunction { public net.minecraft.loot.function.LimitCountLootFunction wrapperContained; public LimitCountLootFunction(net.minecraft.loot.function.LimitCountLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.operator.BoundedIntUnaryOperator limit() { return new yarnwrap.loot.operator.BoundedIntUnaryOperator(wrapperContained.limit); }
// public void limit(yarnwrap.loot.operator.BoundedIntUnaryOperator value) { wrapperContained.limit = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object builder(yarnwrap.loot.operator.BoundedIntUnaryOperator limit) { return wrapperContained.builder(limit.wrapperContained); }

}