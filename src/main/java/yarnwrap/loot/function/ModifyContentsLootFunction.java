package yarnwrap.loot.function;
public class ModifyContentsLootFunction { public net.minecraft.loot.function.ModifyContentsLootFunction wrapperContained; public ModifyContentsLootFunction(net.minecraft.loot.function.ModifyContentsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.ModifyContentsLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.ModifyContentsLootFunction.CODEC = value; }

// public yarnwrap.loot.ContainerComponentModifier component() { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.component); }
// public void component(yarnwrap.loot.ContainerComponentModifier value) { wrapperContained.component = value.wrapperContained; }
// public static yarnwrap.loot.ContainerComponentModifier component() { return new yarnwrap.loot.ContainerComponentModifier(net.minecraft.loot.function.ModifyContentsLootFunction.component); }
// public static void component(yarnwrap.loot.ContainerComponentModifier value, ) { net.minecraft.loot.function.ModifyContentsLootFunction.component = value.wrapperContained; }

// public yarnwrap.loot.function.LootFunction modifier() { return new yarnwrap.loot.function.LootFunction(wrapperContained.modifier); }
// public void modifier(yarnwrap.loot.function.LootFunction value) { wrapperContained.modifier = value.wrapperContained; }
// public static yarnwrap.loot.function.LootFunction modifier() { return new yarnwrap.loot.function.LootFunction(net.minecraft.loot.function.ModifyContentsLootFunction.modifier); }
// public static void modifier(yarnwrap.loot.function.LootFunction value, ) { net.minecraft.loot.function.ModifyContentsLootFunction.modifier = value.wrapperContained; }

// public ModifyContentsLootFunction(java.util.List conditions,yarnwrap.loot.ContainerComponentModifier component,yarnwrap.loot.function.LootFunction modifier) { this.wrapperContained = new net.minecraft.loot.function.ModifyContentsLootFunction(conditions,component.wrapperContained,modifier.wrapperContained); }
// public yarnwrap.item.ItemStack method_59743(yarnwrap.loot.context.LootContext content) { return new yarnwrap.item.ItemStack(wrapperContained.method_59743(content.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_59743(yarnwrap.loot.context.LootContext content, ) { return new yarnwrap.item.ItemStack(net.minecraft.loot.function.ModifyContentsLootFunction.method_59743(content.wrapperContained)); }
// public yarnwrap.loot.function.LootFunction method_59744(yarnwrap.loot.function.ModifyContentsLootFunction lootFunction) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_59744(lootFunction.wrapperContained)); }
// public static yarnwrap.loot.function.LootFunction method_59744(yarnwrap.loot.function.ModifyContentsLootFunction lootFunction, ) { return new yarnwrap.loot.function.LootFunction(net.minecraft.loot.function.ModifyContentsLootFunction.method_59744(lootFunction.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_59745(Object instance) { return wrapperContained.method_59745(instance); }
// public static com.mojang.datafixers.kinds.App method_59745(Object instance, ) { return net.minecraft.loot.function.ModifyContentsLootFunction.method_59745(instance); }
// public yarnwrap.loot.ContainerComponentModifier method_59746(yarnwrap.loot.function.ModifyContentsLootFunction lootFunction) { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.method_59746(lootFunction.wrapperContained)); }
// public static yarnwrap.loot.ContainerComponentModifier method_59746(yarnwrap.loot.function.ModifyContentsLootFunction lootFunction, ) { return new yarnwrap.loot.ContainerComponentModifier(net.minecraft.loot.function.ModifyContentsLootFunction.method_59746(lootFunction.wrapperContained)); }

}