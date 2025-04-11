package yarnwrap.block;
public class CartographyTableBlock { public net.minecraft.block.CartographyTableBlock wrapperContained; public CartographyTableBlock(net.minecraft.block.CartographyTableBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.screen.ScreenHandler method_17457(yarnwrap.world.World syncId,yarnwrap.util.math.BlockPos inventory,int player) { return new yarnwrap.screen.ScreenHandler(wrapperContained.method_17457(syncId.wrapperContained,inventory.wrapperContained,player)); }

}