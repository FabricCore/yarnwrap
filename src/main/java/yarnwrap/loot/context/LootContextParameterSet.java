package yarnwrap.loot.context;
public class LootContextParameterSet { public net.minecraft.loot.context.LootContextParameterSet wrapperContained; public LootContextParameterSet(net.minecraft.loot.context.LootContextParameterSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.loot.context.LootContextParameterSet.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.loot.context.LootContextParameterSet.world = value.wrapperContained; }

// public java.util.Map parameters() { return wrapperContained.parameters; }
// public void parameters(java.util.Map value) { wrapperContained.parameters = value; }
// public static java.util.Map parameters() { return net.minecraft.loot.context.LootContextParameterSet.parameters; }
// public static void parameters(java.util.Map value, ) { net.minecraft.loot.context.LootContextParameterSet.parameters = value; }

// public java.util.Map dynamicDrops() { return wrapperContained.dynamicDrops; }
// public void dynamicDrops(java.util.Map value) { wrapperContained.dynamicDrops = value; }
// public static java.util.Map dynamicDrops() { return net.minecraft.loot.context.LootContextParameterSet.dynamicDrops; }
// public static void dynamicDrops(java.util.Map value, ) { net.minecraft.loot.context.LootContextParameterSet.dynamicDrops = value; }

// public float luck() { return wrapperContained.luck; }
// public void luck(float value) { wrapperContained.luck = value; }
// public static float luck() { return net.minecraft.loot.context.LootContextParameterSet.luck; }
// public static void luck(float value, ) { net.minecraft.loot.context.LootContextParameterSet.luck = value; }

public LootContextParameterSet(yarnwrap.server.world.ServerWorld world,java.util.Map parameters,java.util.Map dynamicDrops,float luck) { this.wrapperContained = new net.minecraft.loot.context.LootContextParameterSet(world.wrapperContained,parameters,dynamicDrops,luck); }
public yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld()); }
// public static yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(net.minecraft.loot.context.LootContextParameterSet.getWorld()); }
public void addDynamicDrops(yarnwrap.util.Identifier id,java.util.function.Consumer lootConsumer) { wrapperContained.addDynamicDrops(id.wrapperContained,lootConsumer); }
// public static void addDynamicDrops(yarnwrap.util.Identifier id,java.util.function.Consumer lootConsumer, ) { net.minecraft.loot.context.LootContextParameterSet.addDynamicDrops(id.wrapperContained,lootConsumer); }
public boolean contains(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.contains(parameter.wrapperContained); }
// public static boolean contains(yarnwrap.loot.context.LootContextParameter parameter, ) { return net.minecraft.loot.context.LootContextParameterSet.contains(parameter.wrapperContained); }
public float getLuck() { return wrapperContained.getLuck(); }
// public static float getLuck() { return net.minecraft.loot.context.LootContextParameterSet.getLuck(); }
public java.lang.Object get(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.get(parameter.wrapperContained); }
// public static java.lang.Object get(yarnwrap.loot.context.LootContextParameter parameter, ) { return net.minecraft.loot.context.LootContextParameterSet.get(parameter.wrapperContained); }
public java.lang.Object method_51868(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.method_51868(parameter.wrapperContained); }
// public static java.lang.Object method_51868(yarnwrap.loot.context.LootContextParameter parameter, ) { return net.minecraft.loot.context.LootContextParameterSet.method_51868(parameter.wrapperContained); }
public java.lang.Object getOptional(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.getOptional(parameter.wrapperContained); }
// public static java.lang.Object getOptional(yarnwrap.loot.context.LootContextParameter parameter, ) { return net.minecraft.loot.context.LootContextParameterSet.getOptional(parameter.wrapperContained); }

}