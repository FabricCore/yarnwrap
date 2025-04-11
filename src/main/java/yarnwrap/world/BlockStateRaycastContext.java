package yarnwrap.world;
public class BlockStateRaycastContext { public net.minecraft.world.BlockStateRaycastContext wrapperContained; public BlockStateRaycastContext(net.minecraft.world.BlockStateRaycastContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d start() { return new yarnwrap.util.math.Vec3d(wrapperContained.start); }
// public void start(yarnwrap.util.math.Vec3d value) { wrapperContained.start = value.wrapperContained; }
// public yarnwrap.util.math.Vec3d end() { return new yarnwrap.util.math.Vec3d(wrapperContained.end); }
// public void end(yarnwrap.util.math.Vec3d value) { wrapperContained.end = value.wrapperContained; }
// public java.util.function.Predicate statePredicate() { return wrapperContained.statePredicate; }
// public void statePredicate(java.util.function.Predicate value) { wrapperContained.statePredicate = value; }
public BlockStateRaycastContext(yarnwrap.util.math.Vec3d start,yarnwrap.util.math.Vec3d end,java.util.function.Predicate statePredicate) { this.wrapperContained = new net.minecraft.world.BlockStateRaycastContext(start.wrapperContained,end.wrapperContained,statePredicate); }
public yarnwrap.util.math.Vec3d getEnd() { return new yarnwrap.util.math.Vec3d(wrapperContained.getEnd()); }
public yarnwrap.util.math.Vec3d getStart() { return new yarnwrap.util.math.Vec3d(wrapperContained.getStart()); }
public java.util.function.Predicate getStatePredicate() { return wrapperContained.getStatePredicate(); }

}