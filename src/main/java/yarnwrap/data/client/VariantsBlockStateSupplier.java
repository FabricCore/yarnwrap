package yarnwrap.data.client;
public class VariantsBlockStateSupplier { public net.minecraft.data.client.VariantsBlockStateSupplier wrapperContained; public VariantsBlockStateSupplier(net.minecraft.data.client.VariantsBlockStateSupplier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
// public java.util.List variants() { return wrapperContained.variants; }
// public void variants(java.util.List value) { wrapperContained.variants = value; }
// public java.util.Set definedProperties() { return wrapperContained.definedProperties; }
// public void definedProperties(java.util.Set value) { wrapperContained.definedProperties = value; }
// public java.util.List variantMaps() { return wrapperContained.variantMaps; }
// public void variantMaps(java.util.List value) { wrapperContained.variantMaps = value; }
public yarnwrap.data.client.VariantsBlockStateSupplier create(yarnwrap.block.Block block) { return new yarnwrap.data.client.VariantsBlockStateSupplier(wrapperContained.create(block.wrapperContained)); }
public yarnwrap.data.client.VariantsBlockStateSupplier create(yarnwrap.block.Block block,yarnwrap.data.client.BlockStateVariant variant) { return new yarnwrap.data.client.VariantsBlockStateSupplier(wrapperContained.create(block.wrapperContained,variant.wrapperContained)); }
public yarnwrap.data.client.VariantsBlockStateSupplier create(yarnwrap.block.Block block,net.minecraft.data.client.BlockStateVariant[] variants) { return new yarnwrap.data.client.VariantsBlockStateSupplier(wrapperContained.create(block.wrapperContained,variants)); }
public yarnwrap.data.client.VariantsBlockStateSupplier coordinate(yarnwrap.data.client.BlockStateVariantMap map) { return new yarnwrap.data.client.VariantsBlockStateSupplier(wrapperContained.coordinate(map.wrapperContained)); }
// public java.util.List intersect(java.util.List left,java.util.List right) { return wrapperContained.intersect(left,right); }

}