package yarnwrap.block;
public class AttachedStemBlock { public net.minecraft.block.AttachedStemBlock wrapperContained; public AttachedStemBlock(net.minecraft.block.AttachedStemBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey pickBlockItem() { return new yarnwrap.registry.RegistryKey(wrapperContained.pickBlockItem); }
// public void pickBlockItem(yarnwrap.registry.RegistryKey value) { wrapperContained.pickBlockItem = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.registry.RegistryKey stemBlock() { return new yarnwrap.registry.RegistryKey(wrapperContained.stemBlock); }
// public void stemBlock(yarnwrap.registry.RegistryKey value) { wrapperContained.stemBlock = value.wrapperContained; }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
// public java.util.Map FACING_TO_SHAPE() { return wrapperContained.FACING_TO_SHAPE; }
// public void FACING_TO_SHAPE(java.util.Map value) { wrapperContained.FACING_TO_SHAPE = value; }
// public yarnwrap.registry.RegistryKey gourdBlock() { return new yarnwrap.registry.RegistryKey(wrapperContained.gourdBlock); }
// public void gourdBlock(yarnwrap.registry.RegistryKey value) { wrapperContained.gourdBlock = value.wrapperContained; }

}