package yarnwrap.loot.condition;
public class LootConditionTypes { public net.minecraft.loot.condition.LootConditionTypes wrapperContained; public LootConditionTypes(net.minecraft.loot.condition.LootConditionTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.condition.LootConditionType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.loot.condition.LootConditionType(wrapperContained.register(id,codec)); }
// public static yarnwrap.loot.condition.LootConditionType register(java.lang.String id,com.mojang.serialization.MapCodec codec, ) { return new yarnwrap.loot.condition.LootConditionType(net.minecraft.loot.condition.LootConditionTypes.register(id,codec)); }

}