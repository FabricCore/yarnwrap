package yarnwrap.block;
public class SmithingTableBlock { public net.minecraft.block.SmithingTableBlock wrapperContained; public SmithingTableBlock(net.minecraft.block.SmithingTableBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text SCREEN_TITLE() { return new yarnwrap.text.Text(wrapperContained.SCREEN_TITLE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}