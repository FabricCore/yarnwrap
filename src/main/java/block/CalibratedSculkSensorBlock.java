package yarnwrap.block;
public class CalibratedSculkSensorBlock { public net.minecraft.block.CalibratedSculkSensorBlock wrapperContained; public CalibratedSculkSensorBlock(net.minecraft.block.CalibratedSculkSensorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}