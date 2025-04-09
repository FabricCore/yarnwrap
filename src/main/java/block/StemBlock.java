package yarnwrap.block;
public class StemBlock { public net.minecraft.block.StemBlock wrapperContained; public StemBlock(net.minecraft.block.StemBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return wrapperContained.AGE_TO_SHAPE; }
public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public yarnwrap.registry.RegistryKey gourdBlock() { return new yarnwrap.registry.RegistryKey(wrapperContained.gourdBlock); }
// public yarnwrap.registry.RegistryKey pickBlockItem() { return new yarnwrap.registry.RegistryKey(wrapperContained.pickBlockItem); }
public int MAX_AGE() { return wrapperContained.MAX_AGE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.registry.RegistryKey attachedStemBlock() { return new yarnwrap.registry.RegistryKey(wrapperContained.attachedStemBlock); }

}