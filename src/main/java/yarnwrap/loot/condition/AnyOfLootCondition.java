package yarnwrap.loot.condition;
public class AnyOfLootCondition { public net.minecraft.loot.condition.AnyOfLootCondition wrapperContained; public AnyOfLootCondition(net.minecraft.loot.condition.AnyOfLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.AnyOfLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.AnyOfLootCondition.CODEC = value; }

// public AnyOfLootCondition(java.util.List terms) { this.wrapperContained = new net.minecraft.loot.condition.AnyOfLootCondition(terms); }
// public Object builder(Object[] terms) { return wrapperContained.builder(terms); }
// public static Object builder(Object[] terms, ) { return net.minecraft.loot.condition.AnyOfLootCondition.builder(terms); }

}