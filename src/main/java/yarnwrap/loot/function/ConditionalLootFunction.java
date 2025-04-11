package yarnwrap.loot.function;
public class ConditionalLootFunction { public net.minecraft.loot.function.ConditionalLootFunction wrapperContained; public ConditionalLootFunction(net.minecraft.loot.function.ConditionalLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List conditions() { return wrapperContained.conditions; }
// public void conditions(java.util.List value) { wrapperContained.conditions = value; }
// public java.util.function.Predicate predicate() { return wrapperContained.predicate; }
// public void predicate(java.util.function.Predicate value) { wrapperContained.predicate = value; }
// public ConditionalLootFunction(java.util.List conditions) { this.wrapperContained = new net.minecraft.loot.function.ConditionalLootFunction(conditions); }
// public java.lang.Object apply(java.lang.Object itemStack,java.lang.Object context) { return wrapperContained.apply(itemStack,context); }
// public Object builder(java.util.function.Function joiner) { return wrapperContained.builder(joiner); }
// public yarnwrap.item.ItemStack process(yarnwrap.item.ItemStack stack,yarnwrap.loot.context.LootContext context) { return new yarnwrap.item.ItemStack(wrapperContained.process(stack.wrapperContained,context.wrapperContained)); }
// public Object addConditionsField(Object instance) { return wrapperContained.addConditionsField(instance); }
// public java.util.List method_53345(yarnwrap.loot.function.ConditionalLootFunction function) { return wrapperContained.method_53345(function.wrapperContained); }

}