package yarnwrap.block;
public class DoubleBlockProperties { public net.minecraft.block.DoubleBlockProperties wrapperContained; public DoubleBlockProperties(net.minecraft.block.DoubleBlockProperties wrapperContained) { this.wrapperContained = wrapperContained; }

public Object toPropertySource(yarnwrap.block.entity.BlockEntityType blockEntityType,java.util.function.Function typeMapper,java.util.function.Function directionMapper,yarnwrap.state.property.DirectionProperty directionProperty,yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,java.util.function.BiPredicate fallbackTester) { return wrapperContained.toPropertySource(blockEntityType.wrapperContained,typeMapper,directionMapper,directionProperty.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained,fallbackTester); }

}