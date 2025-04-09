package yarnwrap.loot.function;
public class SetNameLootFunction { public net.minecraft.loot.function.SetNameLootFunction wrapperContained; public SetNameLootFunction(net.minecraft.loot.function.SetNameLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional name() { return wrapperContained.name; }
// public java.util.Optional entity() { return wrapperContained.entity; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object target() { return wrapperContained.target; }
// public java.util.function.UnaryOperator applySourceEntity(yarnwrap.loot.context.LootContext context,Object sourceEntity) { return wrapperContained.applySourceEntity(context.wrapperContained,sourceEntity); }
// public Object builder(yarnwrap.text.Text name,Object target) { return wrapperContained.builder(name.wrapperContained,target); }
// public Object builder(yarnwrap.text.Text name,Object target,Object entity) { return wrapperContained.builder(name.wrapperContained,target,entity); }

}