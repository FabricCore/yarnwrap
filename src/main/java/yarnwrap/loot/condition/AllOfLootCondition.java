package yarnwrap.loot.condition;
public class AllOfLootCondition { public net.minecraft.loot.condition.AllOfLootCondition wrapperContained; public AllOfLootCondition(net.minecraft.loot.condition.AllOfLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec INLINE_CODEC() { return wrapperContained.INLINE_CODEC; }
// public void INLINE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.INLINE_CODEC = value; }
// public Object builder(Object[] terms) { return wrapperContained.builder(terms); }
public yarnwrap.loot.condition.AllOfLootCondition create(java.util.List terms) { return new yarnwrap.loot.condition.AllOfLootCondition(wrapperContained.create(terms)); }

}