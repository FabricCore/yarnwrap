package yarnwrap.block;
public class EntityShapeContext { public net.minecraft.block.EntityShapeContext wrapperContained; public EntityShapeContext(net.minecraft.block.EntityShapeContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public double minY() { return wrapperContained.minY; }
// public void minY(double value) { wrapperContained.minY = value; }
// public boolean descending() { return wrapperContained.descending; }
// public void descending(boolean value) { wrapperContained.descending = value; }
// public yarnwrap.block.ShapeContext ABSENT() { return new yarnwrap.block.ShapeContext(wrapperContained.ABSENT); }
// public void ABSENT(yarnwrap.block.ShapeContext value) { wrapperContained.ABSENT = value.wrapperContained; }
// public yarnwrap.item.ItemStack heldItem() { return new yarnwrap.item.ItemStack(wrapperContained.heldItem); }
// public void heldItem(yarnwrap.item.ItemStack value) { wrapperContained.heldItem = value.wrapperContained; }
// public java.util.function.Predicate walkOnFluidPredicate() { return wrapperContained.walkOnFluidPredicate; }
// public void walkOnFluidPredicate(java.util.function.Predicate value) { wrapperContained.walkOnFluidPredicate = value; }
// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
// public EntityShapeContext(yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.block.EntityShapeContext(entity.wrapperContained); }
// public EntityShapeContext(boolean descending,double minY,yarnwrap.item.ItemStack heldItem,java.util.function.Predicate walkOnFluidPredicate,yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.block.EntityShapeContext(descending,minY,heldItem.wrapperContained,walkOnFluidPredicate,entity.wrapperContained); }
// public boolean method_27868(yarnwrap.fluid.FluidState fluidState) { return wrapperContained.method_27868(fluidState.wrapperContained); }
public yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(wrapperContained.getEntity()); }

}