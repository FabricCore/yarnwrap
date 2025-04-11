package yarnwrap.datafixer.fix;
public class ItemNbtFix { public net.minecraft.datafixer.fix.ItemNbtFix wrapperContained; public ItemNbtFix(net.minecraft.datafixer.fix.ItemNbtFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.util.function.Predicate itemIdPredicate() { return wrapperContained.itemIdPredicate; }
// public void itemIdPredicate(java.util.function.Predicate value) { wrapperContained.itemIdPredicate = value; }
// public ItemNbtFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.util.function.Predicate itemIdPredicate) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemNbtFix(outputSchema,name,itemIdPredicate); }
// public com.mojang.serialization.Dynamic fixNbt(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixNbt(dynamic); }
// public com.mojang.datafixers.Typed method_56970(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_56970(itemStackTyped); }
public java.util.function.UnaryOperator fixNbt(com.mojang.datafixers.types.Type itemStackType,java.util.function.Predicate itemIdPredicate,java.util.function.UnaryOperator nbtFixer) { return wrapperContained.fixNbt(itemStackType,itemIdPredicate,nbtFixer); }
// public com.mojang.datafixers.Typed method_56972(java.util.function.UnaryOperator tag) { return wrapperContained.method_56972(tag); }

}