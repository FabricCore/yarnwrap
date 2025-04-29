package yarnwrap.block;
public class CaveVines { public net.minecraft.block.CaveVines wrapperContained; public CaveVines(net.minecraft.block.CaveVines wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.CaveVines.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.CaveVines.SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty BERRIES() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.BERRIES); }
// public void BERRIES(yarnwrap.state.property.BooleanProperty value) { wrapperContained.BERRIES = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty BERRIES() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.CaveVines.BERRIES); }
// public static void BERRIES(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.CaveVines.BERRIES = value.wrapperContained; }

// public boolean hasBerries(yarnwrap.block.BlockState state) { return wrapperContained.hasBerries(state.wrapperContained); }
// public static boolean hasBerries(yarnwrap.block.BlockState state, ) { return net.minecraft.block.CaveVines.hasBerries(state.wrapperContained); }
// public yarnwrap.util.ActionResult pickBerries(yarnwrap.entity.Entity picker,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.ActionResult(wrapperContained.pickBerries(picker.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.ActionResult pickBerries(yarnwrap.entity.Entity picker,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.ActionResult(net.minecraft.block.CaveVines.pickBerries(picker.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public int method_37361(int state) { return wrapperContained.method_37361(state); }
// public static int method_37361(int state, ) { return net.minecraft.block.CaveVines.method_37361(state); }
// public java.util.function.ToIntFunction getLuminanceSupplier(int luminance) { return wrapperContained.getLuminanceSupplier(luminance); }
// public static java.util.function.ToIntFunction getLuminanceSupplier(int luminance, ) { return net.minecraft.block.CaveVines.getLuminanceSupplier(luminance); }

}