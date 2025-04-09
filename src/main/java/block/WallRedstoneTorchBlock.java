package yarnwrap.block;
public class WallRedstoneTorchBlock { public net.minecraft.block.WallRedstoneTorchBlock wrapperContained; public WallRedstoneTorchBlock(net.minecraft.block.WallRedstoneTorchBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}