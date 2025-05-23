package yarnwrap.loot.entry;
public class AlternativeEntry { public net.minecraft.loot.entry.AlternativeEntry wrapperContained; public AlternativeEntry(net.minecraft.loot.entry.AlternativeEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.entry.AlternativeEntry.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.entry.AlternativeEntry.CODEC = value; }

// public Object UNREACHABLE_ENTRY_ERROR() { return wrapperContained.UNREACHABLE_ENTRY_ERROR; }
// public void UNREACHABLE_ENTRY_ERROR(Object value) { wrapperContained.UNREACHABLE_ENTRY_ERROR = value; }
// // public static Object UNREACHABLE_ENTRY_ERROR() { return net.minecraft.loot.entry.AlternativeEntry.UNREACHABLE_ENTRY_ERROR; }
// public static void UNREACHABLE_ENTRY_ERROR(Object value, ) { net.minecraft.loot.entry.AlternativeEntry.UNREACHABLE_ENTRY_ERROR = value; }

// public Object builder(Object[] children) { return wrapperContained.builder(children); }
// public static Object builder(Object[] children, ) { return net.minecraft.loot.entry.AlternativeEntry.builder(children); }
// public boolean method_387(java.util.List context,yarnwrap.loot.context.LootContext lootChoiceExpander) { return wrapperContained.method_387(context,lootChoiceExpander.wrapperContained); }
// public static boolean method_387(java.util.List context,yarnwrap.loot.context.LootContext lootChoiceExpander, ) { return net.minecraft.loot.entry.AlternativeEntry.method_387(context,lootChoiceExpander.wrapperContained); }
// public Object builder(java.util.Collection children,java.util.function.Function toBuilderFunction) { return wrapperContained.builder(children,toBuilderFunction); }
// public static Object builder(java.util.Collection children,java.util.function.Function toBuilderFunction, ) { return net.minecraft.loot.entry.AlternativeEntry.builder(children,toBuilderFunction); }

}