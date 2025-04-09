package yarnwrap.loot.function;
public class ConditionalLootFunction { public net.minecraft.loot.function.ConditionalLootFunction wrapperContained; public ConditionalLootFunction(net.minecraft.loot.function.ConditionalLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List conditions() { return wrapperContained.conditions; }
// public java.util.function.Predicate predicate() { return wrapperContained.predicate; }
// public Object builder(java.util.function.Function joiner) { return wrapperContained.builder(joiner); }
// public yarnwrap.item.ItemStack process(yarnwrap.item.ItemStack stack,yarnwrap.loot.context.LootContext context) { return new yarnwrap.item.ItemStack(wrapperContained.process(stack.wrapperContained,context.wrapperContained)); }
// public Object addConditionsField(Object instance) { return wrapperContained.addConditionsField(instance); }

}