package yarnwrap.world;
public class TestableWorld { public net.minecraft.world.TestableWorld wrapperContained; public TestableWorld(net.minecraft.world.TestableWorld wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean testBlockState(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate state) { return wrapperContained.testBlockState(pos.wrapperContained,state); }
public java.util.Optional getBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.BlockEntityType type) { return wrapperContained.getBlockEntity(pos.wrapperContained,type.wrapperContained); }
public boolean testFluidState(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate state) { return wrapperContained.testFluidState(pos.wrapperContained,state); }
// public yarnwrap.util.math.BlockPos getTopPosition(Object heightmap,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getTopPosition(heightmap,pos.wrapperContained)); }

}