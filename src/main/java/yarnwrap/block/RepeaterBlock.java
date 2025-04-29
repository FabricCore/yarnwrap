package yarnwrap.block;
public class RepeaterBlock { public net.minecraft.block.RepeaterBlock wrapperContained; public RepeaterBlock(net.minecraft.block.RepeaterBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty DELAY() { return new yarnwrap.state.property.IntProperty(wrapperContained.DELAY); }
// public void DELAY(yarnwrap.state.property.IntProperty value) { wrapperContained.DELAY = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty DELAY() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.RepeaterBlock.DELAY); }
// public static void DELAY(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.RepeaterBlock.DELAY = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty LOCKED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LOCKED); }
// public void LOCKED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.LOCKED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty LOCKED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.RepeaterBlock.LOCKED); }
// public static void LOCKED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.RepeaterBlock.LOCKED = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.RepeaterBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.RepeaterBlock.CODEC = value; }


}