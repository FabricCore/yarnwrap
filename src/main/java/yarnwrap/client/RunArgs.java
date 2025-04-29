package yarnwrap.client;
public class RunArgs { public net.minecraft.client.RunArgs wrapperContained; public RunArgs(net.minecraft.client.RunArgs wrapperContained) { this.wrapperContained = wrapperContained; }

public Object directories() { return wrapperContained.directories; }
// // public void directories(Object value) { wrapperContained.directories = value; }
// // public static Object directories() { return net.minecraft.client.RunArgs.directories; }
// // public static void directories(Object value, ) { net.minecraft.client.RunArgs.directories = value; }

public Object network() { return wrapperContained.network; }
// // public void network(Object value) { wrapperContained.network = value; }
// // public static Object network() { return net.minecraft.client.RunArgs.network; }
// // public static void network(Object value, ) { net.minecraft.client.RunArgs.network = value; }

public yarnwrap.client.WindowSettings windowSettings() { return new yarnwrap.client.WindowSettings(wrapperContained.windowSettings); }
// public void windowSettings(yarnwrap.client.WindowSettings value) { wrapperContained.windowSettings = value.wrapperContained; }
// public static yarnwrap.client.WindowSettings windowSettings() { return new yarnwrap.client.WindowSettings(net.minecraft.client.RunArgs.windowSettings); }
// public static void windowSettings(yarnwrap.client.WindowSettings value, ) { net.minecraft.client.RunArgs.windowSettings = value.wrapperContained; }

public Object game() { return wrapperContained.game; }
// // public void game(Object value) { wrapperContained.game = value; }
// // public static Object game() { return net.minecraft.client.RunArgs.game; }
// // public static void game(Object value, ) { net.minecraft.client.RunArgs.game = value; }

public Object quickPlay() { return wrapperContained.quickPlay; }
// // public void quickPlay(Object value) { wrapperContained.quickPlay = value; }
// // public static Object quickPlay() { return net.minecraft.client.RunArgs.quickPlay; }
// // public static void quickPlay(Object value, ) { net.minecraft.client.RunArgs.quickPlay = value; }

// public RunArgs(Object network,yarnwrap.client.WindowSettings windowSettings,Object dirs,Object game,Object quickPlay) { this.wrapperContained = new net.minecraft.client.RunArgs(network,windowSettings.wrapperContained,dirs,game,quickPlay); }

}