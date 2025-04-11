package yarnwrap.data.client;
public class MultipartBlockStateSupplier { public net.minecraft.data.client.MultipartBlockStateSupplier wrapperContained; public MultipartBlockStateSupplier(net.minecraft.data.client.MultipartBlockStateSupplier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
// public java.util.List multiparts() { return wrapperContained.multiparts; }
// public void multiparts(java.util.List value) { wrapperContained.multiparts = value; }
public yarnwrap.data.client.MultipartBlockStateSupplier create(yarnwrap.block.Block block) { return new yarnwrap.data.client.MultipartBlockStateSupplier(wrapperContained.create(block.wrapperContained)); }
public yarnwrap.data.client.MultipartBlockStateSupplier with(yarnwrap.data.client.When condition,yarnwrap.data.client.BlockStateVariant variant) { return new yarnwrap.data.client.MultipartBlockStateSupplier(wrapperContained.with(condition.wrapperContained,variant.wrapperContained)); }
public yarnwrap.data.client.MultipartBlockStateSupplier with(yarnwrap.data.client.When condition,java.util.List variants) { return new yarnwrap.data.client.MultipartBlockStateSupplier(wrapperContained.with(condition.wrapperContained,variants)); }
public yarnwrap.data.client.MultipartBlockStateSupplier with(yarnwrap.data.client.When condition,net.minecraft.data.client.BlockStateVariant[] variants) { return new yarnwrap.data.client.MultipartBlockStateSupplier(wrapperContained.with(condition.wrapperContained,variants)); }
public yarnwrap.data.client.MultipartBlockStateSupplier with(yarnwrap.data.client.BlockStateVariant variant) { return new yarnwrap.data.client.MultipartBlockStateSupplier(wrapperContained.with(variant.wrapperContained)); }
public yarnwrap.data.client.MultipartBlockStateSupplier with(java.util.List variants) { return new yarnwrap.data.client.MultipartBlockStateSupplier(wrapperContained.with(variants)); }

}