package yarnwrap.entity.decoration;
public class AbstractDecorationEntity { public net.minecraft.entity.decoration.AbstractDecorationEntity wrapperContained; public AbstractDecorationEntity(net.minecraft.entity.decoration.AbstractDecorationEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Predicate PREDICATE() { return wrapperContained.PREDICATE; }
// public yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(wrapperContained.facing); }
// public yarnwrap.util.math.Box getAttachmentBox() { return new yarnwrap.util.math.Box(wrapperContained.getAttachmentBox()); }
// public yarnwrap.util.math.Box calculateBoundingBox(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side) { return new yarnwrap.util.math.Box(wrapperContained.calculateBoundingBox(pos.wrapperContained,side.wrapperContained)); }
// public void setFacing(yarnwrap.util.math.Direction facing) { wrapperContained.setFacing(facing.wrapperContained); }
public void onPlace() { wrapperContained.onPlace(); }

}