package yarnwrap.client.color.world;
public class BiomeColors { public net.minecraft.client.color.world.BiomeColors wrapperContained; public BiomeColors(net.minecraft.client.color.world.BiomeColors wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.biome.ColorResolver FOLIAGE_COLOR() { return new yarnwrap.world.biome.ColorResolver(wrapperContained.FOLIAGE_COLOR); }
// public void FOLIAGE_COLOR(yarnwrap.world.biome.ColorResolver value) { wrapperContained.FOLIAGE_COLOR = value.wrapperContained; }
public static yarnwrap.world.biome.ColorResolver FOLIAGE_COLOR() { return new yarnwrap.world.biome.ColorResolver(net.minecraft.client.color.world.BiomeColors.FOLIAGE_COLOR); }
// public static void FOLIAGE_COLOR(yarnwrap.world.biome.ColorResolver value, ) { net.minecraft.client.color.world.BiomeColors.FOLIAGE_COLOR = value.wrapperContained; }

// public yarnwrap.world.biome.ColorResolver GRASS_COLOR() { return new yarnwrap.world.biome.ColorResolver(wrapperContained.GRASS_COLOR); }
// public void GRASS_COLOR(yarnwrap.world.biome.ColorResolver value) { wrapperContained.GRASS_COLOR = value.wrapperContained; }
public static yarnwrap.world.biome.ColorResolver GRASS_COLOR() { return new yarnwrap.world.biome.ColorResolver(net.minecraft.client.color.world.BiomeColors.GRASS_COLOR); }
// public static void GRASS_COLOR(yarnwrap.world.biome.ColorResolver value, ) { net.minecraft.client.color.world.BiomeColors.GRASS_COLOR = value.wrapperContained; }

// public yarnwrap.world.biome.ColorResolver WATER_COLOR() { return new yarnwrap.world.biome.ColorResolver(wrapperContained.WATER_COLOR); }
// public void WATER_COLOR(yarnwrap.world.biome.ColorResolver value) { wrapperContained.WATER_COLOR = value.wrapperContained; }
public static yarnwrap.world.biome.ColorResolver WATER_COLOR() { return new yarnwrap.world.biome.ColorResolver(net.minecraft.client.color.world.BiomeColors.WATER_COLOR); }
// public static void WATER_COLOR(yarnwrap.world.biome.ColorResolver value, ) { net.minecraft.client.color.world.BiomeColors.WATER_COLOR = value.wrapperContained; }

// public yarnwrap.world.biome.ColorResolver DRY_FOLIAGE_COLOR() { return new yarnwrap.world.biome.ColorResolver(wrapperContained.DRY_FOLIAGE_COLOR); }
// public void DRY_FOLIAGE_COLOR(yarnwrap.world.biome.ColorResolver value) { wrapperContained.DRY_FOLIAGE_COLOR = value.wrapperContained; }
public static yarnwrap.world.biome.ColorResolver DRY_FOLIAGE_COLOR() { return new yarnwrap.world.biome.ColorResolver(net.minecraft.client.color.world.BiomeColors.DRY_FOLIAGE_COLOR); }
// public static void DRY_FOLIAGE_COLOR(yarnwrap.world.biome.ColorResolver value, ) { net.minecraft.client.color.world.BiomeColors.DRY_FOLIAGE_COLOR = value.wrapperContained; }

// public int getWaterColor(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getWaterColor(world.wrapperContained,pos.wrapperContained); }
// public static int getWaterColor(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.color.world.BiomeColors.getWaterColor(world.wrapperContained,pos.wrapperContained); }
// public int getGrassColor(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getGrassColor(world.wrapperContained,pos.wrapperContained); }
// public static int getGrassColor(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.color.world.BiomeColors.getGrassColor(world.wrapperContained,pos.wrapperContained); }
// public int getColor(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.biome.ColorResolver resolver) { return wrapperContained.getColor(world.wrapperContained,pos.wrapperContained,resolver.wrapperContained); }
// public static int getColor(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.biome.ColorResolver resolver, ) { return net.minecraft.client.color.world.BiomeColors.getColor(world.wrapperContained,pos.wrapperContained,resolver.wrapperContained); }
// public int getFoliageColor(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getFoliageColor(world.wrapperContained,pos.wrapperContained); }
// public static int getFoliageColor(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.color.world.BiomeColors.getFoliageColor(world.wrapperContained,pos.wrapperContained); }
// public int method_23791(yarnwrap.world.biome.Biome biome,double x,double z) { return wrapperContained.method_23791(biome.wrapperContained,x,z); }
// public static int method_23791(yarnwrap.world.biome.Biome biome,double x,double z, ) { return net.minecraft.client.color.world.BiomeColors.method_23791(biome.wrapperContained,x,z); }
// public int method_68161(yarnwrap.world.biome.Biome biome,double x,double z) { return wrapperContained.method_68161(biome.wrapperContained,x,z); }
// public static int method_68161(yarnwrap.world.biome.Biome biome,double x,double z, ) { return net.minecraft.client.color.world.BiomeColors.method_68161(biome.wrapperContained,x,z); }
// public int method_68162(yarnwrap.world.biome.Biome biome,double x,double z) { return wrapperContained.method_68162(biome.wrapperContained,x,z); }
// public static int method_68162(yarnwrap.world.biome.Biome biome,double x,double z, ) { return net.minecraft.client.color.world.BiomeColors.method_68162(biome.wrapperContained,x,z); }
// public int getDryFoliageColor(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getDryFoliageColor(world.wrapperContained,pos.wrapperContained); }
// public static int getDryFoliageColor(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.color.world.BiomeColors.getDryFoliageColor(world.wrapperContained,pos.wrapperContained); }

}