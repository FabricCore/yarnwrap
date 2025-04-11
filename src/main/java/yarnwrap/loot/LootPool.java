package yarnwrap.loot;
public class LootPool { public net.minecraft.loot.LootPool wrapperContained; public LootPool(net.minecraft.loot.LootPool wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.util.function.BiFunction javaFunctions() { return wrapperContained.javaFunctions; }
// public void javaFunctions(java.util.function.BiFunction value) { wrapperContained.javaFunctions = value; }
// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public java.util.List conditions() { return wrapperContained.conditions; }
// public void conditions(java.util.List value) { wrapperContained.conditions = value; }
// public java.util.function.Predicate predicate() { return wrapperContained.predicate; }
// public void predicate(java.util.function.Predicate value) { wrapperContained.predicate = value; }
// public java.util.List functions() { return wrapperContained.functions; }
// public void functions(java.util.List value) { wrapperContained.functions = value; }
// public yarnwrap.loot.provider.number.LootNumberProvider rolls() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.rolls); }
// public void rolls(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.rolls = value.wrapperContained; }
// public yarnwrap.loot.provider.number.LootNumberProvider bonusRolls() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.bonusRolls); }
// public void bonusRolls(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.bonusRolls = value.wrapperContained; }
public void addGeneratedLoot(java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context) { wrapperContained.addGeneratedLoot(lootConsumer,context.wrapperContained); }
// public void supplyOnce(java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context) { wrapperContained.supplyOnce(lootConsumer,context.wrapperContained); }
public Object builder() { return wrapperContained.builder(); }
public void validate(yarnwrap.loot.LootTableReporter reporter) { wrapperContained.validate(reporter.wrapperContained); }

}