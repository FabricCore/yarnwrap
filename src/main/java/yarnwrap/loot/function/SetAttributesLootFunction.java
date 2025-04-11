package yarnwrap.loot.function;
public class SetAttributesLootFunction { public net.minecraft.loot.function.SetAttributesLootFunction wrapperContained; public SetAttributesLootFunction(net.minecraft.loot.function.SetAttributesLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List attributes() { return wrapperContained.attributes; }
// public void attributes(java.util.List value) { wrapperContained.attributes = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public boolean replace() { return wrapperContained.replace; }
// public void replace(boolean value) { wrapperContained.replace = value; }
// public SetAttributesLootFunction(java.util.List conditions,java.util.List attributes,boolean replace) { this.wrapperContained = new net.minecraft.loot.function.SetAttributesLootFunction(conditions,attributes,replace); }
// public java.util.stream.Stream method_32406(Object attribute) { return wrapperContained.method_32406(attribute); }
// public Object attributeBuilder(yarnwrap.util.Identifier id,yarnwrap.registry.entry.RegistryEntry attribute,Object operation,yarnwrap.loot.provider.number.LootNumberProvider amountRange) { return wrapperContained.attributeBuilder(id.wrapperContained,attribute.wrapperContained,operation,amountRange.wrapperContained); }
public Object builder() { return wrapperContained.builder(); }
// public java.util.List method_53355(yarnwrap.loot.function.SetAttributesLootFunction function) { return wrapperContained.method_53355(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53356(Object instance) { return wrapperContained.method_53356(instance); }
// public yarnwrap.component.type.AttributeModifiersComponent method_57647(yarnwrap.loot.context.LootContext component) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.method_57647(component.wrapperContained)); }
// public yarnwrap.component.type.AttributeModifiersComponent applyTo(yarnwrap.loot.context.LootContext context,yarnwrap.component.type.AttributeModifiersComponent attributeModifiersComponent) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.applyTo(context.wrapperContained,attributeModifiersComponent.wrapperContained)); }
// public java.lang.Boolean method_59545(yarnwrap.loot.function.SetAttributesLootFunction lootFunction) { return wrapperContained.method_59545(lootFunction.wrapperContained); }

}