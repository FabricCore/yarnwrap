package yarnwrap.loot.condition;
public class AllOfLootCondition { public net.minecraft.loot.condition.AllOfLootCondition wrapperContained; public AllOfLootCondition(net.minecraft.loot.condition.AllOfLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.AllOfLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.AllOfLootCondition.CODEC = value; }

// public com.mojang.serialization.Codec INLINE_CODEC() { return wrapperContained.INLINE_CODEC; }
// public void INLINE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.INLINE_CODEC = value; }
public static com.mojang.serialization.Codec INLINE_CODEC() { return net.minecraft.loot.condition.AllOfLootCondition.INLINE_CODEC; }
// public static void INLINE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.condition.AllOfLootCondition.INLINE_CODEC = value; }

// public AllOfLootCondition(java.util.List terms) { this.wrapperContained = new net.minecraft.loot.condition.AllOfLootCondition(terms); }
// public Object builder(Object[] terms) { return wrapperContained.builder(terms); }
// public static Object builder(Object[] terms, ) { return net.minecraft.loot.condition.AllOfLootCondition.builder(terms); }
// public yarnwrap.loot.condition.AllOfLootCondition create(java.util.List terms) { return new yarnwrap.loot.condition.AllOfLootCondition(wrapperContained.create(terms)); }
// public static yarnwrap.loot.condition.AllOfLootCondition create(java.util.List terms, ) { return new yarnwrap.loot.condition.AllOfLootCondition(net.minecraft.loot.condition.AllOfLootCondition.create(terms)); }

}