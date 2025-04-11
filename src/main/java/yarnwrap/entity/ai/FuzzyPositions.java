package yarnwrap.entity.ai;
public class FuzzyPositions { public net.minecraft.entity.ai.FuzzyPositions wrapperContained; public FuzzyPositions(net.minecraft.entity.ai.FuzzyPositions wrapperContained) { this.wrapperContained = wrapperContained; }

// public int GAUSS_RANGE() { return wrapperContained.GAUSS_RANGE; }
// public void GAUSS_RANGE(int value) { wrapperContained.GAUSS_RANGE = value; }
public yarnwrap.util.math.BlockPos towardTarget(yarnwrap.entity.mob.PathAwareEntity entity,int horizontalRange,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos fuzz) { return new yarnwrap.util.math.BlockPos(wrapperContained.towardTarget(entity.wrapperContained,horizontalRange,random.wrapperContained,fuzz.wrapperContained)); }
public yarnwrap.util.math.Vec3d guessBestPathTarget(yarnwrap.entity.mob.PathAwareEntity entity,java.util.function.Supplier factory) { return new yarnwrap.util.math.Vec3d(wrapperContained.guessBestPathTarget(entity.wrapperContained,factory)); }
public yarnwrap.util.math.BlockPos upWhile(yarnwrap.util.math.BlockPos pos,int extraAbove,int max,java.util.function.Predicate condition) { return new yarnwrap.util.math.BlockPos(wrapperContained.upWhile(pos.wrapperContained,extraAbove,max,condition)); }
public yarnwrap.util.math.BlockPos upWhile(yarnwrap.util.math.BlockPos pos,int maxY,java.util.function.Predicate condition) { return new yarnwrap.util.math.BlockPos(wrapperContained.upWhile(pos.wrapperContained,maxY,condition)); }
public yarnwrap.util.math.BlockPos localFuzz(yarnwrap.util.math.random.Random random,int horizontalRange,int verticalRange) { return new yarnwrap.util.math.BlockPos(wrapperContained.localFuzz(random.wrapperContained,horizontalRange,verticalRange)); }
public yarnwrap.util.math.BlockPos localFuzz(yarnwrap.util.math.random.Random random,int horizontalRange,int verticalRange,int startHeight,double directionX,double directionZ,double angleRange) { return new yarnwrap.util.math.BlockPos(wrapperContained.localFuzz(random.wrapperContained,horizontalRange,verticalRange,startHeight,directionX,directionZ,angleRange)); }
public yarnwrap.util.math.Vec3d guessBest(java.util.function.Supplier factory,java.util.function.ToDoubleFunction scorer) { return new yarnwrap.util.math.Vec3d(wrapperContained.guessBest(factory,scorer)); }

}