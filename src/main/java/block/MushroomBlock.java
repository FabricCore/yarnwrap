package yarnwrap.block;
public class MushroomBlock { public net.minecraft.block.MushroomBlock wrapperContained; public MushroomBlock(net.minecraft.block.MushroomBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty UP() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.UP); }
public yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WEST); }
// public java.util.Map FACING_PROPERTIES() { return wrapperContained.FACING_PROPERTIES; }
public yarnwrap.state.property.BooleanProperty DOWN() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.DOWN); }
public yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SOUTH); }
public yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NORTH); }
public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}