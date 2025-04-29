package yarnwrap.block;
public class Blocks { public net.minecraft.block.Blocks wrapperContained; public Blocks(net.minecraft.block.Blocks wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block PUMPKIN() { return new yarnwrap.block.Block(wrapperContained.PUMPKIN); }
// public void PUMPKIN(yarnwrap.block.Block value) { wrapperContained.PUMPKIN = value.wrapperContained; }
public static yarnwrap.block.Block PUMPKIN() { return new yarnwrap.block.Block(net.minecraft.block.Blocks.PUMPKIN); }
// public static void PUMPKIN(yarnwrap.block.Block value, ) { net.minecraft.block.Blocks.PUMPKIN = value.wrapperContained; }

// public yarnwrap.block.Block MELON() { return new yarnwrap.block.Block(wrapperContained.MELON); }
// public void MELON(yarnwrap.block.Block value) { wrapperContained.MELON = value.wrapperContained; }
public static yarnwrap.block.Block MELON() { return new yarnwrap.block.Block(net.minecraft.block.Blocks.MELON); }
// public static void MELON(yarnwrap.block.Block value, ) { net.minecraft.block.Blocks.MELON = value.wrapperContained; }

// public yarnwrap.block.Block ATTACHED_PUMPKIN_STEM() { return new yarnwrap.block.Block(wrapperContained.ATTACHED_PUMPKIN_STEM); }
// public void ATTACHED_PUMPKIN_STEM(yarnwrap.block.Block value) { wrapperContained.ATTACHED_PUMPKIN_STEM = value.wrapperContained; }
public static yarnwrap.block.Block ATTACHED_PUMPKIN_STEM() { return new yarnwrap.block.Block(net.minecraft.block.Blocks.ATTACHED_PUMPKIN_STEM); }
// public static void ATTACHED_PUMPKIN_STEM(yarnwrap.block.Block value, ) { net.minecraft.block.Blocks.ATTACHED_PUMPKIN_STEM = value.wrapperContained; }

// public yarnwrap.block.Block ATTACHED_MELON_STEM() { return new yarnwrap.block.Block(wrapperContained.ATTACHED_MELON_STEM); }
// public void ATTACHED_MELON_STEM(yarnwrap.block.Block value) { wrapperContained.ATTACHED_MELON_STEM = value.wrapperContained; }
public static yarnwrap.block.Block ATTACHED_MELON_STEM() { return new yarnwrap.block.Block(net.minecraft.block.Blocks.ATTACHED_MELON_STEM); }
// public static void ATTACHED_MELON_STEM(yarnwrap.block.Block value, ) { net.minecraft.block.Blocks.ATTACHED_MELON_STEM = value.wrapperContained; }

// public yarnwrap.block.Block PUMPKIN_STEM() { return new yarnwrap.block.Block(wrapperContained.PUMPKIN_STEM); }
// public void PUMPKIN_STEM(yarnwrap.block.Block value) { wrapperContained.PUMPKIN_STEM = value.wrapperContained; }
public static yarnwrap.block.Block PUMPKIN_STEM() { return new yarnwrap.block.Block(net.minecraft.block.Blocks.PUMPKIN_STEM); }
// public static void PUMPKIN_STEM(yarnwrap.block.Block value, ) { net.minecraft.block.Blocks.PUMPKIN_STEM = value.wrapperContained; }

// public yarnwrap.block.Block MELON_STEM() { return new yarnwrap.block.Block(wrapperContained.MELON_STEM); }
// public void MELON_STEM(yarnwrap.block.Block value) { wrapperContained.MELON_STEM = value.wrapperContained; }
public static yarnwrap.block.Block MELON_STEM() { return new yarnwrap.block.Block(net.minecraft.block.Blocks.MELON_STEM); }
// public static void MELON_STEM(yarnwrap.block.Block value, ) { net.minecraft.block.Blocks.MELON_STEM = value.wrapperContained; }

// public Object SHULKER_BOX_SUFFOCATES_PREDICATE() { return wrapperContained.SHULKER_BOX_SUFFOCATES_PREDICATE; }
// // public void SHULKER_BOX_SUFFOCATES_PREDICATE(Object value) { wrapperContained.SHULKER_BOX_SUFFOCATES_PREDICATE = value; }
// // public static Object SHULKER_BOX_SUFFOCATES_PREDICATE() { return net.minecraft.block.Blocks.SHULKER_BOX_SUFFOCATES_PREDICATE; }
// // public static void SHULKER_BOX_SUFFOCATES_PREDICATE(Object value, ) { net.minecraft.block.Blocks.SHULKER_BOX_SUFFOCATES_PREDICATE = value; }

// public int method_24419(yarnwrap.block.BlockState state) { return wrapperContained.method_24419(state.wrapperContained); }
// public static int method_24419(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_24419(state.wrapperContained); }
// public int method_26104(yarnwrap.block.BlockState state) { return wrapperContained.method_26104(state.wrapperContained); }
// public static int method_26104(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26104(state.wrapperContained); }
// public int method_26105(yarnwrap.block.BlockState state) { return wrapperContained.method_26105(state.wrapperContained); }
// public static int method_26105(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26105(state.wrapperContained); }
// public yarnwrap.block.Block createLeavesBlock(yarnwrap.sound.BlockSoundGroup soundGroup) { return new yarnwrap.block.Block(wrapperContained.createLeavesBlock(soundGroup.wrapperContained)); }
// public static yarnwrap.block.Block createLeavesBlock(yarnwrap.sound.BlockSoundGroup soundGroup, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.createLeavesBlock(soundGroup.wrapperContained)); }
// public java.util.function.ToIntFunction createLightLevelFromLitBlockState(int litLevel) { return wrapperContained.createLightLevelFromLitBlockState(litLevel); }
// public static java.util.function.ToIntFunction createLightLevelFromLitBlockState(int litLevel, ) { return net.minecraft.block.Blocks.createLightLevelFromLitBlockState(litLevel); }
// public int method_26108(int state) { return wrapperContained.method_26108(state); }
// public static int method_26108(int state, ) { return net.minecraft.block.Blocks.method_26108(state); }
// public yarnwrap.block.Block createBedBlock(yarnwrap.util.DyeColor color) { return new yarnwrap.block.Block(wrapperContained.createBedBlock(color.wrapperContained)); }
// public static yarnwrap.block.Block createBedBlock(yarnwrap.util.DyeColor color, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.createBedBlock(color.wrapperContained)); }
// public yarnwrap.block.Block createShulkerBoxBlock(yarnwrap.util.DyeColor color,yarnwrap.block.MapColor mapColor) { return new yarnwrap.block.Block(wrapperContained.createShulkerBoxBlock(color.wrapperContained,mapColor.wrapperContained)); }
// public static yarnwrap.block.Block createShulkerBoxBlock(yarnwrap.util.DyeColor color,yarnwrap.block.MapColor mapColor, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.createShulkerBoxBlock(color.wrapperContained,mapColor.wrapperContained)); }
// public yarnwrap.block.MapColor method_26111(yarnwrap.util.DyeColor state) { return new yarnwrap.block.MapColor(wrapperContained.method_26111(state.wrapperContained)); }
// public static yarnwrap.block.MapColor method_26111(yarnwrap.util.DyeColor state, ) { return new yarnwrap.block.MapColor(net.minecraft.block.Blocks.method_26111(state.wrapperContained)); }
// public int method_26112(yarnwrap.block.BlockState state) { return wrapperContained.method_26112(state.wrapperContained); }
// public static int method_26112(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26112(state.wrapperContained); }
// public boolean always(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.always(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean always(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.Blocks.always(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public java.lang.Boolean never(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type) { return wrapperContained.never(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type.wrapperContained); }
// public static java.lang.Boolean never(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type, ) { return net.minecraft.block.Blocks.never(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type.wrapperContained); }
// public yarnwrap.block.Block createNetherStemBlock(yarnwrap.block.MapColor mapColor) { return new yarnwrap.block.Block(wrapperContained.createNetherStemBlock(mapColor.wrapperContained)); }
// public static yarnwrap.block.Block createNetherStemBlock(yarnwrap.block.MapColor mapColor, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.createNetherStemBlock(mapColor.wrapperContained)); }
// public yarnwrap.block.MapColor method_26116(yarnwrap.block.MapColor state) { return new yarnwrap.block.MapColor(wrapperContained.method_26116(state.wrapperContained)); }
// public static yarnwrap.block.MapColor method_26116(yarnwrap.block.MapColor state, ) { return new yarnwrap.block.MapColor(net.minecraft.block.Blocks.method_26116(state.wrapperContained)); }
// public yarnwrap.block.Block createLogBlock(yarnwrap.block.MapColor topMapColor,yarnwrap.block.MapColor sideMapColor) { return new yarnwrap.block.Block(wrapperContained.createLogBlock(topMapColor.wrapperContained,sideMapColor.wrapperContained)); }
// public static yarnwrap.block.Block createLogBlock(yarnwrap.block.MapColor topMapColor,yarnwrap.block.MapColor sideMapColor, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.createLogBlock(topMapColor.wrapperContained,sideMapColor.wrapperContained)); }
// public yarnwrap.block.MapColor method_26118(yarnwrap.block.MapColor state) { return new yarnwrap.block.MapColor(wrapperContained.method_26118(state.wrapperContained)); }
// public static yarnwrap.block.MapColor method_26118(yarnwrap.block.MapColor state, ) { return new yarnwrap.block.MapColor(net.minecraft.block.Blocks.method_26118(state.wrapperContained)); }
// public yarnwrap.block.Block createPistonBlock(boolean sticky) { return new yarnwrap.block.Block(wrapperContained.createPistonBlock(sticky)); }
// public static yarnwrap.block.Block createPistonBlock(boolean sticky, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.createPistonBlock(sticky)); }
// public yarnwrap.block.Block createStainedGlassBlock(yarnwrap.util.DyeColor color) { return new yarnwrap.block.Block(wrapperContained.createStainedGlassBlock(color.wrapperContained)); }
// public static yarnwrap.block.Block createStainedGlassBlock(yarnwrap.util.DyeColor color, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.createStainedGlassBlock(color.wrapperContained)); }
// public int method_26121(yarnwrap.block.BlockState state) { return wrapperContained.method_26121(state.wrapperContained); }
// public static int method_26121(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26121(state.wrapperContained); }
// public boolean never(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.never(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean never(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.Blocks.never(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public java.lang.Boolean always(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type) { return wrapperContained.always(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type.wrapperContained); }
// public static java.lang.Boolean always(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type, ) { return net.minecraft.block.Blocks.always(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type.wrapperContained); }
// public int method_26124(yarnwrap.block.BlockState state) { return wrapperContained.method_26124(state.wrapperContained); }
// public static int method_26124(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26124(state.wrapperContained); }
// public boolean method_26125(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_26125(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean method_26125(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.Blocks.method_26125(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public java.lang.Boolean canSpawnOnLeaves(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type) { return wrapperContained.canSpawnOnLeaves(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type.wrapperContained); }
// public static java.lang.Boolean canSpawnOnLeaves(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type, ) { return net.minecraft.block.Blocks.canSpawnOnLeaves(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type.wrapperContained); }
// public int method_26127(yarnwrap.block.BlockState state) { return wrapperContained.method_26127(state.wrapperContained); }
// public static int method_26127(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26127(state.wrapperContained); }
// public boolean method_26128(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType) { return wrapperContained.method_26128(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
// public static boolean method_26128(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType, ) { return net.minecraft.block.Blocks.method_26128(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
// public int method_26129(yarnwrap.block.BlockState state) { return wrapperContained.method_26129(state.wrapperContained); }
// public static int method_26129(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26129(state.wrapperContained); }
// public boolean method_26130(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType) { return wrapperContained.method_26130(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
// public static boolean method_26130(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType, ) { return net.minecraft.block.Blocks.method_26130(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
// public int method_26131(yarnwrap.block.BlockState state) { return wrapperContained.method_26131(state.wrapperContained); }
// public static int method_26131(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26131(state.wrapperContained); }
// public boolean method_26132(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType) { return wrapperContained.method_26132(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
// public static boolean method_26132(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType, ) { return net.minecraft.block.Blocks.method_26132(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
// public int method_26134(yarnwrap.block.BlockState state) { return wrapperContained.method_26134(state.wrapperContained); }
// public static int method_26134(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26134(state.wrapperContained); }
// public int method_26135(yarnwrap.block.BlockState state) { return wrapperContained.method_26135(state.wrapperContained); }
// public static int method_26135(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26135(state.wrapperContained); }
// public int method_26136(yarnwrap.block.BlockState state) { return wrapperContained.method_26136(state.wrapperContained); }
// public static int method_26136(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26136(state.wrapperContained); }
// public int method_26137(yarnwrap.block.BlockState state) { return wrapperContained.method_26137(state.wrapperContained); }
// public static int method_26137(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26137(state.wrapperContained); }
// public int method_26138(yarnwrap.block.BlockState state) { return wrapperContained.method_26138(state.wrapperContained); }
// public static int method_26138(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26138(state.wrapperContained); }
// public int method_26139(yarnwrap.block.BlockState state) { return wrapperContained.method_26139(state.wrapperContained); }
// public static int method_26139(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26139(state.wrapperContained); }
// public int method_26140(yarnwrap.block.BlockState state) { return wrapperContained.method_26140(state.wrapperContained); }
// public static int method_26140(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26140(state.wrapperContained); }
// public int method_26141(yarnwrap.block.BlockState state) { return wrapperContained.method_26141(state.wrapperContained); }
// public static int method_26141(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26141(state.wrapperContained); }
// public int method_26142(yarnwrap.block.BlockState state) { return wrapperContained.method_26142(state.wrapperContained); }
// public static int method_26142(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26142(state.wrapperContained); }
// public int method_26143(yarnwrap.block.BlockState state) { return wrapperContained.method_26143(state.wrapperContained); }
// public static int method_26143(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26143(state.wrapperContained); }
// public int method_26144(yarnwrap.block.BlockState state) { return wrapperContained.method_26144(state.wrapperContained); }
// public static int method_26144(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26144(state.wrapperContained); }
// public int method_26145(yarnwrap.block.BlockState state) { return wrapperContained.method_26145(state.wrapperContained); }
// public static int method_26145(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26145(state.wrapperContained); }
// public int method_26146(yarnwrap.block.BlockState state) { return wrapperContained.method_26146(state.wrapperContained); }
// public static int method_26146(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26146(state.wrapperContained); }
// public int method_26147(yarnwrap.block.BlockState state) { return wrapperContained.method_26147(state.wrapperContained); }
// public static int method_26147(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26147(state.wrapperContained); }
// public int method_26148(yarnwrap.block.BlockState state) { return wrapperContained.method_26148(state.wrapperContained); }
// public static int method_26148(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26148(state.wrapperContained); }
// public int method_26149(yarnwrap.block.BlockState state) { return wrapperContained.method_26149(state.wrapperContained); }
// public static int method_26149(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26149(state.wrapperContained); }
// public int method_26150(yarnwrap.block.BlockState state) { return wrapperContained.method_26150(state.wrapperContained); }
// public static int method_26150(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26150(state.wrapperContained); }
// public int method_26151(yarnwrap.block.BlockState state) { return wrapperContained.method_26151(state.wrapperContained); }
// public static int method_26151(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26151(state.wrapperContained); }
// public int method_26152(yarnwrap.block.BlockState state) { return wrapperContained.method_26152(state.wrapperContained); }
// public static int method_26152(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26152(state.wrapperContained); }
// public void refreshShapeCache() { wrapperContained.refreshShapeCache(); }
public static void refreshShapeCache() { net.minecraft.block.Blocks.refreshShapeCache(); }
// public int method_31625(yarnwrap.block.BlockState state) { return wrapperContained.method_31625(state.wrapperContained); }
// public static int method_31625(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_31625(state.wrapperContained); }
// public int method_32894(yarnwrap.block.BlockState state) { return wrapperContained.method_32894(state.wrapperContained); }
// public static int method_32894(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_32894(state.wrapperContained); }
// public boolean method_32895(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_32895(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean method_32895(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.Blocks.method_32895(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public int method_33357(yarnwrap.block.BlockState state) { return wrapperContained.method_33357(state.wrapperContained); }
// public static int method_33357(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_33357(state.wrapperContained); }
// public int method_36458(yarnwrap.block.BlockState state) { return wrapperContained.method_36458(state.wrapperContained); }
// public static int method_36458(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_36458(state.wrapperContained); }
// public int method_36460(yarnwrap.block.BlockState state) { return wrapperContained.method_36460(state.wrapperContained); }
// public static int method_36460(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_36460(state.wrapperContained); }
// public int method_36461(yarnwrap.block.BlockState state) { return wrapperContained.method_36461(state.wrapperContained); }
// public static int method_36461(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_36461(state.wrapperContained); }
// public int method_38230(yarnwrap.block.BlockState state) { return wrapperContained.method_38230(state.wrapperContained); }
// public static int method_38230(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_38230(state.wrapperContained); }
// public boolean method_39537(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_39537(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean method_39537(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.Blocks.method_39537(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public int method_41421(yarnwrap.block.BlockState state) { return wrapperContained.method_41421(state.wrapperContained); }
// public static int method_41421(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_41421(state.wrapperContained); }
// public int method_41422(yarnwrap.block.BlockState state) { return wrapperContained.method_41422(state.wrapperContained); }
// public static int method_41422(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_41422(state.wrapperContained); }
// public int method_41423(yarnwrap.block.BlockState state) { return wrapperContained.method_41423(state.wrapperContained); }
// public static int method_41423(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_41423(state.wrapperContained); }
// public int method_41424(yarnwrap.block.BlockState state) { return wrapperContained.method_41424(state.wrapperContained); }
// public static int method_41424(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_41424(state.wrapperContained); }
// public yarnwrap.block.Block createWoodenButtonBlock(yarnwrap.block.BlockSetType blockSetType) { return new yarnwrap.block.Block(wrapperContained.createWoodenButtonBlock(blockSetType.wrapperContained)); }
// public static yarnwrap.block.Block createWoodenButtonBlock(yarnwrap.block.BlockSetType blockSetType, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.createWoodenButtonBlock(blockSetType.wrapperContained)); }
// public yarnwrap.block.Block createStoneButtonBlock() { return new yarnwrap.block.Block(wrapperContained.createStoneButtonBlock()); }
public static yarnwrap.block.Block createStoneButtonBlock() { return new yarnwrap.block.Block(net.minecraft.block.Blocks.createStoneButtonBlock()); }
// public yarnwrap.block.Block createLogBlock(yarnwrap.block.MapColor topMapColor,yarnwrap.block.MapColor sideMapColor,yarnwrap.sound.BlockSoundGroup soundGroup) { return new yarnwrap.block.Block(wrapperContained.createLogBlock(topMapColor.wrapperContained,sideMapColor.wrapperContained,soundGroup.wrapperContained)); }
// public static yarnwrap.block.Block createLogBlock(yarnwrap.block.MapColor topMapColor,yarnwrap.block.MapColor sideMapColor,yarnwrap.sound.BlockSoundGroup soundGroup, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.createLogBlock(topMapColor.wrapperContained,sideMapColor.wrapperContained,soundGroup.wrapperContained)); }
// public yarnwrap.block.MapColor method_47376(yarnwrap.block.MapColor state) { return new yarnwrap.block.MapColor(wrapperContained.method_47376(state.wrapperContained)); }
// public static yarnwrap.block.MapColor method_47376(yarnwrap.block.MapColor state, ) { return new yarnwrap.block.MapColor(net.minecraft.block.Blocks.method_47376(state.wrapperContained)); }
// public yarnwrap.block.Block createFlowerPotBlock(yarnwrap.block.Block flower) { return new yarnwrap.block.Block(wrapperContained.createFlowerPotBlock(flower.wrapperContained)); }
// public static yarnwrap.block.Block createFlowerPotBlock(yarnwrap.block.Block flower, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.createFlowerPotBlock(flower.wrapperContained)); }
// public yarnwrap.block.Block createCandleBlock(yarnwrap.block.MapColor color) { return new yarnwrap.block.Block(wrapperContained.createCandleBlock(color.wrapperContained)); }
// public static yarnwrap.block.Block createCandleBlock(yarnwrap.block.MapColor color, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.createCandleBlock(color.wrapperContained)); }
// public yarnwrap.block.Block register(yarnwrap.registry.RegistryKey key,yarnwrap.block.Block block) { return new yarnwrap.block.Block(wrapperContained.register(key.wrapperContained,block.wrapperContained)); }
// public static yarnwrap.block.Block register(yarnwrap.registry.RegistryKey key,yarnwrap.block.Block block, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.register(key.wrapperContained,block.wrapperContained)); }
// public yarnwrap.block.Block createStairsBlock(yarnwrap.block.Block base) { return new yarnwrap.block.Block(wrapperContained.createStairsBlock(base.wrapperContained)); }
// public static yarnwrap.block.Block createStairsBlock(yarnwrap.block.Block base, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.createStairsBlock(base.wrapperContained)); }
// public boolean method_53981(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_53981(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean method_53981(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.Blocks.method_53981(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public int method_55132(yarnwrap.block.BlockState state) { return wrapperContained.method_55132(state.wrapperContained); }
// public static int method_55132(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_55132(state.wrapperContained); }
// public yarnwrap.block.Block createOldStairsBlock(yarnwrap.block.Block block) { return new yarnwrap.block.Block(wrapperContained.createOldStairsBlock(block.wrapperContained)); }
// public static yarnwrap.block.Block createOldStairsBlock(yarnwrap.block.Block block, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.createOldStairsBlock(block.wrapperContained)); }
// public int method_56717(yarnwrap.block.BlockState state) { return wrapperContained.method_56717(state.wrapperContained); }
// public static int method_56717(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_56717(state.wrapperContained); }
// public java.util.function.Function createMapColorFromWaterloggedBlockState(yarnwrap.block.MapColor mapColor) { return wrapperContained.createMapColorFromWaterloggedBlockState(mapColor.wrapperContained); }
// public static java.util.function.Function createMapColorFromWaterloggedBlockState(yarnwrap.block.MapColor mapColor, ) { return net.minecraft.block.Blocks.createMapColorFromWaterloggedBlockState(mapColor.wrapperContained); }
// public yarnwrap.block.MapColor method_59824(yarnwrap.block.MapColor state) { return new yarnwrap.block.MapColor(wrapperContained.method_59824(state.wrapperContained)); }
// public static yarnwrap.block.MapColor method_59824(yarnwrap.block.MapColor state, ) { return new yarnwrap.block.MapColor(net.minecraft.block.Blocks.method_59824(state.wrapperContained)); }
// public yarnwrap.block.Block register(java.lang.String id,yarnwrap.block.Block block) { return new yarnwrap.block.Block(wrapperContained.register(id,block.wrapperContained)); }
// public static yarnwrap.block.Block register(java.lang.String id,yarnwrap.block.Block block, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.register(id,block.wrapperContained)); }

}