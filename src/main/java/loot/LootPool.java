package yarnwrap.loot;
public class LootPool { public net.minecraft.loot.LootPool wrapperContained; public LootPool(net.minecraft.loot.LootPool wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.util.function.BiFunction javaFunctions() { return wrapperContained.javaFunctions; }
// public java.util.List entries() { return wrapperContained.entries; }
// public java.util.List conditions() { return wrapperContained.conditions; }
// public java.util.function.Predicate predicate() { return wrapperContained.predicate; }
// public java.util.List functions() { return wrapperContained.functions; }
// public yarnwrap.loot.provider.number.LootNumberProvider rolls() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.rolls); }
// public yarnwrap.loot.provider.number.LootNumberProvider bonusRolls() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.bonusRolls); }
public void addGeneratedLoot(java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context) { wrapperContained.addGeneratedLoot(lootConsumer,context.wrapperContained); }
// public void supplyOnce(java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context) { wrapperContained.supplyOnce(lootConsumer,context.wrapperContained); }
public Object builder() { return wrapperContained.builder(); }
public void validate(yarnwrap.loot.LootTableReporter reporter) { wrapperContained.validate(reporter.wrapperContained); }

}