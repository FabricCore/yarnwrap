package yarnwrap.block;
public class CaveVines { public net.minecraft.block.CaveVines wrapperContained; public CaveVines(net.minecraft.block.CaveVines wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public yarnwrap.state.property.BooleanProperty BERRIES() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.BERRIES); }
// public boolean hasBerries(yarnwrap.block.BlockState state) { return wrapperContained.hasBerries(state.wrapperContained); }
// public yarnwrap.util.ActionResult pickBerries(yarnwrap.entity.Entity picker,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.ActionResult(wrapperContained.pickBerries(picker.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public java.util.function.ToIntFunction getLuminanceSupplier(int luminance) { return wrapperContained.getLuminanceSupplier(luminance); }

}