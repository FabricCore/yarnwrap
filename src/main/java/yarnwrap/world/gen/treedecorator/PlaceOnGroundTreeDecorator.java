package yarnwrap.world.gen.treedecorator;
public class PlaceOnGroundTreeDecorator { public net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator wrapperContained; public PlaceOnGroundTreeDecorator(net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.CODEC = value; }

// public int tries() { return wrapperContained.tries; }
// public void tries(int value) { wrapperContained.tries = value; }
// public static int tries() { return net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.tries; }
// public static void tries(int value, ) { net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.tries = value; }

// public int radius() { return wrapperContained.radius; }
// public void radius(int value) { wrapperContained.radius = value; }
// public static int radius() { return net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.radius; }
// public static void radius(int value, ) { net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.radius = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.height; }
// public static void height(int value, ) { net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.height = value; }

// public yarnwrap.world.gen.stateprovider.BlockStateProvider blockStateProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.blockStateProvider); }
// public void blockStateProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.blockStateProvider = value.wrapperContained; }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider blockStateProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.blockStateProvider); }
// public static void blockStateProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value, ) { net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.blockStateProvider = value.wrapperContained; }

public PlaceOnGroundTreeDecorator(int tries,int radius,int height,yarnwrap.world.gen.stateprovider.BlockStateProvider blockStateProvider) { this.wrapperContained = new net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator(tries,radius,height,blockStateProvider.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_66483(Object instance) { return wrapperContained.method_66483(instance); }
// public static com.mojang.datafixers.kinds.App method_66483(Object instance, ) { return net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.method_66483(instance); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_66484(yarnwrap.world.gen.treedecorator.PlaceOnGroundTreeDecorator treeDecorator) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_66484(treeDecorator.wrapperContained)); }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider method_66484(yarnwrap.world.gen.treedecorator.PlaceOnGroundTreeDecorator treeDecorator, ) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.method_66484(treeDecorator.wrapperContained)); }
// public void generate(Object generator,yarnwrap.util.math.BlockPos pos) { wrapperContained.generate(generator,pos.wrapperContained); }
// public static void generate(Object generator,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.generate(generator,pos.wrapperContained); }
// public boolean method_66486(yarnwrap.block.BlockState state) { return wrapperContained.method_66486(state.wrapperContained); }
// public static boolean method_66486(yarnwrap.block.BlockState state, ) { return net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.method_66486(state.wrapperContained); }
// public java.lang.Integer method_66487(yarnwrap.world.gen.treedecorator.PlaceOnGroundTreeDecorator treeDecorator) { return wrapperContained.method_66487(treeDecorator.wrapperContained); }
// public static java.lang.Integer method_66487(yarnwrap.world.gen.treedecorator.PlaceOnGroundTreeDecorator treeDecorator, ) { return net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.method_66487(treeDecorator.wrapperContained); }
// public java.lang.Integer method_66488(yarnwrap.world.gen.treedecorator.PlaceOnGroundTreeDecorator treeDecorator) { return wrapperContained.method_66488(treeDecorator.wrapperContained); }
// public static java.lang.Integer method_66488(yarnwrap.world.gen.treedecorator.PlaceOnGroundTreeDecorator treeDecorator, ) { return net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.method_66488(treeDecorator.wrapperContained); }
// public java.lang.Integer method_66489(yarnwrap.world.gen.treedecorator.PlaceOnGroundTreeDecorator treeDecorator) { return wrapperContained.method_66489(treeDecorator.wrapperContained); }
// public static java.lang.Integer method_66489(yarnwrap.world.gen.treedecorator.PlaceOnGroundTreeDecorator treeDecorator, ) { return net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator.method_66489(treeDecorator.wrapperContained); }

}