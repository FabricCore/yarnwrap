package yarnwrap.loot.context;
public class LootContext { public net.minecraft.loot.context.LootContext wrapperContained; public LootContext(net.minecraft.loot.context.LootContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object lookup() { return wrapperContained.lookup; }
// // public void lookup(Object value) { wrapperContained.lookup = value; }
// // public static Object lookup() { return net.minecraft.loot.context.LootContext.lookup; }
// // public static void lookup(Object value, ) { net.minecraft.loot.context.LootContext.lookup = value; }

// public yarnwrap.loot.context.LootContextParameterSet parameters() { return new yarnwrap.loot.context.LootContextParameterSet(wrapperContained.parameters); }
// public void parameters(yarnwrap.loot.context.LootContextParameterSet value) { wrapperContained.parameters = value.wrapperContained; }
// public static yarnwrap.loot.context.LootContextParameterSet parameters() { return new yarnwrap.loot.context.LootContextParameterSet(net.minecraft.loot.context.LootContext.parameters); }
// public static void parameters(yarnwrap.loot.context.LootContextParameterSet value, ) { net.minecraft.loot.context.LootContext.parameters = value.wrapperContained; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.loot.context.LootContext.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.loot.context.LootContext.random = value.wrapperContained; }

// public java.util.Set activeEntries() { return wrapperContained.activeEntries; }
// public void activeEntries(java.util.Set value) { wrapperContained.activeEntries = value; }
// public static java.util.Set activeEntries() { return net.minecraft.loot.context.LootContext.activeEntries; }
// public static void activeEntries(java.util.Set value, ) { net.minecraft.loot.context.LootContext.activeEntries = value; }

// public LootContext(yarnwrap.loot.context.LootContextParameterSet parameters,yarnwrap.util.math.random.Random random,Object lookup) { this.wrapperContained = new net.minecraft.loot.context.LootContext(parameters.wrapperContained,random.wrapperContained,lookup); }
public yarnwrap.util.math.random.Random getRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.getRandom()); }
// public static yarnwrap.util.math.random.Random getRandom() { return new yarnwrap.util.math.random.Random(net.minecraft.loot.context.LootContext.getRandom()); }
// public void markInactive(Object entry) { wrapperContained.markInactive(entry); }
// public static void markInactive(Object entry, ) { net.minecraft.loot.context.LootContext.markInactive(entry); }
public java.lang.Object get(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.get(parameter.wrapperContained); }
// public static java.lang.Object get(yarnwrap.loot.context.LootContextParameter parameter, ) { return net.minecraft.loot.context.LootContext.get(parameter.wrapperContained); }
public void drop(yarnwrap.util.Identifier id,java.util.function.Consumer lootConsumer) { wrapperContained.drop(id.wrapperContained,lootConsumer); }
// public static void drop(yarnwrap.util.Identifier id,java.util.function.Consumer lootConsumer, ) { net.minecraft.loot.context.LootContext.drop(id.wrapperContained,lootConsumer); }
// public boolean markActive(Object entry) { return wrapperContained.markActive(entry); }
// public static boolean markActive(Object entry, ) { return net.minecraft.loot.context.LootContext.markActive(entry); }
public yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld()); }
// public static yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(net.minecraft.loot.context.LootContext.getWorld()); }
public boolean hasParameter(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.hasParameter(parameter.wrapperContained); }
// public static boolean hasParameter(yarnwrap.loot.context.LootContextParameter parameter, ) { return net.minecraft.loot.context.LootContext.hasParameter(parameter.wrapperContained); }
public float getLuck() { return wrapperContained.getLuck(); }
// public static float getLuck() { return net.minecraft.loot.context.LootContext.getLuck(); }
public java.lang.Object requireParameter(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.requireParameter(parameter.wrapperContained); }
// public static java.lang.Object requireParameter(yarnwrap.loot.context.LootContextParameter parameter, ) { return net.minecraft.loot.context.LootContext.requireParameter(parameter.wrapperContained); }
public Object getLookup() { return wrapperContained.getLookup(); }
// public static Object getLookup() { return net.minecraft.loot.context.LootContext.getLookup(); }
// public boolean isActive(Object entry) { return wrapperContained.isActive(entry); }
// public static boolean isActive(Object entry, ) { return net.minecraft.loot.context.LootContext.isActive(entry); }
// public Object table(yarnwrap.loot.LootTable table) { return wrapperContained.table(table.wrapperContained); }
// public static Object table(yarnwrap.loot.LootTable table, ) { return net.minecraft.loot.context.LootContext.table(table.wrapperContained); }
// public Object itemModifier(yarnwrap.loot.function.LootFunction itemModifier) { return wrapperContained.itemModifier(itemModifier.wrapperContained); }
// public static Object itemModifier(yarnwrap.loot.function.LootFunction itemModifier, ) { return net.minecraft.loot.context.LootContext.itemModifier(itemModifier.wrapperContained); }
// public Object predicate(yarnwrap.loot.condition.LootCondition predicate) { return wrapperContained.predicate(predicate.wrapperContained); }
// public static Object predicate(yarnwrap.loot.condition.LootCondition predicate, ) { return net.minecraft.loot.context.LootContext.predicate(predicate.wrapperContained); }

}