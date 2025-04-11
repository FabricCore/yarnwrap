package yarnwrap.loot.function;
public class SetContentsLootFunction { public net.minecraft.loot.function.SetContentsLootFunction wrapperContained; public SetContentsLootFunction(net.minecraft.loot.function.SetContentsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.loot.ContainerComponentModifier component() { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.component); }
// public void component(yarnwrap.loot.ContainerComponentModifier value) { wrapperContained.component = value.wrapperContained; }
// public SetContentsLootFunction(java.util.List conditions,yarnwrap.loot.ContainerComponentModifier component,java.util.List entries) { this.wrapperContained = new net.minecraft.loot.function.SetContentsLootFunction(conditions,component.wrapperContained,entries); }
// public java.util.List method_53363(yarnwrap.loot.function.SetContentsLootFunction function) { return wrapperContained.method_53363(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53364(Object instance) { return wrapperContained.method_53364(instance); }
// public yarnwrap.loot.ContainerComponentModifier method_53365(yarnwrap.loot.function.SetContentsLootFunction function) { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.method_53365(function.wrapperContained)); }
// public void method_599(yarnwrap.loot.context.LootContext entry) { wrapperContained.method_599(entry.wrapperContained); }
// public void method_600(yarnwrap.loot.context.LootContext choice) { wrapperContained.method_600(choice.wrapperContained); }
public Object builder(yarnwrap.loot.ContainerComponentModifier componentModifier) { return wrapperContained.builder(componentModifier.wrapperContained); }

}