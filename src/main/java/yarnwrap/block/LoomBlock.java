package yarnwrap.block;
public class LoomBlock { public net.minecraft.block.LoomBlock wrapperContained; public LoomBlock(net.minecraft.block.LoomBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(net.minecraft.block.LoomBlock.TITLE); }
// public static void TITLE(yarnwrap.text.Text value, ) { net.minecraft.block.LoomBlock.TITLE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.LoomBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.LoomBlock.CODEC = value; }

// public yarnwrap.screen.ScreenHandler method_17478(yarnwrap.world.World syncId,yarnwrap.util.math.BlockPos inventory,int player) { return new yarnwrap.screen.ScreenHandler(wrapperContained.method_17478(syncId.wrapperContained,inventory.wrapperContained,player)); }
// public static yarnwrap.screen.ScreenHandler method_17478(yarnwrap.world.World syncId,yarnwrap.util.math.BlockPos inventory,int player, ) { return new yarnwrap.screen.ScreenHandler(net.minecraft.block.LoomBlock.method_17478(syncId.wrapperContained,inventory.wrapperContained,player)); }

}