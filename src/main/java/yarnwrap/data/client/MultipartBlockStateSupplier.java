package yarnwrap.data.client;
public class MultipartBlockStateSupplier { public net.minecraft.data.client.MultipartBlockStateSupplier wrapperContained; public MultipartBlockStateSupplier(net.minecraft.data.client.MultipartBlockStateSupplier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
// public static yarnwrap.block.Block block() { return new yarnwrap.block.Block(net.minecraft.data.client.MultipartBlockStateSupplier.block); }
// public static void block(yarnwrap.block.Block value, ) { net.minecraft.data.client.MultipartBlockStateSupplier.block = value.wrapperContained; }

// public java.util.List multiparts() { return wrapperContained.multiparts; }
// public void multiparts(java.util.List value) { wrapperContained.multiparts = value; }
// public static java.util.List multiparts() { return net.minecraft.data.client.MultipartBlockStateSupplier.multiparts; }
// public static void multiparts(java.util.List value, ) { net.minecraft.data.client.MultipartBlockStateSupplier.multiparts = value; }

// public MultipartBlockStateSupplier(yarnwrap.block.Block block) { this.wrapperContained = new net.minecraft.data.client.MultipartBlockStateSupplier(block.wrapperContained); }
// public yarnwrap.data.client.MultipartBlockStateSupplier create(yarnwrap.block.Block block) { return new yarnwrap.data.client.MultipartBlockStateSupplier(wrapperContained.create(block.wrapperContained)); }
// public static yarnwrap.data.client.MultipartBlockStateSupplier create(yarnwrap.block.Block block, ) { return new yarnwrap.data.client.MultipartBlockStateSupplier(net.minecraft.data.client.MultipartBlockStateSupplier.create(block.wrapperContained)); }
// public void method_25759(yarnwrap.state.StateManager multipart) { wrapperContained.method_25759(multipart.wrapperContained); }
// public static void method_25759(yarnwrap.state.StateManager multipart, ) { net.minecraft.data.client.MultipartBlockStateSupplier.method_25759(multipart.wrapperContained); }
public yarnwrap.data.client.MultipartBlockStateSupplier with(yarnwrap.data.client.When condition,yarnwrap.data.client.BlockStateVariant variant) { return new yarnwrap.data.client.MultipartBlockStateSupplier(wrapperContained.with(condition.wrapperContained,variant.wrapperContained)); }
// public static yarnwrap.data.client.MultipartBlockStateSupplier with(yarnwrap.data.client.When condition,yarnwrap.data.client.BlockStateVariant variant, ) { return new yarnwrap.data.client.MultipartBlockStateSupplier(net.minecraft.data.client.MultipartBlockStateSupplier.with(condition.wrapperContained,variant.wrapperContained)); }
public yarnwrap.data.client.MultipartBlockStateSupplier with(yarnwrap.data.client.When condition,java.util.List variants) { return new yarnwrap.data.client.MultipartBlockStateSupplier(wrapperContained.with(condition.wrapperContained,variants)); }
// public static yarnwrap.data.client.MultipartBlockStateSupplier with(yarnwrap.data.client.When condition,java.util.List variants, ) { return new yarnwrap.data.client.MultipartBlockStateSupplier(net.minecraft.data.client.MultipartBlockStateSupplier.with(condition.wrapperContained,variants)); }
public yarnwrap.data.client.MultipartBlockStateSupplier with(yarnwrap.data.client.When condition,net.minecraft.data.client.BlockStateVariant[] variants) { return new yarnwrap.data.client.MultipartBlockStateSupplier(wrapperContained.with(condition.wrapperContained,variants)); }
// public static yarnwrap.data.client.MultipartBlockStateSupplier with(yarnwrap.data.client.When condition,net.minecraft.data.client.BlockStateVariant[] variants, ) { return new yarnwrap.data.client.MultipartBlockStateSupplier(net.minecraft.data.client.MultipartBlockStateSupplier.with(condition.wrapperContained,variants)); }
public yarnwrap.data.client.MultipartBlockStateSupplier with(yarnwrap.data.client.BlockStateVariant variant) { return new yarnwrap.data.client.MultipartBlockStateSupplier(wrapperContained.with(variant.wrapperContained)); }
// public static yarnwrap.data.client.MultipartBlockStateSupplier with(yarnwrap.data.client.BlockStateVariant variant, ) { return new yarnwrap.data.client.MultipartBlockStateSupplier(net.minecraft.data.client.MultipartBlockStateSupplier.with(variant.wrapperContained)); }
public yarnwrap.data.client.MultipartBlockStateSupplier with(java.util.List variants) { return new yarnwrap.data.client.MultipartBlockStateSupplier(wrapperContained.with(variants)); }
// public static yarnwrap.data.client.MultipartBlockStateSupplier with(java.util.List variants, ) { return new yarnwrap.data.client.MultipartBlockStateSupplier(net.minecraft.data.client.MultipartBlockStateSupplier.with(variants)); }

}