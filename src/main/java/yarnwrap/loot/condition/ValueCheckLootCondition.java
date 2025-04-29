package yarnwrap.loot.condition;
public class ValueCheckLootCondition { public net.minecraft.loot.condition.ValueCheckLootCondition wrapperContained; public ValueCheckLootCondition(net.minecraft.loot.condition.ValueCheckLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider value() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.value); }
// public void value(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.value = value.wrapperContained; }
// public static yarnwrap.loot.provider.number.LootNumberProvider value() { return new yarnwrap.loot.provider.number.LootNumberProvider(net.minecraft.loot.condition.ValueCheckLootCondition.value); }
// public static void value(yarnwrap.loot.provider.number.LootNumberProvider value, ) { net.minecraft.loot.condition.ValueCheckLootCondition.value = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.ValueCheckLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.ValueCheckLootCondition.CODEC = value; }

public ValueCheckLootCondition(yarnwrap.loot.provider.number.LootNumberProvider value,yarnwrap.loot.operator.BoundedIntUnaryOperator range) { this.wrapperContained = new net.minecraft.loot.condition.ValueCheckLootCondition(value.wrapperContained,range.wrapperContained); }
// public yarnwrap.loot.provider.number.LootNumberProvider value() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.value()); }
// // public static yarnwrap.loot.provider.number.LootNumberProvider value() { return new yarnwrap.loot.provider.number.LootNumberProvider(net.minecraft.loot.condition.ValueCheckLootCondition.value()); }
// public Object builder(yarnwrap.loot.provider.number.LootNumberProvider value,yarnwrap.loot.operator.BoundedIntUnaryOperator range) { return wrapperContained.builder(value.wrapperContained,range.wrapperContained); }
// public static Object builder(yarnwrap.loot.provider.number.LootNumberProvider value,yarnwrap.loot.operator.BoundedIntUnaryOperator range, ) { return net.minecraft.loot.condition.ValueCheckLootCondition.builder(value.wrapperContained,range.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53428(Object instance) { return wrapperContained.method_53428(instance); }
// public static com.mojang.datafixers.kinds.App method_53428(Object instance, ) { return net.minecraft.loot.condition.ValueCheckLootCondition.method_53428(instance); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.loot.condition.ValueCheckLootCondition.test(context); }

}