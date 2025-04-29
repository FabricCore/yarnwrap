package yarnwrap.data.client;
public class BlockStateSupplier { public net.minecraft.data.client.BlockStateSupplier wrapperContained; public BlockStateSupplier(net.minecraft.data.client.BlockStateSupplier wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.Block getBlock() { return new yarnwrap.block.Block(wrapperContained.getBlock()); }
// public static yarnwrap.block.Block getBlock() { return new yarnwrap.block.Block(net.minecraft.data.client.BlockStateSupplier.getBlock()); }

}