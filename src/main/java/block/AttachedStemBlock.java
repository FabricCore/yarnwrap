package yarnwrap.block;
public class AttachedStemBlock { public net.minecraft.block.AttachedStemBlock wrapperContained; public AttachedStemBlock(net.minecraft.block.AttachedStemBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey pickBlockItem() { return new yarnwrap.registry.RegistryKey(wrapperContained.pickBlockItem); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.registry.RegistryKey stemBlock() { return new yarnwrap.registry.RegistryKey(wrapperContained.stemBlock); }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public java.util.Map FACING_TO_SHAPE() { return wrapperContained.FACING_TO_SHAPE; }
// public yarnwrap.registry.RegistryKey gourdBlock() { return new yarnwrap.registry.RegistryKey(wrapperContained.gourdBlock); }

}