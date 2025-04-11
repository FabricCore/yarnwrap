package yarnwrap.block;
public class RepeaterBlock { public net.minecraft.block.RepeaterBlock wrapperContained; public RepeaterBlock(net.minecraft.block.RepeaterBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty DELAY() { return new yarnwrap.state.property.IntProperty(wrapperContained.DELAY); }
// public void DELAY(yarnwrap.state.property.IntProperty value) { wrapperContained.DELAY = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty LOCKED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LOCKED); }
// public void LOCKED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.LOCKED = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}