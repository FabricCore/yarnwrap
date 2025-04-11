package yarnwrap.block;
public class AbstractSkullBlock { public net.minecraft.block.AbstractSkullBlock wrapperContained; public AbstractSkullBlock(net.minecraft.block.AbstractSkullBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// public AbstractSkullBlock(Object type,Object settings) { this.wrapperContained = new net.minecraft.block.AbstractSkullBlock(type,settings); }
public Object getSkullType() { return wrapperContained.getSkullType(); }

}