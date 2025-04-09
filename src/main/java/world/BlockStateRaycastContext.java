package yarnwrap.world;
public class BlockStateRaycastContext { public net.minecraft.world.BlockStateRaycastContext wrapperContained; public BlockStateRaycastContext(net.minecraft.world.BlockStateRaycastContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d start() { return new yarnwrap.util.math.Vec3d(wrapperContained.start); }
// public yarnwrap.util.math.Vec3d end() { return new yarnwrap.util.math.Vec3d(wrapperContained.end); }
// public java.util.function.Predicate statePredicate() { return wrapperContained.statePredicate; }
public yarnwrap.util.math.Vec3d getEnd() { return new yarnwrap.util.math.Vec3d(wrapperContained.getEnd()); }
public yarnwrap.util.math.Vec3d getStart() { return new yarnwrap.util.math.Vec3d(wrapperContained.getStart()); }
public java.util.function.Predicate getStatePredicate() { return wrapperContained.getStatePredicate(); }

}