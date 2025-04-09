package yarnwrap.block;
public class AbstractSkullBlock { public net.minecraft.block.AbstractSkullBlock wrapperContained; public AbstractSkullBlock(net.minecraft.block.AbstractSkullBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public Object type() { return wrapperContained.type; }
public Object getSkullType() { return wrapperContained.getSkullType(); }

}