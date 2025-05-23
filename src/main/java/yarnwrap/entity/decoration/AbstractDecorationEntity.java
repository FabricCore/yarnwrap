package yarnwrap.entity.decoration;
public class AbstractDecorationEntity { public net.minecraft.entity.decoration.AbstractDecorationEntity wrapperContained; public AbstractDecorationEntity(net.minecraft.entity.decoration.AbstractDecorationEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Predicate PREDICATE() { return wrapperContained.PREDICATE; }
// public void PREDICATE(java.util.function.Predicate value) { wrapperContained.PREDICATE = value; }
// public static java.util.function.Predicate PREDICATE() { return net.minecraft.entity.decoration.AbstractDecorationEntity.PREDICATE; }
// public static void PREDICATE(java.util.function.Predicate value, ) { net.minecraft.entity.decoration.AbstractDecorationEntity.PREDICATE = value; }

// public yarnwrap.entity.data.TrackedData FACING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FACING); }
// public void FACING(yarnwrap.entity.data.TrackedData value) { wrapperContained.FACING = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData FACING() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.decoration.AbstractDecorationEntity.FACING); }
// public static void FACING(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.decoration.AbstractDecorationEntity.FACING = value.wrapperContained; }

// public yarnwrap.util.math.Direction DEFAULT_FACING() { return new yarnwrap.util.math.Direction(wrapperContained.DEFAULT_FACING); }
// public void DEFAULT_FACING(yarnwrap.util.math.Direction value) { wrapperContained.DEFAULT_FACING = value.wrapperContained; }
// public static yarnwrap.util.math.Direction DEFAULT_FACING() { return new yarnwrap.util.math.Direction(net.minecraft.entity.decoration.AbstractDecorationEntity.DEFAULT_FACING); }
// public static void DEFAULT_FACING(yarnwrap.util.math.Direction value, ) { net.minecraft.entity.decoration.AbstractDecorationEntity.DEFAULT_FACING = value.wrapperContained; }

// public AbstractDecorationEntity(yarnwrap.entity.EntityType type,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.entity.decoration.AbstractDecorationEntity(type.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean method_6890(yarnwrap.entity.Entity entity) { return wrapperContained.method_6890(entity.wrapperContained); }
// public static boolean method_6890(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.decoration.AbstractDecorationEntity.method_6890(entity.wrapperContained); }
// public void setFacing(yarnwrap.util.math.Direction facing) { wrapperContained.setFacing(facing.wrapperContained); }
// public static void setFacing(yarnwrap.util.math.Direction facing, ) { net.minecraft.entity.decoration.AbstractDecorationEntity.setFacing(facing.wrapperContained); }
public void onPlace() { wrapperContained.onPlace(); }
// public static void onPlace() { net.minecraft.entity.decoration.AbstractDecorationEntity.onPlace(); }
// public yarnwrap.util.math.Box getAttachmentBox() { return new yarnwrap.util.math.Box(wrapperContained.getAttachmentBox()); }
// public static yarnwrap.util.math.Box getAttachmentBox() { return new yarnwrap.util.math.Box(net.minecraft.entity.decoration.AbstractDecorationEntity.getAttachmentBox()); }
// public boolean method_59942(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_59942(pos.wrapperContained); }
// public static boolean method_59942(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.decoration.AbstractDecorationEntity.method_59942(pos.wrapperContained); }
// public yarnwrap.util.math.Box calculateBoundingBox(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side) { return new yarnwrap.util.math.Box(wrapperContained.calculateBoundingBox(pos.wrapperContained,side.wrapperContained)); }
// public static yarnwrap.util.math.Box calculateBoundingBox(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side, ) { return new yarnwrap.util.math.Box(net.minecraft.entity.decoration.AbstractDecorationEntity.calculateBoundingBox(pos.wrapperContained,side.wrapperContained)); }
// public void setFacingInternal(yarnwrap.util.math.Direction facing) { wrapperContained.setFacingInternal(facing.wrapperContained); }
// public static void setFacingInternal(yarnwrap.util.math.Direction facing, ) { net.minecraft.entity.decoration.AbstractDecorationEntity.setFacingInternal(facing.wrapperContained); }

}