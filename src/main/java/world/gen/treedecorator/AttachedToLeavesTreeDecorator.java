package yarnwrap.world.gen.treedecorator;
public class AttachedToLeavesTreeDecorator { public net.minecraft.world.gen.treedecorator.AttachedToLeavesTreeDecorator wrapperContained; public AttachedToLeavesTreeDecorator(net.minecraft.world.gen.treedecorator.AttachedToLeavesTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public float probability() { return wrapperContained.probability; }
// public int exclusionRadiusXZ() { return wrapperContained.exclusionRadiusXZ; }
// public int exclusionRadiusY() { return wrapperContained.exclusionRadiusY; }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider blockProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.blockProvider); }
// public int requiredEmptyBlocks() { return wrapperContained.requiredEmptyBlocks; }
// public java.util.List directions() { return wrapperContained.directions; }
// public boolean meetsRequiredEmptyBlocks(Object generator,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.meetsRequiredEmptyBlocks(generator,pos.wrapperContained,direction.wrapperContained); }

}