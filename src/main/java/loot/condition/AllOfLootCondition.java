package yarnwrap.loot.condition;
public class AllOfLootCondition { public net.minecraft.loot.condition.AllOfLootCondition wrapperContained; public AllOfLootCondition(net.minecraft.loot.condition.AllOfLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec INLINE_CODEC() { return wrapperContained.INLINE_CODEC; }
// public Object builder(Object[] terms) { return wrapperContained.builder(terms); }
public yarnwrap.loot.condition.AllOfLootCondition create(java.util.List terms) { return new yarnwrap.loot.condition.AllOfLootCondition(wrapperContained.create(terms)); }

}