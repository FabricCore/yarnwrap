package yarnwrap.loot.function;
public class ModifyContentsLootFunction { public net.minecraft.loot.function.ModifyContentsLootFunction wrapperContained; public ModifyContentsLootFunction(net.minecraft.loot.function.ModifyContentsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.loot.ContainerComponentModifier component() { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.component); }
// public void component(yarnwrap.loot.ContainerComponentModifier value) { wrapperContained.component = value.wrapperContained; }
// public yarnwrap.loot.function.LootFunction modifier() { return new yarnwrap.loot.function.LootFunction(wrapperContained.modifier); }
// public void modifier(yarnwrap.loot.function.LootFunction value) { wrapperContained.modifier = value.wrapperContained; }

}