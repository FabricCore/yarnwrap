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

// public Object PISTON_SUFFOCATES_PREDICATE() { return wrapperContained.PISTON_SUFFOCATES_PREDICATE; }
// // public void PISTON_SUFFOCATES_PREDICATE(Object value) { wrapperContained.PISTON_SUFFOCATES_PREDICATE = value; }
// // public static Object PISTON_SUFFOCATES_PREDICATE() { return net.minecraft.block.Blocks.PISTON_SUFFOCATES_PREDICATE; }
// // public static void PISTON_SUFFOCATES_PREDICATE(Object value, ) { net.minecraft.block.Blocks.PISTON_SUFFOCATES_PREDICATE = value; }

// public yarnwrap.block.Block register(java.lang.String id,Object settings) { return new yarnwrap.block.Block(wrapperContained.register(id,settings)); }
// public static yarnwrap.block.Block register(java.lang.String id,Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.register(id,settings)); }
// public int method_24419(yarnwrap.block.BlockState state) { return wrapperContained.method_24419(state.wrapperContained); }
// public static int method_24419(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_24419(state.wrapperContained); }
// public int method_26104(yarnwrap.block.BlockState state) { return wrapperContained.method_26104(state.wrapperContained); }
// public static int method_26104(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26104(state.wrapperContained); }
// public int method_26105(yarnwrap.block.BlockState state) { return wrapperContained.method_26105(state.wrapperContained); }
// public static int method_26105(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26105(state.wrapperContained); }
// public java.util.function.ToIntFunction createLightLevelFromLitBlockState(int litLevel) { return wrapperContained.createLightLevelFromLitBlockState(litLevel); }
// public static java.util.function.ToIntFunction createLightLevelFromLitBlockState(int litLevel, ) { return net.minecraft.block.Blocks.createLightLevelFromLitBlockState(litLevel); }
// public int method_26108(int state) { return wrapperContained.method_26108(state); }
// public static int method_26108(int state, ) { return net.minecraft.block.Blocks.method_26108(state); }
// public yarnwrap.block.Block registerBedBlock(java.lang.String id,yarnwrap.util.DyeColor color) { return new yarnwrap.block.Block(wrapperContained.registerBedBlock(id,color.wrapperContained)); }
// public static yarnwrap.block.Block registerBedBlock(java.lang.String id,yarnwrap.util.DyeColor color, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.registerBedBlock(id,color.wrapperContained)); }
// public int method_26112(yarnwrap.block.BlockState state) { return wrapperContained.method_26112(state.wrapperContained); }
// public static int method_26112(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26112(state.wrapperContained); }
// public boolean always(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.always(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean always(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.Blocks.always(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public java.lang.Boolean never(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type) { return wrapperContained.never(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type.wrapperContained); }
// public static java.lang.Boolean never(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type, ) { return net.minecraft.block.Blocks.never(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type.wrapperContained); }
// public int method_26121(yarnwrap.block.BlockState state) { return wrapperContained.method_26121(state.wrapperContained); }
// public static int method_26121(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26121(state.wrapperContained); }
// public boolean never(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.never(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean never(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.Blocks.never(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public java.lang.Boolean always(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type) { return wrapperContained.always(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type.wrapperContained); }
// public static java.lang.Boolean always(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType type, ) { return net.minecraft.block.Blocks.always(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type.wrapperContained); }
// public int method_26124(yarnwrap.block.BlockState state) { return wrapperContained.method_26124(state.wrapperContained); }
// public static int method_26124(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26124(state.wrapperContained); }
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
// public int method_26140(yarnwrap.block.BlockState state) { return wrapperContained.method_26140(state.wrapperContained); }
// public static int method_26140(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26140(state.wrapperContained); }
// public int method_26141(yarnwrap.block.BlockState state) { return wrapperContained.method_26141(state.wrapperContained); }
// public static int method_26141(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26141(state.wrapperContained); }
// public int method_26142(yarnwrap.block.BlockState state) { return wrapperContained.method_26142(state.wrapperContained); }
// public static int method_26142(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26142(state.wrapperContained); }
// public int method_26143(yarnwrap.block.BlockState state) { return wrapperContained.method_26143(state.wrapperContained); }
// public static int method_26143(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_26143(state.wrapperContained); }
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
// public int method_41424(yarnwrap.block.BlockState state) { return wrapperContained.method_41424(state.wrapperContained); }
// public static int method_41424(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_41424(state.wrapperContained); }
// public boolean method_53981(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_53981(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean method_53981(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.Blocks.method_53981(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public int method_55132(yarnwrap.block.BlockState state) { return wrapperContained.method_55132(state.wrapperContained); }
// public static int method_55132(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_55132(state.wrapperContained); }
// public yarnwrap.block.Block registerOldStairsBlock(java.lang.String id,yarnwrap.block.Block base) { return new yarnwrap.block.Block(wrapperContained.registerOldStairsBlock(id,base.wrapperContained)); }
// public static yarnwrap.block.Block registerOldStairsBlock(java.lang.String id,yarnwrap.block.Block base, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.registerOldStairsBlock(id,base.wrapperContained)); }
// public int method_56717(yarnwrap.block.BlockState state) { return wrapperContained.method_56717(state.wrapperContained); }
// public static int method_56717(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_56717(state.wrapperContained); }
// public java.util.function.Function createMapColorFromWaterloggedBlockState(yarnwrap.block.MapColor mapColor) { return wrapperContained.createMapColorFromWaterloggedBlockState(mapColor.wrapperContained); }
// public static java.util.function.Function createMapColorFromWaterloggedBlockState(yarnwrap.block.MapColor mapColor, ) { return net.minecraft.block.Blocks.createMapColorFromWaterloggedBlockState(mapColor.wrapperContained); }
// public yarnwrap.block.MapColor method_59824(yarnwrap.block.MapColor state) { return new yarnwrap.block.MapColor(wrapperContained.method_59824(state.wrapperContained)); }
// public static yarnwrap.block.MapColor method_59824(yarnwrap.block.MapColor state, ) { return new yarnwrap.block.MapColor(net.minecraft.block.Blocks.method_59824(state.wrapperContained)); }
// public yarnwrap.block.Block method_63021(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63021(settings)); }
// public static yarnwrap.block.Block method_63021(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63021(settings)); }
// public int method_63022(yarnwrap.block.BlockState state) { return wrapperContained.method_63022(state.wrapperContained); }
// public static int method_63022(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_63022(state.wrapperContained); }
// public yarnwrap.block.Block method_63023(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63023(settings)); }
// public static yarnwrap.block.Block method_63023(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63023(settings)); }
// public yarnwrap.block.Block method_63024(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63024(settings)); }
// public static yarnwrap.block.Block method_63024(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63024(settings)); }
// public yarnwrap.block.Block method_63025(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63025(settings)); }
// public static yarnwrap.block.Block method_63025(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63025(settings)); }
// public yarnwrap.block.Block method_63026(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63026(settings)); }
// public static yarnwrap.block.Block method_63026(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63026(settings)); }
// public int method_63027(yarnwrap.block.BlockState state) { return wrapperContained.method_63027(state.wrapperContained); }
// public static int method_63027(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_63027(state.wrapperContained); }
// public yarnwrap.block.Block method_63028(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63028(settings)); }
// public static yarnwrap.block.Block method_63028(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63028(settings)); }
// public yarnwrap.block.Block method_63029(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63029(settings)); }
// public static yarnwrap.block.Block method_63029(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63029(settings)); }
// public yarnwrap.block.Block method_63030(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63030(settings)); }
// public static yarnwrap.block.Block method_63030(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63030(settings)); }
// public yarnwrap.block.Block method_63031(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63031(settings)); }
// public static yarnwrap.block.Block method_63031(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63031(settings)); }
// public yarnwrap.block.Block method_63032(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63032(settings)); }
// public static yarnwrap.block.Block method_63032(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63032(settings)); }
// public yarnwrap.block.MapColor method_63033(yarnwrap.block.BlockState state) { return new yarnwrap.block.MapColor(wrapperContained.method_63033(state.wrapperContained)); }
// public static yarnwrap.block.MapColor method_63033(yarnwrap.block.BlockState state, ) { return new yarnwrap.block.MapColor(net.minecraft.block.Blocks.method_63033(state.wrapperContained)); }
// public yarnwrap.block.Block method_63034(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63034(settings)); }
// public static yarnwrap.block.Block method_63034(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63034(settings)); }
// public yarnwrap.block.Block method_63035(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63035(settings)); }
// public static yarnwrap.block.Block method_63035(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63035(settings)); }
// public yarnwrap.block.Block method_63036(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63036(settings)); }
// public static yarnwrap.block.Block method_63036(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63036(settings)); }
// public yarnwrap.block.Block method_63037(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63037(settings)); }
// public static yarnwrap.block.Block method_63037(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63037(settings)); }
// public yarnwrap.block.Block method_63038(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63038(settings)); }
// public static yarnwrap.block.Block method_63038(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63038(settings)); }
// public yarnwrap.block.Block method_63039(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63039(settings)); }
// public static yarnwrap.block.Block method_63039(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63039(settings)); }
// public int method_63040(yarnwrap.block.BlockState state) { return wrapperContained.method_63040(state.wrapperContained); }
// public static int method_63040(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_63040(state.wrapperContained); }
// public yarnwrap.block.Block method_63041(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63041(settings)); }
// public static yarnwrap.block.Block method_63041(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63041(settings)); }
// public yarnwrap.block.Block method_63042(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63042(settings)); }
// public static yarnwrap.block.Block method_63042(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63042(settings)); }
// public yarnwrap.block.Block method_63043(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63043(settings)); }
// public static yarnwrap.block.Block method_63043(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63043(settings)); }
// public yarnwrap.block.Block method_63044(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63044(settings)); }
// public static yarnwrap.block.Block method_63044(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63044(settings)); }
// public yarnwrap.block.Block method_63045(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63045(settings)); }
// public static yarnwrap.block.Block method_63045(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63045(settings)); }
// public yarnwrap.block.Block method_63046(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63046(settings)); }
// public static yarnwrap.block.Block method_63046(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63046(settings)); }
// public yarnwrap.block.Block method_63047(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63047(settings)); }
// public static yarnwrap.block.Block method_63047(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63047(settings)); }
// public yarnwrap.block.Block method_63048(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63048(settings)); }
// public static yarnwrap.block.Block method_63048(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63048(settings)); }
// public yarnwrap.block.Block method_63049(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63049(settings)); }
// public static yarnwrap.block.Block method_63049(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63049(settings)); }
// public yarnwrap.block.Block method_63050(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63050(settings)); }
// public static yarnwrap.block.Block method_63050(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63050(settings)); }
// public Object createPistonSettings() { return wrapperContained.createPistonSettings(); }
// public static Object createPistonSettings() { return net.minecraft.block.Blocks.createPistonSettings(); }
// public yarnwrap.block.Block register(yarnwrap.registry.RegistryKey key,Object settings) { return new yarnwrap.block.Block(wrapperContained.register(key.wrapperContained,settings)); }
// public static yarnwrap.block.Block register(yarnwrap.registry.RegistryKey key,Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.register(key.wrapperContained,settings)); }
// public yarnwrap.block.Block register(yarnwrap.registry.RegistryKey key,java.util.function.Function factory,Object settings) { return new yarnwrap.block.Block(wrapperContained.register(key.wrapperContained,factory,settings)); }
// public static yarnwrap.block.Block register(yarnwrap.registry.RegistryKey key,java.util.function.Function factory,Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.register(key.wrapperContained,factory,settings)); }
// public yarnwrap.block.Block method_63054(yarnwrap.util.DyeColor settings) { return new yarnwrap.block.Block(wrapperContained.method_63054(settings.wrapperContained)); }
// public static yarnwrap.block.Block method_63054(yarnwrap.util.DyeColor settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63054(settings.wrapperContained)); }
// public yarnwrap.block.MapColor method_63055(yarnwrap.util.DyeColor state) { return new yarnwrap.block.MapColor(wrapperContained.method_63055(state.wrapperContained)); }
// public static yarnwrap.block.MapColor method_63055(yarnwrap.util.DyeColor state, ) { return new yarnwrap.block.MapColor(net.minecraft.block.Blocks.method_63055(state.wrapperContained)); }
// public yarnwrap.block.Block method_63056(yarnwrap.block.Block settings) { return new yarnwrap.block.Block(wrapperContained.method_63056(settings.wrapperContained)); }
// public static yarnwrap.block.Block method_63056(yarnwrap.block.Block settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63056(settings.wrapperContained)); }
// public Object copyLootTable(yarnwrap.block.Block block,boolean copyTranslationKey) { return wrapperContained.copyLootTable(block.wrapperContained,copyTranslationKey); }
// public static Object copyLootTable(yarnwrap.block.Block block,boolean copyTranslationKey, ) { return net.minecraft.block.Blocks.copyLootTable(block.wrapperContained,copyTranslationKey); }
// public Object createLeavesSettings(yarnwrap.sound.BlockSoundGroup sounds) { return wrapperContained.createLeavesSettings(sounds.wrapperContained); }
// public static Object createLeavesSettings(yarnwrap.sound.BlockSoundGroup sounds, ) { return net.minecraft.block.Blocks.createLeavesSettings(sounds.wrapperContained); }
// public yarnwrap.block.Block method_63059(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63059(settings)); }
// public static yarnwrap.block.Block method_63059(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63059(settings)); }
// public yarnwrap.block.MapColor method_63060(yarnwrap.block.MapColor state) { return new yarnwrap.block.MapColor(wrapperContained.method_63060(state.wrapperContained)); }
// public static yarnwrap.block.MapColor method_63060(yarnwrap.block.MapColor state, ) { return new yarnwrap.block.MapColor(net.minecraft.block.Blocks.method_63060(state.wrapperContained)); }
// public Object createLogSettings(yarnwrap.block.MapColor topMapColor,yarnwrap.block.MapColor sideMapColor,yarnwrap.sound.BlockSoundGroup sounds) { return wrapperContained.createLogSettings(topMapColor.wrapperContained,sideMapColor.wrapperContained,sounds.wrapperContained); }
// public static Object createLogSettings(yarnwrap.block.MapColor topMapColor,yarnwrap.block.MapColor sideMapColor,yarnwrap.sound.BlockSoundGroup sounds, ) { return net.minecraft.block.Blocks.createLogSettings(topMapColor.wrapperContained,sideMapColor.wrapperContained,sounds.wrapperContained); }
// public yarnwrap.block.MapColor method_63062(yarnwrap.block.MapColor state) { return new yarnwrap.block.MapColor(wrapperContained.method_63062(state.wrapperContained)); }
// public static yarnwrap.block.MapColor method_63062(yarnwrap.block.MapColor state, ) { return new yarnwrap.block.MapColor(net.minecraft.block.Blocks.method_63062(state.wrapperContained)); }
// public yarnwrap.registry.RegistryKey keyOf(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.keyOf(id)); }
// public static yarnwrap.registry.RegistryKey keyOf(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.block.Blocks.keyOf(id)); }
// public yarnwrap.block.Block register(java.lang.String id,java.util.function.Function factory,Object settings) { return new yarnwrap.block.Block(wrapperContained.register(id,factory,settings)); }
// public static yarnwrap.block.Block register(java.lang.String id,java.util.function.Function factory,Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.register(id,factory,settings)); }
// public yarnwrap.block.Block method_63065(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63065(settings)); }
// public static yarnwrap.block.Block method_63065(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63065(settings)); }
// public yarnwrap.block.Block method_63066(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63066(settings)); }
// public static yarnwrap.block.Block method_63066(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63066(settings)); }
// public yarnwrap.block.Block method_63067(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63067(settings)); }
// public static yarnwrap.block.Block method_63067(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63067(settings)); }
// public yarnwrap.block.Block method_63068(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63068(settings)); }
// public static yarnwrap.block.Block method_63068(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63068(settings)); }
// public yarnwrap.block.Block method_63069(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63069(settings)); }
// public static yarnwrap.block.Block method_63069(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63069(settings)); }
// public yarnwrap.block.Block method_63070(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63070(settings)); }
// public static yarnwrap.block.Block method_63070(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63070(settings)); }
// public yarnwrap.block.Block method_63071(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63071(settings)); }
// public static yarnwrap.block.Block method_63071(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63071(settings)); }
// public yarnwrap.block.Block method_63072(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63072(settings)); }
// public static yarnwrap.block.Block method_63072(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63072(settings)); }
// public yarnwrap.block.Block method_63073(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63073(settings)); }
// public static yarnwrap.block.Block method_63073(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63073(settings)); }
// public yarnwrap.block.Block method_63074(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63074(settings)); }
// public static yarnwrap.block.Block method_63074(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63074(settings)); }
// public yarnwrap.block.Block method_63075(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63075(settings)); }
// public static yarnwrap.block.Block method_63075(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63075(settings)); }
// public yarnwrap.block.Block method_63076(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63076(settings)); }
// public static yarnwrap.block.Block method_63076(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63076(settings)); }
// public yarnwrap.block.Block method_63077(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63077(settings)); }
// public static yarnwrap.block.Block method_63077(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63077(settings)); }
// public yarnwrap.block.Block method_63078(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63078(settings)); }
// public static yarnwrap.block.Block method_63078(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63078(settings)); }
// public yarnwrap.block.Block method_63079(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63079(settings)); }
// public static yarnwrap.block.Block method_63079(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63079(settings)); }
// public yarnwrap.block.Block method_63080(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63080(settings)); }
// public static yarnwrap.block.Block method_63080(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63080(settings)); }
// public yarnwrap.block.Block method_63081(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63081(settings)); }
// public static yarnwrap.block.Block method_63081(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63081(settings)); }
// public yarnwrap.block.Block method_63082(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63082(settings)); }
// public static yarnwrap.block.Block method_63082(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63082(settings)); }
// public yarnwrap.block.Block method_63083(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63083(settings)); }
// public static yarnwrap.block.Block method_63083(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63083(settings)); }
// public yarnwrap.block.Block method_63084(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63084(settings)); }
// public static yarnwrap.block.Block method_63084(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63084(settings)); }
// public yarnwrap.block.Block method_63085(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63085(settings)); }
// public static yarnwrap.block.Block method_63085(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63085(settings)); }
// public yarnwrap.block.Block method_63086(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63086(settings)); }
// public static yarnwrap.block.Block method_63086(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63086(settings)); }
// public yarnwrap.block.Block method_63087(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63087(settings)); }
// public static yarnwrap.block.Block method_63087(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63087(settings)); }
// public yarnwrap.block.Block method_63088(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63088(settings)); }
// public static yarnwrap.block.Block method_63088(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63088(settings)); }
// public yarnwrap.block.Block method_63089(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63089(settings)); }
// public static yarnwrap.block.Block method_63089(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63089(settings)); }
// public yarnwrap.block.Block method_63090(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63090(settings)); }
// public static yarnwrap.block.Block method_63090(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63090(settings)); }
// public yarnwrap.block.Block method_63091(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63091(settings)); }
// public static yarnwrap.block.Block method_63091(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63091(settings)); }
// public yarnwrap.block.Block method_63092(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63092(settings)); }
// public static yarnwrap.block.Block method_63092(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63092(settings)); }
// public yarnwrap.block.Block method_63093(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63093(settings)); }
// public static yarnwrap.block.Block method_63093(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63093(settings)); }
// public yarnwrap.block.Block method_63094(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63094(settings)); }
// public static yarnwrap.block.Block method_63094(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63094(settings)); }
// public yarnwrap.block.Block method_63095(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63095(settings)); }
// public static yarnwrap.block.Block method_63095(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63095(settings)); }
// public yarnwrap.block.Block method_63096(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63096(settings)); }
// public static yarnwrap.block.Block method_63096(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63096(settings)); }
// public yarnwrap.block.Block method_63097(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63097(settings)); }
// public static yarnwrap.block.Block method_63097(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63097(settings)); }
// public yarnwrap.block.Block method_63098(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63098(settings)); }
// public static yarnwrap.block.Block method_63098(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63098(settings)); }
// public yarnwrap.block.Block method_63099(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63099(settings)); }
// public static yarnwrap.block.Block method_63099(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63099(settings)); }
// public yarnwrap.block.Block method_63100(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63100(settings)); }
// public static yarnwrap.block.Block method_63100(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63100(settings)); }
// public yarnwrap.block.Block method_63101(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63101(settings)); }
// public static yarnwrap.block.Block method_63101(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63101(settings)); }
// public yarnwrap.block.Block method_63102(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63102(settings)); }
// public static yarnwrap.block.Block method_63102(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63102(settings)); }
// public yarnwrap.block.Block method_63103(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63103(settings)); }
// public static yarnwrap.block.Block method_63103(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63103(settings)); }
// public yarnwrap.block.Block method_63104(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63104(settings)); }
// public static yarnwrap.block.Block method_63104(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63104(settings)); }
// public yarnwrap.block.Block method_63105(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63105(settings)); }
// public static yarnwrap.block.Block method_63105(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63105(settings)); }
// public yarnwrap.block.Block method_63106(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63106(settings)); }
// public static yarnwrap.block.Block method_63106(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63106(settings)); }
// public yarnwrap.block.Block method_63107(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63107(settings)); }
// public static yarnwrap.block.Block method_63107(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63107(settings)); }
// public yarnwrap.block.Block method_63108(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63108(settings)); }
// public static yarnwrap.block.Block method_63108(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63108(settings)); }
// public yarnwrap.block.Block method_63109(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63109(settings)); }
// public static yarnwrap.block.Block method_63109(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63109(settings)); }
// public yarnwrap.block.Block method_63110(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63110(settings)); }
// public static yarnwrap.block.Block method_63110(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63110(settings)); }
// public yarnwrap.block.Block method_63111(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63111(settings)); }
// public static yarnwrap.block.Block method_63111(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63111(settings)); }
// public yarnwrap.block.Block method_63112(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63112(settings)); }
// public static yarnwrap.block.Block method_63112(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63112(settings)); }
// public yarnwrap.block.Block method_63113(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63113(settings)); }
// public static yarnwrap.block.Block method_63113(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63113(settings)); }
// public yarnwrap.block.Block method_63114(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63114(settings)); }
// public static yarnwrap.block.Block method_63114(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63114(settings)); }
// public yarnwrap.block.Block method_63115(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63115(settings)); }
// public static yarnwrap.block.Block method_63115(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63115(settings)); }
// public yarnwrap.block.Block method_63116(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63116(settings)); }
// public static yarnwrap.block.Block method_63116(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63116(settings)); }
// public Object createButtonSettings() { return wrapperContained.createButtonSettings(); }
public static Object createButtonSettings() { return net.minecraft.block.Blocks.createButtonSettings(); }
// public yarnwrap.block.Block method_63118(yarnwrap.util.DyeColor settings) { return new yarnwrap.block.Block(wrapperContained.method_63118(settings.wrapperContained)); }
// public static yarnwrap.block.Block method_63118(yarnwrap.util.DyeColor settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63118(settings.wrapperContained)); }
// public yarnwrap.block.Block method_63119(yarnwrap.block.Block settings) { return new yarnwrap.block.Block(wrapperContained.method_63119(settings.wrapperContained)); }
// public static yarnwrap.block.Block method_63119(yarnwrap.block.Block settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63119(settings.wrapperContained)); }
// public yarnwrap.block.Block method_63120(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63120(settings)); }
// public static yarnwrap.block.Block method_63120(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63120(settings)); }
// public Object createNetherStemSettings(yarnwrap.block.MapColor mapColor) { return wrapperContained.createNetherStemSettings(mapColor.wrapperContained); }
// public static Object createNetherStemSettings(yarnwrap.block.MapColor mapColor, ) { return net.minecraft.block.Blocks.createNetherStemSettings(mapColor.wrapperContained); }
// public yarnwrap.block.Block registerStainedGlassBlock(java.lang.String id,yarnwrap.util.DyeColor color) { return new yarnwrap.block.Block(wrapperContained.registerStainedGlassBlock(id,color.wrapperContained)); }
// public static yarnwrap.block.Block registerStainedGlassBlock(java.lang.String id,yarnwrap.util.DyeColor color, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.registerStainedGlassBlock(id,color.wrapperContained)); }
// public yarnwrap.block.Block registerStairsBlock(java.lang.String id,yarnwrap.block.Block base) { return new yarnwrap.block.Block(wrapperContained.registerStairsBlock(id,base.wrapperContained)); }
// public static yarnwrap.block.Block registerStairsBlock(java.lang.String id,yarnwrap.block.Block base, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.registerStairsBlock(id,base.wrapperContained)); }
// public yarnwrap.block.Block method_63124(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63124(settings)); }
// public static yarnwrap.block.Block method_63124(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63124(settings)); }
// public yarnwrap.block.Block method_63125(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63125(settings)); }
// public static yarnwrap.block.Block method_63125(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63125(settings)); }
// public yarnwrap.block.Block method_63126(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63126(settings)); }
// public static yarnwrap.block.Block method_63126(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63126(settings)); }
// public yarnwrap.block.Block method_63127(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63127(settings)); }
// public static yarnwrap.block.Block method_63127(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63127(settings)); }
// public yarnwrap.block.Block method_63128(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63128(settings)); }
// public static yarnwrap.block.Block method_63128(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63128(settings)); }
// public yarnwrap.block.Block method_63129(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63129(settings)); }
// public static yarnwrap.block.Block method_63129(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63129(settings)); }
// public yarnwrap.block.Block method_63130(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63130(settings)); }
// public static yarnwrap.block.Block method_63130(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63130(settings)); }
// public yarnwrap.block.Block method_63131(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63131(settings)); }
// public static yarnwrap.block.Block method_63131(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63131(settings)); }
// public yarnwrap.block.Block method_63132(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63132(settings)); }
// public static yarnwrap.block.Block method_63132(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63132(settings)); }
// public yarnwrap.block.Block method_63133(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63133(settings)); }
// public static yarnwrap.block.Block method_63133(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63133(settings)); }
// public yarnwrap.block.Block method_63134(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63134(settings)); }
// public static yarnwrap.block.Block method_63134(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63134(settings)); }
// public yarnwrap.block.Block method_63135(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63135(settings)); }
// public static yarnwrap.block.Block method_63135(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63135(settings)); }
// public yarnwrap.block.Block method_63136(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63136(settings)); }
// public static yarnwrap.block.Block method_63136(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63136(settings)); }
// public yarnwrap.block.Block method_63137(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63137(settings)); }
// public static yarnwrap.block.Block method_63137(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63137(settings)); }
// public yarnwrap.block.Block method_63138(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63138(settings)); }
// public static yarnwrap.block.Block method_63138(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63138(settings)); }
// public yarnwrap.block.Block method_63139(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63139(settings)); }
// public static yarnwrap.block.Block method_63139(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63139(settings)); }
// public yarnwrap.block.Block method_63140(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63140(settings)); }
// public static yarnwrap.block.Block method_63140(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63140(settings)); }
// public yarnwrap.block.Block method_63141(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63141(settings)); }
// public static yarnwrap.block.Block method_63141(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63141(settings)); }
// public yarnwrap.block.Block method_63142(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63142(settings)); }
// public static yarnwrap.block.Block method_63142(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63142(settings)); }
// public yarnwrap.block.Block method_63143(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63143(settings)); }
// public static yarnwrap.block.Block method_63143(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63143(settings)); }
// public yarnwrap.block.Block method_63144(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63144(settings)); }
// public static yarnwrap.block.Block method_63144(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63144(settings)); }
// public yarnwrap.block.Block method_63145(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63145(settings)); }
// public static yarnwrap.block.Block method_63145(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63145(settings)); }
// public yarnwrap.block.Block method_63146(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63146(settings)); }
// public static yarnwrap.block.Block method_63146(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63146(settings)); }
// public yarnwrap.block.Block method_63147(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63147(settings)); }
// public static yarnwrap.block.Block method_63147(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63147(settings)); }
// public yarnwrap.block.Block method_63148(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63148(settings)); }
// public static yarnwrap.block.Block method_63148(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63148(settings)); }
// public yarnwrap.block.Block method_63149(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63149(settings)); }
// public static yarnwrap.block.Block method_63149(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63149(settings)); }
// public yarnwrap.block.Block method_63150(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63150(settings)); }
// public static yarnwrap.block.Block method_63150(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63150(settings)); }
// public yarnwrap.block.Block method_63151(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63151(settings)); }
// public static yarnwrap.block.Block method_63151(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63151(settings)); }
// public yarnwrap.block.Block method_63152(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63152(settings)); }
// public static yarnwrap.block.Block method_63152(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63152(settings)); }
// public yarnwrap.block.Block method_63153(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63153(settings)); }
// public static yarnwrap.block.Block method_63153(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63153(settings)); }
// public yarnwrap.block.Block method_63154(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63154(settings)); }
// public static yarnwrap.block.Block method_63154(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63154(settings)); }
// public yarnwrap.block.Block method_63155(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63155(settings)); }
// public static yarnwrap.block.Block method_63155(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63155(settings)); }
// public yarnwrap.block.Block method_63156(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63156(settings)); }
// public static yarnwrap.block.Block method_63156(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63156(settings)); }
// public yarnwrap.block.Block method_63157(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63157(settings)); }
// public static yarnwrap.block.Block method_63157(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63157(settings)); }
// public yarnwrap.block.Block method_63158(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63158(settings)); }
// public static yarnwrap.block.Block method_63158(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63158(settings)); }
// public yarnwrap.block.Block method_63159(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63159(settings)); }
// public static yarnwrap.block.Block method_63159(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63159(settings)); }
// public yarnwrap.block.Block method_63160(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63160(settings)); }
// public static yarnwrap.block.Block method_63160(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63160(settings)); }
// public yarnwrap.block.Block method_63161(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63161(settings)); }
// public static yarnwrap.block.Block method_63161(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63161(settings)); }
// public yarnwrap.block.Block method_63162(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63162(settings)); }
// public static yarnwrap.block.Block method_63162(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63162(settings)); }
// public yarnwrap.block.Block method_63163(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63163(settings)); }
// public static yarnwrap.block.Block method_63163(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63163(settings)); }
// public yarnwrap.block.Block method_63164(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63164(settings)); }
// public static yarnwrap.block.Block method_63164(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63164(settings)); }
// public yarnwrap.block.Block method_63165(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63165(settings)); }
// public static yarnwrap.block.Block method_63165(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63165(settings)); }
// public yarnwrap.block.Block method_63166(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63166(settings)); }
// public static yarnwrap.block.Block method_63166(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63166(settings)); }
// public yarnwrap.block.Block method_63167(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63167(settings)); }
// public static yarnwrap.block.Block method_63167(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63167(settings)); }
// public yarnwrap.block.Block method_63168(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63168(settings)); }
// public static yarnwrap.block.Block method_63168(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63168(settings)); }
// public yarnwrap.block.Block method_63169(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63169(settings)); }
// public static yarnwrap.block.Block method_63169(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63169(settings)); }
// public yarnwrap.block.Block method_63170(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63170(settings)); }
// public static yarnwrap.block.Block method_63170(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63170(settings)); }
// public yarnwrap.block.Block method_63171(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63171(settings)); }
// public static yarnwrap.block.Block method_63171(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63171(settings)); }
// public yarnwrap.block.Block method_63172(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63172(settings)); }
// public static yarnwrap.block.Block method_63172(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63172(settings)); }
// public yarnwrap.block.Block method_63173(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63173(settings)); }
// public static yarnwrap.block.Block method_63173(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63173(settings)); }
// public yarnwrap.block.Block method_63174(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63174(settings)); }
// public static yarnwrap.block.Block method_63174(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63174(settings)); }
// public yarnwrap.block.Block method_63175(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63175(settings)); }
// public static yarnwrap.block.Block method_63175(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63175(settings)); }
// public Object createFlowerPotSettings() { return wrapperContained.createFlowerPotSettings(); }
public static Object createFlowerPotSettings() { return net.minecraft.block.Blocks.createFlowerPotSettings(); }
// public yarnwrap.block.Block method_63177(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63177(settings)); }
// public static yarnwrap.block.Block method_63177(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63177(settings)); }
// public Object createShulkerBoxSettings(yarnwrap.block.MapColor mapColor) { return wrapperContained.createShulkerBoxSettings(mapColor.wrapperContained); }
// public static Object createShulkerBoxSettings(yarnwrap.block.MapColor mapColor, ) { return net.minecraft.block.Blocks.createShulkerBoxSettings(mapColor.wrapperContained); }
// public yarnwrap.block.Block method_63179(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63179(settings)); }
// public static yarnwrap.block.Block method_63179(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63179(settings)); }
// public yarnwrap.block.Block method_63180(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63180(settings)); }
// public static yarnwrap.block.Block method_63180(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63180(settings)); }
// public yarnwrap.block.Block method_63181(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63181(settings)); }
// public static yarnwrap.block.Block method_63181(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63181(settings)); }
// public yarnwrap.block.Block method_63182(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63182(settings)); }
// public static yarnwrap.block.Block method_63182(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63182(settings)); }
// public yarnwrap.block.Block method_63183(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63183(settings)); }
// public static yarnwrap.block.Block method_63183(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63183(settings)); }
// public yarnwrap.block.Block method_63184(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63184(settings)); }
// public static yarnwrap.block.Block method_63184(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63184(settings)); }
// public yarnwrap.block.Block method_63185(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63185(settings)); }
// public static yarnwrap.block.Block method_63185(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63185(settings)); }
// public yarnwrap.block.Block method_63186(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63186(settings)); }
// public static yarnwrap.block.Block method_63186(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63186(settings)); }
// public yarnwrap.block.Block method_63187(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63187(settings)); }
// public static yarnwrap.block.Block method_63187(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63187(settings)); }
// public yarnwrap.block.Block method_63188(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63188(settings)); }
// public static yarnwrap.block.Block method_63188(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63188(settings)); }
// public yarnwrap.block.Block method_63189(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63189(settings)); }
// public static yarnwrap.block.Block method_63189(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63189(settings)); }
// public yarnwrap.block.Block method_63190(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63190(settings)); }
// public static yarnwrap.block.Block method_63190(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63190(settings)); }
// public yarnwrap.block.Block method_63191(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63191(settings)); }
// public static yarnwrap.block.Block method_63191(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63191(settings)); }
// public yarnwrap.block.Block method_63192(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63192(settings)); }
// public static yarnwrap.block.Block method_63192(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63192(settings)); }
// public yarnwrap.block.Block method_63193(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63193(settings)); }
// public static yarnwrap.block.Block method_63193(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63193(settings)); }
// public yarnwrap.block.Block method_63194(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63194(settings)); }
// public static yarnwrap.block.Block method_63194(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63194(settings)); }
// public yarnwrap.block.Block method_63195(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63195(settings)); }
// public static yarnwrap.block.Block method_63195(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63195(settings)); }
// public yarnwrap.block.Block method_63196(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63196(settings)); }
// public static yarnwrap.block.Block method_63196(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63196(settings)); }
// public yarnwrap.block.Block method_63197(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63197(settings)); }
// public static yarnwrap.block.Block method_63197(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63197(settings)); }
// public yarnwrap.block.Block method_63198(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63198(settings)); }
// public static yarnwrap.block.Block method_63198(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63198(settings)); }
// public yarnwrap.block.Block method_63199(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63199(settings)); }
// public static yarnwrap.block.Block method_63199(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63199(settings)); }
// public yarnwrap.block.Block method_63200(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63200(settings)); }
// public static yarnwrap.block.Block method_63200(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63200(settings)); }
// public yarnwrap.block.Block method_63201(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63201(settings)); }
// public static yarnwrap.block.Block method_63201(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63201(settings)); }
// public yarnwrap.block.Block method_63202(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63202(settings)); }
// public static yarnwrap.block.Block method_63202(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63202(settings)); }
// public yarnwrap.block.Block method_63203(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63203(settings)); }
// public static yarnwrap.block.Block method_63203(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63203(settings)); }
// public yarnwrap.block.Block method_63204(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63204(settings)); }
// public static yarnwrap.block.Block method_63204(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63204(settings)); }
// public yarnwrap.block.Block method_63205(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63205(settings)); }
// public static yarnwrap.block.Block method_63205(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63205(settings)); }
// public yarnwrap.block.Block method_63206(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63206(settings)); }
// public static yarnwrap.block.Block method_63206(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63206(settings)); }
// public yarnwrap.block.Block method_63207(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63207(settings)); }
// public static yarnwrap.block.Block method_63207(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63207(settings)); }
// public yarnwrap.block.Block method_63208(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63208(settings)); }
// public static yarnwrap.block.Block method_63208(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63208(settings)); }
// public yarnwrap.block.Block method_63209(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63209(settings)); }
// public static yarnwrap.block.Block method_63209(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63209(settings)); }
// public yarnwrap.block.Block method_63210(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63210(settings)); }
// public static yarnwrap.block.Block method_63210(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63210(settings)); }
// public yarnwrap.block.Block method_63211(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63211(settings)); }
// public static yarnwrap.block.Block method_63211(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63211(settings)); }
// public yarnwrap.block.Block method_63212(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63212(settings)); }
// public static yarnwrap.block.Block method_63212(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63212(settings)); }
// public yarnwrap.block.Block method_63213(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63213(settings)); }
// public static yarnwrap.block.Block method_63213(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63213(settings)); }
// public yarnwrap.block.Block method_63214(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63214(settings)); }
// public static yarnwrap.block.Block method_63214(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63214(settings)); }
// public yarnwrap.block.Block method_63215(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63215(settings)); }
// public static yarnwrap.block.Block method_63215(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63215(settings)); }
// public yarnwrap.block.Block method_63216(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63216(settings)); }
// public static yarnwrap.block.Block method_63216(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63216(settings)); }
// public yarnwrap.block.Block method_63217(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63217(settings)); }
// public static yarnwrap.block.Block method_63217(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63217(settings)); }
// public yarnwrap.block.Block method_63218(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63218(settings)); }
// public static yarnwrap.block.Block method_63218(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63218(settings)); }
// public yarnwrap.block.Block method_63219(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63219(settings)); }
// public static yarnwrap.block.Block method_63219(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63219(settings)); }
// public yarnwrap.block.Block method_63220(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63220(settings)); }
// public static yarnwrap.block.Block method_63220(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63220(settings)); }
// public yarnwrap.block.Block method_63221(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63221(settings)); }
// public static yarnwrap.block.Block method_63221(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63221(settings)); }
// public yarnwrap.block.Block method_63222(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63222(settings)); }
// public static yarnwrap.block.Block method_63222(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63222(settings)); }
// public yarnwrap.block.Block method_63223(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63223(settings)); }
// public static yarnwrap.block.Block method_63223(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63223(settings)); }
// public yarnwrap.block.Block method_63224(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63224(settings)); }
// public static yarnwrap.block.Block method_63224(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63224(settings)); }
// public yarnwrap.block.Block method_63225(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63225(settings)); }
// public static yarnwrap.block.Block method_63225(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63225(settings)); }
// public yarnwrap.block.Block method_63226(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63226(settings)); }
// public static yarnwrap.block.Block method_63226(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63226(settings)); }
// public yarnwrap.block.Block method_63227(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63227(settings)); }
// public static yarnwrap.block.Block method_63227(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63227(settings)); }
// public yarnwrap.block.Block method_63228(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63228(settings)); }
// public static yarnwrap.block.Block method_63228(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63228(settings)); }
// public yarnwrap.block.Block method_63229(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63229(settings)); }
// public static yarnwrap.block.Block method_63229(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63229(settings)); }
// public yarnwrap.block.Block method_63230(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63230(settings)); }
// public static yarnwrap.block.Block method_63230(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63230(settings)); }
// public yarnwrap.block.Block method_63232(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63232(settings)); }
// public static yarnwrap.block.Block method_63232(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63232(settings)); }
// public Object createCandleSettings(yarnwrap.block.MapColor mapColor) { return wrapperContained.createCandleSettings(mapColor.wrapperContained); }
// public static Object createCandleSettings(yarnwrap.block.MapColor mapColor, ) { return net.minecraft.block.Blocks.createCandleSettings(mapColor.wrapperContained); }
// public yarnwrap.block.Block method_63234(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63234(settings)); }
// public static yarnwrap.block.Block method_63234(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63234(settings)); }
// public yarnwrap.block.Block method_63235(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63235(settings)); }
// public static yarnwrap.block.Block method_63235(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63235(settings)); }
// public yarnwrap.block.Block method_63236(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63236(settings)); }
// public static yarnwrap.block.Block method_63236(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63236(settings)); }
// public yarnwrap.block.Block method_63237(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63237(settings)); }
// public static yarnwrap.block.Block method_63237(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63237(settings)); }
// public yarnwrap.block.Block method_63238(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63238(settings)); }
// public static yarnwrap.block.Block method_63238(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63238(settings)); }
// public yarnwrap.block.Block method_63239(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63239(settings)); }
// public static yarnwrap.block.Block method_63239(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63239(settings)); }
// public yarnwrap.block.Block method_63240(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63240(settings)); }
// public static yarnwrap.block.Block method_63240(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63240(settings)); }
// public yarnwrap.block.Block method_63241(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63241(settings)); }
// public static yarnwrap.block.Block method_63241(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63241(settings)); }
// public yarnwrap.block.Block method_63242(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63242(settings)); }
// public static yarnwrap.block.Block method_63242(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63242(settings)); }
// public yarnwrap.block.Block method_63243(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63243(settings)); }
// public static yarnwrap.block.Block method_63243(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63243(settings)); }
// public yarnwrap.block.Block method_63244(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63244(settings)); }
// public static yarnwrap.block.Block method_63244(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63244(settings)); }
// public yarnwrap.block.Block method_63245(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63245(settings)); }
// public static yarnwrap.block.Block method_63245(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63245(settings)); }
// public yarnwrap.block.Block method_63246(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63246(settings)); }
// public static yarnwrap.block.Block method_63246(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63246(settings)); }
// public yarnwrap.block.Block method_63247(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63247(settings)); }
// public static yarnwrap.block.Block method_63247(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63247(settings)); }
// public yarnwrap.block.Block method_63248(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63248(settings)); }
// public static yarnwrap.block.Block method_63248(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63248(settings)); }
// public yarnwrap.block.Block method_63249(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63249(settings)); }
// public static yarnwrap.block.Block method_63249(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63249(settings)); }
// public yarnwrap.block.Block method_63250(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63250(settings)); }
// public static yarnwrap.block.Block method_63250(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63250(settings)); }
// public yarnwrap.block.Block method_63251(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63251(settings)); }
// public static yarnwrap.block.Block method_63251(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63251(settings)); }
// public yarnwrap.block.Block method_63252(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63252(settings)); }
// public static yarnwrap.block.Block method_63252(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63252(settings)); }
// public yarnwrap.block.Block method_63253(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63253(settings)); }
// public static yarnwrap.block.Block method_63253(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63253(settings)); }
// public yarnwrap.block.Block method_63254(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63254(settings)); }
// public static yarnwrap.block.Block method_63254(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63254(settings)); }
// public yarnwrap.block.Block method_63255(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63255(settings)); }
// public static yarnwrap.block.Block method_63255(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63255(settings)); }
// public yarnwrap.block.Block method_63256(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63256(settings)); }
// public static yarnwrap.block.Block method_63256(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63256(settings)); }
// public yarnwrap.block.Block method_63257(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63257(settings)); }
// public static yarnwrap.block.Block method_63257(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63257(settings)); }
// public yarnwrap.block.Block method_63258(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63258(settings)); }
// public static yarnwrap.block.Block method_63258(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63258(settings)); }
// public yarnwrap.block.Block method_63259(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63259(settings)); }
// public static yarnwrap.block.Block method_63259(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63259(settings)); }
// public yarnwrap.block.Block method_63260(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63260(settings)); }
// public static yarnwrap.block.Block method_63260(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63260(settings)); }
// public yarnwrap.block.Block method_63261(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63261(settings)); }
// public static yarnwrap.block.Block method_63261(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63261(settings)); }
// public yarnwrap.block.Block method_63262(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63262(settings)); }
// public static yarnwrap.block.Block method_63262(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63262(settings)); }
// public yarnwrap.block.Block method_63263(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63263(settings)); }
// public static yarnwrap.block.Block method_63263(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63263(settings)); }
// public yarnwrap.block.Block method_63264(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63264(settings)); }
// public static yarnwrap.block.Block method_63264(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63264(settings)); }
// public yarnwrap.block.Block method_63265(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63265(settings)); }
// public static yarnwrap.block.Block method_63265(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63265(settings)); }
// public yarnwrap.block.Block method_63266(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63266(settings)); }
// public static yarnwrap.block.Block method_63266(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63266(settings)); }
// public yarnwrap.block.Block method_63267(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63267(settings)); }
// public static yarnwrap.block.Block method_63267(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63267(settings)); }
// public yarnwrap.block.Block method_63268(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63268(settings)); }
// public static yarnwrap.block.Block method_63268(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63268(settings)); }
// public yarnwrap.block.Block method_63269(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63269(settings)); }
// public static yarnwrap.block.Block method_63269(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63269(settings)); }
// public yarnwrap.block.Block method_63270(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63270(settings)); }
// public static yarnwrap.block.Block method_63270(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63270(settings)); }
// public yarnwrap.block.Block method_63271(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63271(settings)); }
// public static yarnwrap.block.Block method_63271(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63271(settings)); }
// public yarnwrap.block.Block method_63272(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63272(settings)); }
// public static yarnwrap.block.Block method_63272(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63272(settings)); }
// public yarnwrap.block.Block method_63273(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63273(settings)); }
// public static yarnwrap.block.Block method_63273(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63273(settings)); }
// public yarnwrap.block.Block method_63274(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63274(settings)); }
// public static yarnwrap.block.Block method_63274(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63274(settings)); }
// public yarnwrap.block.Block method_63275(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63275(settings)); }
// public static yarnwrap.block.Block method_63275(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63275(settings)); }
// public yarnwrap.block.Block method_63276(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63276(settings)); }
// public static yarnwrap.block.Block method_63276(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63276(settings)); }
// public yarnwrap.block.Block method_63277(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63277(settings)); }
// public static yarnwrap.block.Block method_63277(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63277(settings)); }
// public yarnwrap.block.Block method_63278(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63278(settings)); }
// public static yarnwrap.block.Block method_63278(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63278(settings)); }
// public yarnwrap.block.Block method_63279(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63279(settings)); }
// public static yarnwrap.block.Block method_63279(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63279(settings)); }
// public yarnwrap.block.Block method_63280(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63280(settings)); }
// public static yarnwrap.block.Block method_63280(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63280(settings)); }
// public yarnwrap.block.Block method_63281(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63281(settings)); }
// public static yarnwrap.block.Block method_63281(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63281(settings)); }
// public yarnwrap.block.Block method_63282(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63282(settings)); }
// public static yarnwrap.block.Block method_63282(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63282(settings)); }
// public yarnwrap.block.Block method_63283(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63283(settings)); }
// public static yarnwrap.block.Block method_63283(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63283(settings)); }
// public yarnwrap.block.Block method_63284(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63284(settings)); }
// public static yarnwrap.block.Block method_63284(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63284(settings)); }
// public yarnwrap.block.Block method_63285(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63285(settings)); }
// public static yarnwrap.block.Block method_63285(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63285(settings)); }
// public yarnwrap.block.Block method_63286(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63286(settings)); }
// public static yarnwrap.block.Block method_63286(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63286(settings)); }
// public int method_63287(yarnwrap.block.BlockState state) { return wrapperContained.method_63287(state.wrapperContained); }
// public static int method_63287(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_63287(state.wrapperContained); }
// public boolean method_63288(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_63288(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean method_63288(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.Blocks.method_63288(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.Block method_63289(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63289(settings)); }
// public static yarnwrap.block.Block method_63289(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63289(settings)); }
// public yarnwrap.block.Block method_63290(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63290(settings)); }
// public static yarnwrap.block.Block method_63290(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63290(settings)); }
// public yarnwrap.block.Block method_63291(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63291(settings)); }
// public static yarnwrap.block.Block method_63291(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63291(settings)); }
// public yarnwrap.block.Block method_63292(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63292(settings)); }
// public static yarnwrap.block.Block method_63292(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63292(settings)); }
// public yarnwrap.block.Block method_63293(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63293(settings)); }
// public static yarnwrap.block.Block method_63293(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63293(settings)); }
// public yarnwrap.block.Block method_63294(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63294(settings)); }
// public static yarnwrap.block.Block method_63294(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63294(settings)); }
// public yarnwrap.block.Block method_63295(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63295(settings)); }
// public static yarnwrap.block.Block method_63295(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63295(settings)); }
// public yarnwrap.block.Block method_63296(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63296(settings)); }
// public static yarnwrap.block.Block method_63296(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63296(settings)); }
// public yarnwrap.block.Block method_63297(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63297(settings)); }
// public static yarnwrap.block.Block method_63297(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63297(settings)); }
// public yarnwrap.block.Block method_63298(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63298(settings)); }
// public static yarnwrap.block.Block method_63298(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63298(settings)); }
// public yarnwrap.block.Block method_63299(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63299(settings)); }
// public static yarnwrap.block.Block method_63299(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63299(settings)); }
// public yarnwrap.block.Block method_63300(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63300(settings)); }
// public static yarnwrap.block.Block method_63300(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63300(settings)); }
// public yarnwrap.block.Block method_63301(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63301(settings)); }
// public static yarnwrap.block.Block method_63301(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63301(settings)); }
// public yarnwrap.block.Block method_63302(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63302(settings)); }
// public static yarnwrap.block.Block method_63302(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63302(settings)); }
// public yarnwrap.block.Block method_63303(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63303(settings)); }
// public static yarnwrap.block.Block method_63303(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63303(settings)); }
// public yarnwrap.block.Block method_63304(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63304(settings)); }
// public static yarnwrap.block.Block method_63304(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63304(settings)); }
// public yarnwrap.block.Block method_63305(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63305(settings)); }
// public static yarnwrap.block.Block method_63305(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63305(settings)); }
// public yarnwrap.block.Block method_63306(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63306(settings)); }
// public static yarnwrap.block.Block method_63306(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63306(settings)); }
// public yarnwrap.block.Block method_63307(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63307(settings)); }
// public static yarnwrap.block.Block method_63307(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63307(settings)); }
// public yarnwrap.block.Block method_63308(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63308(settings)); }
// public static yarnwrap.block.Block method_63308(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63308(settings)); }
// public yarnwrap.block.Block method_63309(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63309(settings)); }
// public static yarnwrap.block.Block method_63309(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63309(settings)); }
// public yarnwrap.block.Block method_63310(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63310(settings)); }
// public static yarnwrap.block.Block method_63310(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63310(settings)); }
// public yarnwrap.block.Block method_63311(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63311(settings)); }
// public static yarnwrap.block.Block method_63311(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63311(settings)); }
// public yarnwrap.block.Block method_63312(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63312(settings)); }
// public static yarnwrap.block.Block method_63312(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63312(settings)); }
// public yarnwrap.block.Block method_63313(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63313(settings)); }
// public static yarnwrap.block.Block method_63313(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63313(settings)); }
// public yarnwrap.block.Block method_63314(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63314(settings)); }
// public static yarnwrap.block.Block method_63314(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63314(settings)); }
// public yarnwrap.block.Block method_63315(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63315(settings)); }
// public static yarnwrap.block.Block method_63315(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63315(settings)); }
// public yarnwrap.block.Block method_63316(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63316(settings)); }
// public static yarnwrap.block.Block method_63316(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63316(settings)); }
// public yarnwrap.block.Block method_63317(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63317(settings)); }
// public static yarnwrap.block.Block method_63317(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63317(settings)); }
// public yarnwrap.block.Block method_63318(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63318(settings)); }
// public static yarnwrap.block.Block method_63318(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63318(settings)); }
// public yarnwrap.block.Block method_63319(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63319(settings)); }
// public static yarnwrap.block.Block method_63319(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63319(settings)); }
// public yarnwrap.block.Block method_63320(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63320(settings)); }
// public static yarnwrap.block.Block method_63320(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63320(settings)); }
// public yarnwrap.block.Block method_63321(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63321(settings)); }
// public static yarnwrap.block.Block method_63321(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63321(settings)); }
// public yarnwrap.block.Block method_63322(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63322(settings)); }
// public static yarnwrap.block.Block method_63322(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63322(settings)); }
// public yarnwrap.block.Block method_63323(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63323(settings)); }
// public static yarnwrap.block.Block method_63323(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63323(settings)); }
// public yarnwrap.block.Block method_63324(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63324(settings)); }
// public static yarnwrap.block.Block method_63324(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63324(settings)); }
// public yarnwrap.block.Block method_63325(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63325(settings)); }
// public static yarnwrap.block.Block method_63325(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63325(settings)); }
// public yarnwrap.block.Block method_63326(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63326(settings)); }
// public static yarnwrap.block.Block method_63326(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63326(settings)); }
// public yarnwrap.block.Block method_63327(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63327(settings)); }
// public static yarnwrap.block.Block method_63327(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63327(settings)); }
// public yarnwrap.block.Block method_63328(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63328(settings)); }
// public static yarnwrap.block.Block method_63328(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63328(settings)); }
// public yarnwrap.block.Block method_63329(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63329(settings)); }
// public static yarnwrap.block.Block method_63329(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63329(settings)); }
// public yarnwrap.block.Block method_63330(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63330(settings)); }
// public static yarnwrap.block.Block method_63330(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63330(settings)); }
// public yarnwrap.block.Block method_63331(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63331(settings)); }
// public static yarnwrap.block.Block method_63331(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63331(settings)); }
// public yarnwrap.block.Block method_63332(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63332(settings)); }
// public static yarnwrap.block.Block method_63332(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63332(settings)); }
// public yarnwrap.block.Block method_63333(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63333(settings)); }
// public static yarnwrap.block.Block method_63333(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63333(settings)); }
// public yarnwrap.block.Block method_63334(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63334(settings)); }
// public static yarnwrap.block.Block method_63334(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63334(settings)); }
// public yarnwrap.block.Block method_63335(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63335(settings)); }
// public static yarnwrap.block.Block method_63335(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63335(settings)); }
// public yarnwrap.block.Block method_63336(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63336(settings)); }
// public static yarnwrap.block.Block method_63336(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63336(settings)); }
// public yarnwrap.block.Block method_63337(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63337(settings)); }
// public static yarnwrap.block.Block method_63337(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63337(settings)); }
// public yarnwrap.block.Block method_63338(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63338(settings)); }
// public static yarnwrap.block.Block method_63338(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63338(settings)); }
// public yarnwrap.block.Block method_63339(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63339(settings)); }
// public static yarnwrap.block.Block method_63339(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63339(settings)); }
// public yarnwrap.block.Block method_63340(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63340(settings)); }
// public static yarnwrap.block.Block method_63340(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63340(settings)); }
// public yarnwrap.block.Block method_63341(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63341(settings)); }
// public static yarnwrap.block.Block method_63341(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63341(settings)); }
// public yarnwrap.block.Block method_63342(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63342(settings)); }
// public static yarnwrap.block.Block method_63342(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63342(settings)); }
// public yarnwrap.block.Block method_63343(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63343(settings)); }
// public static yarnwrap.block.Block method_63343(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63343(settings)); }
// public yarnwrap.block.Block method_63344(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63344(settings)); }
// public static yarnwrap.block.Block method_63344(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63344(settings)); }
// public yarnwrap.block.Block method_63345(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63345(settings)); }
// public static yarnwrap.block.Block method_63345(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63345(settings)); }
// public yarnwrap.block.Block method_63346(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63346(settings)); }
// public static yarnwrap.block.Block method_63346(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63346(settings)); }
// public yarnwrap.block.Block method_63347(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63347(settings)); }
// public static yarnwrap.block.Block method_63347(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63347(settings)); }
// public yarnwrap.block.Block method_63348(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63348(settings)); }
// public static yarnwrap.block.Block method_63348(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63348(settings)); }
// public yarnwrap.block.Block method_63349(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63349(settings)); }
// public static yarnwrap.block.Block method_63349(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63349(settings)); }
// public yarnwrap.block.Block method_63350(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63350(settings)); }
// public static yarnwrap.block.Block method_63350(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63350(settings)); }
// public yarnwrap.block.Block method_63351(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63351(settings)); }
// public static yarnwrap.block.Block method_63351(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63351(settings)); }
// public yarnwrap.block.Block method_63352(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63352(settings)); }
// public static yarnwrap.block.Block method_63352(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63352(settings)); }
// public yarnwrap.block.Block method_63353(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63353(settings)); }
// public static yarnwrap.block.Block method_63353(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63353(settings)); }
// public yarnwrap.block.Block method_63354(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63354(settings)); }
// public static yarnwrap.block.Block method_63354(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63354(settings)); }
// public yarnwrap.block.Block method_63355(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63355(settings)); }
// public static yarnwrap.block.Block method_63355(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63355(settings)); }
// public yarnwrap.block.Block method_63356(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63356(settings)); }
// public static yarnwrap.block.Block method_63356(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63356(settings)); }
// public yarnwrap.block.Block method_63357(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63357(settings)); }
// public static yarnwrap.block.Block method_63357(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63357(settings)); }
// public yarnwrap.block.Block method_63358(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63358(settings)); }
// public static yarnwrap.block.Block method_63358(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63358(settings)); }
// public yarnwrap.block.Block method_63359(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63359(settings)); }
// public static yarnwrap.block.Block method_63359(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63359(settings)); }
// public yarnwrap.block.Block method_63360(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63360(settings)); }
// public static yarnwrap.block.Block method_63360(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63360(settings)); }
// public yarnwrap.block.Block method_63361(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63361(settings)); }
// public static yarnwrap.block.Block method_63361(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63361(settings)); }
// public yarnwrap.block.Block method_63362(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63362(settings)); }
// public static yarnwrap.block.Block method_63362(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63362(settings)); }
// public yarnwrap.block.Block method_63363(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63363(settings)); }
// public static yarnwrap.block.Block method_63363(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63363(settings)); }
// public yarnwrap.block.Block method_63364(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63364(settings)); }
// public static yarnwrap.block.Block method_63364(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63364(settings)); }
// public yarnwrap.block.Block method_63365(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63365(settings)); }
// public static yarnwrap.block.Block method_63365(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63365(settings)); }
// public yarnwrap.block.Block method_63366(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63366(settings)); }
// public static yarnwrap.block.Block method_63366(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63366(settings)); }
// public yarnwrap.block.Block method_63367(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63367(settings)); }
// public static yarnwrap.block.Block method_63367(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63367(settings)); }
// public yarnwrap.block.Block method_63368(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63368(settings)); }
// public static yarnwrap.block.Block method_63368(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63368(settings)); }
// public yarnwrap.block.Block method_63369(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63369(settings)); }
// public static yarnwrap.block.Block method_63369(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63369(settings)); }
// public yarnwrap.block.Block method_63370(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63370(settings)); }
// public static yarnwrap.block.Block method_63370(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63370(settings)); }
// public yarnwrap.block.Block method_63371(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63371(settings)); }
// public static yarnwrap.block.Block method_63371(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63371(settings)); }
// public yarnwrap.block.Block method_63372(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63372(settings)); }
// public static yarnwrap.block.Block method_63372(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63372(settings)); }
// public yarnwrap.block.Block method_63373(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63373(settings)); }
// public static yarnwrap.block.Block method_63373(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63373(settings)); }
// public yarnwrap.block.Block method_63374(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63374(settings)); }
// public static yarnwrap.block.Block method_63374(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63374(settings)); }
// public yarnwrap.block.Block method_63375(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63375(settings)); }
// public static yarnwrap.block.Block method_63375(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63375(settings)); }
// public yarnwrap.block.Block method_63376(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63376(settings)); }
// public static yarnwrap.block.Block method_63376(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63376(settings)); }
// public yarnwrap.block.Block method_63377(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63377(settings)); }
// public static yarnwrap.block.Block method_63377(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63377(settings)); }
// public yarnwrap.block.Block method_63378(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63378(settings)); }
// public static yarnwrap.block.Block method_63378(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63378(settings)); }
// public yarnwrap.block.Block method_63379(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63379(settings)); }
// public static yarnwrap.block.Block method_63379(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63379(settings)); }
// public yarnwrap.block.Block method_63380(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63380(settings)); }
// public static yarnwrap.block.Block method_63380(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63380(settings)); }
// public yarnwrap.block.Block method_63381(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63381(settings)); }
// public static yarnwrap.block.Block method_63381(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63381(settings)); }
// public yarnwrap.block.Block method_63382(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63382(settings)); }
// public static yarnwrap.block.Block method_63382(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63382(settings)); }
// public yarnwrap.block.Block method_63383(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63383(settings)); }
// public static yarnwrap.block.Block method_63383(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63383(settings)); }
// public yarnwrap.block.Block method_63384(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63384(settings)); }
// public static yarnwrap.block.Block method_63384(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63384(settings)); }
// public yarnwrap.block.Block method_63385(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63385(settings)); }
// public static yarnwrap.block.Block method_63385(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63385(settings)); }
// public yarnwrap.block.Block method_63386(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63386(settings)); }
// public static yarnwrap.block.Block method_63386(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63386(settings)); }
// public yarnwrap.block.Block method_63387(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63387(settings)); }
// public static yarnwrap.block.Block method_63387(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63387(settings)); }
// public yarnwrap.block.Block method_63388(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63388(settings)); }
// public static yarnwrap.block.Block method_63388(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63388(settings)); }
// public yarnwrap.block.Block method_63389(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63389(settings)); }
// public static yarnwrap.block.Block method_63389(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63389(settings)); }
// public yarnwrap.block.Block method_63390(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63390(settings)); }
// public static yarnwrap.block.Block method_63390(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63390(settings)); }
// public yarnwrap.block.Block method_63391(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63391(settings)); }
// public static yarnwrap.block.Block method_63391(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63391(settings)); }
// public yarnwrap.block.Block method_63392(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63392(settings)); }
// public static yarnwrap.block.Block method_63392(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63392(settings)); }
// public yarnwrap.block.Block method_63393(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63393(settings)); }
// public static yarnwrap.block.Block method_63393(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63393(settings)); }
// public yarnwrap.block.Block method_63394(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63394(settings)); }
// public static yarnwrap.block.Block method_63394(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63394(settings)); }
// public yarnwrap.block.Block method_63395(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63395(settings)); }
// public static yarnwrap.block.Block method_63395(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63395(settings)); }
// public yarnwrap.block.Block method_63396(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63396(settings)); }
// public static yarnwrap.block.Block method_63396(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63396(settings)); }
// public yarnwrap.block.Block method_63397(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63397(settings)); }
// public static yarnwrap.block.Block method_63397(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63397(settings)); }
// public yarnwrap.block.Block method_63398(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63398(settings)); }
// public static yarnwrap.block.Block method_63398(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63398(settings)); }
// public yarnwrap.block.Block method_63399(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63399(settings)); }
// public static yarnwrap.block.Block method_63399(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63399(settings)); }
// public yarnwrap.block.Block method_63400(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63400(settings)); }
// public static yarnwrap.block.Block method_63400(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63400(settings)); }
// public yarnwrap.block.Block method_63401(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63401(settings)); }
// public static yarnwrap.block.Block method_63401(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63401(settings)); }
// public yarnwrap.block.Block method_63402(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63402(settings)); }
// public static yarnwrap.block.Block method_63402(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63402(settings)); }
// public yarnwrap.block.Block method_63403(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63403(settings)); }
// public static yarnwrap.block.Block method_63403(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63403(settings)); }
// public yarnwrap.block.Block method_63404(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63404(settings)); }
// public static yarnwrap.block.Block method_63404(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63404(settings)); }
// public yarnwrap.block.Block method_63405(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63405(settings)); }
// public static yarnwrap.block.Block method_63405(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63405(settings)); }
// public yarnwrap.block.Block method_63406(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63406(settings)); }
// public static yarnwrap.block.Block method_63406(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63406(settings)); }
// public yarnwrap.block.Block method_63407(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63407(settings)); }
// public static yarnwrap.block.Block method_63407(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63407(settings)); }
// public yarnwrap.block.Block method_63408(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63408(settings)); }
// public static yarnwrap.block.Block method_63408(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63408(settings)); }
// public yarnwrap.block.Block method_63409(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63409(settings)); }
// public static yarnwrap.block.Block method_63409(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63409(settings)); }
// public yarnwrap.block.Block method_63410(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63410(settings)); }
// public static yarnwrap.block.Block method_63410(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63410(settings)); }
// public yarnwrap.block.Block method_63411(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63411(settings)); }
// public static yarnwrap.block.Block method_63411(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63411(settings)); }
// public yarnwrap.block.Block method_63412(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63412(settings)); }
// public static yarnwrap.block.Block method_63412(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63412(settings)); }
// public yarnwrap.block.Block method_63413(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63413(settings)); }
// public static yarnwrap.block.Block method_63413(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63413(settings)); }
// public yarnwrap.block.Block method_63414(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63414(settings)); }
// public static yarnwrap.block.Block method_63414(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63414(settings)); }
// public yarnwrap.block.Block method_63415(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63415(settings)); }
// public static yarnwrap.block.Block method_63415(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63415(settings)); }
// public yarnwrap.block.Block method_63416(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63416(settings)); }
// public static yarnwrap.block.Block method_63416(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63416(settings)); }
// public yarnwrap.block.Block method_63417(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63417(settings)); }
// public static yarnwrap.block.Block method_63417(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63417(settings)); }
// public yarnwrap.block.Block method_63418(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63418(settings)); }
// public static yarnwrap.block.Block method_63418(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63418(settings)); }
// public yarnwrap.block.Block method_63419(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63419(settings)); }
// public static yarnwrap.block.Block method_63419(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63419(settings)); }
// public yarnwrap.block.Block method_63420(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63420(settings)); }
// public static yarnwrap.block.Block method_63420(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63420(settings)); }
// public yarnwrap.block.Block method_63421(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63421(settings)); }
// public static yarnwrap.block.Block method_63421(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63421(settings)); }
// public yarnwrap.block.Block method_63422(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63422(settings)); }
// public static yarnwrap.block.Block method_63422(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63422(settings)); }
// public yarnwrap.block.Block method_63423(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63423(settings)); }
// public static yarnwrap.block.Block method_63423(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63423(settings)); }
// public yarnwrap.block.Block method_63424(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63424(settings)); }
// public static yarnwrap.block.Block method_63424(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63424(settings)); }
// public yarnwrap.block.Block method_63425(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63425(settings)); }
// public static yarnwrap.block.Block method_63425(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63425(settings)); }
// public yarnwrap.block.Block method_63426(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63426(settings)); }
// public static yarnwrap.block.Block method_63426(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63426(settings)); }
// public yarnwrap.block.Block method_63427(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63427(settings)); }
// public static yarnwrap.block.Block method_63427(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63427(settings)); }
// public yarnwrap.block.Block method_63428(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63428(settings)); }
// public static yarnwrap.block.Block method_63428(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63428(settings)); }
// public yarnwrap.block.Block method_63429(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63429(settings)); }
// public static yarnwrap.block.Block method_63429(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63429(settings)); }
// public yarnwrap.block.Block method_63430(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63430(settings)); }
// public static yarnwrap.block.Block method_63430(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63430(settings)); }
// public yarnwrap.block.Block method_63431(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63431(settings)); }
// public static yarnwrap.block.Block method_63431(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63431(settings)); }
// public yarnwrap.block.Block method_63432(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63432(settings)); }
// public static yarnwrap.block.Block method_63432(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63432(settings)); }
// public yarnwrap.block.Block method_63433(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63433(settings)); }
// public static yarnwrap.block.Block method_63433(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63433(settings)); }
// public yarnwrap.block.Block method_63434(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63434(settings)); }
// public static yarnwrap.block.Block method_63434(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63434(settings)); }
// public yarnwrap.block.Block method_63435(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63435(settings)); }
// public static yarnwrap.block.Block method_63435(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63435(settings)); }
// public yarnwrap.block.Block method_63436(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63436(settings)); }
// public static yarnwrap.block.Block method_63436(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63436(settings)); }
// public yarnwrap.block.Block method_63437(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63437(settings)); }
// public static yarnwrap.block.Block method_63437(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63437(settings)); }
// public yarnwrap.block.Block method_63438(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63438(settings)); }
// public static yarnwrap.block.Block method_63438(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63438(settings)); }
// public yarnwrap.block.Block method_63439(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63439(settings)); }
// public static yarnwrap.block.Block method_63439(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63439(settings)); }
// public yarnwrap.block.Block method_63440(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63440(settings)); }
// public static yarnwrap.block.Block method_63440(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63440(settings)); }
// public yarnwrap.block.Block method_63441(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63441(settings)); }
// public static yarnwrap.block.Block method_63441(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63441(settings)); }
// public yarnwrap.block.Block method_63442(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63442(settings)); }
// public static yarnwrap.block.Block method_63442(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63442(settings)); }
// public yarnwrap.block.Block method_63443(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63443(settings)); }
// public static yarnwrap.block.Block method_63443(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63443(settings)); }
// public yarnwrap.block.Block method_63444(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63444(settings)); }
// public static yarnwrap.block.Block method_63444(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63444(settings)); }
// public yarnwrap.block.Block method_63445(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63445(settings)); }
// public static yarnwrap.block.Block method_63445(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63445(settings)); }
// public yarnwrap.block.Block method_63446(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63446(settings)); }
// public static yarnwrap.block.Block method_63446(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63446(settings)); }
// public yarnwrap.block.Block method_63447(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63447(settings)); }
// public static yarnwrap.block.Block method_63447(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63447(settings)); }
// public yarnwrap.block.Block method_63448(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63448(settings)); }
// public static yarnwrap.block.Block method_63448(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63448(settings)); }
// public yarnwrap.block.Block method_63449(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63449(settings)); }
// public static yarnwrap.block.Block method_63449(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63449(settings)); }
// public yarnwrap.block.Block method_63450(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63450(settings)); }
// public static yarnwrap.block.Block method_63450(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63450(settings)); }
// public yarnwrap.block.Block method_63451(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63451(settings)); }
// public static yarnwrap.block.Block method_63451(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63451(settings)); }
// public yarnwrap.block.Block method_63452(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63452(settings)); }
// public static yarnwrap.block.Block method_63452(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63452(settings)); }
// public yarnwrap.block.Block method_63453(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63453(settings)); }
// public static yarnwrap.block.Block method_63453(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63453(settings)); }
// public yarnwrap.block.Block method_63454(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63454(settings)); }
// public static yarnwrap.block.Block method_63454(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63454(settings)); }
// public yarnwrap.block.Block method_63455(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63455(settings)); }
// public static yarnwrap.block.Block method_63455(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63455(settings)); }
// public yarnwrap.block.Block method_63456(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63456(settings)); }
// public static yarnwrap.block.Block method_63456(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63456(settings)); }
// public yarnwrap.block.Block method_63457(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63457(settings)); }
// public static yarnwrap.block.Block method_63457(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63457(settings)); }
// public yarnwrap.block.Block method_63458(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63458(settings)); }
// public static yarnwrap.block.Block method_63458(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63458(settings)); }
// public int method_63459(yarnwrap.block.BlockState state) { return wrapperContained.method_63459(state.wrapperContained); }
// public static int method_63459(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_63459(state.wrapperContained); }
// public yarnwrap.block.Block method_63460(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63460(settings)); }
// public static yarnwrap.block.Block method_63460(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63460(settings)); }
// public yarnwrap.block.Block method_63461(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63461(settings)); }
// public static yarnwrap.block.Block method_63461(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63461(settings)); }
// public yarnwrap.block.Block method_63462(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_63462(settings)); }
// public static yarnwrap.block.Block method_63462(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_63462(settings)); }
// public yarnwrap.block.Block method_64764(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_64764(settings)); }
// public static yarnwrap.block.Block method_64764(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_64764(settings)); }
// public yarnwrap.block.Block method_64765(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_64765(settings)); }
// public static yarnwrap.block.Block method_64765(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_64765(settings)); }
// public yarnwrap.block.Block method_64766(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_64766(settings)); }
// public static yarnwrap.block.Block method_64766(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_64766(settings)); }
// public yarnwrap.block.Block method_64767(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_64767(settings)); }
// public static yarnwrap.block.Block method_64767(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_64767(settings)); }
// public yarnwrap.block.Block method_64768(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_64768(settings)); }
// public static yarnwrap.block.Block method_64768(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_64768(settings)); }
// public yarnwrap.block.Block method_64769(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_64769(settings)); }
// public static yarnwrap.block.Block method_64769(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_64769(settings)); }
// public yarnwrap.block.Block method_64770(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_64770(settings)); }
// public static yarnwrap.block.Block method_64770(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_64770(settings)); }
// public yarnwrap.block.Block method_64771(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_64771(settings)); }
// public static yarnwrap.block.Block method_64771(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_64771(settings)); }
// public yarnwrap.block.Block method_64772(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_64772(settings)); }
// public static yarnwrap.block.Block method_64772(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_64772(settings)); }
// public yarnwrap.block.Block method_64773(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_64773(settings)); }
// public static yarnwrap.block.Block method_64773(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_64773(settings)); }
// public yarnwrap.block.Block method_64774(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_64774(settings)); }
// public static yarnwrap.block.Block method_64774(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_64774(settings)); }
// public yarnwrap.block.Block method_64775(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_64775(settings)); }
// public static yarnwrap.block.Block method_64775(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_64775(settings)); }
// public yarnwrap.block.Block method_64776(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_64776(settings)); }
// public static yarnwrap.block.Block method_64776(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_64776(settings)); }
// public yarnwrap.block.Block method_65139(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_65139(settings)); }
// public static yarnwrap.block.Block method_65139(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_65139(settings)); }
// public yarnwrap.block.Block method_65140(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_65140(settings)); }
// public static yarnwrap.block.Block method_65140(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_65140(settings)); }
// public yarnwrap.block.Block method_65141(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_65141(settings)); }
// public static yarnwrap.block.Block method_65141(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_65141(settings)); }
// public yarnwrap.block.Block method_65142(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_65142(settings)); }
// public static yarnwrap.block.Block method_65142(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_65142(settings)); }
// public yarnwrap.block.Block method_65143(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_65143(settings)); }
// public static yarnwrap.block.Block method_65143(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_65143(settings)); }
// public yarnwrap.block.Block method_65144(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_65144(settings)); }
// public static yarnwrap.block.Block method_65144(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_65144(settings)); }
// public yarnwrap.block.Block method_65145(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_65145(settings)); }
// public static yarnwrap.block.Block method_65145(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_65145(settings)); }
// public yarnwrap.block.Block method_65146(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_65146(settings)); }
// public static yarnwrap.block.Block method_65146(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_65146(settings)); }
// public yarnwrap.block.Block method_66409(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_66409(settings)); }
// public static yarnwrap.block.Block method_66409(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_66409(settings)); }
// public yarnwrap.block.Block method_66410(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_66410(settings)); }
// public static yarnwrap.block.Block method_66410(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_66410(settings)); }
// public yarnwrap.block.Block method_66411(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_66411(settings)); }
// public static yarnwrap.block.Block method_66411(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_66411(settings)); }
// public yarnwrap.block.Block method_66412(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_66412(settings)); }
// public static yarnwrap.block.Block method_66412(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_66412(settings)); }
// public yarnwrap.block.Block method_66413(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_66413(settings)); }
// public static yarnwrap.block.Block method_66413(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_66413(settings)); }
// public yarnwrap.block.Block method_66414(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_66414(settings)); }
// public static yarnwrap.block.Block method_66414(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_66414(settings)); }
// public yarnwrap.block.Block method_66415(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_66415(settings)); }
// public static yarnwrap.block.Block method_66415(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_66415(settings)); }
// public yarnwrap.block.Block method_66416(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_66416(settings)); }
// public static yarnwrap.block.Block method_66416(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_66416(settings)); }
// public yarnwrap.block.Block method_66417(Object settings) { return new yarnwrap.block.Block(wrapperContained.method_66417(settings)); }
// public static yarnwrap.block.Block method_66417(Object settings, ) { return new yarnwrap.block.Block(net.minecraft.block.Blocks.method_66417(settings)); }
// public int method_67401(yarnwrap.block.BlockState state) { return wrapperContained.method_67401(state.wrapperContained); }
// public static int method_67401(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Blocks.method_67401(state.wrapperContained); }

}