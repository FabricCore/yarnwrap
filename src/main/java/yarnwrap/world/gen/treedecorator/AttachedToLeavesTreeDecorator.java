package yarnwrap.world.gen.treedecorator;
public class AttachedToLeavesTreeDecorator { public net.minecraft.world.gen.treedecorator.AttachedToLeavesTreeDecorator wrapperContained; public AttachedToLeavesTreeDecorator(net.minecraft.world.gen.treedecorator.AttachedToLeavesTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
// public int exclusionRadiusXZ() { return wrapperContained.exclusionRadiusXZ; }
// public void exclusionRadiusXZ(int value) { wrapperContained.exclusionRadiusXZ = value; }
// public int exclusionRadiusY() { return wrapperContained.exclusionRadiusY; }
// public void exclusionRadiusY(int value) { wrapperContained.exclusionRadiusY = value; }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider blockProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.blockProvider); }
// public void blockProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.blockProvider = value.wrapperContained; }
// public int requiredEmptyBlocks() { return wrapperContained.requiredEmptyBlocks; }
// public void requiredEmptyBlocks(int value) { wrapperContained.requiredEmptyBlocks = value; }
// public java.util.List directions() { return wrapperContained.directions; }
// public void directions(java.util.List value) { wrapperContained.directions = value; }
public AttachedToLeavesTreeDecorator(float probability,int exclusionRadiusXZ,int exclusionRadiusY,yarnwrap.world.gen.stateprovider.BlockStateProvider blockProvider,int requiredEmptyBlocks,java.util.List directions) { this.wrapperContained = new net.minecraft.world.gen.treedecorator.AttachedToLeavesTreeDecorator(probability,exclusionRadiusXZ,exclusionRadiusY,blockProvider.wrapperContained,requiredEmptyBlocks,directions); }
// public boolean meetsRequiredEmptyBlocks(Object generator,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.meetsRequiredEmptyBlocks(generator,pos.wrapperContained,direction.wrapperContained); }
// public java.util.List method_43189(yarnwrap.world.gen.treedecorator.AttachedToLeavesTreeDecorator treeDecorator) { return wrapperContained.method_43189(treeDecorator.wrapperContained); }
// public java.lang.Integer method_43190(yarnwrap.world.gen.treedecorator.AttachedToLeavesTreeDecorator treeDecorator) { return wrapperContained.method_43190(treeDecorator.wrapperContained); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_43191(yarnwrap.world.gen.treedecorator.AttachedToLeavesTreeDecorator treeDecorator) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_43191(treeDecorator.wrapperContained)); }
// public java.lang.Integer method_43192(yarnwrap.world.gen.treedecorator.AttachedToLeavesTreeDecorator treeDecorator) { return wrapperContained.method_43192(treeDecorator.wrapperContained); }
// public java.lang.Integer method_43193(yarnwrap.world.gen.treedecorator.AttachedToLeavesTreeDecorator treeDecorator) { return wrapperContained.method_43193(treeDecorator.wrapperContained); }
// public java.lang.Float method_43194(yarnwrap.world.gen.treedecorator.AttachedToLeavesTreeDecorator treeDecorator) { return wrapperContained.method_43194(treeDecorator.wrapperContained); }

}