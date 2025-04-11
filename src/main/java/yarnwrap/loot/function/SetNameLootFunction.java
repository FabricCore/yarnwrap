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
// public java.util.function.UnaryOperator applySourceEntity(yarnwrap.loot.context.LootContext context,Object sourceEntity) { return wrapperContained.applySourceEntity(context.wrapperContained,sourceEntity); }
// public Object builder(yarnwrap.text.Text name,Object target) { return wrapperContained.builder(name.wrapperContained,target); }
// public Object builder(yarnwrap.text.Text name,Object target,Object entity) { return wrapperContained.builder(name.wrapperContained,target,entity); }

}