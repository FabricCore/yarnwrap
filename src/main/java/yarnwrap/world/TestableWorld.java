package yarnwrap.world;
public class TestableWorld { public net.minecraft.world.TestableWorld wrapperContained; public TestableWorld(net.minecraft.world.TestableWorld wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean testBlockState(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate state) { return wrapperContained.testBlockState(pos.wrapperContained,state); }
// public static boolean testBlockState(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate state, ) { return net.minecraft.world.TestableWorld.testBlockState(pos.wrapperContained,state); }
public java.util.Optional getBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.BlockEntityType type) { return wrapperContained.getBlockEntity(pos.wrapperContained,type.wrapperContained); }
// public static java.util.Optional getBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.BlockEntityType type, ) { return net.minecraft.world.TestableWorld.getBlockEntity(pos.wrapperContained,type.wrapperContained); }
public boolean testFluidState(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate state) { return wrapperContained.testFluidState(pos.wrapperContained,state); }
// public static boolean testFluidState(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate state, ) { return net.minecraft.world.TestableWorld.testFluidState(pos.wrapperContained,state); }
// public yarnwrap.util.math.BlockPos getTopPosition(Object heightmap,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getTopPosition(heightmap,pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos getTopPosition(Object heightmap,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.TestableWorld.getTopPosition(heightmap,pos.wrapperContained)); }

}