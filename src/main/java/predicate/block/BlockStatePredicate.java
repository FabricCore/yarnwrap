package yarnwrap.predicate.block;
public class BlockStatePredicate { public net.minecraft.predicate.block.BlockStatePredicate wrapperContained; public BlockStatePredicate(net.minecraft.predicate.block.BlockStatePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Predicate ANY() { return wrapperContained.ANY; }
// public yarnwrap.state.StateManager manager() { return new yarnwrap.state.StateManager(wrapperContained.manager); }
// public java.util.Map propertyTests() { return wrapperContained.propertyTests; }
public yarnwrap.predicate.block.BlockStatePredicate forBlock(yarnwrap.block.Block block) { return new yarnwrap.predicate.block.BlockStatePredicate(wrapperContained.forBlock(block.wrapperContained)); }
// public boolean testProperty(yarnwrap.block.BlockState blockState,yarnwrap.state.property.Property property,java.util.function.Predicate predicate) { return wrapperContained.testProperty(blockState.wrapperContained,property.wrapperContained,predicate); }
public yarnwrap.predicate.block.BlockStatePredicate with(yarnwrap.state.property.Property property,java.util.function.Predicate predicate) { return new yarnwrap.predicate.block.BlockStatePredicate(wrapperContained.with(property.wrapperContained,predicate)); }

}