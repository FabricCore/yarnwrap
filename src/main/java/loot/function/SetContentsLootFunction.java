package yarnwrap.loot.function;
public class SetContentsLootFunction { public net.minecraft.loot.function.SetContentsLootFunction wrapperContained; public SetContentsLootFunction(net.minecraft.loot.function.SetContentsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List entries() { return wrapperContained.entries; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.loot.ContainerComponentModifier component() { return new yarnwrap.loot.ContainerComponentModifier(wrapperContained.component); }
public Object builder(yarnwrap.loot.ContainerComponentModifier componentModifier) { return wrapperContained.builder(componentModifier.wrapperContained); }

}