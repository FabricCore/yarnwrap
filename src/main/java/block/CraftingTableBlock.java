package yarnwrap.block;
public class CraftingTableBlock { public net.minecraft.block.CraftingTableBlock wrapperContained; public CraftingTableBlock(net.minecraft.block.CraftingTableBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}