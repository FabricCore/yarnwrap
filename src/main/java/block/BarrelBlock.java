package yarnwrap.block;
public class BarrelBlock { public net.minecraft.block.BarrelBlock wrapperContained; public BarrelBlock(net.minecraft.block.BarrelBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
public yarnwrap.state.property.BooleanProperty OPEN() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OPEN); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}