package yarnwrap.block;
public class JukeboxBlock { public net.minecraft.block.JukeboxBlock wrapperContained; public JukeboxBlock(net.minecraft.block.JukeboxBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty HAS_RECORD() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.HAS_RECORD); }
// public void HAS_RECORD(yarnwrap.state.property.BooleanProperty value) { wrapperContained.HAS_RECORD = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty HAS_RECORD() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.JukeboxBlock.HAS_RECORD); }
// public static void HAS_RECORD(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.JukeboxBlock.HAS_RECORD = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.JukeboxBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.JukeboxBlock.CODEC = value; }


}