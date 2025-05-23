package yarnwrap.loot.entry;
public class SequenceEntry { public net.minecraft.loot.entry.SequenceEntry wrapperContained; public SequenceEntry(net.minecraft.loot.entry.SequenceEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.entry.SequenceEntry.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.entry.SequenceEntry.CODEC = value; }

// public boolean method_400(java.util.List context,yarnwrap.loot.context.LootContext lootChoiceExpander) { return wrapperContained.method_400(context,lootChoiceExpander.wrapperContained); }
// public static boolean method_400(java.util.List context,yarnwrap.loot.context.LootContext lootChoiceExpander, ) { return net.minecraft.loot.entry.SequenceEntry.method_400(context,lootChoiceExpander.wrapperContained); }
// public Object create(Object[] entries) { return wrapperContained.create(entries); }
// public static Object create(Object[] entries, ) { return net.minecraft.loot.entry.SequenceEntry.create(entries); }

}