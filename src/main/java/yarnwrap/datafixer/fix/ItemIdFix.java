package yarnwrap.datafixer.fix;
public class ItemIdFix { public net.minecraft.datafixer.fix.ItemIdFix wrapperContained; public ItemIdFix(net.minecraft.datafixer.fix.ItemIdFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap NUMERICAL_ID_TO_STRING_ID_MAP() { return wrapperContained.NUMERICAL_ID_TO_STRING_ID_MAP; }
// public void NUMERICAL_ID_TO_STRING_ID_MAP(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.NUMERICAL_ID_TO_STRING_ID_MAP = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap NUMERICAL_ID_TO_STRING_ID_MAP() { return net.minecraft.datafixer.fix.ItemIdFix.NUMERICAL_ID_TO_STRING_ID_MAP; }
// public static void NUMERICAL_ID_TO_STRING_ID_MAP(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.datafixer.fix.ItemIdFix.NUMERICAL_ID_TO_STRING_ID_MAP = value; }

public ItemIdFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemIdFix(outputSchema,changesType); }
// public com.mojang.datafixers.Typed method_5013(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_5013(itemStackTyped); }
// public static com.mojang.datafixers.Typed method_5013(com.mojang.datafixers.OpticFinder itemStackTyped, ) { return net.minecraft.datafixer.fix.ItemIdFix.method_5013(itemStackTyped); }
// public com.mojang.datafixers.util.Pair method_5014(com.mojang.datafixers.util.Either id) { return wrapperContained.method_5014(id); }
// public static com.mojang.datafixers.util.Pair method_5014(com.mojang.datafixers.util.Either id, ) { return net.minecraft.datafixer.fix.ItemIdFix.method_5014(id); }
// public void method_5015(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap map) { wrapperContained.method_5015(map); }
// public static void method_5015(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap map, ) { net.minecraft.datafixer.fix.ItemIdFix.method_5015(map); }
// public com.mojang.datafixers.util.Pair method_5016(java.lang.Integer ordinal) { return wrapperContained.method_5016(ordinal); }
// public static com.mojang.datafixers.util.Pair method_5016(java.lang.Integer ordinal, ) { return net.minecraft.datafixer.fix.ItemIdFix.method_5016(ordinal); }
// public com.mojang.datafixers.util.Pair method_5017(com.mojang.datafixers.util.Pair named) { return wrapperContained.method_5017(named); }
// public static com.mojang.datafixers.util.Pair method_5017(com.mojang.datafixers.util.Pair named, ) { return net.minecraft.datafixer.fix.ItemIdFix.method_5017(named); }
// public java.lang.String fromId(int id) { return wrapperContained.fromId(id); }
// public static java.lang.String fromId(int id, ) { return net.minecraft.datafixer.fix.ItemIdFix.fromId(id); }

}