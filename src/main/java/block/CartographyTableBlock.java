package yarnwrap.block;
public class CartographyTableBlock { public net.minecraft.block.CartographyTableBlock wrapperContained; public CartographyTableBlock(net.minecraft.block.CartographyTableBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}