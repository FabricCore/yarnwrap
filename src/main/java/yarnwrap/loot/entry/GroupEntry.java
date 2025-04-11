package yarnwrap.loot.entry;
public class GroupEntry { public net.minecraft.loot.entry.GroupEntry wrapperContained; public GroupEntry(net.minecraft.loot.entry.GroupEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// // public boolean method_29315(yarnwrap.loot.entry.EntryCombiner context,yarnwrap.loot.entry.EntryCombiner choiceConsumer) { return wrapperContained.method_29315(context.wrapperContained,choiceConsumer.wrapperContained); }
// public Object create(Object[] entries) { return wrapperContained.create(entries); }
// public boolean method_452(java.util.List context,yarnwrap.loot.context.LootContext lootChoiceExpander) { return wrapperContained.method_452(context,lootChoiceExpander.wrapperContained); }

}