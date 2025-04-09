package yarnwrap.loot.condition;
public class KilledByPlayerLootCondition { public net.minecraft.loot.condition.KilledByPlayerLootCondition wrapperContained; public KilledByPlayerLootCondition(net.minecraft.loot.condition.KilledByPlayerLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.condition.KilledByPlayerLootCondition INSTANCE() { return new yarnwrap.loot.condition.KilledByPlayerLootCondition(wrapperContained.INSTANCE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object builder() { return wrapperContained.builder(); }

}