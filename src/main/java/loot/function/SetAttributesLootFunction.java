package yarnwrap.loot.function;
public class SetAttributesLootFunction { public net.minecraft.loot.function.SetAttributesLootFunction wrapperContained; public SetAttributesLootFunction(net.minecraft.loot.function.SetAttributesLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List attributes() { return wrapperContained.attributes; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public boolean replace() { return wrapperContained.replace; }
// public Object attributeBuilder(yarnwrap.util.Identifier id,yarnwrap.registry.entry.RegistryEntry attribute,Object operation,yarnwrap.loot.provider.number.LootNumberProvider amountRange) { return wrapperContained.attributeBuilder(id.wrapperContained,attribute.wrapperContained,operation,amountRange.wrapperContained); }
public Object builder() { return wrapperContained.builder(); }
// public yarnwrap.component.type.AttributeModifiersComponent applyTo(yarnwrap.loot.context.LootContext context,yarnwrap.component.type.AttributeModifiersComponent attributeModifiersComponent) { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.applyTo(context.wrapperContained,attributeModifiersComponent.wrapperContained)); }

}