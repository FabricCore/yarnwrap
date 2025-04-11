package yarnwrap.loot.context;
public class LootContext { public net.minecraft.loot.context.LootContext wrapperContained; public LootContext(net.minecraft.loot.context.LootContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object lookup() { return wrapperContained.lookup; }
// // public void lookup(Object value) { wrapperContained.lookup = value; }
// public yarnwrap.loot.context.LootContextParameterSet parameters() { return new yarnwrap.loot.context.LootContextParameterSet(wrapperContained.parameters); }
// public void parameters(yarnwrap.loot.context.LootContextParameterSet value) { wrapperContained.parameters = value.wrapperContained; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public java.util.Set activeEntries() { return wrapperContained.activeEntries; }
// public void activeEntries(java.util.Set value) { wrapperContained.activeEntries = value; }
public yarnwrap.util.math.random.Random getRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.getRandom()); }
// public void markInactive(Object entry) { wrapperContained.markInactive(entry); }
public java.lang.Object get(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.get(parameter.wrapperContained); }
public void drop(yarnwrap.util.Identifier id,java.util.function.Consumer lootConsumer) { wrapperContained.drop(id.wrapperContained,lootConsumer); }
// public boolean markActive(Object entry) { return wrapperContained.markActive(entry); }
public yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld()); }
public boolean hasParameter(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.hasParameter(parameter.wrapperContained); }
public float getLuck() { return wrapperContained.getLuck(); }
public java.lang.Object requireParameter(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.requireParameter(parameter.wrapperContained); }
public Object getLookup() { return wrapperContained.getLookup(); }
// public boolean isActive(Object entry) { return wrapperContained.isActive(entry); }
public Object table(yarnwrap.loot.LootTable table) { return wrapperContained.table(table.wrapperContained); }
public Object itemModifier(yarnwrap.loot.function.LootFunction itemModifier) { return wrapperContained.itemModifier(itemModifier.wrapperContained); }
public Object predicate(yarnwrap.loot.condition.LootCondition predicate) { return wrapperContained.predicate(predicate.wrapperContained); }

}