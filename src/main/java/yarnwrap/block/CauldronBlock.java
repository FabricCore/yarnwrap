package yarnwrap.block;
public class CauldronBlock { public net.minecraft.block.CauldronBlock wrapperContained; public CauldronBlock(net.minecraft.block.CauldronBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public float FILL_WITH_RAIN_CHANCE() { return wrapperContained.FILL_WITH_RAIN_CHANCE; }
// public void FILL_WITH_RAIN_CHANCE(float value) { wrapperContained.FILL_WITH_RAIN_CHANCE = value; }
// public static float FILL_WITH_RAIN_CHANCE() { return net.minecraft.block.CauldronBlock.FILL_WITH_RAIN_CHANCE; }
// public static void FILL_WITH_RAIN_CHANCE(float value, ) { net.minecraft.block.CauldronBlock.FILL_WITH_RAIN_CHANCE = value; }

// public float FILL_WITH_SNOW_CHANCE() { return wrapperContained.FILL_WITH_SNOW_CHANCE; }
// public void FILL_WITH_SNOW_CHANCE(float value) { wrapperContained.FILL_WITH_SNOW_CHANCE = value; }
// public static float FILL_WITH_SNOW_CHANCE() { return net.minecraft.block.CauldronBlock.FILL_WITH_SNOW_CHANCE; }
// public static void FILL_WITH_SNOW_CHANCE(float value, ) { net.minecraft.block.CauldronBlock.FILL_WITH_SNOW_CHANCE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CauldronBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CauldronBlock.CODEC = value; }

// public boolean canFillWithPrecipitation(yarnwrap.world.World world,Object precipitation) { return wrapperContained.canFillWithPrecipitation(world.wrapperContained,precipitation); }
// public static boolean canFillWithPrecipitation(yarnwrap.world.World world,Object precipitation, ) { return net.minecraft.block.CauldronBlock.canFillWithPrecipitation(world.wrapperContained,precipitation); }

}