package yarnwrap.block;
public class RepeaterBlock { public net.minecraft.block.RepeaterBlock wrapperContained; public RepeaterBlock(net.minecraft.block.RepeaterBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty DELAY() { return new yarnwrap.state.property.IntProperty(wrapperContained.DELAY); }
public yarnwrap.state.property.BooleanProperty LOCKED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LOCKED); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}