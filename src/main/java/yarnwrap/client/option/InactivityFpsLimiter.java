package yarnwrap.client.option;
public class InactivityFpsLimiter { public net.minecraft.client.option.InactivityFpsLimiter wrapperContained; public InactivityFpsLimiter(net.minecraft.client.option.InactivityFpsLimiter wrapperContained) { this.wrapperContained = wrapperContained; }

// public int IN_GUI_FPS() { return wrapperContained.IN_GUI_FPS; }
// public void IN_GUI_FPS(int value) { wrapperContained.IN_GUI_FPS = value; }
// public static int IN_GUI_FPS() { return net.minecraft.client.option.InactivityFpsLimiter.IN_GUI_FPS; }
// public static void IN_GUI_FPS(int value, ) { net.minecraft.client.option.InactivityFpsLimiter.IN_GUI_FPS = value; }

// public int MINIMIZED_FPS() { return wrapperContained.MINIMIZED_FPS; }
// public void MINIMIZED_FPS(int value) { wrapperContained.MINIMIZED_FPS = value; }
// public static int MINIMIZED_FPS() { return net.minecraft.client.option.InactivityFpsLimiter.MINIMIZED_FPS; }
// public static void MINIMIZED_FPS(int value, ) { net.minecraft.client.option.InactivityFpsLimiter.MINIMIZED_FPS = value; }

// public int AFK_STAGE_1_FPS() { return wrapperContained.AFK_STAGE_1_FPS; }
// public void AFK_STAGE_1_FPS(int value) { wrapperContained.AFK_STAGE_1_FPS = value; }
// public static int AFK_STAGE_1_FPS() { return net.minecraft.client.option.InactivityFpsLimiter.AFK_STAGE_1_FPS; }
// public static void AFK_STAGE_1_FPS(int value, ) { net.minecraft.client.option.InactivityFpsLimiter.AFK_STAGE_1_FPS = value; }

// public int AFK_STAGE_2_FPS() { return wrapperContained.AFK_STAGE_2_FPS; }
// public void AFK_STAGE_2_FPS(int value) { wrapperContained.AFK_STAGE_2_FPS = value; }
// public static int AFK_STAGE_2_FPS() { return net.minecraft.client.option.InactivityFpsLimiter.AFK_STAGE_2_FPS; }
// public static void AFK_STAGE_2_FPS(int value, ) { net.minecraft.client.option.InactivityFpsLimiter.AFK_STAGE_2_FPS = value; }

// public long AFK_STAGE_1_THRESHOLD() { return wrapperContained.AFK_STAGE_1_THRESHOLD; }
// public void AFK_STAGE_1_THRESHOLD(long value) { wrapperContained.AFK_STAGE_1_THRESHOLD = value; }
// public static long AFK_STAGE_1_THRESHOLD() { return net.minecraft.client.option.InactivityFpsLimiter.AFK_STAGE_1_THRESHOLD; }
// public static void AFK_STAGE_1_THRESHOLD(long value, ) { net.minecraft.client.option.InactivityFpsLimiter.AFK_STAGE_1_THRESHOLD = value; }

// public long AFK_STAGE_2_THRESHOLD() { return wrapperContained.AFK_STAGE_2_THRESHOLD; }
// public void AFK_STAGE_2_THRESHOLD(long value) { wrapperContained.AFK_STAGE_2_THRESHOLD = value; }
// public static long AFK_STAGE_2_THRESHOLD() { return net.minecraft.client.option.InactivityFpsLimiter.AFK_STAGE_2_THRESHOLD; }
// public static void AFK_STAGE_2_THRESHOLD(long value, ) { net.minecraft.client.option.InactivityFpsLimiter.AFK_STAGE_2_THRESHOLD = value; }

// public yarnwrap.client.option.GameOptions options() { return new yarnwrap.client.option.GameOptions(wrapperContained.options); }
// public void options(yarnwrap.client.option.GameOptions value) { wrapperContained.options = value.wrapperContained; }
// public static yarnwrap.client.option.GameOptions options() { return new yarnwrap.client.option.GameOptions(net.minecraft.client.option.InactivityFpsLimiter.options); }
// public static void options(yarnwrap.client.option.GameOptions value, ) { net.minecraft.client.option.InactivityFpsLimiter.options = value.wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.option.InactivityFpsLimiter.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.option.InactivityFpsLimiter.client = value.wrapperContained; }

// public int maxFps() { return wrapperContained.maxFps; }
// public void maxFps(int value) { wrapperContained.maxFps = value; }
// public static int maxFps() { return net.minecraft.client.option.InactivityFpsLimiter.maxFps; }
// public static void maxFps(int value, ) { net.minecraft.client.option.InactivityFpsLimiter.maxFps = value; }

// public long lastInputTime() { return wrapperContained.lastInputTime; }
// public void lastInputTime(long value) { wrapperContained.lastInputTime = value; }
// public static long lastInputTime() { return net.minecraft.client.option.InactivityFpsLimiter.lastInputTime; }
// public static void lastInputTime(long value, ) { net.minecraft.client.option.InactivityFpsLimiter.lastInputTime = value; }

public InactivityFpsLimiter(yarnwrap.client.option.GameOptions options,yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.option.InactivityFpsLimiter(options.wrapperContained,client.wrapperContained); }
public int update() { return wrapperContained.update(); }
// public static int update() { return net.minecraft.client.option.InactivityFpsLimiter.update(); }
public void setMaxFps(int maxFps) { wrapperContained.setMaxFps(maxFps); }
// public static void setMaxFps(int maxFps, ) { net.minecraft.client.option.InactivityFpsLimiter.setMaxFps(maxFps); }
public void onInput() { wrapperContained.onInput(); }
// public static void onInput() { net.minecraft.client.option.InactivityFpsLimiter.onInput(); }
public Object getLimitReason() { return wrapperContained.getLimitReason(); }
// public static Object getLimitReason() { return net.minecraft.client.option.InactivityFpsLimiter.getLimitReason(); }
public boolean shouldDisableProfilerTimeout() { return wrapperContained.shouldDisableProfilerTimeout(); }
// public static boolean shouldDisableProfilerTimeout() { return net.minecraft.client.option.InactivityFpsLimiter.shouldDisableProfilerTimeout(); }

}