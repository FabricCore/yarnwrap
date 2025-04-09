package yarnwrap.block;
public class LoomBlock { public net.minecraft.block.LoomBlock wrapperContained; public LoomBlock(net.minecraft.block.LoomBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}