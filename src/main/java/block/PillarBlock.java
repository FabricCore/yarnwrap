package yarnwrap.block;
public class PillarBlock { public net.minecraft.block.PillarBlock wrapperContained; public PillarBlock(net.minecraft.block.PillarBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.EnumProperty AXIS() { return new yarnwrap.state.property.EnumProperty(wrapperContained.AXIS); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.block.BlockState changeRotation(yarnwrap.block.BlockState state,yarnwrap.util.BlockRotation rotation) { return new yarnwrap.block.BlockState(wrapperContained.changeRotation(state.wrapperContained,rotation.wrapperContained)); }

}