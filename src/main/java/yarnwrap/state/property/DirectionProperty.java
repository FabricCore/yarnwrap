package yarnwrap.state.property;
public class DirectionProperty { public net.minecraft.state.property.DirectionProperty wrapperContained; public DirectionProperty(net.minecraft.state.property.DirectionProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public DirectionProperty(java.lang.String name,java.util.Collection values) { this.wrapperContained = new net.minecraft.state.property.DirectionProperty(name,values); }
public yarnwrap.state.property.DirectionProperty of(java.lang.String name,java.util.Collection values) { return new yarnwrap.state.property.DirectionProperty(wrapperContained.of(name,values)); }
public yarnwrap.state.property.DirectionProperty of(java.lang.String name,java.util.function.Predicate filter) { return new yarnwrap.state.property.DirectionProperty(wrapperContained.of(name,filter)); }
public yarnwrap.state.property.DirectionProperty of(java.lang.String name,net.minecraft.util.math.Direction[] values) { return new yarnwrap.state.property.DirectionProperty(wrapperContained.of(name,values)); }
public yarnwrap.state.property.DirectionProperty of(java.lang.String name) { return new yarnwrap.state.property.DirectionProperty(wrapperContained.of(name)); }
// public boolean method_38862(yarnwrap.util.math.Direction direction) { return wrapperContained.method_38862(direction.wrapperContained); }

}