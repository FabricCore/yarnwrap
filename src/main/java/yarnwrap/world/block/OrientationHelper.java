package yarnwrap.world.block;
public class OrientationHelper { public net.minecraft.world.block.OrientationHelper wrapperContained; public OrientationHelper(net.minecraft.world.block.OrientationHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.block.WireOrientation getEmissionOrientation(yarnwrap.world.World world,yarnwrap.util.math.Direction up,yarnwrap.util.math.Direction front) { return new yarnwrap.world.block.WireOrientation(wrapperContained.getEmissionOrientation(world.wrapperContained,up.wrapperContained,front.wrapperContained)); }
// public static yarnwrap.world.block.WireOrientation getEmissionOrientation(yarnwrap.world.World world,yarnwrap.util.math.Direction up,yarnwrap.util.math.Direction front, ) { return new yarnwrap.world.block.WireOrientation(net.minecraft.world.block.OrientationHelper.getEmissionOrientation(world.wrapperContained,up.wrapperContained,front.wrapperContained)); }
// public yarnwrap.world.block.WireOrientation withFrontNullable(yarnwrap.world.block.WireOrientation orientation,yarnwrap.util.math.Direction direction) { return new yarnwrap.world.block.WireOrientation(wrapperContained.withFrontNullable(orientation.wrapperContained,direction.wrapperContained)); }
// public static yarnwrap.world.block.WireOrientation withFrontNullable(yarnwrap.world.block.WireOrientation orientation,yarnwrap.util.math.Direction direction, ) { return new yarnwrap.world.block.WireOrientation(net.minecraft.world.block.OrientationHelper.withFrontNullable(orientation.wrapperContained,direction.wrapperContained)); }

}