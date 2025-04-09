package yarnwrap.block;
public class SideShapeType { public net.minecraft.block.SideShapeType wrapperContained; public SideShapeType(net.minecraft.block.SideShapeType wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean matches(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.matches(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }

}