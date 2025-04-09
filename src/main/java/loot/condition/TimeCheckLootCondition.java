package yarnwrap.loot.condition;
public class TimeCheckLootCondition { public net.minecraft.loot.condition.TimeCheckLootCondition wrapperContained; public TimeCheckLootCondition(net.minecraft.loot.condition.TimeCheckLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object create(yarnwrap.loot.operator.BoundedIntUnaryOperator value) { return wrapperContained.create(value.wrapperContained); }

}