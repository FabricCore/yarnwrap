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
// public VariantsBlockStateSupplier(yarnwrap.block.Block block,java.util.List variants) { this.wrapperContained = new net.minecraft.data.client.VariantsBlockStateSupplier(block.wrapperContained,variants); }
public yarnwrap.data.client.VariantsBlockStateSupplier create(yarnwrap.block.Block block) { return new yarnwrap.data.client.VariantsBlockStateSupplier(wrapperContained.create(block.wrapperContained)); }
public yarnwrap.data.client.VariantsBlockStateSupplier create(yarnwrap.block.Block block,yarnwrap.data.client.BlockStateVariant variant) { return new yarnwrap.data.client.VariantsBlockStateSupplier(wrapperContained.create(block.wrapperContained,variant.wrapperContained)); }
public yarnwrap.data.client.VariantsBlockStateSupplier create(yarnwrap.block.Block block,net.minecraft.data.client.BlockStateVariant[] variants) { return new yarnwrap.data.client.VariantsBlockStateSupplier(wrapperContained.create(block.wrapperContained,variants)); }
// public void method_25772(yarnwrap.state.property.Property property) { wrapperContained.method_25772(property.wrapperContained); }
// public void method_25773(Object rightVariant) { wrapperContained.method_25773(rightVariant); }
// public com.mojang.datafixers.util.Pair method_25774(com.mojang.datafixers.util.Pair entry) { return wrapperContained.method_25774(entry); }
public yarnwrap.data.client.VariantsBlockStateSupplier coordinate(yarnwrap.data.client.BlockStateVariantMap map) { return new yarnwrap.data.client.VariantsBlockStateSupplier(wrapperContained.coordinate(map.wrapperContained)); }
// public void method_25776(java.util.List leftVariant) { wrapperContained.method_25776(leftVariant); }
// public java.util.List intersect(java.util.List left,java.util.List right) { return wrapperContained.intersect(left,right); }
// public void method_25778(java.util.Map json) { wrapperContained.method_25778(json); }
// public void method_25779(java.util.Map pair) { wrapperContained.method_25779(pair); }
// public java.util.stream.Stream method_25781(java.util.Map pair) { return wrapperContained.method_25781(pair); }

}