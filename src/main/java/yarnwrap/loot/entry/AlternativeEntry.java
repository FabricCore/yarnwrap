package yarnwrap.loot.entry;
public class AlternativeEntry { public net.minecraft.loot.entry.AlternativeEntry wrapperContained; public AlternativeEntry(net.minecraft.loot.entry.AlternativeEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object builder(Object[] children) { return wrapperContained.builder(children); }
// public boolean method_387(java.util.List context,yarnwrap.loot.context.LootContext lootChoiceExpander) { return wrapperContained.method_387(context,lootChoiceExpander.wrapperContained); }
public Object builder(java.util.Collection children,java.util.function.Function toBuilderFunction) { return wrapperContained.builder(children,toBuilderFunction); }

}