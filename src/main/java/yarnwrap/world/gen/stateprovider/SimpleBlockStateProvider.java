package yarnwrap.world.gen.stateprovider;
public class SimpleBlockStateProvider { public net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider wrapperContained; public SimpleBlockStateProvider(net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public void state(yarnwrap.block.BlockState value) { wrapperContained.state = value.wrapperContained; }
// public static yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider.state); }
// public static void state(yarnwrap.block.BlockState value, ) { net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider.state = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider.CODEC = value; }

// public SimpleBlockStateProvider(yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider(state.wrapperContained); }

}