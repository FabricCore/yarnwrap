package yarnwrap.world.gen.treedecorator;
public class LeavesVineTreeDecorator { public net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator wrapperContained; public LeavesVineTreeDecorator(net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public float probability() { return wrapperContained.probability; }
// public void placeVines(yarnwrap.util.math.BlockPos pos,yarnwrap.state.property.BooleanProperty faceProperty,Object generator) { wrapperContained.placeVines(pos.wrapperContained,faceProperty.wrapperContained,generator); }

}