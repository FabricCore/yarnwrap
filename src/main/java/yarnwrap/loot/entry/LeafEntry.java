package yarnwrap.loot.entry;
public class LeafEntry { public net.minecraft.loot.entry.LeafEntry wrapperContained; public LeafEntry(net.minecraft.loot.entry.LeafEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public int DEFAULT_WEIGHT() { return wrapperContained.DEFAULT_WEIGHT; }
// public void DEFAULT_WEIGHT(int value) { wrapperContained.DEFAULT_WEIGHT = value; }
public int DEFAULT_QUALITY() { return wrapperContained.DEFAULT_QUALITY; }
// public void DEFAULT_QUALITY(int value) { wrapperContained.DEFAULT_QUALITY = value; }
// public int quality() { return wrapperContained.quality; }
// public void quality(int value) { wrapperContained.quality = value; }
// public int weight() { return wrapperContained.weight; }
// public void weight(int value) { wrapperContained.weight = value; }
// public java.util.List functions() { return wrapperContained.functions; }
// public void functions(java.util.List value) { wrapperContained.functions = value; }
// public java.util.function.BiFunction compiledFunctions() { return wrapperContained.compiledFunctions; }
// public void compiledFunctions(java.util.function.BiFunction value) { wrapperContained.compiledFunctions = value; }
// public yarnwrap.loot.LootChoice choice() { return new yarnwrap.loot.LootChoice(wrapperContained.choice); }
// public void choice(yarnwrap.loot.LootChoice value) { wrapperContained.choice = value.wrapperContained; }
// public void generateLoot(java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context) { wrapperContained.generateLoot(lootConsumer,context.wrapperContained); }
// public Object builder(Object factory) { return wrapperContained.builder(factory); }
// public Object addLeafFields(Object instance) { return wrapperContained.addLeafFields(instance); }

}