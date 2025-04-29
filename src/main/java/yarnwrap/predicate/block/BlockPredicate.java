package yarnwrap.predicate.block;
public class BlockPredicate { public net.minecraft.predicate.block.BlockPredicate wrapperContained; public BlockPredicate(net.minecraft.predicate.block.BlockPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
// public static yarnwrap.block.Block block() { return new yarnwrap.block.Block(net.minecraft.predicate.block.BlockPredicate.block); }
// public static void block(yarnwrap.block.Block value, ) { net.minecraft.predicate.block.BlockPredicate.block = value.wrapperContained; }

public BlockPredicate(yarnwrap.block.Block block) { this.wrapperContained = new net.minecraft.predicate.block.BlockPredicate(block.wrapperContained); }
// public yarnwrap.predicate.block.BlockPredicate make(yarnwrap.block.Block block) { return new yarnwrap.predicate.block.BlockPredicate(wrapperContained.make(block.wrapperContained)); }
// public static yarnwrap.predicate.block.BlockPredicate make(yarnwrap.block.Block block, ) { return new yarnwrap.predicate.block.BlockPredicate(net.minecraft.predicate.block.BlockPredicate.make(block.wrapperContained)); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.predicate.block.BlockPredicate.test(context); }

}