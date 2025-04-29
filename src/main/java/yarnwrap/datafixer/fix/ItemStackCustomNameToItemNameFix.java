package yarnwrap.datafixer.fix;
public class ItemStackCustomNameToItemNameFix { public net.minecraft.datafixer.fix.ItemStackCustomNameToItemNameFix wrapperContained; public ItemStackCustomNameToItemNameFix(net.minecraft.datafixer.fix.ItemStackCustomNameToItemNameFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set EXPLORER_MAP_NAMES() { return wrapperContained.EXPLORER_MAP_NAMES; }
// public void EXPLORER_MAP_NAMES(java.util.Set value) { wrapperContained.EXPLORER_MAP_NAMES = value; }
// public static java.util.Set EXPLORER_MAP_NAMES() { return net.minecraft.datafixer.fix.ItemStackCustomNameToItemNameFix.EXPLORER_MAP_NAMES; }
// public static void EXPLORER_MAP_NAMES(java.util.Set value, ) { net.minecraft.datafixer.fix.ItemStackCustomNameToItemNameFix.EXPLORER_MAP_NAMES = value; }

public ItemStackCustomNameToItemNameFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemStackCustomNameToItemNameFix(outputSchema); }
// public com.mojang.datafixers.Typed method_58601(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_58601(itemStackTyped); }
// public static com.mojang.datafixers.Typed method_58601(com.mojang.datafixers.OpticFinder itemStackTyped, ) { return net.minecraft.datafixer.fix.ItemStackCustomNameToItemNameFix.method_58601(itemStackTyped); }
// public com.mojang.serialization.Dynamic fixExplorerMaps(com.mojang.serialization.Dynamic data) { return wrapperContained.fixExplorerMaps(data); }
// public static com.mojang.serialization.Dynamic fixExplorerMaps(com.mojang.serialization.Dynamic data, ) { return net.minecraft.datafixer.fix.ItemStackCustomNameToItemNameFix.fixExplorerMaps(data); }
// public com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic data,java.util.function.Predicate namePredicate) { return wrapperContained.fix(data,namePredicate); }
// public static com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic data,java.util.function.Predicate namePredicate, ) { return net.minecraft.datafixer.fix.ItemStackCustomNameToItemNameFix.fix(data,namePredicate); }
// public boolean method_58605(java.lang.String name) { return wrapperContained.method_58605(name); }
// public static boolean method_58605(java.lang.String name, ) { return net.minecraft.datafixer.fix.ItemStackCustomNameToItemNameFix.method_58605(name); }
// public com.mojang.serialization.Dynamic fixOminousBanner(com.mojang.serialization.Dynamic data) { return wrapperContained.fixOminousBanner(data); }
// public static com.mojang.serialization.Dynamic fixOminousBanner(com.mojang.serialization.Dynamic data, ) { return net.minecraft.datafixer.fix.ItemStackCustomNameToItemNameFix.fixOminousBanner(data); }
// public boolean method_58608(java.lang.String itemId) { return wrapperContained.method_58608(itemId); }
// public static boolean method_58608(java.lang.String itemId, ) { return net.minecraft.datafixer.fix.ItemStackCustomNameToItemNameFix.method_58608(itemId); }
// public boolean method_58609(java.lang.String itemId) { return wrapperContained.method_58609(itemId); }
// public static boolean method_58609(java.lang.String itemId, ) { return net.minecraft.datafixer.fix.ItemStackCustomNameToItemNameFix.method_58609(itemId); }

}