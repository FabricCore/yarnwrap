package yarnwrap.client;
public class RunArgs { public net.minecraft.client.RunArgs wrapperContained; public RunArgs(net.minecraft.client.RunArgs wrapperContained) { this.wrapperContained = wrapperContained; }

public Object directories() { return wrapperContained.directories; }
public Object network() { return wrapperContained.network; }
public yarnwrap.client.WindowSettings windowSettings() { return new yarnwrap.client.WindowSettings(wrapperContained.windowSettings); }
public Object game() { return wrapperContained.game; }
public Object quickPlay() { return wrapperContained.quickPlay; }

}