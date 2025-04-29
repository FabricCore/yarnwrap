package yarnwrap.entity.decoration;
public class AbstractDecorationEntity { public net.minecraft.entity.decoration.AbstractDecorationEntity wrapperContained; public AbstractDecorationEntity(net.minecraft.entity.decoration.AbstractDecorationEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Predicate PREDICATE() { return wrapperContained.PREDICATE; }
// public void PREDICATE(java.util.function.Predicate value) { wrapperContained.PREDICATE = value; }
// public static java.util.function.Predicate PREDICATE() { return net.minecraft.entity.decoration.AbstractDecorationEntity.PREDICATE; }
// public static void PREDICATE(java.util.function.Predicate value, ) { net.minecraft.entity.decoration.AbstractDecorationEntity.PREDICATE = value; }

// public yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(wrapperContained.facing); }
// public void facing(yarnwrap.util.math.Direction value) { wrapperContained.facing = value.wrapperContained; }
// public static yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(net.minecraft.entity.decoration.AbstractDecorationEntity.facing); }
// public static void facing(yarnwrap.util.math.Direction value, ) { net.minecraft.entity.decoration.AbstractDecorationEntity.facing = value.wrapperContained; }

// public AbstractDecorationEntity(yarnwrap.entity.EntityType type,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.entity.decoration.AbstractDecorationEntity(type.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.util.math.Box getAttachmentBox() { return new yarnwrap.util.math.Box(wrapperContained.getAttachmentBox()); }
// public static yarnwrap.util.math.Box getAttachmentBox() { return new yarnwrap.util.math.Box(net.minecraft.entity.decoration.AbstractDecorationEntity.getAttachmentBox()); }
// public boolean method_59942(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_59942(pos.wrapperContained); }
// public static boolean method_59942(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.decoration.AbstractDecorationEntity.method_59942(pos.wrapperContained); }
// public yarnwrap.util.math.Box calculateBoundingBox(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side) { return new yarnwrap.util.math.Box(wrapperContained.calculateBoundingBox(pos.wrapperContained,side.wrapperContained)); }
// public static yarnwrap.util.math.Box calculateBoundingBox(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side, ) { return new yarnwrap.util.math.Box(net.minecraft.entity.decoration.AbstractDecorationEntity.calculateBoundingBox(pos.wrapperContained,side.wrapperContained)); }
// public boolean method_6890(yarnwrap.entity.Entity entity) { return wrapperContained.method_6890(entity.wrapperContained); }
// public static boolean method_6890(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.decoration.AbstractDecorationEntity.method_6890(entity.wrapperContained); }
// public void setFacing(yarnwrap.util.math.Direction facing) { wrapperContained.setFacing(facing.wrapperContained); }
// public static void setFacing(yarnwrap.util.math.Direction facing, ) { net.minecraft.entity.decoration.AbstractDecorationEntity.setFacing(facing.wrapperContained); }
public void onPlace() { wrapperContained.onPlace(); }
// public static void onPlace() { net.minecraft.entity.decoration.AbstractDecorationEntity.onPlace(); }

}