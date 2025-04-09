package yarnwrap.datafixer.fix;
public class ItemNbtFix { public net.minecraft.datafixer.fix.ItemNbtFix wrapperContained; public ItemNbtFix(net.minecraft.datafixer.fix.ItemNbtFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public java.util.function.Predicate itemIdPredicate() { return wrapperContained.itemIdPredicate; }
// public com.mojang.serialization.Dynamic fixNbt(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixNbt(dynamic); }
public java.util.function.UnaryOperator fixNbt(com.mojang.datafixers.types.Type itemStackType,java.util.function.Predicate itemIdPredicate,java.util.function.UnaryOperator nbtFixer) { return wrapperContained.fixNbt(itemStackType,itemIdPredicate,nbtFixer); }

}