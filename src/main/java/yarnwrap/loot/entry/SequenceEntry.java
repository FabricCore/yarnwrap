package yarnwrap.loot.entry;
public class SequenceEntry { public net.minecraft.loot.entry.SequenceEntry wrapperContained; public SequenceEntry(net.minecraft.loot.entry.SequenceEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object create(Object[] entries) { return wrapperContained.create(entries); }
// public boolean method_400(java.util.List context,yarnwrap.loot.context.LootContext lootChoiceExpander) { return wrapperContained.method_400(context,lootChoiceExpander.wrapperContained); }

}