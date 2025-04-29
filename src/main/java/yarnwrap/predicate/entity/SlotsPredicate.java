package yarnwrap.predicate.entity;
public class SlotsPredicate { public net.minecraft.predicate.entity.SlotsPredicate wrapperContained; public SlotsPredicate(net.minecraft.predicate.entity.SlotsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.entity.SlotsPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.entity.SlotsPredicate.CODEC = value; }

public boolean matches(yarnwrap.entity.Entity entity) { return wrapperContained.matches(entity.wrapperContained); }
// public static boolean matches(yarnwrap.entity.Entity entity, ) { return net.minecraft.predicate.entity.SlotsPredicate.matches(entity.wrapperContained); }
// public boolean matches(yarnwrap.entity.Entity entity,yarnwrap.predicate.item.ItemPredicate itemPredicate,it.unimi.dsi.fastutil.ints.IntList slotIds) { return wrapperContained.matches(entity.wrapperContained,itemPredicate.wrapperContained,slotIds); }
// public static boolean matches(yarnwrap.entity.Entity entity,yarnwrap.predicate.item.ItemPredicate itemPredicate,it.unimi.dsi.fastutil.ints.IntList slotIds, ) { return net.minecraft.predicate.entity.SlotsPredicate.matches(entity.wrapperContained,itemPredicate.wrapperContained,slotIds); }

}