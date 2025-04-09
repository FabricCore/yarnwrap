package yarnwrap.block;
public class EntityShapeContext { public net.minecraft.block.EntityShapeContext wrapperContained; public EntityShapeContext(net.minecraft.block.EntityShapeContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public double minY() { return wrapperContained.minY; }
// public boolean descending() { return wrapperContained.descending; }
// public yarnwrap.block.ShapeContext ABSENT() { return new yarnwrap.block.ShapeContext(wrapperContained.ABSENT); }
// public yarnwrap.item.ItemStack heldItem() { return new yarnwrap.item.ItemStack(wrapperContained.heldItem); }
// public java.util.function.Predicate walkOnFluidPredicate() { return wrapperContained.walkOnFluidPredicate; }
// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
public yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(wrapperContained.getEntity()); }

}