package yarnwrap.block;
public class StemBlock { public net.minecraft.block.StemBlock wrapperContained; public StemBlock(net.minecraft.block.StemBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return wrapperContained.AGE_TO_SHAPE; }
// public void AGE_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.AGE_TO_SHAPE = value; }
public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey gourdBlock() { return new yarnwrap.registry.RegistryKey(wrapperContained.gourdBlock); }
// public void gourdBlock(yarnwrap.registry.RegistryKey value) { wrapperContained.gourdBlock = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey pickBlockItem() { return new yarnwrap.registry.RegistryKey(wrapperContained.pickBlockItem); }
// public void pickBlockItem(yarnwrap.registry.RegistryKey value) { wrapperContained.pickBlockItem = value.wrapperContained; }
public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public void MAX_AGE(int value) { wrapperContained.MAX_AGE = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.registry.RegistryKey attachedStemBlock() { return new yarnwrap.registry.RegistryKey(wrapperContained.attachedStemBlock); }
// public void attachedStemBlock(yarnwrap.registry.RegistryKey value) { wrapperContained.attachedStemBlock = value.wrapperContained; }
// public StemBlock(yarnwrap.registry.RegistryKey gourdBlock,yarnwrap.registry.RegistryKey attachedStemBlock,yarnwrap.registry.RegistryKey pickBlockItem,Object settings) { this.wrapperContained = new net.minecraft.block.StemBlock(gourdBlock.wrapperContained,attachedStemBlock.wrapperContained,pickBlockItem.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_54049(Object instance) { return wrapperContained.method_54049(instance); }
// public yarnwrap.registry.RegistryKey method_54050(yarnwrap.block.StemBlock block) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_54050(block.wrapperContained)); }
// public yarnwrap.registry.RegistryKey method_54051(yarnwrap.block.StemBlock block) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_54051(block.wrapperContained)); }
// public yarnwrap.registry.RegistryKey method_54052(yarnwrap.block.StemBlock block) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_54052(block.wrapperContained)); }

}