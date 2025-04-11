package yarnwrap.predicate.entity;
public class SlotsPredicate { public net.minecraft.predicate.entity.SlotsPredicate wrapperContained; public SlotsPredicate(net.minecraft.predicate.entity.SlotsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public boolean matches(yarnwrap.entity.Entity entity) { return wrapperContained.matches(entity.wrapperContained); }
// public boolean matches(yarnwrap.entity.Entity entity,yarnwrap.predicate.item.ItemPredicate itemPredicate,it.unimi.dsi.fastutil.ints.IntList slotIds) { return wrapperContained.matches(entity.wrapperContained,itemPredicate.wrapperContained,slotIds); }

}