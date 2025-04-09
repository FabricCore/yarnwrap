package yarnwrap.block;
public class JukeboxBlock { public net.minecraft.block.JukeboxBlock wrapperContained; public JukeboxBlock(net.minecraft.block.JukeboxBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty HAS_RECORD() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.HAS_RECORD); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}