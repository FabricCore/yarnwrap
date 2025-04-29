package yarnwrap.block;
public class SmithingTableBlock { public net.minecraft.block.SmithingTableBlock wrapperContained; public SmithingTableBlock(net.minecraft.block.SmithingTableBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text SCREEN_TITLE() { return new yarnwrap.text.Text(wrapperContained.SCREEN_TITLE); }
// public void SCREEN_TITLE(yarnwrap.text.Text value) { wrapperContained.SCREEN_TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text SCREEN_TITLE() { return new yarnwrap.text.Text(net.minecraft.block.SmithingTableBlock.SCREEN_TITLE); }
// public static void SCREEN_TITLE(yarnwrap.text.Text value, ) { net.minecraft.block.SmithingTableBlock.SCREEN_TITLE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.SmithingTableBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.SmithingTableBlock.CODEC = value; }

// public yarnwrap.screen.ScreenHandler method_24950(yarnwrap.world.World syncId,yarnwrap.util.math.BlockPos inventory,int player) { return new yarnwrap.screen.ScreenHandler(wrapperContained.method_24950(syncId.wrapperContained,inventory.wrapperContained,player)); }
// public static yarnwrap.screen.ScreenHandler method_24950(yarnwrap.world.World syncId,yarnwrap.util.math.BlockPos inventory,int player, ) { return new yarnwrap.screen.ScreenHandler(net.minecraft.block.SmithingTableBlock.method_24950(syncId.wrapperContained,inventory.wrapperContained,player)); }

}