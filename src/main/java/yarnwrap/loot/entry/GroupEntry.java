package yarnwrap.loot.entry;
public class GroupEntry { public net.minecraft.loot.entry.GroupEntry wrapperContained; public GroupEntry(net.minecraft.loot.entry.GroupEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.entry.GroupEntry.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.entry.GroupEntry.CODEC = value; }

// // public boolean method_29315(yarnwrap.loot.entry.EntryCombiner context,yarnwrap.loot.entry.EntryCombiner choiceConsumer) { return wrapperContained.method_29315(context.wrapperContained,choiceConsumer.wrapperContained); }
// // public static boolean method_29315(yarnwrap.loot.entry.EntryCombiner context,yarnwrap.loot.entry.EntryCombiner choiceConsumer, ) { return net.minecraft.loot.entry.GroupEntry.method_29315(context.wrapperContained,choiceConsumer.wrapperContained); }
// public Object create(Object[] entries) { return wrapperContained.create(entries); }
// public static Object create(Object[] entries, ) { return net.minecraft.loot.entry.GroupEntry.create(entries); }
// public boolean method_452(java.util.List context,yarnwrap.loot.context.LootContext lootChoiceExpander) { return wrapperContained.method_452(context,lootChoiceExpander.wrapperContained); }
// public static boolean method_452(java.util.List context,yarnwrap.loot.context.LootContext lootChoiceExpander, ) { return net.minecraft.loot.entry.GroupEntry.method_452(context,lootChoiceExpander.wrapperContained); }

}