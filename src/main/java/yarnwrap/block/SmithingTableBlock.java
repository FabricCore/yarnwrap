package yarnwrap.block;
public class SmithingTableBlock { public net.minecraft.block.SmithingTableBlock wrapperContained; public SmithingTableBlock(net.minecraft.block.SmithingTableBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text SCREEN_TITLE() { return new yarnwrap.text.Text(wrapperContained.SCREEN_TITLE); }
// public void SCREEN_TITLE(yarnwrap.text.Text value) { wrapperContained.SCREEN_TITLE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}