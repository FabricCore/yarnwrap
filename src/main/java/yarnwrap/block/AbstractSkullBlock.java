package yarnwrap.block;
public class AbstractSkullBlock { public net.minecraft.block.AbstractSkullBlock wrapperContained; public AbstractSkullBlock(net.minecraft.block.AbstractSkullBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.AbstractSkullBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.AbstractSkullBlock.POWERED = value.wrapperContained; }

// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.block.AbstractSkullBlock.type; }
// // public static void type(Object value, ) { net.minecraft.block.AbstractSkullBlock.type = value; }

// public AbstractSkullBlock(Object type,Object settings) { this.wrapperContained = new net.minecraft.block.AbstractSkullBlock(type,settings); }
public Object getSkullType() { return wrapperContained.getSkullType(); }
// public static Object getSkullType() { return net.minecraft.block.AbstractSkullBlock.getSkullType(); }

}