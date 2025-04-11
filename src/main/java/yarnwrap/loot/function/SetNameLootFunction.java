package yarnwrap.loot.function;
public class SetNameLootFunction { public net.minecraft.loot.function.SetNameLootFunction wrapperContained; public SetNameLootFunction(net.minecraft.loot.function.SetNameLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional name() { return wrapperContained.name; }
// public void name(java.util.Optional value) { wrapperContained.name = value; }
// public java.util.Optional entity() { return wrapperContained.entity; }
// public void entity(java.util.Optional value) { wrapperContained.entity = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object target() { return wrapperContained.target; }
// // public void target(Object value) { wrapperContained.target = value; }
// public SetNameLootFunction(java.util.List conditions,java.util.Optional name,java.util.Optional entity,Object target) { this.wrapperContained = new net.minecraft.loot.function.SetNameLootFunction(conditions,name,entity,target); }
// public yarnwrap.text.Text method_16189(yarnwrap.server.command.ServerCommandSource textComponent) { return new yarnwrap.text.Text(wrapperContained.method_16189(textComponent.wrapperContained)); }
// public java.util.function.UnaryOperator applySourceEntity(yarnwrap.loot.context.LootContext context,Object sourceEntity) { return wrapperContained.applySourceEntity(context.wrapperContained,sourceEntity); }
// public yarnwrap.text.Text method_16191(yarnwrap.text.Text textComponent) { return new yarnwrap.text.Text(wrapperContained.method_16191(textComponent.wrapperContained)); }
// public Object builder(yarnwrap.text.Text name,Object target) { return wrapperContained.builder(name.wrapperContained,target); }
// public Object builder(yarnwrap.text.Text name,Object target,Object entity) { return wrapperContained.builder(name.wrapperContained,target,entity); }
// public yarnwrap.loot.function.LootFunction method_35551(yarnwrap.text.Text conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_35551(conditions.wrapperContained)); }
// public yarnwrap.loot.function.LootFunction method_35552(yarnwrap.text.Text conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_35552(conditions.wrapperContained)); }
// public void method_53386(yarnwrap.item.ItemStack name) { wrapperContained.method_53386(name.wrapperContained); }
// public java.util.Set method_53387(Object entity) { return wrapperContained.method_53387(entity); }
// public java.util.Optional method_53388(yarnwrap.loot.function.SetNameLootFunction function) { return wrapperContained.method_53388(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53389(Object instance) { return wrapperContained.method_53389(instance); }
// public java.util.Optional method_53390(yarnwrap.loot.function.SetNameLootFunction function) { return wrapperContained.method_53390(function.wrapperContained); }
// public Object method_58733(yarnwrap.loot.function.SetNameLootFunction function) { return wrapperContained.method_58733(function.wrapperContained); }

}