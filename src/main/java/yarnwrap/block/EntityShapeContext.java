package yarnwrap.block;
public class EntityShapeContext { public net.minecraft.block.EntityShapeContext wrapperContained; public EntityShapeContext(net.minecraft.block.EntityShapeContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public double minY() { return wrapperContained.minY; }
// public void minY(double value) { wrapperContained.minY = value; }
// public static double minY() { return net.minecraft.block.EntityShapeContext.minY; }
// public static void minY(double value, ) { net.minecraft.block.EntityShapeContext.minY = value; }

// public boolean descending() { return wrapperContained.descending; }
// public void descending(boolean value) { wrapperContained.descending = value; }
// public static boolean descending() { return net.minecraft.block.EntityShapeContext.descending; }
// public static void descending(boolean value, ) { net.minecraft.block.EntityShapeContext.descending = value; }

// public yarnwrap.block.ShapeContext ABSENT() { return new yarnwrap.block.ShapeContext(wrapperContained.ABSENT); }
// public void ABSENT(yarnwrap.block.ShapeContext value) { wrapperContained.ABSENT = value.wrapperContained; }
// public static yarnwrap.block.ShapeContext ABSENT() { return new yarnwrap.block.ShapeContext(net.minecraft.block.EntityShapeContext.ABSENT); }
// public static void ABSENT(yarnwrap.block.ShapeContext value, ) { net.minecraft.block.EntityShapeContext.ABSENT = value.wrapperContained; }

// public yarnwrap.item.ItemStack heldItem() { return new yarnwrap.item.ItemStack(wrapperContained.heldItem); }
// public void heldItem(yarnwrap.item.ItemStack value) { wrapperContained.heldItem = value.wrapperContained; }
// public static yarnwrap.item.ItemStack heldItem() { return new yarnwrap.item.ItemStack(net.minecraft.block.EntityShapeContext.heldItem); }
// public static void heldItem(yarnwrap.item.ItemStack value, ) { net.minecraft.block.EntityShapeContext.heldItem = value.wrapperContained; }

// public java.util.function.Predicate walkOnFluidPredicate() { return wrapperContained.walkOnFluidPredicate; }
// public void walkOnFluidPredicate(java.util.function.Predicate value) { wrapperContained.walkOnFluidPredicate = value; }
// public static java.util.function.Predicate walkOnFluidPredicate() { return net.minecraft.block.EntityShapeContext.walkOnFluidPredicate; }
// public static void walkOnFluidPredicate(java.util.function.Predicate value, ) { net.minecraft.block.EntityShapeContext.walkOnFluidPredicate = value; }

// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(net.minecraft.block.EntityShapeContext.entity); }
// public static void entity(yarnwrap.entity.Entity value, ) { net.minecraft.block.EntityShapeContext.entity = value.wrapperContained; }

// public boolean placement() { return wrapperContained.placement; }
// public void placement(boolean value) { wrapperContained.placement = value; }
// public static boolean placement() { return net.minecraft.block.EntityShapeContext.placement; }
// public static void placement(boolean value, ) { net.minecraft.block.EntityShapeContext.placement = value; }

// public EntityShapeContext(yarnwrap.entity.Entity entity,boolean collidesWithFluid,boolean placement) { this.wrapperContained = new net.minecraft.block.EntityShapeContext(entity.wrapperContained,collidesWithFluid,placement); }
// public EntityShapeContext(boolean descending,boolean placement,double minY,yarnwrap.item.ItemStack heldItem,java.util.function.Predicate walkOnFluidPredicate,yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.block.EntityShapeContext(descending,placement,minY,heldItem.wrapperContained,walkOnFluidPredicate,entity.wrapperContained); }
// public boolean method_27868(yarnwrap.fluid.FluidState fluidState) { return wrapperContained.method_27868(fluidState.wrapperContained); }
// public static boolean method_27868(yarnwrap.fluid.FluidState fluidState, ) { return net.minecraft.block.EntityShapeContext.method_27868(fluidState.wrapperContained); }
public yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(wrapperContained.getEntity()); }
// public static yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(net.minecraft.block.EntityShapeContext.getEntity()); }
// public boolean method_61894(yarnwrap.fluid.FluidState state) { return wrapperContained.method_61894(state.wrapperContained); }
// public static boolean method_61894(yarnwrap.fluid.FluidState state, ) { return net.minecraft.block.EntityShapeContext.method_61894(state.wrapperContained); }
// public boolean method_61895(yarnwrap.fluid.FluidState state) { return wrapperContained.method_61895(state.wrapperContained); }
// public static boolean method_61895(yarnwrap.fluid.FluidState state, ) { return net.minecraft.block.EntityShapeContext.method_61895(state.wrapperContained); }
// public boolean method_67717(yarnwrap.entity.LivingEntity state) { return wrapperContained.method_67717(state.wrapperContained); }
// public static boolean method_67717(yarnwrap.entity.LivingEntity state, ) { return net.minecraft.block.EntityShapeContext.method_67717(state.wrapperContained); }

}