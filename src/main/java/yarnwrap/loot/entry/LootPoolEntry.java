package yarnwrap.loot.entry;
public class LootPoolEntry { public net.minecraft.loot.entry.LootPoolEntry wrapperContained; public LootPoolEntry(net.minecraft.loot.entry.LootPoolEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List conditions() { return wrapperContained.conditions; }
// public void conditions(java.util.List value) { wrapperContained.conditions = value; }
// public java.util.function.Predicate conditionPredicate() { return wrapperContained.conditionPredicate; }
// public void conditionPredicate(java.util.function.Predicate value) { wrapperContained.conditionPredicate = value; }
// public LootPoolEntry(java.util.List conditions) { this.wrapperContained = new net.minecraft.loot.entry.LootPoolEntry(conditions); }
public yarnwrap.loot.entry.LootPoolEntryType getType() { return new yarnwrap.loot.entry.LootPoolEntryType(wrapperContained.getType()); }
// public boolean test(yarnwrap.loot.context.LootContext context) { return wrapperContained.test(context.wrapperContained); }
public void validate(yarnwrap.loot.LootTableReporter reporter) { wrapperContained.validate(reporter.wrapperContained); }
// public Object addConditionsField(Object instance) { return wrapperContained.addConditionsField(instance); }
// public java.util.List method_53288(yarnwrap.loot.entry.LootPoolEntry entry) { return wrapperContained.method_53288(entry.wrapperContained); }

}