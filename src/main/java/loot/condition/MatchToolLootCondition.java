package yarnwrap.loot.condition;
public class MatchToolLootCondition { public net.minecraft.loot.condition.MatchToolLootCondition wrapperContained; public MatchToolLootCondition(net.minecraft.loot.condition.MatchToolLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object builder(Object predicate) { return wrapperContained.builder(predicate); }

}