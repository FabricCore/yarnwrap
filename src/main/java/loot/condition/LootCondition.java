package yarnwrap.loot.condition;
public class LootCondition { public net.minecraft.loot.condition.LootCondition wrapperContained; public LootCondition(net.minecraft.loot.condition.LootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
public yarnwrap.loot.condition.LootConditionType getType() { return new yarnwrap.loot.condition.LootConditionType(wrapperContained.getType()); }

}