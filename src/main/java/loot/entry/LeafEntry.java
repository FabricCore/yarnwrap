package yarnwrap.loot.entry;
public class LeafEntry { public net.minecraft.loot.entry.LeafEntry wrapperContained; public LeafEntry(net.minecraft.loot.entry.LeafEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public int DEFAULT_WEIGHT() { return wrapperContained.DEFAULT_WEIGHT; }
public int DEFAULT_QUALITY() { return wrapperContained.DEFAULT_QUALITY; }
// public int quality() { return wrapperContained.quality; }
// public int weight() { return wrapperContained.weight; }
// public java.util.List functions() { return wrapperContained.functions; }
// public java.util.function.BiFunction compiledFunctions() { return wrapperContained.compiledFunctions; }
// public yarnwrap.loot.LootChoice choice() { return new yarnwrap.loot.LootChoice(wrapperContained.choice); }
// public void generateLoot(java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context) { wrapperContained.generateLoot(lootConsumer,context.wrapperContained); }
// public Object builder(Object factory) { return wrapperContained.builder(factory); }
// public Object addLeafFields(Object instance) { return wrapperContained.addLeafFields(instance); }

}