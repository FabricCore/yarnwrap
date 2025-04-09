package yarnwrap.predicate.block;
public class BlockPredicate { public net.minecraft.predicate.block.BlockPredicate wrapperContained; public BlockPredicate(net.minecraft.predicate.block.BlockPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
public yarnwrap.predicate.block.BlockPredicate make(yarnwrap.block.Block block) { return new yarnwrap.predicate.block.BlockPredicate(wrapperContained.make(block.wrapperContained)); }

}