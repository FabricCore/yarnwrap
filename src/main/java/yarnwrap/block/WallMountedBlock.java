package yarnwrap.block;
public class WallMountedBlock { public net.minecraft.block.WallMountedBlock wrapperContained; public WallMountedBlock(net.minecraft.block.WallMountedBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.EnumProperty FACE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACE); }
// public void FACE(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACE = value.wrapperContained; }
// public yarnwrap.util.math.Direction getDirection(yarnwrap.block.BlockState state) { return new yarnwrap.util.math.Direction(wrapperContained.getDirection(state.wrapperContained)); }
public boolean canPlaceAt(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.canPlaceAt(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }

}