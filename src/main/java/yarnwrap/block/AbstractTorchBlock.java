package yarnwrap.block;
public class AbstractTorchBlock { public net.minecraft.block.AbstractTorchBlock wrapperContained; public AbstractTorchBlock(net.minecraft.block.AbstractTorchBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractTorchBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.AbstractTorchBlock.SHAPE = value.wrapperContained; }


}