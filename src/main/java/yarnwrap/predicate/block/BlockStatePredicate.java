package yarnwrap.predicate.block;
public class BlockStatePredicate { public net.minecraft.predicate.block.BlockStatePredicate wrapperContained; public BlockStatePredicate(net.minecraft.predicate.block.BlockStatePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Predicate ANY() { return wrapperContained.ANY; }
// public void ANY(java.util.function.Predicate value) { wrapperContained.ANY = value; }
public static java.util.function.Predicate ANY() { return net.minecraft.predicate.block.BlockStatePredicate.ANY; }
// public static void ANY(java.util.function.Predicate value, ) { net.minecraft.predicate.block.BlockStatePredicate.ANY = value; }

// public yarnwrap.state.StateManager manager() { return new yarnwrap.state.StateManager(wrapperContained.manager); }
// public void manager(yarnwrap.state.StateManager value) { wrapperContained.manager = value.wrapperContained; }
// public static yarnwrap.state.StateManager manager() { return new yarnwrap.state.StateManager(net.minecraft.predicate.block.BlockStatePredicate.manager); }
// public static void manager(yarnwrap.state.StateManager value, ) { net.minecraft.predicate.block.BlockStatePredicate.manager = value.wrapperContained; }

// public java.util.Map propertyTests() { return wrapperContained.propertyTests; }
// public void propertyTests(java.util.Map value) { wrapperContained.propertyTests = value; }
// public static java.util.Map propertyTests() { return net.minecraft.predicate.block.BlockStatePredicate.propertyTests; }
// public static void propertyTests(java.util.Map value, ) { net.minecraft.predicate.block.BlockStatePredicate.propertyTests = value; }

// public BlockStatePredicate(yarnwrap.state.StateManager manager) { this.wrapperContained = new net.minecraft.predicate.block.BlockStatePredicate(manager.wrapperContained); }
// public yarnwrap.predicate.block.BlockStatePredicate forBlock(yarnwrap.block.Block block) { return new yarnwrap.predicate.block.BlockStatePredicate(wrapperContained.forBlock(block.wrapperContained)); }
// public static yarnwrap.predicate.block.BlockStatePredicate forBlock(yarnwrap.block.Block block, ) { return new yarnwrap.predicate.block.BlockStatePredicate(net.minecraft.predicate.block.BlockStatePredicate.forBlock(block.wrapperContained)); }
// public boolean method_11759(yarnwrap.block.BlockState state) { return wrapperContained.method_11759(state.wrapperContained); }
// public static boolean method_11759(yarnwrap.block.BlockState state, ) { return net.minecraft.predicate.block.BlockStatePredicate.method_11759(state.wrapperContained); }
// public boolean testProperty(yarnwrap.block.BlockState blockState,yarnwrap.state.property.Property property,java.util.function.Predicate predicate) { return wrapperContained.testProperty(blockState.wrapperContained,property.wrapperContained,predicate); }
// public static boolean testProperty(yarnwrap.block.BlockState blockState,yarnwrap.state.property.Property property,java.util.function.Predicate predicate, ) { return net.minecraft.predicate.block.BlockStatePredicate.testProperty(blockState.wrapperContained,property.wrapperContained,predicate); }
public yarnwrap.predicate.block.BlockStatePredicate with(yarnwrap.state.property.Property property,java.util.function.Predicate predicate) { return new yarnwrap.predicate.block.BlockStatePredicate(wrapperContained.with(property.wrapperContained,predicate)); }
// public static yarnwrap.predicate.block.BlockStatePredicate with(yarnwrap.state.property.Property property,java.util.function.Predicate predicate, ) { return new yarnwrap.predicate.block.BlockStatePredicate(net.minecraft.predicate.block.BlockStatePredicate.with(property.wrapperContained,predicate)); }
// public boolean test(java.lang.Object state) { return wrapperContained.test(state); }
// public static boolean test(java.lang.Object state, ) { return net.minecraft.predicate.block.BlockStatePredicate.test(state); }

}