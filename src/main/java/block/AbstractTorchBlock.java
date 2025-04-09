package yarnwrap.block;
public class AbstractTorchBlock { public net.minecraft.block.AbstractTorchBlock wrapperContained; public AbstractTorchBlock(net.minecraft.block.AbstractTorchBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }

}