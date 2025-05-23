package yarnwrap.world.timer;
public class TimerCallbackSerializer { public net.minecraft.world.timer.TimerCallbackSerializer wrapperContained; public TimerCallbackSerializer(net.minecraft.world.timer.TimerCallbackSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.timer.TimerCallbackSerializer INSTANCE() { return new yarnwrap.world.timer.TimerCallbackSerializer(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.world.timer.TimerCallbackSerializer value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.world.timer.TimerCallbackSerializer INSTANCE() { return new yarnwrap.world.timer.TimerCallbackSerializer(net.minecraft.world.timer.TimerCallbackSerializer.INSTANCE); }
// public static void INSTANCE(yarnwrap.world.timer.TimerCallbackSerializer value, ) { net.minecraft.world.timer.TimerCallbackSerializer.INSTANCE = value.wrapperContained; }

// public Object idMapper() { return wrapperContained.idMapper; }
// // public void idMapper(Object value) { wrapperContained.idMapper = value; }
// // public static Object idMapper() { return net.minecraft.world.timer.TimerCallbackSerializer.idMapper; }
// // public static void idMapper(Object value, ) { net.minecraft.world.timer.TimerCallbackSerializer.idMapper = value; }

// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.Codec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.Codec codec() { return net.minecraft.world.timer.TimerCallbackSerializer.codec; }
// public static void codec(com.mojang.serialization.Codec value, ) { net.minecraft.world.timer.TimerCallbackSerializer.codec = value; }

public yarnwrap.world.timer.TimerCallbackSerializer registerSerializer(yarnwrap.util.Identifier id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.world.timer.TimerCallbackSerializer(wrapperContained.registerSerializer(id.wrapperContained,codec)); }
// public static yarnwrap.world.timer.TimerCallbackSerializer registerSerializer(yarnwrap.util.Identifier id,com.mojang.serialization.MapCodec codec, ) { return new yarnwrap.world.timer.TimerCallbackSerializer(net.minecraft.world.timer.TimerCallbackSerializer.registerSerializer(id.wrapperContained,codec)); }
public com.mojang.serialization.Codec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.Codec getCodec() { return net.minecraft.world.timer.TimerCallbackSerializer.getCodec(); }

}