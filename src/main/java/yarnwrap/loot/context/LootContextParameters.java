package yarnwrap.loot.context;
public class LootContextParameters { public net.minecraft.loot.context.LootContextParameters wrapperContained; public LootContextParameters(net.minecraft.loot.context.LootContextParameters wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.context.ContextParameter BLOCK_STATE() { return new yarnwrap.util.context.ContextParameter(wrapperContained.BLOCK_STATE); }
// public void BLOCK_STATE(yarnwrap.util.context.ContextParameter value) { wrapperContained.BLOCK_STATE = value.wrapperContained; }
public static yarnwrap.util.context.ContextParameter BLOCK_STATE() { return new yarnwrap.util.context.ContextParameter(net.minecraft.loot.context.LootContextParameters.BLOCK_STATE); }
// public static void BLOCK_STATE(yarnwrap.util.context.ContextParameter value, ) { net.minecraft.loot.context.LootContextParameters.BLOCK_STATE = value.wrapperContained; }

// public yarnwrap.util.context.ContextParameter EXPLOSION_RADIUS() { return new yarnwrap.util.context.ContextParameter(wrapperContained.EXPLOSION_RADIUS); }
// public void EXPLOSION_RADIUS(yarnwrap.util.context.ContextParameter value) { wrapperContained.EXPLOSION_RADIUS = value.wrapperContained; }
public static yarnwrap.util.context.ContextParameter EXPLOSION_RADIUS() { return new yarnwrap.util.context.ContextParameter(net.minecraft.loot.context.LootContextParameters.EXPLOSION_RADIUS); }
// public static void EXPLOSION_RADIUS(yarnwrap.util.context.ContextParameter value, ) { net.minecraft.loot.context.LootContextParameters.EXPLOSION_RADIUS = value.wrapperContained; }

// public yarnwrap.util.context.ContextParameter THIS_ENTITY() { return new yarnwrap.util.context.ContextParameter(wrapperContained.THIS_ENTITY); }
// public void THIS_ENTITY(yarnwrap.util.context.ContextParameter value) { wrapperContained.THIS_ENTITY = value.wrapperContained; }
public static yarnwrap.util.context.ContextParameter THIS_ENTITY() { return new yarnwrap.util.context.ContextParameter(net.minecraft.loot.context.LootContextParameters.THIS_ENTITY); }
// public static void THIS_ENTITY(yarnwrap.util.context.ContextParameter value, ) { net.minecraft.loot.context.LootContextParameters.THIS_ENTITY = value.wrapperContained; }

// public yarnwrap.util.context.ContextParameter DIRECT_ATTACKING_ENTITY() { return new yarnwrap.util.context.ContextParameter(wrapperContained.DIRECT_ATTACKING_ENTITY); }
// public void DIRECT_ATTACKING_ENTITY(yarnwrap.util.context.ContextParameter value) { wrapperContained.DIRECT_ATTACKING_ENTITY = value.wrapperContained; }
public static yarnwrap.util.context.ContextParameter DIRECT_ATTACKING_ENTITY() { return new yarnwrap.util.context.ContextParameter(net.minecraft.loot.context.LootContextParameters.DIRECT_ATTACKING_ENTITY); }
// public static void DIRECT_ATTACKING_ENTITY(yarnwrap.util.context.ContextParameter value, ) { net.minecraft.loot.context.LootContextParameters.DIRECT_ATTACKING_ENTITY = value.wrapperContained; }

// public yarnwrap.util.context.ContextParameter BLOCK_ENTITY() { return new yarnwrap.util.context.ContextParameter(wrapperContained.BLOCK_ENTITY); }
// public void BLOCK_ENTITY(yarnwrap.util.context.ContextParameter value) { wrapperContained.BLOCK_ENTITY = value.wrapperContained; }
public static yarnwrap.util.context.ContextParameter BLOCK_ENTITY() { return new yarnwrap.util.context.ContextParameter(net.minecraft.loot.context.LootContextParameters.BLOCK_ENTITY); }
// public static void BLOCK_ENTITY(yarnwrap.util.context.ContextParameter value, ) { net.minecraft.loot.context.LootContextParameters.BLOCK_ENTITY = value.wrapperContained; }

// public yarnwrap.util.context.ContextParameter TOOL() { return new yarnwrap.util.context.ContextParameter(wrapperContained.TOOL); }
// public void TOOL(yarnwrap.util.context.ContextParameter value) { wrapperContained.TOOL = value.wrapperContained; }
public static yarnwrap.util.context.ContextParameter TOOL() { return new yarnwrap.util.context.ContextParameter(net.minecraft.loot.context.LootContextParameters.TOOL); }
// public static void TOOL(yarnwrap.util.context.ContextParameter value, ) { net.minecraft.loot.context.LootContextParameters.TOOL = value.wrapperContained; }

// public yarnwrap.util.context.ContextParameter ATTACKING_ENTITY() { return new yarnwrap.util.context.ContextParameter(wrapperContained.ATTACKING_ENTITY); }
// public void ATTACKING_ENTITY(yarnwrap.util.context.ContextParameter value) { wrapperContained.ATTACKING_ENTITY = value.wrapperContained; }
public static yarnwrap.util.context.ContextParameter ATTACKING_ENTITY() { return new yarnwrap.util.context.ContextParameter(net.minecraft.loot.context.LootContextParameters.ATTACKING_ENTITY); }
// public static void ATTACKING_ENTITY(yarnwrap.util.context.ContextParameter value, ) { net.minecraft.loot.context.LootContextParameters.ATTACKING_ENTITY = value.wrapperContained; }

// public yarnwrap.util.context.ContextParameter DAMAGE_SOURCE() { return new yarnwrap.util.context.ContextParameter(wrapperContained.DAMAGE_SOURCE); }
// public void DAMAGE_SOURCE(yarnwrap.util.context.ContextParameter value) { wrapperContained.DAMAGE_SOURCE = value.wrapperContained; }
public static yarnwrap.util.context.ContextParameter DAMAGE_SOURCE() { return new yarnwrap.util.context.ContextParameter(net.minecraft.loot.context.LootContextParameters.DAMAGE_SOURCE); }
// public static void DAMAGE_SOURCE(yarnwrap.util.context.ContextParameter value, ) { net.minecraft.loot.context.LootContextParameters.DAMAGE_SOURCE = value.wrapperContained; }

// public yarnwrap.util.context.ContextParameter LAST_DAMAGE_PLAYER() { return new yarnwrap.util.context.ContextParameter(wrapperContained.LAST_DAMAGE_PLAYER); }
// public void LAST_DAMAGE_PLAYER(yarnwrap.util.context.ContextParameter value) { wrapperContained.LAST_DAMAGE_PLAYER = value.wrapperContained; }
public static yarnwrap.util.context.ContextParameter LAST_DAMAGE_PLAYER() { return new yarnwrap.util.context.ContextParameter(net.minecraft.loot.context.LootContextParameters.LAST_DAMAGE_PLAYER); }
// public static void LAST_DAMAGE_PLAYER(yarnwrap.util.context.ContextParameter value, ) { net.minecraft.loot.context.LootContextParameters.LAST_DAMAGE_PLAYER = value.wrapperContained; }

// public yarnwrap.util.context.ContextParameter ORIGIN() { return new yarnwrap.util.context.ContextParameter(wrapperContained.ORIGIN); }
// public void ORIGIN(yarnwrap.util.context.ContextParameter value) { wrapperContained.ORIGIN = value.wrapperContained; }
public static yarnwrap.util.context.ContextParameter ORIGIN() { return new yarnwrap.util.context.ContextParameter(net.minecraft.loot.context.LootContextParameters.ORIGIN); }
// public static void ORIGIN(yarnwrap.util.context.ContextParameter value, ) { net.minecraft.loot.context.LootContextParameters.ORIGIN = value.wrapperContained; }

// public yarnwrap.util.context.ContextParameter ENCHANTMENT_LEVEL() { return new yarnwrap.util.context.ContextParameter(wrapperContained.ENCHANTMENT_LEVEL); }
// public void ENCHANTMENT_LEVEL(yarnwrap.util.context.ContextParameter value) { wrapperContained.ENCHANTMENT_LEVEL = value.wrapperContained; }
public static yarnwrap.util.context.ContextParameter ENCHANTMENT_LEVEL() { return new yarnwrap.util.context.ContextParameter(net.minecraft.loot.context.LootContextParameters.ENCHANTMENT_LEVEL); }
// public static void ENCHANTMENT_LEVEL(yarnwrap.util.context.ContextParameter value, ) { net.minecraft.loot.context.LootContextParameters.ENCHANTMENT_LEVEL = value.wrapperContained; }

// public yarnwrap.util.context.ContextParameter ENCHANTMENT_ACTIVE() { return new yarnwrap.util.context.ContextParameter(wrapperContained.ENCHANTMENT_ACTIVE); }
// public void ENCHANTMENT_ACTIVE(yarnwrap.util.context.ContextParameter value) { wrapperContained.ENCHANTMENT_ACTIVE = value.wrapperContained; }
public static yarnwrap.util.context.ContextParameter ENCHANTMENT_ACTIVE() { return new yarnwrap.util.context.ContextParameter(net.minecraft.loot.context.LootContextParameters.ENCHANTMENT_ACTIVE); }
// public static void ENCHANTMENT_ACTIVE(yarnwrap.util.context.ContextParameter value, ) { net.minecraft.loot.context.LootContextParameters.ENCHANTMENT_ACTIVE = value.wrapperContained; }


}