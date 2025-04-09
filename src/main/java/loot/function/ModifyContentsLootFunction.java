package yarnwrap.loot.function;
public class ModifyContentsLootFunction { public net.minecraft.loot.function.ModifyContentsLootFunction wrapperContained; public ModifyContentsLootFunction(net.minecraft.loot.function.ModifyContentsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.loot.ContainerComponentModifier component() { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.component); }
// public yarnwrap.loot.function.LootFunction modifier() { return new yarnwrap.loot.function.LootFunction(wrapperContained.modifier); }

}